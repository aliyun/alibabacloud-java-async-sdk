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
 * {@link AddPhoneNumberRequest} extends {@link RequestModel}
 *
 * <p>AddPhoneNumberRequest</p>
 */
public class AddPhoneNumberRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactFlowId")
    private String contactFlowId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhoneNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String phoneNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Usage")
    @com.aliyun.core.annotation.Validation(required = true)
    private String usage;

    private AddPhoneNumberRequest(Builder builder) {
        super(builder);
        this.contactFlowId = builder.contactFlowId;
        this.instanceId = builder.instanceId;
        this.phoneNumber = builder.phoneNumber;
        this.usage = builder.usage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddPhoneNumberRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contactFlowId
     */
    public String getContactFlowId() {
        return this.contactFlowId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * @return usage
     */
    public String getUsage() {
        return this.usage;
    }

    public static final class Builder extends Request.Builder<AddPhoneNumberRequest, Builder> {
        private String contactFlowId; 
        private String instanceId; 
        private String phoneNumber; 
        private String usage; 

        private Builder() {
            super();
        } 

        private Builder(AddPhoneNumberRequest request) {
            super(request);
            this.contactFlowId = request.contactFlowId;
            this.instanceId = request.instanceId;
            this.phoneNumber = request.phoneNumber;
            this.usage = request.usage;
        } 

        /**
         * ContactFlowId.
         */
        public Builder contactFlowId(String contactFlowId) {
            this.putQueryParameter("ContactFlowId", contactFlowId);
            this.contactFlowId = contactFlowId;
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

        /**
         * <p>This parameter is required.</p>
         */
        public Builder phoneNumber(String phoneNumber) {
            this.putQueryParameter("PhoneNumber", phoneNumber);
            this.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder usage(String usage) {
            this.putQueryParameter("Usage", usage);
            this.usage = usage;
            return this;
        }

        @Override
        public AddPhoneNumberRequest build() {
            return new AddPhoneNumberRequest(this);
        } 

    } 

}
