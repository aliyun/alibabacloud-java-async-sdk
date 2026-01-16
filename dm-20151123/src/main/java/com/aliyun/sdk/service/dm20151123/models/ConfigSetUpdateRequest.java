// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

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
 * {@link ConfigSetUpdateRequest} extends {@link RequestModel}
 *
 * <p>ConfigSetUpdateRequest</p>
 */
public class ConfigSetUpdateRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpPoolId")
    private String ipPoolId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    private ConfigSetUpdateRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.description = builder.description;
        this.id = builder.id;
        this.ipPoolId = builder.ipPoolId;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigSetUpdateRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return ipPoolId
     */
    public String getIpPoolId() {
        return this.ipPoolId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<ConfigSetUpdateRequest, Builder> {
        private String regionId; 
        private String description; 
        private String id; 
        private String ipPoolId; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(ConfigSetUpdateRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.description = request.description;
            this.id = request.id;
            this.ipPoolId = request.ipPoolId;
            this.name = request.name;
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
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * IpPoolId.
         */
        public Builder ipPoolId(String ipPoolId) {
            this.putQueryParameter("IpPoolId", ipPoolId);
            this.ipPoolId = ipPoolId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public ConfigSetUpdateRequest build() {
            return new ConfigSetUpdateRequest(this);
        } 

    } 

}
