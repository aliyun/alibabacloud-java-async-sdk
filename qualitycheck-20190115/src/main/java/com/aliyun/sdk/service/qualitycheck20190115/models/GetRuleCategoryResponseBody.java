// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

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
 * {@link GetRuleCategoryResponseBody} extends {@link TeaModel}
 *
 * <p>GetRuleCategoryResponseBody</p>
 */
public class GetRuleCategoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetRuleCategoryResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRuleCategoryResponseBody create() {
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
        private String code; 
        private Data data; 
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

        public GetRuleCategoryResponseBody build() {
            return new GetRuleCategoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetRuleCategoryResponseBody} extends {@link TeaModel}
     *
     * <p>GetRuleCategoryResponseBody</p>
     */
    public static class RuleCountInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Select")
        private Boolean select;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Integer type;

        @com.aliyun.core.annotation.NameInMap("TypeName")
        private String typeName;

        private RuleCountInfo(Builder builder) {
            this.select = builder.select;
            this.type = builder.type;
            this.typeName = builder.typeName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleCountInfo create() {
            return builder().build();
        }

        /**
         * @return select
         */
        public Boolean getSelect() {
            return this.select;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        /**
         * @return typeName
         */
        public String getTypeName() {
            return this.typeName;
        }

        public static final class Builder {
            private Boolean select; 
            private Integer type; 
            private String typeName; 

            /**
             * Select.
             */
            public Builder select(Boolean select) {
                this.select = select;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            /**
             * TypeName.
             */
            public Builder typeName(String typeName) {
                this.typeName = typeName;
                return this;
            }

            public RuleCountInfo build() {
                return new RuleCountInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRuleCategoryResponseBody} extends {@link TeaModel}
     *
     * <p>GetRuleCategoryResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RuleCountInfo")
        private java.util.List<RuleCountInfo> ruleCountInfo;

        private Data(Builder builder) {
            this.ruleCountInfo = builder.ruleCountInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return ruleCountInfo
         */
        public java.util.List<RuleCountInfo> getRuleCountInfo() {
            return this.ruleCountInfo;
        }

        public static final class Builder {
            private java.util.List<RuleCountInfo> ruleCountInfo; 

            /**
             * RuleCountInfo.
             */
            public Builder ruleCountInfo(java.util.List<RuleCountInfo> ruleCountInfo) {
                this.ruleCountInfo = ruleCountInfo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
