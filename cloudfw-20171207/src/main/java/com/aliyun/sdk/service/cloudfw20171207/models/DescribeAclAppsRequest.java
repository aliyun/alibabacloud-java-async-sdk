// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeAclAppsRequest} extends {@link RequestModel}
 *
 * <p>DescribeAclAppsRequest</p>
 */
public class DescribeAclAppsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AclType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aclType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Popular")
    private Integer popular;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Protocols")
    private java.util.List<String> protocols;

    private DescribeAclAppsRequest(Builder builder) {
        super(builder);
        this.aclType = builder.aclType;
        this.lang = builder.lang;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.popular = builder.popular;
        this.protocols = builder.protocols;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAclAppsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aclType
     */
    public String getAclType() {
        return this.aclType;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return popular
     */
    public Integer getPopular() {
        return this.popular;
    }

    /**
     * @return protocols
     */
    public java.util.List<String> getProtocols() {
        return this.protocols;
    }

    public static final class Builder extends Request.Builder<DescribeAclAppsRequest, Builder> {
        private String aclType; 
        private String lang; 
        private Integer pageNo; 
        private Integer pageSize; 
        private Integer popular; 
        private java.util.List<String> protocols; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAclAppsRequest request) {
            super(request);
            this.aclType = request.aclType;
            this.lang = request.lang;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.popular = request.popular;
            this.protocols = request.protocols;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        public Builder aclType(String aclType) {
            this.putQueryParameter("AclType", aclType);
            this.aclType = aclType;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Popular.
         */
        public Builder popular(Integer popular) {
            this.putQueryParameter("Popular", popular);
            this.popular = popular;
            return this;
        }

        /**
         * Protocols.
         */
        public Builder protocols(java.util.List<String> protocols) {
            this.putQueryParameter("Protocols", protocols);
            this.protocols = protocols;
            return this;
        }

        @Override
        public DescribeAclAppsRequest build() {
            return new DescribeAclAppsRequest(this);
        } 

    } 

}
