// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyPrivacyNumberCallDetailRequest} extends {@link RequestModel}
 *
 * <p>ModifyPrivacyNumberCallDetailRequest</p>
 */
public class ModifyPrivacyNumberCallDetailRequest extends Request {
    @Query
    @NameInMap("CallId")
    @Validation(required = true)
    private String callId;

    @Query
    @NameInMap("ContactId")
    @Validation(required = true)
    private String contactId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private ModifyPrivacyNumberCallDetailRequest(Builder builder) {
        super(builder);
        this.callId = builder.callId;
        this.contactId = builder.contactId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyPrivacyNumberCallDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callId
     */
    public String getCallId() {
        return this.callId;
    }

    /**
     * @return contactId
     */
    public String getContactId() {
        return this.contactId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<ModifyPrivacyNumberCallDetailRequest, Builder> {
        private String callId; 
        private String contactId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyPrivacyNumberCallDetailRequest response) {
            super(response);
            this.callId = response.callId;
            this.contactId = response.contactId;
            this.instanceId = response.instanceId;
        } 

        /**
         * CallId.
         */
        public Builder callId(String callId) {
            this.putQueryParameter("CallId", callId);
            this.callId = callId;
            return this;
        }

        /**
         * ContactId.
         */
        public Builder contactId(String contactId) {
            this.putQueryParameter("ContactId", contactId);
            this.contactId = contactId;
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

        @Override
        public ModifyPrivacyNumberCallDetailRequest build() {
            return new ModifyPrivacyNumberCallDetailRequest(this);
        } 

    } 

}
