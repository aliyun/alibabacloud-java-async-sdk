// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link BatchCreateVodPackagingAssetResponseBody} extends {@link TeaModel}
 *
 * <p>BatchCreateVodPackagingAssetResponseBody</p>
 */
public class BatchCreateVodPackagingAssetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultList")
    private java.util.List<ResultList> resultList;

    private BatchCreateVodPackagingAssetResponseBody(Builder builder) {
        this.groupName = builder.groupName;
        this.requestId = builder.requestId;
        this.resultList = builder.resultList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchCreateVodPackagingAssetResponseBody create() {
        return builder().build();
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultList
     */
    public java.util.List<ResultList> getResultList() {
        return this.resultList;
    }

    public static final class Builder {
        private String groupName; 
        private String requestId; 
        private java.util.List<ResultList> resultList; 

        /**
         * GroupName.
         */
        public Builder groupName(String groupName) {
            this.groupName = groupName;
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
         * ResultList.
         */
        public Builder resultList(java.util.List<ResultList> resultList) {
            this.resultList = resultList;
            return this;
        }

        public BatchCreateVodPackagingAssetResponseBody build() {
            return new BatchCreateVodPackagingAssetResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BatchCreateVodPackagingAssetResponseBody} extends {@link TeaModel}
     *
     * <p>BatchCreateVodPackagingAssetResponseBody</p>
     */
    public static class ResultList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Asset")
        private VodPackagingAsset asset;

        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        private ResultList(Builder builder) {
            this.asset = builder.asset;
            this.code = builder.code;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultList create() {
            return builder().build();
        }

        /**
         * @return asset
         */
        public VodPackagingAsset getAsset() {
            return this.asset;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        public static final class Builder {
            private VodPackagingAsset asset; 
            private String code; 
            private String message; 

            /**
             * Asset.
             */
            public Builder asset(VodPackagingAsset asset) {
                this.asset = asset;
                return this;
            }

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            public ResultList build() {
                return new ResultList(this);
            } 

        } 

    }
}
