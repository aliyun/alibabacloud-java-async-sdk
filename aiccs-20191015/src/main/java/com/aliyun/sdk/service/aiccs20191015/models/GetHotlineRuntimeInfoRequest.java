// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHotlineRuntimeInfoRequest} extends {@link RequestModel}
 *
 * <p>GetHotlineRuntimeInfoRequest</p>
 */
public class GetHotlineRuntimeInfoRequest extends Request {
    @Query
    @NameInMap("AccountName")
    @Validation(required = true)
    private String accountName;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private GetHotlineRuntimeInfoRequest(Builder builder) {
        super(builder);
        this.accountName = builder.accountName;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHotlineRuntimeInfoRequest create() {
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

    public static final class Builder extends Request.Builder<GetHotlineRuntimeInfoRequest, Builder> {
        private String accountName; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetHotlineRuntimeInfoRequest response) {
            super(response);
            this.accountName = response.accountName;
            this.instanceId = response.instanceId;
        } 

        /**
         * 账号名
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
        public GetHotlineRuntimeInfoRequest build() {
            return new GetHotlineRuntimeInfoRequest(this);
        } 

    } 

}
