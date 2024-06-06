// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateClusterDiagnosisRequest} extends {@link RequestModel}
 *
 * <p>CreateClusterDiagnosisRequest</p>
 */
public class CreateClusterDiagnosisRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("cluster_id")
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("target")
    private java.util.Map < String, ? > target;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private CreateClusterDiagnosisRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.target = builder.target;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateClusterDiagnosisRequest create() {
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
     * @return target
     */
    public java.util.Map < String, ? > getTarget() {
        return this.target;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateClusterDiagnosisRequest, Builder> {
        private String clusterId; 
        private java.util.Map < String, ? > target; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateClusterDiagnosisRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.target = request.target;
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
         * target.
         */
        public Builder target(java.util.Map < String, ? > target) {
            this.putBodyParameter("target", target);
            this.target = target;
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
        public CreateClusterDiagnosisRequest build() {
            return new CreateClusterDiagnosisRequest(this);
        } 

    } 

}
