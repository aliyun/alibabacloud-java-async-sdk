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
 * {@link CreateInstanceAclRequest} extends {@link RequestModel}
 *
 * <p>CreateInstanceAclRequest</p>
 */
public class CreateInstanceAclRequest extends Request {
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
    @com.aliyun.core.annotation.Validation(required = true)
    private String actions;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("decision")
    @com.aliyun.core.annotation.Validation(required = true)
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

    private CreateInstanceAclRequest(Builder builder) {
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

    public static CreateInstanceAclRequest create() {
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
    public String getActions() {
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

    public static final class Builder extends Request.Builder<CreateInstanceAclRequest, Builder> {
        private String instanceId; 
        private String username; 
        private String actions; 
        private String decision; 
        private java.util.List<String> ipWhitelists; 
        private String resourceName; 
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(CreateInstanceAclRequest request) {
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
         * <p>The username of the account.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        public Builder username(String username) {
            this.putPathParameter("username", username);
            this.username = username;
            return this;
        }

        /**
         * <p>The type of operations that can be performed on the resource.</p>
         * <p>The following types of operations are supported based on the resource type:</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Pub</p>
         */
        public Builder actions(String actions) {
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
         * <p>This parameter is required.</p>
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
        public CreateInstanceAclRequest build() {
            return new CreateInstanceAclRequest(this);
        } 

    } 

}
