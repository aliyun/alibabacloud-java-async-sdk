// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20230601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryEnterpriseDataTagResponseBody} extends {@link TeaModel}
 *
 * <p>QueryEnterpriseDataTagResponseBody</p>
 */
public class QueryEnterpriseDataTagResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMsg")
    private String errorMsg;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QueryEnterpriseDataTagResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryEnterpriseDataTagResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
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
        private java.util.List < Data> data; 
        private String errorCode; 
        private String errorMsg; 
        private String requestId; 
        private Boolean success; 

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
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

        public QueryEnterpriseDataTagResponseBody build() {
            return new QueryEnterpriseDataTagResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("DataId")
        private String dataId;

        @NameInMap("TagId")
        private Long tagId;

        @NameInMap("TagName")
        private String tagName;

        private Data(Builder builder) {
            this.dataId = builder.dataId;
            this.tagId = builder.tagId;
            this.tagName = builder.tagName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return dataId
         */
        public String getDataId() {
            return this.dataId;
        }

        /**
         * @return tagId
         */
        public Long getTagId() {
            return this.tagId;
        }

        /**
         * @return tagName
         */
        public String getTagName() {
            return this.tagName;
        }

        public static final class Builder {
            private String dataId; 
            private Long tagId; 
            private String tagName; 

            /**
             * DataId.
             */
            public Builder dataId(String dataId) {
                this.dataId = dataId;
                return this;
            }

            /**
             * TagId.
             */
            public Builder tagId(Long tagId) {
                this.tagId = tagId;
                return this;
            }

            /**
             * TagName.
             */
            public Builder tagName(String tagName) {
                this.tagName = tagName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
