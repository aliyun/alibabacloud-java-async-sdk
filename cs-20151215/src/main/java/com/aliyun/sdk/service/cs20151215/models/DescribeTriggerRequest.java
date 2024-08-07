// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTriggerRequest} extends {@link RequestModel}
 *
 * <p>DescribeTriggerRequest</p>
 */
public class DescribeTriggerRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("cluster_id")
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

    private DescribeTriggerRequest(Builder builder) {
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

    public static DescribeTriggerRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeTriggerRequest, Builder> {
        private String clusterId; 
        private String name; 
        private String namespace; 
        private String type; 
        private String action; 

        private Builder() {
            super();
        } 

        private Builder(DescribeTriggerRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.name = request.name;
            this.namespace = request.namespace;
            this.type = request.type;
            this.action = request.action;
        } 

        /**
         * The cluster ID.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("cluster_id", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The application name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The namespace to which the application belongs.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * The type of trigger. Valid values:
         * <p>
         * 
         * *   `deployment`: performs actions on Deployments.
         * *   `application`: performs actions on applications that are deployed in Application Center.
         * 
         * Default value: `deployment`.
         * 
         * If you do not set this parameter, triggers are not filtered by type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * The action that the trigger performs. Set the value to redeploy.
         * <p>
         * 
         * `redeploy`: redeploys the resources specified by `project_id`.
         * 
         * If you do not specify this parameter, triggers are not filtered by action.
         */
        public Builder action(String action) {
            this.putQueryParameter("action", action);
            this.action = action;
            return this;
        }

        @Override
        public DescribeTriggerRequest build() {
            return new DescribeTriggerRequest(this);
        } 

    } 

}
