// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRtcTokenRequest} extends {@link RequestModel}
 *
 * <p>GetRtcTokenRequest</p>
 */
public class GetRtcTokenRequest extends Request {
    @Query
    @NameInMap("AccountName")
    @Validation(required = true)
    private String accountName;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private GetRtcTokenRequest(Builder builder) {
        super(builder);
        this.accountName = builder.accountName;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRtcTokenRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountName
     */
    public String getAccountName() {
        return this.accountName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<GetRtcTokenRequest, Builder> {
        private String accountName; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetRtcTokenRequest response) {
            super(response);
            this.accountName = response.accountName;
            this.instanceId = response.instanceId;
        } 

        /**
         * 账号名称
         */
        public Builder accountName(String accountName) {
            this.putQueryParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * 实例ID
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public GetRtcTokenRequest build() {
            return new GetRtcTokenRequest(this);
        } 

    } 

}
