// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeSimilarEventScenariosResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSimilarEventScenariosResponseBody</p>
 */
public class DescribeSimilarEventScenariosResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Scenarios")
    private java.util.List < Scenarios> scenarios;

    private DescribeSimilarEventScenariosResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.scenarios = builder.scenarios;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSimilarEventScenariosResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scenarios
     */
    public java.util.List < Scenarios> getScenarios() {
        return this.scenarios;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Scenarios> scenarios; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Scenarios.
         */
        public Builder scenarios(java.util.List < Scenarios> scenarios) {
            this.scenarios = scenarios;
            return this;
        }

        public DescribeSimilarEventScenariosResponseBody build() {
            return new DescribeSimilarEventScenariosResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSimilarEventScenariosResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSimilarEventScenariosResponseBody</p>
     */
    public static class Scenarios extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        private Scenarios(Builder builder) {
            this.code = builder.code;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Scenarios create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        public static final class Builder {
            private String code; 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            public Scenarios build() {
                return new Scenarios(this);
            } 

        } 

    }
}
