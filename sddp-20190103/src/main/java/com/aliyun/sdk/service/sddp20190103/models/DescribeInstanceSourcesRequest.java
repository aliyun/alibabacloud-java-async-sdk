// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceSourcesRequest} extends {@link RequestModel}
 *
 * <p>DescribeInstanceSourcesRequest</p>
 */
public class DescribeInstanceSourcesRequest extends Request {
    @Query
    @NameInMap("AuditStatus")
    private Integer auditStatus;

    @Query
    @NameInMap("AuthStatus")
    private Integer authStatus;

    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("EngineType")
    private String engineType;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("ProductCode")
    private String productCode;

    @Query
    @NameInMap("ProductId")
    private Long productId;

    @Query
    @NameInMap("SearchKey")
    private String searchKey;

    @Query
    @NameInMap("SearchType")
    private String searchType;

    @Query
    @NameInMap("ServiceRegionId")
    private String serviceRegionId;

    private DescribeInstanceSourcesRequest(Builder builder) {
        super(builder);
        this.auditStatus = builder.auditStatus;
        this.authStatus = builder.authStatus;
        this.currentPage = builder.currentPage;
        this.engineType = builder.engineType;
        this.instanceId = builder.instanceId;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.productCode = builder.productCode;
        this.productId = builder.productId;
        this.searchKey = builder.searchKey;
        this.searchType = builder.searchType;
        this.serviceRegionId = builder.serviceRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceSourcesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return auditStatus
     */
    public Integer getAuditStatus() {
        return this.auditStatus;
    }

    /**
     * @return authStatus
     */
    public Integer getAuthStatus() {
        return this.authStatus;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return engineType
     */
    public String getEngineType() {
        return this.engineType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return productId
     */
    public Long getProductId() {
        return this.productId;
    }

    /**
     * @return searchKey
     */
    public String getSearchKey() {
        return this.searchKey;
    }

    /**
     * @return searchType
     */
    public String getSearchType() {
        return this.searchType;
    }

    /**
     * @return serviceRegionId
     */
    public String getServiceRegionId() {
        return this.serviceRegionId;
    }

    public static final class Builder extends Request.Builder<DescribeInstanceSourcesRequest, Builder> {
        private Integer auditStatus; 
        private Integer authStatus; 
        private Integer currentPage; 
        private String engineType; 
        private String instanceId; 
        private String lang; 
        private Integer pageSize; 
        private String productCode; 
        private Long productId; 
        private String searchKey; 
        private String searchType; 
        private String serviceRegionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInstanceSourcesRequest request) {
            super(request);
            this.auditStatus = request.auditStatus;
            this.authStatus = request.authStatus;
            this.currentPage = request.currentPage;
            this.engineType = request.engineType;
            this.instanceId = request.instanceId;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.productCode = request.productCode;
            this.productId = request.productId;
            this.searchKey = request.searchKey;
            this.searchType = request.searchType;
            this.serviceRegionId = request.serviceRegionId;
        } 

        /**
         * AuditStatus.
         */
        public Builder auditStatus(Integer auditStatus) {
            this.putQueryParameter("AuditStatus", auditStatus);
            this.auditStatus = auditStatus;
            return this;
        }

        /**
         * AuthStatus.
         */
        public Builder authStatus(Integer authStatus) {
            this.putQueryParameter("AuthStatus", authStatus);
            this.authStatus = authStatus;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * EngineType.
         */
        public Builder engineType(String engineType) {
            this.putQueryParameter("EngineType", engineType);
            this.engineType = engineType;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ProductCode.
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * ProductId.
         */
        public Builder productId(Long productId) {
            this.putQueryParameter("ProductId", productId);
            this.productId = productId;
            return this;
        }

        /**
         * SearchKey.
         */
        public Builder searchKey(String searchKey) {
            this.putQueryParameter("SearchKey", searchKey);
            this.searchKey = searchKey;
            return this;
        }

        /**
         * SearchType.
         */
        public Builder searchType(String searchType) {
            this.putQueryParameter("SearchType", searchType);
            this.searchType = searchType;
            return this;
        }

        /**
         * ServiceRegionId.
         */
        public Builder serviceRegionId(String serviceRegionId) {
            this.putQueryParameter("ServiceRegionId", serviceRegionId);
            this.serviceRegionId = serviceRegionId;
            return this;
        }

        @Override
        public DescribeInstanceSourcesRequest build() {
            return new DescribeInstanceSourcesRequest(this);
        } 

    } 

}
