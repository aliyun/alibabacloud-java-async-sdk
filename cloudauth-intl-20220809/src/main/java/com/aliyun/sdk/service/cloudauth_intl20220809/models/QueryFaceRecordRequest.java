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
 * {@link QueryFaceRecordRequest} extends {@link RequestModel}
 *
 * <p>QueryFaceRecordRequest</p>
 */
public class QueryFaceRecordRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FaceGroupCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String faceGroupCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FaceId")
    private String faceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MerchantUserId")
    private String merchantUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegistrationType")
    private String registrationType;

    private QueryFaceRecordRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.currentPage = builder.currentPage;
        this.faceGroupCode = builder.faceGroupCode;
        this.faceId = builder.faceId;
        this.maxResults = builder.maxResults;
        this.merchantUserId = builder.merchantUserId;
        this.nextToken = builder.nextToken;
        this.pageSize = builder.pageSize;
        this.registrationType = builder.registrationType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryFaceRecordRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return currentPage
     */
    public Long getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return faceGroupCode
     */
    public String getFaceGroupCode() {
        return this.faceGroupCode;
    }

    /**
     * @return faceId
     */
    public String getFaceId() {
        return this.faceId;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return merchantUserId
     */
    public String getMerchantUserId() {
        return this.merchantUserId;
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
     * @return registrationType
     */
    public String getRegistrationType() {
        return this.registrationType;
    }

    public static final class Builder extends Request.Builder<QueryFaceRecordRequest, Builder> {
        private String regionId; 
        private Long currentPage; 
        private String faceGroupCode; 
        private String faceId; 
        private Integer maxResults; 
        private String merchantUserId; 
        private String nextToken; 
        private Integer pageSize; 
        private String registrationType; 

        private Builder() {
            super();
        } 

        private Builder(QueryFaceRecordRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.currentPage = request.currentPage;
            this.faceGroupCode = request.faceGroupCode;
            this.faceId = request.faceId;
            this.maxResults = request.maxResults;
            this.merchantUserId = request.merchantUserId;
            this.nextToken = request.nextToken;
            this.pageSize = request.pageSize;
            this.registrationType = request.registrationType;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Current Page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Long currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>Face Group Code.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Cu****D08q</p>
         */
        public Builder faceGroupCode(String faceGroupCode) {
            this.putQueryParameter("FaceGroupCode", faceGroupCode);
            this.faceGroupCode = faceGroupCode;
            return this;
        }

        /**
         * <p>Face ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5006538</p>
         */
        public Builder faceId(String faceId) {
            this.putQueryParameter("FaceId", faceId);
            this.faceId = faceId;
            return this;
        }

        /**
         * <p>Number of rows per page for paginated queries.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>Merchant User ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CuN6hiD08qr</p>
         */
        public Builder merchantUserId(String merchantUserId) {
            this.putQueryParameter("MerchantUserId", merchantUserId);
            this.merchantUserId = merchantUserId;
            return this;
        }

        /**
         * <p>Used to request the next page of search results.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAARbaCuN6hiD08qrLdwJ9Fh0OP1yH8z+7FV4KKGUw4X32</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Number of items per page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Registration Type.</p>
         * 
         * <strong>example:</strong>
         * <p>MANUAL</p>
         */
        public Builder registrationType(String registrationType) {
            this.putQueryParameter("RegistrationType", registrationType);
            this.registrationType = registrationType;
            return this;
        }

        @Override
        public QueryFaceRecordRequest build() {
            return new QueryFaceRecordRequest(this);
        } 

    } 

}
