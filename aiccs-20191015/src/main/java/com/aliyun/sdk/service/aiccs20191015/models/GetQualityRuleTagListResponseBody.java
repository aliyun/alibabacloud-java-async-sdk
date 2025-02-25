// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetQualityRuleTagListResponseBody} extends {@link TeaModel}
 *
 * <p>GetQualityRuleTagListResponseBody</p>
 */
public class GetQualityRuleTagListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetQualityRuleTagListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQualityRuleTagListResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
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
        private String code; 
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
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
         * RequestId.
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

        public GetQualityRuleTagListResponseBody build() {
            return new GetQualityRuleTagListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetQualityRuleTagListResponseBody} extends {@link TeaModel}
     *
     * <p>GetQualityRuleTagListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RuleTagId")
        private Long ruleTagId;

        @com.aliyun.core.annotation.NameInMap("RuleTagName")
        private String ruleTagName;

        private Data(Builder builder) {
            this.ruleTagId = builder.ruleTagId;
            this.ruleTagName = builder.ruleTagName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return ruleTagId
         */
        public Long getRuleTagId() {
            return this.ruleTagId;
        }

        /**
         * @return ruleTagName
         */
        public String getRuleTagName() {
            return this.ruleTagName;
        }

        public static final class Builder {
            private Long ruleTagId; 
            private String ruleTagName; 

            /**
             * RuleTagId.
             */
            public Builder ruleTagId(Long ruleTagId) {
                this.ruleTagId = ruleTagId;
                return this;
            }

            /**
             * RuleTagName.
             */
            public Builder ruleTagName(String ruleTagName) {
                this.ruleTagName = ruleTagName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
