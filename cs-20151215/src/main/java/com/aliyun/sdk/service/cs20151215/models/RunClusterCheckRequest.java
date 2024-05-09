// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunClusterCheckRequest} extends {@link RequestModel}
 *
 * <p>RunClusterCheckRequest</p>
 */
public class RunClusterCheckRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("cluster_id")
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("options")
    private java.util.Map < String, String > options;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("target")
    private String target;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private RunClusterCheckRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.options = builder.options;
        this.target = builder.target;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunClusterCheckRequest create() {
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
     * @return options
     */
    public java.util.Map < String, String > getOptions() {
        return this.options;
    }

    /**
     * @return target
     */
    public String getTarget() {
        return this.target;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<RunClusterCheckRequest, Builder> {
        private String clusterId; 
        private java.util.Map < String, String > options; 
        private String target; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(RunClusterCheckRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.options = request.options;
            this.target = request.target;
            this.type = request.type;
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
         * The cluster check items.
         */
        public Builder options(java.util.Map < String, String > options) {
            this.putBodyParameter("options", options);
            this.options = options;
            return this;
        }

        /**
         * target.
         */
        public Builder target(String target) {
            this.putBodyParameter("target", target);
            this.target = target;
            return this;
        }

        /**
         * The check method.
         */
        public Builder type(String type) {
            this.putBodyParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public RunClusterCheckRequest build() {
            return new RunClusterCheckRequest(this);
        } 

    } 

}
