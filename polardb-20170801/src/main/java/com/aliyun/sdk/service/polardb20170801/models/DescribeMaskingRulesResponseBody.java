// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMaskingRulesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMaskingRulesResponseBody</p>
 */
public class DescribeMaskingRulesResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeMaskingRulesResponseBody(Builder builder) {
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMaskingRulesResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeMaskingRulesResponseBody build() {
            return new DescribeMaskingRulesResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("RuleList")
        private java.util.List < String > ruleList;

        private Data(Builder builder) {
            this.ruleList = builder.ruleList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return ruleList
         */
        public java.util.List < String > getRuleList() {
            return this.ruleList;
        }

        public static final class Builder {
            private java.util.List < String > ruleList; 

            /**
             * RuleList.
             */
            public Builder ruleList(java.util.List < String > ruleList) {
                this.ruleList = ruleList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
