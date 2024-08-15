// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetServiceGroupSchedulingRequest} extends {@link RequestModel}
 *
 * <p>GetServiceGroupSchedulingRequest</p>
 */
public class GetServiceGroupSchedulingRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("serviceGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long serviceGroupId;

    private GetServiceGroupSchedulingRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.serviceGroupId = builder.serviceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceGroupSchedulingRequest create() {
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
     * @return serviceGroupId
     */
    public Long getServiceGroupId() {
        return this.serviceGroupId;
    }

    public static final class Builder extends Request.Builder<GetServiceGroupSchedulingRequest, Builder> {
        private String clientToken; 
        private Long serviceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(GetServiceGroupSchedulingRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.serviceGroupId = request.serviceGroupId;
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
         * serviceGroupId.
         */
        public Builder serviceGroupId(Long serviceGroupId) {
            this.putBodyParameter("serviceGroupId", serviceGroupId);
            this.serviceGroupId = serviceGroupId;
            return this;
        }

        @Override
        public GetServiceGroupSchedulingRequest build() {
            return new GetServiceGroupSchedulingRequest(this);
        } 

    } 

}
