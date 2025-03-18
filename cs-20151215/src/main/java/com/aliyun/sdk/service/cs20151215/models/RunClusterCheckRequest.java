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
    private java.util.Map<String, String> options;

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
    public java.util.Map<String, String> getOptions() {
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
        private java.util.Map<String, String> options; 
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
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ce0da5a1d627e4e9e9f96cae8ad07****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("cluster_id", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The cluster check items.</p>
         */
        public Builder options(java.util.Map<String, String> options) {
            this.putBodyParameter("options", options);
            this.options = options;
            return this;
        }

        /**
         * <p>The target to be checked.</p>
         * 
         * <strong>example:</strong>
         * <p>np1f6779297c4444a3a1cdd29be8e5****</p>
         */
        public Builder target(String target) {
            this.putBodyParameter("target", target);
            this.target = target;
            return this;
        }

        /**
         * <p>The check method.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ClusterUpgrade</p>
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
