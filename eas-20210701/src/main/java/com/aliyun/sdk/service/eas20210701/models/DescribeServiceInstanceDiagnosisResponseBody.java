// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeServiceInstanceDiagnosisResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeServiceInstanceDiagnosisResponseBody</p>
 */
public class DescribeServiceInstanceDiagnosisResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Diagnosis")
    private Diagnosis diagnosis;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeServiceInstanceDiagnosisResponseBody(Builder builder) {
        this.diagnosis = builder.diagnosis;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeServiceInstanceDiagnosisResponseBody create() {
        return builder().build();
    }

    /**
     * @return diagnosis
     */
    public Diagnosis getDiagnosis() {
        return this.diagnosis;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Diagnosis diagnosis; 
        private String requestId; 

        /**
         * <p>The diagnostics information.</p>
         */
        public Builder diagnosis(Diagnosis diagnosis) {
            this.diagnosis = diagnosis;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>40325405-579C-4D82***</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeServiceInstanceDiagnosisResponseBody build() {
            return new DescribeServiceInstanceDiagnosisResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeServiceInstanceDiagnosisResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceInstanceDiagnosisResponseBody</p>
     */
    public static class Diagnosis extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Advices")
        private java.util.List < String > advices;

        @com.aliyun.core.annotation.NameInMap("Causes")
        private java.util.List < String > causes;

        @com.aliyun.core.annotation.NameInMap("Error")
        private String error;

        private Diagnosis(Builder builder) {
            this.advices = builder.advices;
            this.causes = builder.causes;
            this.error = builder.error;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Diagnosis create() {
            return builder().build();
        }

        /**
         * @return advices
         */
        public java.util.List < String > getAdvices() {
            return this.advices;
        }

        /**
         * @return causes
         */
        public java.util.List < String > getCauses() {
            return this.causes;
        }

        /**
         * @return error
         */
        public String getError() {
            return this.error;
        }

        public static final class Builder {
            private java.util.List < String > advices; 
            private java.util.List < String > causes; 
            private String error; 

            /**
             * <p>The solutions to the errors.</p>
             */
            public Builder advices(java.util.List < String > advices) {
                this.advices = advices;
                return this;
            }

            /**
             * <p>The causes of the errors.</p>
             */
            public Builder causes(java.util.List < String > causes) {
                this.causes = causes;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>Container worker0 failed to pull image.</p>
             */
            public Builder error(String error) {
                this.error = error;
                return this;
            }

            public Diagnosis build() {
                return new Diagnosis(this);
            } 

        } 

    }
}
