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
    @com.aliyun.core.annotation.NameInMap("X-Debug-Id")
    private String xDebugId;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("x-sysom-invoke-source")
    private String xSysomInvokeSource;

    private ListInstancesEcsInfoListRequest(Builder builder) {
        super(builder);
        this.xDebugId = builder.xDebugId;
        this.infoType = builder.infoType;
        this.instanceId = builder.instanceId;
        this.managedType = builder.managedType;
        this.pluginId = builder.pluginId;
        this.region = builder.region;
        this.xSysomInvokeSource = builder.xSysomInvokeSource;
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
     * @return xDebugId
     */
    public String getXDebugId() {
        return this.xDebugId;
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

    /**
     * @return xSysomInvokeSource
     */
    public String getXSysomInvokeSource() {
        return this.xSysomInvokeSource;
    }

    public static final class Builder extends Request.Builder<ListInstancesEcsInfoListRequest, Builder> {
        private String xDebugId; 
        private String infoType; 
        private String instanceId; 
        private String managedType; 
        private String pluginId; 
        private String region; 
        private String xSysomInvokeSource; 

        private Builder() {
            super();
        } 

        private Builder(ListInstancesEcsInfoListRequest request) {
            super(request);
            this.xDebugId = request.xDebugId;
            this.infoType = request.infoType;
            this.instanceId = request.instanceId;
            this.managedType = request.managedType;
            this.pluginId = request.pluginId;
            this.region = request.region;
            this.xSysomInvokeSource = request.xSysomInvokeSource;
        } 

        /**
         * X-Debug-Id.
         */
        public Builder xDebugId(String xDebugId) {
            this.putQueryParameter("X-Debug-Id", xDebugId);
            this.xDebugId = xDebugId;
            return this;
        }

        /**
         * <p>The type of information to retrieve.</p>
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
         * <p>Specifies the instance ID to filter the Agent installation status of the specified instance.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp118piqcio9tiwgh84b</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("instance_id", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The management status of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>managed</p>
         */
        public Builder managedType(String managedType) {
            this.putQueryParameter("managed_type", managedType);
            this.managedType = managedType;
            return this;
        }

        /**
         * <p>Specifies the component ID to filter the instance information list for the corresponding component.</p>
         * 
         * <strong>example:</strong>
         * <p>74a86327-3170-412c-8e67-da3389ec56a9</p>
         */
        public Builder pluginId(String pluginId) {
            this.putQueryParameter("plugin_id", pluginId);
            this.pluginId = pluginId;
            return this;
        }

        /**
         * <p>The region used to filter instances.</p>
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

        /**
         * x-sysom-invoke-source.
         */
        public Builder xSysomInvokeSource(String xSysomInvokeSource) {
            this.putQueryParameter("x-sysom-invoke-source", xSysomInvokeSource);
            this.xSysomInvokeSource = xSysomInvokeSource;
            return this;
        }

        @Override
        public ListInstancesEcsInfoListRequest build() {
            return new ListInstancesEcsInfoListRequest(this);
        } 

    } 

}
