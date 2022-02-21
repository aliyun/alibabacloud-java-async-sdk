// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemovePhoneNumberRequest} extends {@link RequestModel}
 *
 * <p>RemovePhoneNumberRequest</p>
 */
public class RemovePhoneNumberRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("PhoneNumberId")
    @Validation(required = true)
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

        private Builder(RemovePhoneNumberRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.phoneNumberId = response.phoneNumberId;
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
         * PhoneNumberId.
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
