// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateServiceMirrorRequest} extends {@link RequestModel}
 *
 * <p>CreateServiceMirrorRequest</p>
 */
public class CreateServiceMirrorRequest extends Request {
    @Path
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Path
    @NameInMap("ServiceName")
    @Validation(required = true)
    private String serviceName;

    @Body
    @NameInMap("Ratio")
    private Integer ratio;

    @Body
    @NameInMap("Target")
    private java.util.List < String > target;

    private CreateServiceMirrorRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.serviceName = builder.serviceName;
        this.ratio = builder.ratio;
        this.target = builder.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateServiceMirrorRequest create() {
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
    public java.util.List < String > getTarget() {
        return this.target;
    }

    public static final class Builder extends Request.Builder<CreateServiceMirrorRequest, Builder> {
        private String clusterId; 
        private String serviceName; 
        private Integer ratio; 
        private java.util.List < String > target; 

        private Builder() {
            super();
        } 

        private Builder(CreateServiceMirrorRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.serviceName = request.serviceName;
            this.ratio = request.ratio;
            this.target = request.target;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * ServiceName.
         */
        public Builder serviceName(String serviceName) {
            this.putPathParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * Ratio.
         */
        public Builder ratio(Integer ratio) {
            this.putBodyParameter("Ratio", ratio);
            this.ratio = ratio;
            return this;
        }

        /**
         * Target.
         */
        public Builder target(java.util.List < String > target) {
            this.putBodyParameter("Target", target);
            this.target = target;
            return this;
        }

        @Override
        public CreateServiceMirrorRequest build() {
            return new CreateServiceMirrorRequest(this);
        } 

    } 

}
