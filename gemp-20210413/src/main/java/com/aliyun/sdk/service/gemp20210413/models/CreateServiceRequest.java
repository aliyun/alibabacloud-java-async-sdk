// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateServiceRequest} extends {@link RequestModel}
 *
 * <p>CreateServiceRequest</p>
 */
public class CreateServiceRequest extends Request {
    @Body
    @NameInMap("clientToken")
    private String clientToken;

    @Body
    @NameInMap("escalationPlanId")
    private Long escalationPlanId;

    @Body
    @NameInMap("serviceDescription")
    private String serviceDescription;

    @Body
    @NameInMap("serviceGroupIdList")
    private java.util.List < Long > serviceGroupIdList;

    @Body
    @NameInMap("serviceName")
    @Validation(required = true)
    private String serviceName;

    private CreateServiceRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.escalationPlanId = builder.escalationPlanId;
        this.serviceDescription = builder.serviceDescription;
        this.serviceGroupIdList = builder.serviceGroupIdList;
        this.serviceName = builder.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateServiceRequest create() {
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
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    public static final class Builder extends Request.Builder<CreateServiceRequest, Builder> {
        private String clientToken; 
        private Long escalationPlanId; 
        private String serviceDescription; 
        private java.util.List < Long > serviceGroupIdList; 
        private String serviceName; 

        private Builder() {
            super();
        } 

        private Builder(CreateServiceRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.escalationPlanId = request.escalationPlanId;
            this.serviceDescription = request.serviceDescription;
            this.serviceGroupIdList = request.serviceGroupIdList;
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
         * serviceName.
         */
        public Builder serviceName(String serviceName) {
            this.putBodyParameter("serviceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        @Override
        public CreateServiceRequest build() {
            return new CreateServiceRequest(this);
        } 

    } 

}
