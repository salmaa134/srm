import React from 'react';
import { render, screen } from '@testing-library/react';
import '@testing-library/jest-dom';
import Airflow from './Airflow';

describe('<Airflow />', () => {
  test('it should mount', () => {
    render(<Airflow />);

    const airflow = screen.getByTestId('Airflow');

    expect(airflow).toBeInTheDocument();
  });
});