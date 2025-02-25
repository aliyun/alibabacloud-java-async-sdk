// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link GetKubernetesTriggerRequest} extends {@link RequestModel}
 *
 * <p>GetKubernetesTriggerRequest</p>
 */
public class GetKubernetesTriggerRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("action")
    private String action;

    private GetKubernetesTriggerRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.name = builder.name;
        this.namespace = builder.namespace;
        this.type = builder.type;
        this.action = builder.action;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetKubernetesTriggerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return action
     */
    public String getAction() {
        return this.action;
    }

    public static final class Builder extends Request.Builder<GetKubernetesTriggerRequest, Builder> {
        private String clusterId; 
        private String name; 
        private String namespace; 
        private String type; 
        private String action; 

        private Builder() {
            super();
        } 

        private Builder(GetKubernetesTriggerRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.name = request.name;
            this.namespace = request.namespace;
            this.type = request.type;
            this.action = request.action;
        } 

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c5cdf7e3938bc4f8eb0e44b21a80f****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The application name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>web-server</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The namespace name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The type of trigger. Valid values:</p>
         * <ul>
         * <li><code>deployment</code>: performs actions on Deployments.</li>
         * <li><code>application</code>: performs actions on applications that are deployed in Application Center.</li>
         * </ul>
         * <p>Default value: <code>deployment</code>.</p>
         * <p>If you do not set this parameter, triggers are not filtered by type.</p>
         * 
         * <strong>example:</strong>
         * <p>deployment</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>The action that the trigger performs. Set the value to redeploy.</p>
         * <p><code>redeploy</code>: redeploys the resources specified by <code>project_id</code>.</p>
         * <p>If you do not specify this parameter, triggers are not filtered by action.</p>
         * 
         * <strong>example:</strong>
         * <p>redeploy</p>
         */
        public Builder action(String action) {
            this.putQueryParameter("action", action);
            this.action = action;
            return this;
        }

        @Override
        public GetKubernetesTriggerRequest build() {
            return new GetKubernetesTriggerRequest(this);
        } 

    } 

}
