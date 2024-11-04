// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DevelopServiceRequest} extends {@link RequestModel}
 *
 * <p>DevelopServiceRequest</p>
 */
public class DevelopServiceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ServiceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Exit")
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
         * <p>echo</p>
         */
        public Builder serviceName(String serviceName) {
            this.putPathParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * <p>Specifies whether to exit development mode. Valid values:</p>
         * <ul>
         * <li>true: exits development mode.</li>
         * <li>false (default): enters development mode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
