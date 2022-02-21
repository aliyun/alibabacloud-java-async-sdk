// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserLiveDomainsRequest} extends {@link RequestModel}
 *
 * <p>DescribeUserLiveDomainsRequest</p>
 */
public class DescribeUserLiveDomainsRequest extends Request {
    @Query
    @NameInMap("CheckDomainShow")
    private Boolean checkDomainShow;

    @Query
    @NameInMap("DomainName")
    private String domainName;

    @Query
    @NameInMap("DomainSearchType")
    private String domainSearchType;

    @Query
    @NameInMap("DomainStatus")
    private String domainStatus;

    @Query
    @NameInMap("FuncFilter")
    private String funcFilter;

    @Query
    @NameInMap("FuncId")
    private String funcId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 500)
    private Integer pageSize;

    @Query
    @NameInMap("Region")
    private String region;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private DescribeUserLiveDomainsRequest(Builder builder) {
        super(builder);
        this.checkDomainShow = builder.checkDomainShow;
        this.domainName = builder.domainName;
        this.domainSearchType = builder.domainSearchType;
        this.domainStatus = builder.domainStatus;
        this.funcFilter = builder.funcFilter;
        this.funcId = builder.funcId;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.region = builder.region;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserLiveDomainsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkDomainShow
     */
    public Boolean getCheckDomainShow() {
        return this.checkDomainShow;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return domainSearchType
     */
    public String getDomainSearchType() {
        return this.domainSearchType;
    }

    /**
     * @return domainStatus
     */
    public String getDomainStatus() {
        return this.domainStatus;
    }

    /**
     * @return funcFilter
     */
    public String getFuncFilter() {
        return this.funcFilter;
    }

    /**
     * @return funcId
     */
    public String getFuncId() {
        return this.funcId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<DescribeUserLiveDomainsRequest, Builder> {
        private Boolean checkDomainShow; 
        private String domainName; 
        private String domainSearchType; 
        private String domainStatus; 
        private String funcFilter; 
        private String funcId; 
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String region; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DescribeUserLiveDomainsRequest response) {
            super(response);
            this.checkDomainShow = response.checkDomainShow;
            this.domainName = response.domainName;
            this.domainSearchType = response.domainSearchType;
            this.domainStatus = response.domainStatus;
            this.funcFilter = response.funcFilter;
            this.funcId = response.funcId;
            this.ownerId = response.ownerId;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.region = response.region;
            this.securityToken = response.securityToken;
        } 

        /**
         * CheckDomainShow.
         */
        public Builder checkDomainShow(Boolean checkDomainShow) {
            this.putQueryParameter("CheckDomainShow", checkDomainShow);
            this.checkDomainShow = checkDomainShow;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * DomainSearchType.
         */
        public Builder domainSearchType(String domainSearchType) {
            this.putQueryParameter("DomainSearchType", domainSearchType);
            this.domainSearchType = domainSearchType;
            return this;
        }

        /**
         * DomainStatus.
         */
        public Builder domainStatus(String domainStatus) {
            this.putQueryParameter("DomainStatus", domainStatus);
            this.domainStatus = domainStatus;
            return this;
        }

        /**
         * FuncFilter.
         */
        public Builder funcFilter(String funcFilter) {
            this.putQueryParameter("FuncFilter", funcFilter);
            this.funcFilter = funcFilter;
            return this;
        }

        /**
         * FuncId.
         */
        public Builder funcId(String funcId) {
            this.putQueryParameter("FuncId", funcId);
            this.funcId = funcId;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
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
         * Region.
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        @Override
        public DescribeUserLiveDomainsRequest build() {
            return new DescribeUserLiveDomainsRequest(this);
        } 

    } 

}
