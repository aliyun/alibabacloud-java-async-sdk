// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetServiceGroupSpecialPersonSchedulingRequest} extends {@link RequestModel}
 *
 * <p>GetServiceGroupSpecialPersonSchedulingRequest</p>
 */
public class GetServiceGroupSpecialPersonSchedulingRequest extends Request {
    @Body
    @NameInMap("clientToken")
    private String clientToken;

    @Body
    @NameInMap("serviceGroupId")
    private Long serviceGroupId;

    @Body
    @NameInMap("userId")
    @Validation(required = true)
    private Long userId;

    private GetServiceGroupSpecialPersonSchedulingRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.serviceGroupId = builder.serviceGroupId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceGroupSpecialPersonSchedulingRequest create() {
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

    /**
     * @return userId
     */
    public Long getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<GetServiceGroupSpecialPersonSchedulingRequest, Builder> {
        private String clientToken; 
        private Long serviceGroupId; 
        private Long userId; 

        private Builder() {
            super();
        } 

        private Builder(GetServiceGroupSpecialPersonSchedulingRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.serviceGroupId = response.serviceGroupId;
            this.userId = response.userId;
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

        /**
         * 用户ID
         */
        public Builder userId(Long userId) {
            this.putBodyParameter("userId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public GetServiceGroupSpecialPersonSchedulingRequest build() {
            return new GetServiceGroupSpecialPersonSchedulingRequest(this);
        } 

    } 

}
