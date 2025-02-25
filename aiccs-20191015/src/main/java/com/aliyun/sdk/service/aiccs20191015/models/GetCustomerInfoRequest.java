// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetCustomerInfoRequest} extends {@link RequestModel}
 *
 * <p>GetCustomerInfoRequest</p>
 */
public class GetCustomerInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemberId")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
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

        private Builder(GetCustomerInfoRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.memberId = request.memberId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc_xp_pre-cn-***</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>82345678****</p>
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
