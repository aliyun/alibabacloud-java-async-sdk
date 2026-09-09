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
 * {@link ListInstancesWithEcsInfoRequest} extends {@link RequestModel}
 *
 * <p>ListInstancesWithEcsInfoRequest</p>
 */
public class ListInstancesWithEcsInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("X-Debug-Id")
    private String xDebugId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("current")
    private Integer current;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("health_status")
    private String healthStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("instance_id")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("instance_id_name")
    private String instanceIdName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("instance_name")
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("instance_tag")
    private InstanceTag instanceTag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("is_managed")
    private Integer isManaged;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("os_name")
    private String osName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("private_ip")
    private String privateIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("public_ip")
    private String publicIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("region")
    @com.aliyun.core.annotation.Validation(required = true)
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("resource_group_id")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("resource_group_id_name")
    private String resourceGroupIdName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("resource_group_name")
    private String resourceGroupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("x-sysom-invoke-source")
    private String xSysomInvokeSource;

    private ListInstancesWithEcsInfoRequest(Builder builder) {
        super(builder);
        this.xDebugId = builder.xDebugId;
        this.current = builder.current;
        this.healthStatus = builder.healthStatus;
        this.instanceId = builder.instanceId;
        this.instanceIdName = builder.instanceIdName;
        this.instanceName = builder.instanceName;
        this.instanceTag = builder.instanceTag;
        this.isManaged = builder.isManaged;
        this.osName = builder.osName;
        this.pageSize = builder.pageSize;
        this.privateIp = builder.privateIp;
        this.publicIp = builder.publicIp;
        this.region = builder.region;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceGroupIdName = builder.resourceGroupIdName;
        this.resourceGroupName = builder.resourceGroupName;
        this.xSysomInvokeSource = builder.xSysomInvokeSource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstancesWithEcsInfoRequest create() {
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
     * @return current
     */
    public Integer getCurrent() {
        return this.current;
    }

    /**
     * @return healthStatus
     */
    public String getHealthStatus() {
        return this.healthStatus;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceIdName
     */
    public String getInstanceIdName() {
        return this.instanceIdName;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return instanceTag
     */
    public InstanceTag getInstanceTag() {
        return this.instanceTag;
    }

    /**
     * @return isManaged
     */
    public Integer getIsManaged() {
        return this.isManaged;
    }

    /**
     * @return osName
     */
    public String getOsName() {
        return this.osName;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return privateIp
     */
    public String getPrivateIp() {
        return this.privateIp;
    }

    /**
     * @return publicIp
     */
    public String getPublicIp() {
        return this.publicIp;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return resourceGroupIdName
     */
    public String getResourceGroupIdName() {
        return this.resourceGroupIdName;
    }

    /**
     * @return resourceGroupName
     */
    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * @return xSysomInvokeSource
     */
    public String getXSysomInvokeSource() {
        return this.xSysomInvokeSource;
    }

    public static final class Builder extends Request.Builder<ListInstancesWithEcsInfoRequest, Builder> {
        private String xDebugId; 
        private Integer current; 
        private String healthStatus; 
        private String instanceId; 
        private String instanceIdName; 
        private String instanceName; 
        private InstanceTag instanceTag; 
        private Integer isManaged; 
        private String osName; 
        private Integer pageSize; 
        private String privateIp; 
        private String publicIp; 
        private String region; 
        private String resourceGroupId; 
        private String resourceGroupIdName; 
        private String resourceGroupName; 
        private String xSysomInvokeSource; 

        private Builder() {
            super();
        } 

        private Builder(ListInstancesWithEcsInfoRequest request) {
            super(request);
            this.xDebugId = request.xDebugId;
            this.current = request.current;
            this.healthStatus = request.healthStatus;
            this.instanceId = request.instanceId;
            this.instanceIdName = request.instanceIdName;
            this.instanceName = request.instanceName;
            this.instanceTag = request.instanceTag;
            this.isManaged = request.isManaged;
            this.osName = request.osName;
            this.pageSize = request.pageSize;
            this.privateIp = request.privateIp;
            this.publicIp = request.publicIp;
            this.region = request.region;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceGroupIdName = request.resourceGroupIdName;
            this.resourceGroupName = request.resourceGroupName;
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
         * <p>The page number for pagination. This parameter specifies the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder current(Integer current) {
            this.putQueryParameter("current", current);
            this.current = current;
            return this;
        }

        /**
         * <p>Filters instances by health status.</p>
         * 
         * <strong>example:</strong>
         * <p>healthy</p>
         */
        public Builder healthStatus(String healthStatus) {
            this.putQueryParameter("health_status", healthStatus);
            this.healthStatus = healthStatus;
            return this;
        }

        /**
         * <p>Specifies an instance ID to filter the Agent installation status of the specified instance.</p>
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
         * <p>Filters instances by instance name or instance ID. Fuzzy match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>84b</p>
         */
        public Builder instanceIdName(String instanceIdName) {
            this.putQueryParameter("instance_id_name", instanceIdName);
            this.instanceIdName = instanceIdName;
            return this;
        }

        /**
         * <p>The name of the component instance.</p>
         * 
         * <strong>example:</strong>
         * <p>block-load-balancer-hjdm9</p>
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("instance_name", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>Filters instances by instance tag.</p>
         */
        public Builder instanceTag(InstanceTag instanceTag) {
            String instanceTagShrink = shrink(instanceTag, "instance_tag", "json");
            this.putQueryParameter("instance_tag", instanceTagShrink);
            this.instanceTag = instanceTag;
            return this;
        }

        /**
         * <p>Filters instances by management status.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder isManaged(Integer isManaged) {
            this.putQueryParameter("is_managed", isManaged);
            this.isManaged = isManaged;
            return this;
        }

        /**
         * <p>Filters instances by operating system name.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba Cloud Linux  3.2104 LTS 64bit</p>
         */
        public Builder osName(String osName) {
            this.putQueryParameter("os_name", osName);
            this.osName = osName;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Filters instances by private IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.1.1</p>
         */
        public Builder privateIp(String privateIp) {
            this.putQueryParameter("private_ip", privateIp);
            this.privateIp = privateIp;
            return this;
        }

        /**
         * <p>Filters instances by public IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.1.1</p>
         */
        public Builder publicIp(String publicIp) {
            this.putQueryParameter("public_ip", publicIp);
            this.publicIp = publicIp;
            return this;
        }

        /**
         * <p>Filters instances by region.</p>
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
         * <p>Filters instances by resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-xxxxxxx</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("resource_group_id", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>Filters instances by resource group name or resource group ID. Fuzzy match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder resourceGroupIdName(String resourceGroupIdName) {
            this.putQueryParameter("resource_group_id_name", resourceGroupIdName);
            this.resourceGroupIdName = resourceGroupIdName;
            return this;
        }

        /**
         * <p>Filters instances by resource group name.</p>
         * 
         * <strong>example:</strong>
         * <p>default resource group</p>
         */
        public Builder resourceGroupName(String resourceGroupName) {
            this.putQueryParameter("resource_group_name", resourceGroupName);
            this.resourceGroupName = resourceGroupName;
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
        public ListInstancesWithEcsInfoRequest build() {
            return new ListInstancesWithEcsInfoRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListInstancesWithEcsInfoRequest} extends {@link TeaModel}
     *
     * <p>ListInstancesWithEcsInfoRequest</p>
     */
    public static class InstanceTag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private InstanceTag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceTag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(InstanceTag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>feature_dim_radar_chart</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public InstanceTag build() {
                return new InstanceTag(this);
            } 

        } 

    }
}
