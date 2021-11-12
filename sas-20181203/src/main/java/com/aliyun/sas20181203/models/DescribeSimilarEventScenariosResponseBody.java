// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeSimilarEventScenariosResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSimilarEventScenariosResponseBody</p>
 */
public class DescribeSimilarEventScenariosResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Scenarios")
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
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Scenarios.</p>
         */
        public Builder scenarios(java.util.List < Scenarios> scenarios) {
            this.scenarios = scenarios;
            return this;
        }

        public DescribeSimilarEventScenariosResponseBody build() {
            return new DescribeSimilarEventScenariosResponseBody(this);
        } 

    } 

    public static class Scenarios extends TeaModel {
        @NameInMap("Code")
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
             * <p>Code.</p>
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
