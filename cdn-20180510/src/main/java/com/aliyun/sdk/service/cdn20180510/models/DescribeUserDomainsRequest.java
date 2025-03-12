// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

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
 * {@link DescribeUserDomainsRequest} extends {@link RequestModel}
 *
 * <p>DescribeUserDomainsRequest</p>
 */
public class DescribeUserDomainsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CdnType")
    private String cdnType;

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
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    private DescribeUserDomainsRequest(Builder builder) {
        super(builder);
        this.cdnType = builder.cdnType;
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
        this.source = builder.source;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserDomainsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cdnType
     */
    public String getCdnType() {
        return this.cdnType;
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
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<DescribeUserDomainsRequest, Builder> {
        private String cdnType; 
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
        private String source; 
        private java.util.List<Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(DescribeUserDomainsRequest request) {
            super(request);
            this.cdnType = request.cdnType;
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
            this.source = request.source;
            this.tag = request.tag;
        } 

        /**
         * <p>The type of workload accelerated by Alibaba Cloud CDN. Separate types with commas (,). Valid values:</p>
         * <ul>
         * <li><strong>web</strong>: images and small files</li>
         * <li><strong>download</strong>: large files</li>
         * <li><strong>video</strong>: on-demand video and audio streaming</li>
         * </ul>
         * <p>If you do not set this parameter, all service types are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>download,web,video</p>
         */
        public Builder cdnType(String cdnType) {
            this.putQueryParameter("CdnType", cdnType);
            this.cdnType = cdnType;
            return this;
        }

        /**
         * <p>The end of the time range to query. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * <blockquote>
         * <p>The end time must be later than the start time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2019-10-10T12:14:58Z</p>
         */
        public Builder changeEndTime(String changeEndTime) {
            this.putQueryParameter("ChangeEndTime", changeEndTime);
            this.changeEndTime = changeEndTime;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-10-10T12:14:55Z</p>
         */
        public Builder changeStartTime(String changeStartTime) {
            this.putQueryParameter("ChangeStartTime", changeStartTime);
            this.changeStartTime = changeStartTime;
            return this;
        }

        /**
         * <p>Specifies whether to display domain names that are under review, failed the review, or failed to be configured. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
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
         * <p>The acceleration region. By default, all acceleration regions are queried. Valid values:</p>
         * <ul>
         * <li><strong>domestic</strong>: Chinese mainland</li>
         * <li><strong>global</strong>: global</li>
         * <li><strong>overseas</strong>: outside the Chinese mainland</li>
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
         * <p>The accelerated domain. If you do not set this parameter, all domain names that match the conditions are returned.</p>
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
         * <p>The search mode. Valid values:</p>
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
         * <li><strong>online</strong></li>
         * <li><strong>offline</strong></li>
         * <li><strong>configuring</strong></li>
         * <li><strong>configure_failed</strong></li>
         * <li><strong>checking</strong></li>
         * <li><strong>check_failed</strong></li>
         * <li><strong>stopping</strong></li>
         * <li><strong>deleting</strong></li>
         * </ul>
         * <p>If you do not set this parameter, domain names in all states are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>configure_failed</p>
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
         * <p>The page number. Valid values: <strong>1</strong> to <strong>100000</strong>.</p>
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
         * <p>The number of entries to return on each page. Valid values: <strong>1 to 500</strong>. Default value: <strong>20</strong>. Maximum value: <strong>500</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the resource group. By default, all IDs are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>abcd1234abcd1234</p>
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
         * <p>The information about the origin server.</p>
         * 
         * <strong>example:</strong>
         * <p>example.source.com</p>
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * <p>The list of tags. Maximum number of elements in the list: 20</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public DescribeUserDomainsRequest build() {
            return new DescribeUserDomainsRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeUserDomainsRequest} extends {@link TeaModel}
     *
     * <p>DescribeUserDomainsRequest</p>
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
             * <p>The key of a tag.</p>
             * <p>By default, all tag keys are queried.</p>
             * 
             * <strong>example:</strong>
             * <p>key</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the tag.</p>
             * <p>By default, all tag values are queried.</p>
             * 
             * <strong>example:</strong>
             * <p>value</p>
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
