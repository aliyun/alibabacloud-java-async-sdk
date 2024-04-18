// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SwitchServiceRequest} extends {@link RequestModel}
 *
 * <p>SwitchServiceRequest</p>
 */
public class SwitchServiceRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("Operate")
    @Validation(required = true)
    private String operate;

    @Query
    @NameInMap("ServiceName")
    @Validation(required = true)
    private String serviceName;

    private SwitchServiceRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.operate = builder.operate;
        this.serviceName = builder.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SwitchServiceRequest create() {
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
     * @return operate
     */
    public String getOperate() {
        return this.operate;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    public static final class Builder extends Request.Builder<SwitchServiceRequest, Builder> {
        private String clusterId; 
        private String operate; 
        private String serviceName; 

        private Builder() {
            super();
        } 

        private Builder(SwitchServiceRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.operate = request.operate;
            this.serviceName = request.serviceName;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * Operate.
         */
        public Builder operate(String operate) {
            this.putQueryParameter("Operate", operate);
            this.operate = operate;
            return this;
        }

        /**
         * ServiceName.
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        @Override
        public SwitchServiceRequest build() {
            return new SwitchServiceRequest(this);
        } 

    } 

}
