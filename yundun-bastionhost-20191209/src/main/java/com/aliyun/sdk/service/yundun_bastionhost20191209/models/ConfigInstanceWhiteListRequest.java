// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigInstanceWhiteListRequest} extends {@link RequestModel}
 *
 * <p>ConfigInstanceWhiteListRequest</p>
 */
public class ConfigInstanceWhiteListRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("WhiteList")
    private java.util.List < String > whiteList;

    private ConfigInstanceWhiteListRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.whiteList = builder.whiteList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigInstanceWhiteListRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return whiteList
     */
    public java.util.List < String > getWhiteList() {
        return this.whiteList;
    }

    public static final class Builder extends Request.Builder<ConfigInstanceWhiteListRequest, Builder> {
        private String instanceId; 
        private String regionId; 
        private java.util.List < String > whiteList; 

        private Builder() {
            super();
        } 

        private Builder(ConfigInstanceWhiteListRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.whiteList = request.whiteList;
        } 

        /**
         * The ID of the bastion host for which a whitelist of public IP addresses is configured.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Configures a whitelist of public IP addresses for a bastion host.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ConfigInstanceWhiteList
         */
        public Builder whiteList(java.util.List < String > whiteList) {
            this.putQueryParameter("WhiteList", whiteList);
            this.whiteList = whiteList;
            return this;
        }

        @Override
        public ConfigInstanceWhiteListRequest build() {
            return new ConfigInstanceWhiteListRequest(this);
        } 

    } 

}
