// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20180418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeServiceContainersRequest} extends {@link RequestModel}
 *
 * <p>DescribeServiceContainersRequest</p>
 */
public class DescribeServiceContainersRequest extends Request {
    @Path
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Path
    @NameInMap("ServiceId")
    @Validation(required = true)
    private String serviceId;

    private DescribeServiceContainersRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.serviceId = builder.serviceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeServiceContainersRequest create() {
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
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    public static final class Builder extends Request.Builder<DescribeServiceContainersRequest, Builder> {
        private String clusterId; 
        private String serviceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeServiceContainersRequest response) {
            super(response);
            this.clusterId = response.clusterId;
            this.serviceId = response.serviceId;
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
         * ServiceId.
         */
        public Builder serviceId(String serviceId) {
            this.putPathParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        @Override
        public DescribeServiceContainersRequest build() {
            return new DescribeServiceContainersRequest(this);
        } 

    } 

}
