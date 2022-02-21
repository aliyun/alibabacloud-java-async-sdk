// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetServiceGroupSchedulingRequest} extends {@link RequestModel}
 *
 * <p>GetServiceGroupSchedulingRequest</p>
 */
public class GetServiceGroupSchedulingRequest extends Request {
    @Body
    @NameInMap("clientToken")
    private String clientToken;

    @Body
    @NameInMap("serviceGroupId")
    @Validation(required = true)
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

        private Builder(GetServiceGroupSchedulingRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.serviceGroupId = response.serviceGroupId;
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
         * 服务组ID
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
