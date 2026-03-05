// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.unimkt20181212.models;

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
 * {@link ListUnionMediaIndustryResponseBody} extends {@link TeaModel}
 *
 * <p>ListUnionMediaIndustryResponseBody</p>
 */
public class ListUnionMediaIndustryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("ErrorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListUnionMediaIndustryResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMsg = builder.errorMsg;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUnionMediaIndustryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
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
        private Integer code; 
        private java.util.List<Data> data; 
        private String errorMsg; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListUnionMediaIndustryResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMsg = model.errorMsg;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(Integer code) {
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
         * ErrorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
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

        public ListUnionMediaIndustryResponseBody build() {
            return new ListUnionMediaIndustryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListUnionMediaIndustryResponseBody} extends {@link TeaModel}
     *
     * <p>ListUnionMediaIndustryResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IndustryCode")
        private String industryCode;

        @com.aliyun.core.annotation.NameInMap("IndustryName")
        private String industryName;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("ParentIndustryCode")
        private String parentIndustryCode;

        @com.aliyun.core.annotation.NameInMap("UsedFlag")
        private Boolean usedFlag;

        private Data(Builder builder) {
            this.industryCode = builder.industryCode;
            this.industryName = builder.industryName;
            this.level = builder.level;
            this.parentIndustryCode = builder.parentIndustryCode;
            this.usedFlag = builder.usedFlag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return industryCode
         */
        public String getIndustryCode() {
            return this.industryCode;
        }

        /**
         * @return industryName
         */
        public String getIndustryName() {
            return this.industryName;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return parentIndustryCode
         */
        public String getParentIndustryCode() {
            return this.parentIndustryCode;
        }

        /**
         * @return usedFlag
         */
        public Boolean getUsedFlag() {
            return this.usedFlag;
        }

        public static final class Builder {
            private String industryCode; 
            private String industryName; 
            private String level; 
            private String parentIndustryCode; 
            private Boolean usedFlag; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.industryCode = model.industryCode;
                this.industryName = model.industryName;
                this.level = model.level;
                this.parentIndustryCode = model.parentIndustryCode;
                this.usedFlag = model.usedFlag;
            } 

            /**
             * IndustryCode.
             */
            public Builder industryCode(String industryCode) {
                this.industryCode = industryCode;
                return this;
            }

            /**
             * IndustryName.
             */
            public Builder industryName(String industryName) {
                this.industryName = industryName;
                return this;
            }

            /**
             * Level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * ParentIndustryCode.
             */
            public Builder parentIndustryCode(String parentIndustryCode) {
                this.parentIndustryCode = parentIndustryCode;
                return this;
            }

            /**
             * UsedFlag.
             */
            public Builder usedFlag(Boolean usedFlag) {
                this.usedFlag = usedFlag;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
