// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth_intl20220809.models;

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
 * {@link QueryFaceRecordResponseBody} extends {@link TeaModel}
 *
 * <p>QueryFaceRecordResponseBody</p>
 */
public class QueryFaceRecordResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Long currentPage;

    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("TotalPage")
    private Integer totalPage;

    private QueryFaceRecordResponseBody(Builder builder) {
        this.code = builder.code;
        this.currentPage = builder.currentPage;
        this.items = builder.items;
        this.maxResults = builder.maxResults;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.totalPage = builder.totalPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryFaceRecordResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return currentPage
     */
    public Long getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return totalPage
     */
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static final class Builder {
        private String code; 
        private Long currentPage; 
        private java.util.List<Items> items; 
        private Integer maxResults; 
        private String message; 
        private String nextToken; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private Integer totalPage; 

        private Builder() {
        } 

        private Builder(QueryFaceRecordResponseBody model) {
            this.code = model.code;
            this.currentPage = model.currentPage;
            this.items = model.items;
            this.maxResults = model.maxResults;
            this.message = model.message;
            this.nextToken = model.nextToken;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.totalPage = model.totalPage;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Items.
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
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
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>7F971622-38C0-5F56-B2EC-315367979B4F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * TotalPage.
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public QueryFaceRecordResponseBody build() {
            return new QueryFaceRecordResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryFaceRecordResponseBody} extends {@link TeaModel}
     *
     * <p>QueryFaceRecordResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FaceId")
        private String faceId;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("ImgOssUrl")
        private String imgOssUrl;

        @com.aliyun.core.annotation.NameInMap("MerchantUserId")
        private String merchantUserId;

        @com.aliyun.core.annotation.NameInMap("RegistrationType")
        private String registrationType;

        private Items(Builder builder) {
            this.faceId = builder.faceId;
            this.gmtCreate = builder.gmtCreate;
            this.id = builder.id;
            this.imgOssUrl = builder.imgOssUrl;
            this.merchantUserId = builder.merchantUserId;
            this.registrationType = builder.registrationType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return faceId
         */
        public String getFaceId() {
            return this.faceId;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return imgOssUrl
         */
        public String getImgOssUrl() {
            return this.imgOssUrl;
        }

        /**
         * @return merchantUserId
         */
        public String getMerchantUserId() {
            return this.merchantUserId;
        }

        /**
         * @return registrationType
         */
        public String getRegistrationType() {
            return this.registrationType;
        }

        public static final class Builder {
            private String faceId; 
            private String gmtCreate; 
            private Long id; 
            private String imgOssUrl; 
            private String merchantUserId; 
            private String registrationType; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.faceId = model.faceId;
                this.gmtCreate = model.gmtCreate;
                this.id = model.id;
                this.imgOssUrl = model.imgOssUrl;
                this.merchantUserId = model.merchantUserId;
                this.registrationType = model.registrationType;
            } 

            /**
             * FaceId.
             */
            public Builder faceId(String faceId) {
                this.faceId = faceId;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * ImgOssUrl.
             */
            public Builder imgOssUrl(String imgOssUrl) {
                this.imgOssUrl = imgOssUrl;
                return this;
            }

            /**
             * MerchantUserId.
             */
            public Builder merchantUserId(String merchantUserId) {
                this.merchantUserId = merchantUserId;
                return this;
            }

            /**
             * RegistrationType.
             */
            public Builder registrationType(String registrationType) {
                this.registrationType = registrationType;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
