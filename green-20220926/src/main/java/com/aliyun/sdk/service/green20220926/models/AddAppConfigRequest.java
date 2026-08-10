// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link AddAppConfigRequest} extends {@link RequestModel}
 *
 * <p>AddAppConfigRequest</p>
 */
public class AddAppConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Classify")
    private String classify;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SysAppId")
    private String sysAppId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private AddAppConfigRequest(Builder builder) {
        super(builder);
        this.classify = builder.classify;
        this.name = builder.name;
        this.regionId = builder.regionId;
        this.resourceType = builder.resourceType;
        this.sysAppId = builder.sysAppId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddAppConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return classify
     */
    public String getClassify() {
        return this.classify;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return sysAppId
     */
    public String getSysAppId() {
        return this.sysAppId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<AddAppConfigRequest, Builder> {
        private String classify; 
        private String name; 
        private String regionId; 
        private String resourceType; 
        private String sysAppId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(AddAppConfigRequest request) {
            super(request);
            this.classify = request.classify;
            this.name = request.name;
            this.regionId = request.regionId;
            this.resourceType = request.resourceType;
            this.sysAppId = request.sysAppId;
            this.type = request.type;
        } 

        /**
         * Classify.
         */
        public Builder classify(String classify) {
            this.putQueryParameter("Classify", classify);
            this.classify = classify;
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

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>appId</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder sysAppId(String sysAppId) {
            this.putQueryParameter("SysAppId", sysAppId);
            this.sysAppId = sysAppId;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public AddAppConfigRequest build() {
            return new AddAppConfigRequest(this);
        } 

    } 

}
