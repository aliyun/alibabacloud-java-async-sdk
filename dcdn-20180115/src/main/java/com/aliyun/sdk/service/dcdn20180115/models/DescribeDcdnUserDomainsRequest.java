// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnUserDomainsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnUserDomainsRequest</p>
 */
public class DescribeDcdnUserDomainsRequest extends Request {
    @Query
    @NameInMap("ChangeEndTime")
    private String changeEndTime;

    @Query
    @NameInMap("ChangeStartTime")
    private String changeStartTime;

    @Query
    @NameInMap("CheckDomainShow")
    private Boolean checkDomainShow;

    @Query
    @NameInMap("Coverage")
    private String coverage;

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
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    private DescribeDcdnUserDomainsRequest(Builder builder) {
        super(builder);
        this.changeEndTime = builder.changeEndTime;
        this.changeStartTime = builder.changeStartTime;
        this.checkDomainShow = builder.checkDomainShow;
        this.coverage = builder.coverage;
        this.domainName = builder.domainName;
        this.domainSearchType = builder.domainSearchType;
        this.domainStatus = builder.domainStatus;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.resourceGroupId = builder.resourceGroupId;
        this.securityToken = builder.securityToken;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnUserDomainsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return changeEndTime
     */
    public String getChangeEndTime() {
        return this.changeEndTime;
    }

    /**
     * @return changeStartTime
     */
    public String getChangeStartTime() {
        return this.changeStartTime;
    }

    /**
     * @return checkDomainShow
     */
    public Boolean getCheckDomainShow() {
        return this.checkDomainShow;
    }

    /**
     * @return coverage
     */
    public String getCoverage() {
        return this.coverage;
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<DescribeDcdnUserDomainsRequest, Builder> {
        private String changeEndTime; 
        private String changeStartTime; 
        private Boolean checkDomainShow; 
        private String coverage; 
        private String domainName; 
        private String domainSearchType; 
        private String domainStatus; 
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String resourceGroupId; 
        private String securityToken; 
        private java.util.List < Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDcdnUserDomainsRequest request) {
            super(request);
            this.changeEndTime = request.changeEndTime;
            this.changeStartTime = request.changeStartTime;
            this.checkDomainShow = request.checkDomainShow;
            this.coverage = request.coverage;
            this.domainName = request.domainName;
            this.domainSearchType = request.domainSearchType;
            this.domainStatus = request.domainStatus;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.resourceGroupId = request.resourceGroupId;
            this.securityToken = request.securityToken;
            this.tag = request.tag;
        } 

        /**
         * ChangeEndTime.
         */
        public Builder changeEndTime(String changeEndTime) {
            this.putQueryParameter("ChangeEndTime", changeEndTime);
            this.changeEndTime = changeEndTime;
            return this;
        }

        /**
         * ChangeStartTime.
         */
        public Builder changeStartTime(String changeStartTime) {
            this.putQueryParameter("ChangeStartTime", changeStartTime);
            this.changeStartTime = changeStartTime;
            return this;
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
         * Coverage.
         */
        public Builder coverage(String coverage) {
            this.putQueryParameter("Coverage", coverage);
            this.coverage = coverage;
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
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
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

        /**
         * Tag.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public DescribeDcdnUserDomainsRequest build() {
            return new DescribeDcdnUserDomainsRequest(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
