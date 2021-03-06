// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteServiceInstancesRequest} extends {@link RequestModel}
 *
 * <p>DeleteServiceInstancesRequest</p>
 */
public class DeleteServiceInstancesRequest extends Request {
    @Path
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Path
    @NameInMap("ServiceName")
    @Validation(required = true)
    private String serviceName;

    @Query
    @NameInMap("InstanceList")
    @Validation(required = true)
    private String instanceList;

    private DeleteServiceInstancesRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.serviceName = builder.serviceName;
        this.instanceList = builder.instanceList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteServiceInstancesRequest create() {
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
     * @return instanceList
     */
    public String getInstanceList() {
        return this.instanceList;
    }

    public static final class Builder extends Request.Builder<DeleteServiceInstancesRequest, Builder> {
        private String clusterId; 
        private String serviceName; 
        private String instanceList; 

        private Builder() {
            super();
        } 

        private Builder(DeleteServiceInstancesRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.serviceName = request.serviceName;
            this.instanceList = request.instanceList;
        } 

        /**
         * ??????????????????
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * ????????????
         */
        public Builder serviceName(String serviceName) {
            this.putPathParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * ????????????????????????????????????????????????????????????
         */
        public Builder instanceList(String instanceList) {
            this.putQueryParameter("InstanceList", instanceList);
            this.instanceList = instanceList;
            return this;
        }

        @Override
        public DeleteServiceInstancesRequest build() {
            return new DeleteServiceInstancesRequest(this);
        } 

    } 

}
