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

    @Query
    @NameInMap("WebSiteType")
    private String webSiteType;

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
        this.webSiteType = builder.webSiteType;
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

    /**
     * @return webSiteType
     */
    public String getWebSiteType() {
        return this.webSiteType;
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
        private String webSiteType; 

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
            this.webSiteType = request.webSiteType;
        } 

        /**
         * The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC+0.
         * <p>
         * 
         * > The end time must be later than the start time.
         */
        public Builder changeEndTime(String changeEndTime) {
            this.putQueryParameter("ChangeEndTime", changeEndTime);
            this.changeEndTime = changeEndTime;
            return this;
        }

        /**
         * The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC+0.
         */
        public Builder changeStartTime(String changeStartTime) {
            this.putQueryParameter("ChangeStartTime", changeStartTime);
            this.changeStartTime = changeStartTime;
            return this;
        }

        /**
         * Specifies whether to display domain names that are under review, failed the review, or failed to be configured. Valid values:
         * <p>
         * 
         * *   true: displays domain names.
         * *   false: does not display detailed information.
         */
        public Builder checkDomainShow(Boolean checkDomainShow) {
            this.putQueryParameter("CheckDomainShow", checkDomainShow);
            this.checkDomainShow = checkDomainShow;
            return this;
        }

        /**
         * The acceleration region. By default, all acceleration regions are queried.
         * <p>
         * 
         * *   **domestic**: Chinese mainland
         * *   **overseas**: outside the Chinese mainland
         * *   **global**: global
         */
        public Builder coverage(String coverage) {
            this.putQueryParameter("Coverage", coverage);
            this.coverage = coverage;
            return this;
        }

        /**
         * The accelerated domain names. If you do not set this parameter, configurations of all domain names that match the conditions are returned.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * The search method. Default value: full_match. Valid values:
         * <p>
         * 
         * *   **fuzzy_match**: fuzzy match
         * *   **pre_match**: prefix match
         * *   **suf_match**: suffix match
         * *   **full_match** (default): exact match
         * 
         * > If you specify the domain names to query but do not set the DomainSearchType parameter, the exact match mode is used.
         */
        public Builder domainSearchType(String domainSearchType) {
            this.putQueryParameter("DomainSearchType", domainSearchType);
            this.domainSearchType = domainSearchType;
            return this;
        }

        /**
         * The status of the domain name. Valid values:
         * <p>
         * 
         * *   **online**: enabled
         * *   **offline**: disabled
         * *   **configuring**: configuring
         * *   **configure_failed**: configuration failed
         * *   **checking**: reviewing
         * *   **check_failed:** review failed
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
         * The number of returned pages. Valid values: **1** to **100000**.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: **20**. Valid values: **1** to **500**.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the resource group.
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
         * The list of tags.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * WebSiteType.
         */
        public Builder webSiteType(String webSiteType) {
            this.putQueryParameter("WebSiteType", webSiteType);
            this.webSiteType = webSiteType;
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
             * The tag key. Valid values of N: **1** to **20**. You can call the TagDcdnResources operation to set a tag for a domain name.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value. Valid values of N: **1** to **20**.
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
