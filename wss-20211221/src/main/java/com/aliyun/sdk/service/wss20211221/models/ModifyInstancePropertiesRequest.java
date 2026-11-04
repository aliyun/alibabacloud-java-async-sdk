// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wss20211221.models;

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
 * {@link ModifyInstancePropertiesRequest} extends {@link RequestModel}
 *
 * <p>ModifyInstancePropertiesRequest</p>
 */
public class ModifyInstancePropertiesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private java.util.List<String> instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Key")
    private String key;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Properties")
    private java.util.List<Properties> properties;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Value")
    private String value;

    private ModifyInstancePropertiesRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.instanceIds = builder.instanceIds;
        this.key = builder.key;
        this.properties = builder.properties;
        this.resourceType = builder.resourceType;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstancePropertiesRequest create() {
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
     * @return instanceIds
     */
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return properties
     */
    public java.util.List<Properties> getProperties() {
        return this.properties;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder extends Request.Builder<ModifyInstancePropertiesRequest, Builder> {
        private String instanceId; 
        private java.util.List<String> instanceIds; 
        private String key; 
        private java.util.List<Properties> properties; 
        private String resourceType; 
        private String value; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstancePropertiesRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.instanceIds = request.instanceIds;
            this.key = request.key;
            this.properties = request.properties;
            this.resourceType = request.resourceType;
            this.value = request.value;
        } 

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>mdp-0c62ayep0nk4v****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The instance IDs.</p>
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>The key of the attribute.</p>
         * 
         * <strong>example:</strong>
         * <p>PackageUsedUpStrategy</p>
         */
        public Builder key(String key) {
            this.putQueryParameter("Key", key);
            this.key = key;
            return this;
        }

        /**
         * <p>The list of instance attributes to modify. You can modify multiple key-value pairs at a time. These pairs are merged with the original Key and Value request parameters. If an attribute with the same name has the same value, it is deduplicated. If the values are different, a parameter error is returned.</p>
         */
        public Builder properties(java.util.List<Properties> properties) {
            this.putQueryParameter("Properties", properties);
            this.properties = properties;
            return this;
        }

        /**
         * <p>The resource type.</p>
         * <blockquote>
         * <p>This parameter is case-sensitive. Ensure correct spelling.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DurationPackage</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The value of the attribute.</p>
         * <ul>
         * <li>PackageUsedUpStrategy: [enum]<ul>
         * <li>Postpaid (switches to the pay-as-you-go billing method)</li>
         * <li>Shutdown (hibernates or shuts down the instance)</li>
         * <li>Maintenance (stops the instance and enters O&amp;M mode, and does not allow client connections)</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Postpaid</p>
         */
        public Builder value(String value) {
            this.putQueryParameter("Value", value);
            this.value = value;
            return this;
        }

        @Override
        public ModifyInstancePropertiesRequest build() {
            return new ModifyInstancePropertiesRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyInstancePropertiesRequest} extends {@link TeaModel}
     *
     * <p>ModifyInstancePropertiesRequest</p>
     */
    public static class Properties extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Properties(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Properties create() {
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

            private Builder(Properties model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The name of the instance attribute. For example, DisableRemainingNotify specifies whether to disable the remaining duration reminder for the client, and PackageUsedUpStrategy specifies the policy applied when the package duration is used up.</p>
             * 
             * <strong>example:</strong>
             * <p>DisableRemainingNotify</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the instance attribute. When Key is set to DisableRemainingNotify, only the string true or false is supported, and ResourceType must be set to DurationPackage. A value of true indicates that the remaining duration reminder for the client is disabled. A value of false indicates that the reminder is retained and triggered based on the original conditions. Administrator notifications continue to be triggered based on the original conditions. For other attributes, pass values based on their respective definitions.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Properties build() {
                return new Properties(this);
            } 

        } 

    }
}
