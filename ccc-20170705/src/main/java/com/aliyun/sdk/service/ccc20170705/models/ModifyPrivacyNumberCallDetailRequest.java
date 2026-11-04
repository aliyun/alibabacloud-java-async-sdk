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
 * {@link ModifyPrivacyNumberCallDetailRequest} extends {@link RequestModel}
 *
 * <p>ModifyPrivacyNumberCallDetailRequest</p>
 */
public class ModifyPrivacyNumberCallDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String callId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String contactId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
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

        private Builder(ModifyPrivacyNumberCallDetailRequest request) {
            super(request);
            this.callId = request.callId;
            this.contactId = request.contactId;
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder callId(String callId) {
            this.putQueryParameter("CallId", callId);
            this.callId = callId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder contactId(String contactId) {
            this.putQueryParameter("ContactId", contactId);
            this.contactId = contactId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
