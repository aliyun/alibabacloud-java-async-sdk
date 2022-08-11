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
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("Namespace")
    @Validation(required = true)
    private String namespace;

    @Query
    @NameInMap("Type")
    private String type;

    @Query
    @NameInMap("action")
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
         * 集群ID
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("cluster_id", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * 应用名称。
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * 应用所属命名空间。
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * 应用类型。
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * 触发器行为。
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
