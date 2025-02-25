// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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
 * {@link ListPrivateDNSRequest} extends {@link RequestModel}
 *
 * <p>ListPrivateDNSRequest</p>
 */
public class ListPrivateDNSRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IntranetDomain")
    private String intranetDomain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private ListPrivateDNSRequest(Builder builder) {
        super(builder);
        this.intranetDomain = builder.intranetDomain;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.securityToken = builder.securityToken;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPrivateDNSRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return intranetDomain
     */
    public String getIntranetDomain() {
        return this.intranetDomain;
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
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListPrivateDNSRequest, Builder> {
        private String intranetDomain; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String securityToken; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListPrivateDNSRequest request) {
            super(request);
            this.intranetDomain = request.intranetDomain;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.securityToken = request.securityToken;
            this.type = request.type;
        } 

        /**
         * <p>The internal domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>api.demo.com</p>
         */
        public Builder intranetDomain(String intranetDomain) {
            this.putQueryParameter("IntranetDomain", intranetDomain);
            this.intranetDomain = intranetDomain;
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
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * <p>The internal domain name resolution type. Valid values:</p>
         * <ul>
         * <li>VPC: resolution for virtual private cloud (VPC) access authorizations. A resolution of this type can be bound only to traditional dedicated instances.</li>
         * <li>A: resolution that supports A records. A resolution of this type can be bound only to VPC integration dedicated instances.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>A</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListPrivateDNSRequest build() {
            return new ListPrivateDNSRequest(this);
        } 

    } 

}
