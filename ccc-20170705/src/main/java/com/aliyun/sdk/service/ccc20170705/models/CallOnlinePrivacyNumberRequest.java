// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CallOnlinePrivacyNumberRequest} extends {@link RequestModel}
 *
 * <p>CallOnlinePrivacyNumberRequest</p>
 */
public class CallOnlinePrivacyNumberRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("TelA")
    @Validation(required = true)
    private String telA;

    @Query
    @NameInMap("TelB")
    @Validation(required = true)
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

        private Builder(CallOnlinePrivacyNumberRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.telA = response.telA;
            this.telB = response.telB;
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
         * TelA.
         */
        public Builder telA(String telA) {
            this.putQueryParameter("TelA", telA);
            this.telA = telA;
            return this;
        }

        /**
         * TelB.
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
