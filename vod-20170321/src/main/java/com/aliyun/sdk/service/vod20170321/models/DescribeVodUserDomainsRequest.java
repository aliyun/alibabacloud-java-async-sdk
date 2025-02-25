// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link DescribeVodUserDomainsRequest} extends {@link RequestModel}
 *
 * <p>DescribeVodUserDomainsRequest</p>
 */
public class DescribeVodUserDomainsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
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
    @com.aliyun.core.annotation.Validation(maximum = 500, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    private DescribeVodUserDomainsRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.domainSearchType = builder.domainSearchType;
        this.domainStatus = builder.domainStatus;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.securityToken = builder.securityToken;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVodUserDomainsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<DescribeVodUserDomainsRequest, Builder> {
        private String domainName; 
        private String domainSearchType; 
        private String domainStatus; 
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String securityToken; 
        private java.util.List<Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVodUserDomainsRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.domainSearchType = request.domainSearchType;
            this.domainStatus = request.domainStatus;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.securityToken = request.securityToken;
            this.tag = request.tag;
        } 

        /**
         * <p>The domain name. The value of this parameter is used as a filter condition for a fuzzy match.</p>
         * 
         * <strong>example:</strong>
         * <p>example.aliyundoc.com</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The search method. Valid values:</p>
         * <ul>
         * <li><strong>fuzzy_match</strong> (default): fuzzy match.</li>
         * <li><strong>pre_match</strong>: prefix match</li>
         * <li><strong>suf_match</strong>: suffix match</li>
         * <li><strong>full_match</strong>: exact match</li>
         * </ul>
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
         * <p>The status of the domain name. Value values:</p>
         * <ul>
         * <li><strong>online</strong>: indicates that the domain name is enabled.</li>
         * <li><strong>offline</strong>: indicates that the domain name is disabled.</li>
         * <li><strong>configuring</strong>: indicates that the domain name is being configured.</li>
         * <li><strong>configure_failed</strong>: indicates that the domain name failed to be configured.</li>
         * <li><strong>checking</strong>: indicates that the domain name is under review.</li>
         * <li><strong>check_failed</strong>: indicates that the domain name failed the review.</li>
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
         * <p>The page number.</p>
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
         * <p>The number of entries per page. Default value: <strong>20</strong>. Maximum value: <strong>50</strong>. Valid values: <strong>1</strong> to <strong>50</strong>.</p>
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
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * <p>The tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public DescribeVodUserDomainsRequest build() {
            return new DescribeVodUserDomainsRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVodUserDomainsRequest} extends {@link TeaModel}
     *
     * <p>DescribeVodUserDomainsRequest</p>
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
             * <p>The key of tag N. Valid values of N: <strong>1</strong> to <strong>20</strong>.</p>
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
             * <p>The value of tag N. Valid values of N: <strong>1</strong> to <strong>20</strong>.</p>
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
