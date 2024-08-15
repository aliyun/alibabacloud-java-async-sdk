// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateServiceRequest} extends {@link RequestModel}
 *
 * <p>UpdateServiceRequest</p>
 */
public class UpdateServiceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("escalationPlanId")
    private Long escalationPlanId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("serviceDescription")
    private String serviceDescription;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("serviceGroupIdList")
    private java.util.List < Long > serviceGroupIdList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("serviceId")
    private Long serviceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("serviceName")
    private String serviceName;

    private UpdateServiceRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.escalationPlanId = builder.escalationPlanId;
        this.serviceDescription = builder.serviceDescription;
        this.serviceGroupIdList = builder.serviceGroupIdList;
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
     * @return escalationPlanId
     */
    public Long getEscalationPlanId() {
        return this.escalationPlanId;
    }

    /**
     * @return serviceDescription
     */
    public String getServiceDescription() {
        return this.serviceDescription;
    }

    /**
     * @return serviceGroupIdList
     */
    public java.util.List < Long > getServiceGroupIdList() {
        return this.serviceGroupIdList;
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
        private Long escalationPlanId; 
        private String serviceDescription; 
        private java.util.List < Long > serviceGroupIdList; 
        private Long serviceId; 
        private String serviceName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateServiceRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.escalationPlanId = request.escalationPlanId;
            this.serviceDescription = request.serviceDescription;
            this.serviceGroupIdList = request.serviceGroupIdList;
            this.serviceId = request.serviceId;
            this.serviceName = request.serviceName;
        } 

        /**
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * escalationPlanId.
         */
        public Builder escalationPlanId(Long escalationPlanId) {
            this.putBodyParameter("escalationPlanId", escalationPlanId);
            this.escalationPlanId = escalationPlanId;
            return this;
        }

        /**
         * serviceDescription.
         */
        public Builder serviceDescription(String serviceDescription) {
            this.putBodyParameter("serviceDescription", serviceDescription);
            this.serviceDescription = serviceDescription;
            return this;
        }

        /**
         * serviceGroupIdList.
         */
        public Builder serviceGroupIdList(java.util.List < Long > serviceGroupIdList) {
            this.putBodyParameter("serviceGroupIdList", serviceGroupIdList);
            this.serviceGroupIdList = serviceGroupIdList;
            return this;
        }

        /**
         * serviceId.
         */
        public Builder serviceId(Long serviceId) {
            this.putBodyParameter("serviceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * serviceName.
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
