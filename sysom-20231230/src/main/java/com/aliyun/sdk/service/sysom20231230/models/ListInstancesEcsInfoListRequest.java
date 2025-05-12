// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link ListInstancesEcsInfoListRequest} extends {@link RequestModel}
 *
 * <p>ListInstancesEcsInfoListRequest</p>
 */
public class ListInstancesEcsInfoListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("info_type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String infoType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("instance_id")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("managed_type")
    private String managedType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("plugin_id")
    private String pluginId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("region")
    @com.aliyun.core.annotation.Validation(required = true)
    private String region;

    private ListInstancesEcsInfoListRequest(Builder builder) {
        super(builder);
        this.infoType = builder.infoType;
        this.instanceId = builder.instanceId;
        this.managedType = builder.managedType;
        this.pluginId = builder.pluginId;
        this.region = builder.region;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstancesEcsInfoListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return infoType
     */
    public String getInfoType() {
        return this.infoType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return managedType
     */
    public String getManagedType() {
        return this.managedType;
    }

    /**
     * @return pluginId
     */
    public String getPluginId() {
        return this.pluginId;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    public static final class Builder extends Request.Builder<ListInstancesEcsInfoListRequest, Builder> {
        private String infoType; 
        private String instanceId; 
        private String managedType; 
        private String pluginId; 
        private String region; 

        private Builder() {
            super();
        } 

        private Builder(ListInstancesEcsInfoListRequest request) {
            super(request);
            this.infoType = request.infoType;
            this.instanceId = request.instanceId;
            this.managedType = request.managedType;
            this.pluginId = request.pluginId;
            this.region = request.region;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ip</p>
         */
        public Builder infoType(String infoType) {
            this.putQueryParameter("info_type", infoType);
            this.infoType = infoType;
            return this;
        }

        /**
         * instance_id.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("instance_id", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * managed_type.
         */
        public Builder managedType(String managedType) {
            this.putQueryParameter("managed_type", managedType);
            this.managedType = managedType;
            return this;
        }

        /**
         * plugin_id.
         */
        public Builder pluginId(String pluginId) {
            this.putQueryParameter("plugin_id", pluginId);
            this.pluginId = pluginId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen</p>
         */
        public Builder region(String region) {
            this.putQueryParameter("region", region);
            this.region = region;
            return this;
        }

        @Override
        public ListInstancesEcsInfoListRequest build() {
            return new ListInstancesEcsInfoListRequest(this);
        } 

    } 

}
