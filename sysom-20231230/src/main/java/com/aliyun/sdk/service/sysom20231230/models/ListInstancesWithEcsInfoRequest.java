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

    private ListInstancesWithEcsInfoRequest(Builder builder) {
        super(builder);
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

    public static final class Builder extends Request.Builder<ListInstancesWithEcsInfoRequest, Builder> {
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

        private Builder() {
            super();
        } 

        private Builder(ListInstancesWithEcsInfoRequest request) {
            super(request);
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
        } 

        /**
         * current.
         */
        public Builder current(Integer current) {
            this.putQueryParameter("current", current);
            this.current = current;
            return this;
        }

        /**
         * health_status.
         */
        public Builder healthStatus(String healthStatus) {
            this.putQueryParameter("health_status", healthStatus);
            this.healthStatus = healthStatus;
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
         * instance_id_name.
         */
        public Builder instanceIdName(String instanceIdName) {
            this.putQueryParameter("instance_id_name", instanceIdName);
            this.instanceIdName = instanceIdName;
            return this;
        }

        /**
         * instance_name.
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("instance_name", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * instance_tag.
         */
        public Builder instanceTag(InstanceTag instanceTag) {
            String instanceTagShrink = shrink(instanceTag, "instance_tag", "json");
            this.putQueryParameter("instance_tag", instanceTagShrink);
            this.instanceTag = instanceTag;
            return this;
        }

        /**
         * is_managed.
         */
        public Builder isManaged(Integer isManaged) {
            this.putQueryParameter("is_managed", isManaged);
            this.isManaged = isManaged;
            return this;
        }

        /**
         * os_name.
         */
        public Builder osName(String osName) {
            this.putQueryParameter("os_name", osName);
            this.osName = osName;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * private_ip.
         */
        public Builder privateIp(String privateIp) {
            this.putQueryParameter("private_ip", privateIp);
            this.privateIp = privateIp;
            return this;
        }

        /**
         * public_ip.
         */
        public Builder publicIp(String publicIp) {
            this.putQueryParameter("public_ip", publicIp);
            this.publicIp = publicIp;
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

        /**
         * resource_group_id.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("resource_group_id", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * resource_group_id_name.
         */
        public Builder resourceGroupIdName(String resourceGroupIdName) {
            this.putQueryParameter("resource_group_id_name", resourceGroupIdName);
            this.resourceGroupIdName = resourceGroupIdName;
            return this;
        }

        /**
         * resource_group_name.
         */
        public Builder resourceGroupName(String resourceGroupName) {
            this.putQueryParameter("resource_group_name", resourceGroupName);
            this.resourceGroupName = resourceGroupName;
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

            /**
             * key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * value.
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
