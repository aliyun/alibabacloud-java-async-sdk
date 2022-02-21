// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetNumLocationRequest} extends {@link RequestModel}
 *
 * <p>GetNumLocationRequest</p>
 */
public class GetNumLocationRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("PhoneNum")
    @Validation(required = true)
    private String phoneNum;

    private GetNumLocationRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.instanceId = builder.instanceId;
        this.phoneNum = builder.phoneNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNumLocationRequest create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return phoneNum
     */
    public String getPhoneNum() {
        return this.phoneNum;
    }

    public static final class Builder extends Request.Builder<GetNumLocationRequest, Builder> {
        private String clientToken; 
        private String instanceId; 
        private String phoneNum; 

        private Builder() {
            super();
        } 

        private Builder(GetNumLocationRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.instanceId = response.instanceId;
            this.phoneNum = response.phoneNum;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * PhoneNum.
         */
        public Builder phoneNum(String phoneNum) {
            this.putQueryParameter("PhoneNum", phoneNum);
            this.phoneNum = phoneNum;
            return this;
        }

        @Override
        public GetNumLocationRequest build() {
            return new GetNumLocationRequest(this);
        } 

    } 

}
