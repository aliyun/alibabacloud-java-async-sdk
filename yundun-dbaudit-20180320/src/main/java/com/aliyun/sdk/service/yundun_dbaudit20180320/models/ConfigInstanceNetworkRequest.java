// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_dbaudit20180320.models;

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
 * {@link ConfigInstanceNetworkRequest} extends {@link RequestModel}
 *
 * <p>ConfigInstanceNetworkRequest</p>
 */
public class ConfigInstanceNetworkRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrivateWhiteList")
    private java.util.List<String> privateWhiteList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PublicAccessControl")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer publicAccessControl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PublicWhiteList")
    private java.util.List<String> publicWhiteList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityGroupIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> securityGroupIds;

    private ConfigInstanceNetworkRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.privateWhiteList = builder.privateWhiteList;
        this.publicAccessControl = builder.publicAccessControl;
        this.publicWhiteList = builder.publicWhiteList;
        this.regionId = builder.regionId;
        this.securityGroupIds = builder.securityGroupIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigInstanceNetworkRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return privateWhiteList
     */
    public java.util.List<String> getPrivateWhiteList() {
        return this.privateWhiteList;
    }

    /**
     * @return publicAccessControl
     */
    public Integer getPublicAccessControl() {
        return this.publicAccessControl;
    }

    /**
     * @return publicWhiteList
     */
    public java.util.List<String> getPublicWhiteList() {
        return this.publicWhiteList;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return securityGroupIds
     */
    public java.util.List<String> getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    public static final class Builder extends Request.Builder<ConfigInstanceNetworkRequest, Builder> {
        private String instanceId; 
        private java.util.List<String> privateWhiteList; 
        private Integer publicAccessControl; 
        private java.util.List<String> publicWhiteList; 
        private String regionId; 
        private java.util.List<String> securityGroupIds; 

        private Builder() {
            super();
        } 

        private Builder(ConfigInstanceNetworkRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.privateWhiteList = request.privateWhiteList;
            this.publicAccessControl = request.publicAccessControl;
            this.publicWhiteList = request.publicWhiteList;
            this.regionId = request.regionId;
            this.securityGroupIds = request.securityGroupIds;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * PrivateWhiteList.
         */
        public Builder privateWhiteList(java.util.List<String> privateWhiteList) {
            this.putQueryParameter("PrivateWhiteList", privateWhiteList);
            this.privateWhiteList = privateWhiteList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder publicAccessControl(Integer publicAccessControl) {
            this.putQueryParameter("PublicAccessControl", publicAccessControl);
            this.publicAccessControl = publicAccessControl;
            return this;
        }

        /**
         * PublicWhiteList.
         */
        public Builder publicWhiteList(java.util.List<String> publicWhiteList) {
            this.putQueryParameter("PublicWhiteList", publicWhiteList);
            this.publicWhiteList = publicWhiteList;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder securityGroupIds(java.util.List<String> securityGroupIds) {
            this.putQueryParameter("SecurityGroupIds", securityGroupIds);
            this.securityGroupIds = securityGroupIds;
            return this;
        }

        @Override
        public ConfigInstanceNetworkRequest build() {
            return new ConfigInstanceNetworkRequest(this);
        } 

    } 

}
