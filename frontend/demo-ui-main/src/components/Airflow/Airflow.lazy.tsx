import React, { lazy, Suspense } from 'react';

const LazyAirflow = lazy(() => import('./Airflow'));

const Airflow = (props: JSX.IntrinsicAttributes & { children?: React.ReactNode; }) => (
  <Suspense fallback={null}>
    <LazyAirflow {...props} />
  </Suspense>
);

export default Airflow;
