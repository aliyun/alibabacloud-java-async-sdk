// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReleaseServiceRequest} extends {@link RequestModel}
 *
 * <p>ReleaseServiceRequest</p>
 */
public class ReleaseServiceRequest extends Request {
    @Path
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Path
    @NameInMap("ServiceName")
    @Validation(required = true)
    private String serviceName;

    @Body
    @NameInMap("Weight")
    @Validation(required = true)
    private Integer weight;

    private ReleaseServiceRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.serviceName = builder.serviceName;
        this.weight = builder.weight;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReleaseServiceRequest create() {
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
     * @return weight
     */
    public Integer getWeight() {
        return this.weight;
    }

    public static final class Builder extends Request.Builder<ReleaseServiceRequest, Builder> {
        private String clusterId; 
        private String serviceName; 
        private Integer weight; 

        private Builder() {
            super();
        } 

        private Builder(ReleaseServiceRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.serviceName = request.serviceName;
            this.weight = request.weight;
        } 

        /**
         * 服务所在区域
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * 服务名字
         */
        public Builder serviceName(String serviceName) {
            this.putPathParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * 灰度权重，范围 [0, 100]
         */
        public Builder weight(Integer weight) {
            this.putBodyParameter("Weight", weight);
            this.weight = weight;
            return this;
        }

        @Override
        public ReleaseServiceRequest build() {
            return new ReleaseServiceRequest(this);
        } 

    } 

}
