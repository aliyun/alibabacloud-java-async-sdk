// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTriggerRequest} extends {@link RequestModel}
 *
 * <p>DescribeTriggerRequest</p>
 */
public class DescribeTriggerRequest extends Request {
    @Path
    @NameInMap("cluster_id")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("action")
    private String action;

    @Query
    @NameInMap("Type")
    private String type;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("Namespace")
    @Validation(required = true)
    private String namespace;

    private DescribeTriggerRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.action = builder.action;
        this.type = builder.type;
        this.name = builder.name;
        this.namespace = builder.namespace;
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
     * @return action
     */
    public String getAction() {
        return this.action;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
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

    public static final class Builder extends Request.Builder<DescribeTriggerRequest, Builder> {
        private String clusterId; 
        private String action; 
        private String type; 
        private String name; 
        private String namespace; 

        private Builder() {
            super();
        } 

        private Builder(DescribeTriggerRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.action = request.action;
            this.type = request.type;
            this.name = request.name;
            this.namespace = request.namespace;
        } 

        /**
         * The ID of the cluster.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("cluster_id", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The behavior of the trigger. Valid values:
         * <p>
         * 
         * "redeploy": redeploys the resources defined in "project_id.
         * 
         * If the trigger behavior is not specified, the query results do not filter the trigger behavior.
         */
        public Builder action(String action) {
            this.putQueryParameter("action", action);
            this.action = action;
            return this;
        }

        /**
         * The type of the trigger. Valid values:
         * <p>
         * 
         * -"deployment": triggers for stateless applications.
         * 
         * -"application": triggers for application center applications.
         * 
         * Default value: "deployment ".
         * 
         * If the trigger type is not specified, the query result does not filter the trigger type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * The name of the application.
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

        @Override
        public DescribeTriggerRequest build() {
            return new DescribeTriggerRequest(this);
        } 

    } 

}
