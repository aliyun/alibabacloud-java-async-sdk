// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DevelopServiceRequest} extends {@link RequestModel}
 *
 * <p>DevelopServiceRequest</p>
 */
public class DevelopServiceRequest extends Request {
    @Path
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Path
    @NameInMap("ServiceName")
    @Validation(required = true)
    private String serviceName;

    @Query
    @NameInMap("Exit")
    private String exit;

    private DevelopServiceRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.serviceName = builder.serviceName;
        this.exit = builder.exit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DevelopServiceRequest create() {
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
     * @return exit
     */
    public String getExit() {
        return this.exit;
    }

    public static final class Builder extends Request.Builder<DevelopServiceRequest, Builder> {
        private String clusterId; 
        private String serviceName; 
        private String exit; 

        private Builder() {
            super();
        } 

        private Builder(DevelopServiceRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.serviceName = request.serviceName;
            this.exit = request.exit;
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
         * Specifies whether to exit development mode. Valid values:
         * <p>
         * 
         * *   true
         * *   false (default)
         */
        public Builder exit(String exit) {
            this.putQueryParameter("Exit", exit);
            this.exit = exit;
            return this;
        }

        @Override
        public DevelopServiceRequest build() {
            return new DevelopServiceRequest(this);
        } 

    } 

}
