// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateServiceVersionRequest} extends {@link RequestModel}
 *
 * <p>UpdateServiceVersionRequest</p>
 */
public class UpdateServiceVersionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ServiceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Version")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer version;

    private UpdateServiceVersionRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.serviceName = builder.serviceName;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateServiceVersionRequest create() {
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
     * @return version
     */
    public Integer getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<UpdateServiceVersionRequest, Builder> {
        private String clusterId; 
        private String serviceName; 
        private Integer version; 

        private Builder() {
            super();
        } 

        private Builder(UpdateServiceVersionRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.serviceName = request.serviceName;
            this.version = request.version;
        } 

        /**
         * <p>The ID of the region where the service is deployed.</p>
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
         * <p>The service name. For more information about how to query the service name, see <a href="~~412109~~">ListServices</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>echo</p>
         */
        public Builder serviceName(String serviceName) {
            this.putPathParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * <p>The destination version of the service. The value must be of the INT type. The value must be greater than 0 and smaller than the current version of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder version(Integer version) {
            this.putBodyParameter("Version", version);
            this.version = version;
            return this;
        }

        @Override
        public UpdateServiceVersionRequest build() {
            return new UpdateServiceVersionRequest(this);
        } 

    } 

}
