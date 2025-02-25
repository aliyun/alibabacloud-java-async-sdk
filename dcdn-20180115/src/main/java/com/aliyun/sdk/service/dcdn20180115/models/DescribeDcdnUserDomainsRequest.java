// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnUserDomainsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnUserDomainsRequest</p>
 */
public class DescribeDcdnUserDomainsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChangeEndTime")
    private String changeEndTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChangeStartTime")
    private String changeStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckDomainShow")
    private Boolean checkDomainShow;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Coverage")
    private String coverage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(maxLength = 6800)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainSearchType")
    private String domainSearchType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainStatus")
    private String domainStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 500)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List < Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WebSiteType")
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
         * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC+0.</p>
         * <blockquote>
         * <p>The end time must be later than the start time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2018-05-10T14:00:00Z</p>
         */
        public Builder changeEndTime(String changeEndTime) {
            this.putQueryParameter("ChangeEndTime", changeEndTime);
            this.changeEndTime = changeEndTime;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC+0.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-05-10T12:00:00Z</p>
         */
        public Builder changeStartTime(String changeStartTime) {
            this.putQueryParameter("ChangeStartTime", changeStartTime);
            this.changeStartTime = changeStartTime;
            return this;
        }

        /**
         * <p>Specifies whether to display domain names that are under review, failed the review, or failed to be configured. Valid values:</p>
         * <ul>
         * <li>true: displays domain names.</li>
         * <li>false: does not display detailed information.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder checkDomainShow(Boolean checkDomainShow) {
            this.putQueryParameter("CheckDomainShow", checkDomainShow);
            this.checkDomainShow = checkDomainShow;
            return this;
        }

        /**
         * <p>The acceleration region. By default, all acceleration regions are queried.</p>
         * <ul>
         * <li><strong>domestic</strong>: Chinese mainland</li>
         * <li><strong>overseas</strong>: outside the Chinese mainland</li>
         * <li><strong>global</strong>: global</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>domestic</p>
         */
        public Builder coverage(String coverage) {
            this.putQueryParameter("Coverage", coverage);
            this.coverage = coverage;
            return this;
        }

        /**
         * <p>The accelerated domain names. If you do not set this parameter, configurations of all domain names that match the conditions are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The search method. Default value: full_match. Valid values:</p>
         * <ul>
         * <li><strong>fuzzy_match</strong>: fuzzy match</li>
         * <li><strong>pre_match</strong>: prefix match</li>
         * <li><strong>suf_match</strong>: suffix match</li>
         * <li><strong>full_match</strong> (default): exact match</li>
         * </ul>
         * <blockquote>
         * <p>If you specify the domain names to query but do not set the DomainSearchType parameter, the exact match mode is used.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>fuzzy_match</p>
         */
        public Builder domainSearchType(String domainSearchType) {
            this.putQueryParameter("DomainSearchType", domainSearchType);
            this.domainSearchType = domainSearchType;
            return this;
        }

        /**
         * <p>The status of the domain name. Valid values:</p>
         * <ul>
         * <li><strong>online</strong>: enabled</li>
         * <li><strong>offline</strong>: disabled</li>
         * <li><strong>configuring</strong>: configuring</li>
         * <li><strong>configure_failed</strong>: configuration failed</li>
         * <li><strong>checking</strong>: reviewing</li>
         * <li><strong>check_failed:</strong> review failed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>online</p>
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
         * <p>The number of returned pages. Valid values: <strong>1</strong> to <strong>100000</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Default value: <strong>20</strong>. Valid values: <strong>1</strong> to <strong>500</strong>.</p>
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
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmv6jutt**</p>
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
         * <p>The list of tags.</p>
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The business type of the domain. Separate multiple values with commas (,). Default value: <strong>dynamic</strong>. To query common domains, keep the default value. To query domains of the computing business type, enter <strong>computing_routine</strong> or <strong>computing_image</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>computing_routine</p>
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

    /**
     * 
     * {@link DescribeDcdnUserDomainsRequest} extends {@link TeaModel}
     *
     * <p>DescribeDcdnUserDomainsRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The tag key. Valid values of N: <strong>1</strong> to <strong>20</strong>. You can call the TagDcdnResources operation to set a tag for a domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value. Valid values of N: <strong>1</strong> to <strong>20</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
