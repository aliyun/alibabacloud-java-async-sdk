// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateServiceRequest} extends {@link RequestModel}
 *
 * <p>UpdateServiceRequest</p>
 */
public class UpdateServiceRequest extends Request {
    @Body
    @NameInMap("clientToken")
    private String clientToken;

    @Body
    @NameInMap("serviceDescription")
    private String serviceDescription;

    @Body
    @NameInMap("serviceId")
    private Long serviceId;

    @Body
    @NameInMap("serviceName")
    private String serviceName;

    private UpdateServiceRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.serviceDescription = builder.serviceDescription;
        this.serviceId = builder.serviceId;
        this.serviceName = builder.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return serviceDescription
     */
    public String getServiceDescription() {
        return this.serviceDescription;
    }

    /**
     * @return serviceId
     */
    public Long getServiceId() {
        return this.serviceId;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    public static final class Builder extends Request.Builder<UpdateServiceRequest, Builder> {
        private String clientToken; 
        private String serviceDescription; 
        private Long serviceId; 
        private String serviceName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateServiceRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.serviceDescription = response.serviceDescription;
            this.serviceId = response.serviceId;
            this.serviceName = response.serviceName;
        } 

        /**
         * 幂等号
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * 服务描述
         */
        public Builder serviceDescription(String serviceDescription) {
            this.putBodyParameter("serviceDescription", serviceDescription);
            this.serviceDescription = serviceDescription;
            return this;
        }

        /**
         * 服务ID
         */
        public Builder serviceId(Long serviceId) {
            this.putBodyParameter("serviceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * 服务名字
         */
        public Builder serviceName(String serviceName) {
            this.putBodyParameter("serviceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        @Override
        public UpdateServiceRequest build() {
            return new UpdateServiceRequest(this);
        } 

    } 

}
