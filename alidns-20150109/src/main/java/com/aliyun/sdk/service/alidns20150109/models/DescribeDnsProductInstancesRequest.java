// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The Sorting direction. Values:
         * <p>
         * * **DESC**: Descending (if not specified, the default is descending order)
         * * **ASC**: Ascending
         */
        public Builder direction(String direction) {
            this.putQueryParameter("Direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * The type of the domain name. Valid values:
         * <p>
         * 
         * *   PUBLIC (default): hosted public domain name
         * *   CACHE: cached public domain name
         */
        public Builder domainType(String domainType) {
            this.putQueryParameter("DomainType", domainType);
            this.domainType = domainType;
            return this;
        }

        /**
         * The language of the content within the request and response. Valid values:
         * <p>
         * 
         * *   **zh** : Chinese
         * *   **en** (default) : English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The Sorting parameter. Values:
         * <p>
         * * createDate: Sort by creation time (if not specified, the default is to sort by creation time)
         * * expireDate: Sort by expiration time
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * The number of the page to return. Pages start from page **1**. Default value: **1**.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page. Maximum value: **100**. Default value: **20**.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The IP address of the client.
         */
        public Builder userClientIp(String userClientIp) {
            this.putQueryParameter("UserClientIp", userClientIp);
            this.userClientIp = userClientIp;
            return this;
        }

        /**
         * The version code of the Alibaba Cloud DNS instance.
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
