import React, { FC } from 'react';
import { AirflowWrapper } from './Airflow.styled';

interface AirflowProps {}

const Airflow: FC<AirflowProps> = () => (
 <AirflowWrapper data-testid="Airflow">
    Airflow Component
 </AirflowWrapper>
);

export default Airflow;
