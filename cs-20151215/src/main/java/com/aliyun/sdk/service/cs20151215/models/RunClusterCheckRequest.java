// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunClusterCheckRequest} extends {@link RequestModel}
 *
 * <p>RunClusterCheckRequest</p>
 */
public class RunClusterCheckRequest extends Request {
    @Path
    @NameInMap("cluster_id")
    private String clusterId;

    @Body
    @NameInMap("options")
    private java.util.Map < String, String > options;

    @Body
    @NameInMap("type")
    @Validation(required = true)
    private String type;

    private RunClusterCheckRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.options = builder.options;
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
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<RunClusterCheckRequest, Builder> {
        private String clusterId; 
        private java.util.Map < String, String > options; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(RunClusterCheckRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.options = request.options;
            this.type = request.type;
        } 

        /**
         * cluster_id.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("cluster_id", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * options.
         */
        public Builder options(java.util.Map < String, String > options) {
            this.putBodyParameter("options", options);
            this.options = options;
            return this;
        }

        /**
         * type.
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
