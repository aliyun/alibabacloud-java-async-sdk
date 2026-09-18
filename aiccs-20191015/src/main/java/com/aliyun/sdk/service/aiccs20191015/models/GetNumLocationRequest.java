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
 * {@link GetNumLocationRequest} extends {@link RequestModel}
 *
 * <p>GetNumLocationRequest</p>
 */
public class GetNumLocationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhoneNum")
    @com.aliyun.core.annotation.Validation(required = true)
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

        private Builder(GetNumLocationRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.instanceId = request.instanceId;
            this.phoneNum = request.phoneNum;
        } 

        /**
         * <p>Unique ID for the customer request. Used for idempotency validation and can be generated using a UUID.</p>
         * 
         * <strong>example:</strong>
         * <p>46c1341e-2648-447a-9b11-70b6a298d94d</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Artificial Intelligence Cloud Call Service (AICCS) instance ID.<br>You can obtain it in the <b>Instance Management</b> section of the left-side navigation pane in the <a href="https://aiccs.console.aliyun.com/overview">Artificial Intelligence Cloud Call Service console</a>.</p>
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
         * <p>Phone number to query.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1360987****</p>
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
