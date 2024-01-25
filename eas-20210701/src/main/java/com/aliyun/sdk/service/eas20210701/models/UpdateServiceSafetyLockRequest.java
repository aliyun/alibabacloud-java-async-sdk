// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateServiceSafetyLockRequest} extends {@link RequestModel}
 *
 * <p>UpdateServiceSafetyLockRequest</p>
 */
public class UpdateServiceSafetyLockRequest extends Request {
    @Path
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Path
    @NameInMap("ServiceName")
    @Validation(required = true)
    private String serviceName;

    @Body
    @NameInMap("Lock")
    @Validation(required = true)
    private String lock;

    private UpdateServiceSafetyLockRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.serviceName = builder.serviceName;
        this.lock = builder.lock;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateServiceSafetyLockRequest create() {
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
     * @return lock
     */
    public String getLock() {
        return this.lock;
    }

    public static final class Builder extends Request.Builder<UpdateServiceSafetyLockRequest, Builder> {
        private String clusterId; 
        private String serviceName; 
        private String lock; 

        private Builder() {
            super();
        } 

        private Builder(UpdateServiceSafetyLockRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.serviceName = request.serviceName;
            this.lock = request.lock;
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
         * The lock scope. Valid values:
         * <p>
         * 
         * *   all: locks all operations.
         * *   dangerous: locks high-risk operations such as delete and stop operations.
         * *   none: locks no operations.
         */
        public Builder lock(String lock) {
            this.putBodyParameter("Lock", lock);
            this.lock = lock;
            return this;
        }

        @Override
        public UpdateServiceSafetyLockRequest build() {
            return new UpdateServiceSafetyLockRequest(this);
        } 

    } 

}
