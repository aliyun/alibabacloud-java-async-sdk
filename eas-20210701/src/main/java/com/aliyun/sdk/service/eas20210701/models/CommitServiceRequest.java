// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CommitServiceRequest} extends {@link RequestModel}
 *
 * <p>CommitServiceRequest</p>
 */
public class CommitServiceRequest extends Request {
    @Path
    @NameInMap("ClusterId")
    private String clusterId;

    @Path
    @NameInMap("ServiceName")
    private String serviceName;

    private CommitServiceRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.serviceName = builder.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CommitServiceRequest create() {
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

    public static final class Builder extends Request.Builder<CommitServiceRequest, Builder> {
        private String clusterId; 
        private String serviceName; 

        private Builder() {
            super();
        } 

        private Builder(CommitServiceRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.serviceName = request.serviceName;
        } 

        /**
         * 集群Id。
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * 服务名。
         */
        public Builder serviceName(String serviceName) {
            this.putPathParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        @Override
        public CommitServiceRequest build() {
            return new CommitServiceRequest(this);
        } 

    } 

}
