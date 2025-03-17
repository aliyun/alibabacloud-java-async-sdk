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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(BatchCreateVodPackagingAssetResponseBody model) {
            this.groupName = model.groupName;
            this.requestId = model.requestId;
            this.resultList = model.resultList;
        } 

        /**
         * <p>The name of the packaging group.</p>
         * 
         * <strong>example:</strong>
         * <p>vod_hls</p>
         */
        public Builder groupName(String groupName) {
            this.groupName = groupName;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>3B-0E1A-586A-AC29-742247</strong></strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The results of asset ingestion.</p>
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

            private Builder() {
            } 

            private Builder(ResultList model) {
                this.asset = model.asset;
                this.code = model.code;
                this.message = model.message;
            } 

            /**
             * <p>The information about the ingested asset.</p>
             */
            public Builder asset(VodPackagingAsset asset) {
                this.asset = asset;
                return this;
            }

            /**
             * <p>The error code for failed ingestion.</p>
             * 
             * <strong>example:</strong>
             * <p>InvalidParameter.PackagingAssetAlreadyExists</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The error message for failed ingestion.</p>
             * 
             * <strong>example:</strong>
             * <p>The specified packagingAsset &quot;inputMovie&quot; already exists</p>
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
