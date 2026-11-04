// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

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
 * {@link CallOnlinePrivacyNumberRequest} extends {@link RequestModel}
 *
 * <p>CallOnlinePrivacyNumberRequest</p>
 */
public class CallOnlinePrivacyNumberRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TelA")
    @com.aliyun.core.annotation.Validation(required = true)
    private String telA;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TelB")
    @com.aliyun.core.annotation.Validation(required = true)
    private String telB;

    private CallOnlinePrivacyNumberRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.telA = builder.telA;
        this.telB = builder.telB;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CallOnlinePrivacyNumberRequest create() {
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
     * @return telA
     */
    public String getTelA() {
        return this.telA;
    }

    /**
     * @return telB
     */
    public String getTelB() {
        return this.telB;
    }

    public static final class Builder extends Request.Builder<CallOnlinePrivacyNumberRequest, Builder> {
        private String instanceId; 
        private String telA; 
        private String telB; 

        private Builder() {
            super();
        } 

        private Builder(CallOnlinePrivacyNumberRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.telA = request.telA;
            this.telB = request.telB;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder telA(String telA) {
            this.putQueryParameter("TelA", telA);
            this.telA = telA;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder telB(String telB) {
            this.putQueryParameter("TelB", telB);
            this.telB = telB;
            return this;
        }

        @Override
        public CallOnlinePrivacyNumberRequest build() {
            return new CallOnlinePrivacyNumberRequest(this);
        } 

    } 

}
