// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeServiceDiagnosisResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeServiceDiagnosisResponseBody</p>
 */
public class DescribeServiceDiagnosisResponseBody extends TeaModel {
    @NameInMap("DiagnosisList")
    private java.util.List < DiagnosisList> diagnosisList;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeServiceDiagnosisResponseBody(Builder builder) {
        this.diagnosisList = builder.diagnosisList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeServiceDiagnosisResponseBody create() {
        return builder().build();
    }

    /**
     * @return diagnosisList
     */
    public java.util.List < DiagnosisList> getDiagnosisList() {
        return this.diagnosisList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < DiagnosisList> diagnosisList; 
        private String requestId; 

        /**
         * DiagnosisList.
         */
        public Builder diagnosisList(java.util.List < DiagnosisList> diagnosisList) {
            this.diagnosisList = diagnosisList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeServiceDiagnosisResponseBody build() {
            return new DescribeServiceDiagnosisResponseBody(this);
        } 

    } 

    public static class DiagnosisList extends TeaModel {
        @NameInMap("Advices")
        private java.util.List < String > advices;

        @NameInMap("Causes")
        private java.util.List < String > causes;

        @NameInMap("Error")
        private String error;

        private DiagnosisList(Builder builder) {
            this.advices = builder.advices;
            this.causes = builder.causes;
            this.error = builder.error;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiagnosisList create() {
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
             * Advices.
             */
            public Builder advices(java.util.List < String > advices) {
                this.advices = advices;
                return this;
            }

            /**
             * Causes.
             */
            public Builder causes(java.util.List < String > causes) {
                this.causes = causes;
                return this;
            }

            /**
             * Error.
             */
            public Builder error(String error) {
                this.error = error;
                return this;
            }

            public DiagnosisList build() {
                return new DiagnosisList(this);
            } 

        } 

    }
}
