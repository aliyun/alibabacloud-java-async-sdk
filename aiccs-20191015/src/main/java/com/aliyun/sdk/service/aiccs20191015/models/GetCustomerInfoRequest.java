// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCustomerInfoRequest} extends {@link RequestModel}
 *
 * <p>GetCustomerInfoRequest</p>
 */
public class GetCustomerInfoRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("MemberId")
    @Validation(required = true, minimum = 1)
    private Long memberId;

    private GetCustomerInfoRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.memberId = builder.memberId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCustomerInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return memberId
     */
    public Long getMemberId() {
        return this.memberId;
    }

    public static final class Builder extends Request.Builder<GetCustomerInfoRequest, Builder> {
        private String instanceId; 
        private Long memberId; 

        private Builder() {
            super();
        } 

        private Builder(GetCustomerInfoRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.memberId = response.memberId;
        } 

        /**
         * 实例ID
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 会员ID
         */
        public Builder memberId(Long memberId) {
            this.putQueryParameter("MemberId", memberId);
            this.memberId = memberId;
            return this;
        }

        @Override
        public GetCustomerInfoRequest build() {
            return new GetCustomerInfoRequest(this);
        } 

    } 

}
