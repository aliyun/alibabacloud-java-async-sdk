// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

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
 * {@link UpdateInstanceAclRequest} extends {@link RequestModel}
 *
 * <p>UpdateInstanceAclRequest</p>
 */
public class UpdateInstanceAclRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("username")
    @com.aliyun.core.annotation.Validation(required = true)
    private String username;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("actions")
    private java.util.List<String> actions;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("decision")
    private String decision;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ipWhitelists")
    private java.util.List<String> ipWhitelists;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resourceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceType;

    private UpdateInstanceAclRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.username = builder.username;
        this.actions = builder.actions;
        this.decision = builder.decision;
        this.ipWhitelists = builder.ipWhitelists;
        this.resourceName = builder.resourceName;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateInstanceAclRequest create() {
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
     * @return actions
     */
    public java.util.List<String> getActions() {
        return this.actions;
    }

    /**
     * @return decision
     */
    public String getDecision() {
        return this.decision;
    }

    /**
     * @return ipWhitelists
     */
    public java.util.List<String> getIpWhitelists() {
        return this.ipWhitelists;
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

    public static final class Builder extends Request.Builder<UpdateInstanceAclRequest, Builder> {
        private String instanceId; 
        private String username; 
        private java.util.List<String> actions; 
        private String decision; 
        private java.util.List<String> ipWhitelists; 
        private String resourceName; 
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(UpdateInstanceAclRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.username = request.username;
            this.actions = request.actions;
            this.decision = request.decision;
            this.ipWhitelists = request.ipWhitelists;
            this.resourceName = request.resourceName;
            this.resourceType = request.resourceType;
        } 

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rmq-cn-7e22ody****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The username.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder username(String username) {
            this.putPathParameter("username", username);
            this.username = username;
            return this;
        }

        /**
         * <p>The following items describe the types of permissions that can be granted based on the resource type:</p>
         * <ul>
         * <li>Topic: Pub, Sub, and Pub|Sub</li>
         * <li>Consumer group: Sub</li>
         * </ul>
         * <p>Valid values:</p>
         * <ul>
         * <li>SUB: subscribe</li>
         * <li>Pub|Sub: publish and subscribe</li>
         * <li>Pub: publish</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Pub</p>
         */
        public Builder actions(java.util.List<String> actions) {
            this.putBodyParameter("actions", actions);
            this.actions = actions;
            return this;
        }

        /**
         * <p>The decision result of the authorization.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Deny</li>
         * <li>Allow</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Allow</p>
         */
        public Builder decision(String decision) {
            this.putBodyParameter("decision", decision);
            this.decision = decision;
            return this;
        }

        /**
         * <p>The IP address whitelists.</p>
         */
        public Builder ipWhitelists(java.util.List<String> ipWhitelists) {
            this.putBodyParameter("ipWhitelists", ipWhitelists);
            this.ipWhitelists = ipWhitelists;
            return this;
        }

        /**
         * <p>The name of the resource on which you want to grant permissions.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder resourceName(String resourceName) {
            this.putBodyParameter("resourceName", resourceName);
            this.resourceName = resourceName;
            return this;
        }

        /**
         * <p>The type of the resource on which you want to grant permissions.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Group</li>
         * <li>Topic</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Topic</p>
         */
        public Builder resourceType(String resourceType) {
            this.putBodyParameter("resourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        @Override
        public UpdateInstanceAclRequest build() {
            return new UpdateInstanceAclRequest(this);
        } 

    } 

}
