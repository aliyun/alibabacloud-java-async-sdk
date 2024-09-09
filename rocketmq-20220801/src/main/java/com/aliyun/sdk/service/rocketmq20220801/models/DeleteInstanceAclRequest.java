// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteInstanceAclRequest} extends {@link RequestModel}
 *
 * <p>DeleteInstanceAclRequest</p>
 */
public class DeleteInstanceAclRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("username")
    @com.aliyun.core.annotation.Validation(required = true)
    private String username;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("resourceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("resourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceType;

    private DeleteInstanceAclRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.username = builder.username;
        this.resourceName = builder.resourceName;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteInstanceAclRequest create() {
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
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * @return resourceName
     */
    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    public static final class Builder extends Request.Builder<DeleteInstanceAclRequest, Builder> {
        private String instanceId; 
        private String username; 
        private String resourceName; 
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(DeleteInstanceAclRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.username = request.username;
            this.resourceName = request.resourceName;
            this.resourceType = request.resourceType;
        } 

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * username.
         */
        public Builder username(String username) {
            this.putPathParameter("username", username);
            this.username = username;
            return this;
        }

        /**
         * resourceName.
         */
        public Builder resourceName(String resourceName) {
            this.putQueryParameter("resourceName", resourceName);
            this.resourceName = resourceName;
            return this;
        }

        /**
         * resourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("resourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        @Override
        public DeleteInstanceAclRequest build() {
            return new DeleteInstanceAclRequest(this);
        } 

    } 

}
