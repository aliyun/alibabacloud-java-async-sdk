// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mns_open20220119.models;

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
 * {@link AuthorizeEndpointAclRequest} extends {@link RequestModel}
 *
 * <p>AuthorizeEndpointAclRequest</p>
 */
public class AuthorizeEndpointAclRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AclStrategy")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aclStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CidrList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> cidrList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndpointType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endpointType;

    private AuthorizeEndpointAclRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.aclStrategy = builder.aclStrategy;
        this.cidrList = builder.cidrList;
        this.endpointType = builder.endpointType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AuthorizeEndpointAclRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return aclStrategy
     */
    public String getAclStrategy() {
        return this.aclStrategy;
    }

    /**
     * @return cidrList
     */
    public java.util.List<String> getCidrList() {
        return this.cidrList;
    }

    /**
     * @return endpointType
     */
    public String getEndpointType() {
        return this.endpointType;
    }

    public static final class Builder extends Request.Builder<AuthorizeEndpointAclRequest, Builder> {
        private String regionId; 
        private String aclStrategy; 
        private java.util.List<String> cidrList; 
        private String endpointType; 

        private Builder() {
            super();
        } 

        private Builder(AuthorizeEndpointAclRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.aclStrategy = request.aclStrategy;
            this.cidrList = request.cidrList;
            this.endpointType = request.endpointType;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ACL policy. Valid values:</p>
         * <ul>
         * <li><strong>allow</strong>: indicates that this operation is included in the Cidr whitelist. (Only the allow is supported.)</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>allow</p>
         */
        public Builder aclStrategy(String aclStrategy) {
            this.putQueryParameter("AclStrategy", aclStrategy);
            this.aclStrategy = aclStrategy;
            return this;
        }

        /**
         * <p>The list of CIDR block.</p>
         * <p>This parameter is required.</p>
         */
        public Builder cidrList(java.util.List<String> cidrList) {
            String cidrListShrink = shrink(cidrList, "CidrList", "simple");
            this.putQueryParameter("CidrList", cidrListShrink);
            this.cidrList = cidrList;
            return this;
        }

        /**
         * <p>The type of the endpoint. Valid values:</p>
         * <ul>
         * <li><strong>public</strong>: indicates public endpoint. (Only the public endpoint is supported.)</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>public</p>
         */
        public Builder endpointType(String endpointType) {
            this.putQueryParameter("EndpointType", endpointType);
            this.endpointType = endpointType;
            return this;
        }

        @Override
        public AuthorizeEndpointAclRequest build() {
            return new AuthorizeEndpointAclRequest(this);
        } 

    } 

}
