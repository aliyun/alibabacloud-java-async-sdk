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
 * {@link RemovePhoneNumberRequest} extends {@link RequestModel}
 *
 * <p>RemovePhoneNumberRequest</p>
 */
public class RemovePhoneNumberRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhoneNumberId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String phoneNumberId;

    private RemovePhoneNumberRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.phoneNumberId = builder.phoneNumberId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemovePhoneNumberRequest create() {
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
     * @return phoneNumberId
     */
    public String getPhoneNumberId() {
        return this.phoneNumberId;
    }

    public static final class Builder extends Request.Builder<RemovePhoneNumberRequest, Builder> {
        private String instanceId; 
        private String phoneNumberId; 

        private Builder() {
            super();
        } 

        private Builder(RemovePhoneNumberRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.phoneNumberId = request.phoneNumberId;
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
        public Builder phoneNumberId(String phoneNumberId) {
            this.putQueryParameter("PhoneNumberId", phoneNumberId);
            this.phoneNumberId = phoneNumberId;
            return this;
        }

        @Override
        public RemovePhoneNumberRequest build() {
            return new RemovePhoneNumberRequest(this);
        } 

    } 

}
