// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link DescribeDnsProductInstancesRequest} extends {@link RequestModel}
 *
 * <p>DescribeDnsProductInstancesRequest</p>
 */
public class DescribeDnsProductInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Direction")
    private String direction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainType")
    private String domainType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderBy")
    private String orderBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 1000, minimum = 1)
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserClientIp")
    private String userClientIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VersionCode")
    private String versionCode;

    private DescribeDnsProductInstancesRequest(Builder builder) {
        super(builder);
        this.direction = builder.direction;
        this.domainType = builder.domainType;
        this.lang = builder.lang;
        this.orderBy = builder.orderBy;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.userClientIp = builder.userClientIp;
        this.versionCode = builder.versionCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDnsProductInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return direction
     */
    public String getDirection() {
        return this.direction;
    }

    /**
     * @return domainType
     */
    public String getDomainType() {
        return this.domainType;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    /**
     * @return versionCode
     */
    public String getVersionCode() {
        return this.versionCode;
    }

    public static final class Builder extends Request.Builder<DescribeDnsProductInstancesRequest, Builder> {
        private String direction; 
        private String domainType; 
        private String lang; 
        private String orderBy; 
        private Long pageNumber; 
        private Long pageSize; 
        private String userClientIp; 
        private String versionCode; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDnsProductInstancesRequest request) {
            super(request);
            this.direction = request.direction;
            this.domainType = request.domainType;
            this.lang = request.lang;
            this.orderBy = request.orderBy;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.userClientIp = request.userClientIp;
            this.versionCode = request.versionCode;
        } 

        /**
         * <p>The order in which you want to sort returned entries. Valid values:</p>
         * <ul>
         * <li>DESC: Returned entries are sorted in descending order. If this parameter is left empty, returned entries are sorted in descending order by default.</li>
         * <li>ASC: Returned entries are sorted in ascending order.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DESC</p>
         */
        public Builder direction(String direction) {
            this.putQueryParameter("Direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * <p>The type of the domain name. Valid values:</p>
         * <ul>
         * <li>PUBLIC (default): hosted public domain name</li>
         * <li>CACHE: cached public domain name</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PUBLIC</p>
         */
        public Builder domainType(String domainType) {
            this.putQueryParameter("DomainType", domainType);
            this.domainType = domainType;
            return this;
        }

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li>zh: Chinese</li>
         * <li>en: English</li>
         * </ul>
         * <p>Default value: en</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The method that is used to sort returned entries. Valid values:</p>
         * <ul>
         * <li>createDate: sorts returned entries by creation time. If this parameter is left empty, returned entries are sorted by creation time by default.</li>
         * <li>expireDate: sorts returned entries by expiration time.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>createDate</p>
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * <p>The number of the page to return. Pages start from page <strong>1</strong>. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Maximum value: <strong>100</strong>. Default value: <strong>20</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The IP address of the client.</p>
         * 
         * <strong>example:</strong>
         * <p>192.0.2.0</p>
         */
        public Builder userClientIp(String userClientIp) {
            this.putQueryParameter("UserClientIp", userClientIp);
            this.userClientIp = userClientIp;
            return this;
        }

        /**
         * <p>The version code of the Alibaba Cloud DNS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>version1</p>
         */
        public Builder versionCode(String versionCode) {
            this.putQueryParameter("VersionCode", versionCode);
            this.versionCode = versionCode;
            return this;
        }

        @Override
        public DescribeDnsProductInstancesRequest build() {
            return new DescribeDnsProductInstancesRequest(this);
        } 

    } 

}
