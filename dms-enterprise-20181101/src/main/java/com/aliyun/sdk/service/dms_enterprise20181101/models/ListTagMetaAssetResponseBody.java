// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link ListTagMetaAssetResponseBody} extends {@link TeaModel}
 *
 * <p>ListTagMetaAssetResponseBody</p>
 */
public class ListTagMetaAssetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListTagMetaAssetResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTagMetaAssetResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListTagMetaAssetResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
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
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListTagMetaAssetResponseBody build() {
            return new ListTagMetaAssetResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTagMetaAssetResponseBody} extends {@link TeaModel}
     *
     * <p>ListTagMetaAssetResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MetaEntityAttrs")
        private java.util.Map<String, ?> metaEntityAttrs;

        @com.aliyun.core.annotation.NameInMap("MetaType")
        private String metaType;

        private Data(Builder builder) {
            this.metaEntityAttrs = builder.metaEntityAttrs;
            this.metaType = builder.metaType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return metaEntityAttrs
         */
        public java.util.Map<String, ?> getMetaEntityAttrs() {
            return this.metaEntityAttrs;
        }

        /**
         * @return metaType
         */
        public String getMetaType() {
            return this.metaType;
        }

        public static final class Builder {
            private java.util.Map<String, ?> metaEntityAttrs; 
            private String metaType; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.metaEntityAttrs = model.metaEntityAttrs;
                this.metaType = model.metaType;
            } 

            /**
             * MetaEntityAttrs.
             */
            public Builder metaEntityAttrs(java.util.Map<String, ?> metaEntityAttrs) {
                this.metaEntityAttrs = metaEntityAttrs;
                return this;
            }

            /**
             * MetaType.
             */
            public Builder metaType(String metaType) {
                this.metaType = metaType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
