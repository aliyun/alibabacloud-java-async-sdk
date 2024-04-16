// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link JobDriver} extends {@link TeaModel}
 *
 * <p>JobDriver</p>
 */
public class JobDriver extends TeaModel {
    @NameInMap("sparkSubmit")
    private SparkSubmit sparkSubmit;

    private JobDriver(Builder builder) {
        this.sparkSubmit = builder.sparkSubmit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static JobDriver create() {
        return builder().build();
    }

    /**
     * @return sparkSubmit
     */
    public SparkSubmit getSparkSubmit() {
        return this.sparkSubmit;
    }

    public static final class Builder {
        private SparkSubmit sparkSubmit; 

        /**
         * sparkSubmit.
         */
        public Builder sparkSubmit(SparkSubmit sparkSubmit) {
            this.sparkSubmit = sparkSubmit;
            return this;
        }

        public JobDriver build() {
            return new JobDriver(this);
        } 

    } 

    public static class SparkSubmit extends TeaModel {
        @NameInMap("entryPoint")
        private String entryPoint;

        @NameInMap("entryPointArguments")
        private java.util.List < String > entryPointArguments;

        @NameInMap("sparkSubmitParameters")
        private String sparkSubmitParameters;

        private SparkSubmit(Builder builder) {
            this.entryPoint = builder.entryPoint;
            this.entryPointArguments = builder.entryPointArguments;
            this.sparkSubmitParameters = builder.sparkSubmitParameters;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SparkSubmit create() {
            return builder().build();
        }

        /**
         * @return entryPoint
         */
        public String getEntryPoint() {
            return this.entryPoint;
        }

        /**
         * @return entryPointArguments
         */
        public java.util.List < String > getEntryPointArguments() {
            return this.entryPointArguments;
        }

        /**
         * @return sparkSubmitParameters
         */
        public String getSparkSubmitParameters() {
            return this.sparkSubmitParameters;
        }

        public static final class Builder {
            private String entryPoint; 
            private java.util.List < String > entryPointArguments; 
            private String sparkSubmitParameters; 

            /**
             * entryPoint.
             */
            public Builder entryPoint(String entryPoint) {
                this.entryPoint = entryPoint;
                return this;
            }

            /**
             * entryPointArguments.
             */
            public Builder entryPointArguments(java.util.List < String > entryPointArguments) {
                this.entryPointArguments = entryPointArguments;
                return this;
            }

            /**
             * sparkSubmitParameters.
             */
            public Builder sparkSubmitParameters(String sparkSubmitParameters) {
                this.sparkSubmitParameters = sparkSubmitParameters;
                return this;
            }

            public SparkSubmit build() {
                return new SparkSubmit(this);
            } 

        } 

    }
}
