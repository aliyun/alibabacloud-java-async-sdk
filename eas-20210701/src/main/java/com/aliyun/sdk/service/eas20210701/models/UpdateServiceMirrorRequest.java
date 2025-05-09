// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

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
 * {@link UpdateServiceMirrorRequest} extends {@link RequestModel}
 *
 * <p>UpdateServiceMirrorRequest</p>
 */
public class UpdateServiceMirrorRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ServiceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Ratio")
    private Integer ratio;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Target")
    private java.util.List<String> target;

    private UpdateServiceMirrorRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.serviceName = builder.serviceName;
        this.ratio = builder.ratio;
        this.target = builder.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateServiceMirrorRequest create() {
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
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return ratio
     */
    public Integer getRatio() {
        return this.ratio;
    }

    /**
     * @return target
     */
    public java.util.List<String> getTarget() {
        return this.target;
    }

    public static final class Builder extends Request.Builder<UpdateServiceMirrorRequest, Builder> {
        private String clusterId; 
        private String serviceName; 
        private Integer ratio; 
        private java.util.List<String> target; 

        private Builder() {
            super();
        } 

        private Builder(UpdateServiceMirrorRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.serviceName = request.serviceName;
            this.ratio = request.ratio;
            this.target = request.target;
        } 

        /**
         * <p>The ID of the region where the service is deployed.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The service name. For more information about how to query the service name, see <a href="https://help.aliyun.com/document_detail/412109.html">ListServices</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>foo</p>
         */
        public Builder serviceName(String serviceName) {
            this.putPathParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * <p>The percentage of traffic that you want to mirror. Valid values: 0 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder ratio(Integer ratio) {
            this.putBodyParameter("Ratio", ratio);
            this.ratio = ratio;
            return this;
        }

        /**
         * <p>The service instances.</p>
         */
        public Builder target(java.util.List<String> target) {
            this.putBodyParameter("Target", target);
            this.target = target;
            return this;
        }

        @Override
        public UpdateServiceMirrorRequest build() {
            return new UpdateServiceMirrorRequest(this);
        } 

    } 

}
