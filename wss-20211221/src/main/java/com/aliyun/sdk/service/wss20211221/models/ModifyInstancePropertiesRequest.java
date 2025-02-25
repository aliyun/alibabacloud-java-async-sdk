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
            this.resourceType = request.resourceType;
            this.value = request.value;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * InstanceIds.
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * Key.
         */
        public Builder key(String key) {
            this.putQueryParameter("Key", key);
            this.key = key;
            return this;
        }

        /**
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
         * Value.
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

}
