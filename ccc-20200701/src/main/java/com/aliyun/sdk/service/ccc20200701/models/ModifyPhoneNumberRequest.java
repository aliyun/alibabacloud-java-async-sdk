// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyPhoneNumberRequest} extends {@link RequestModel}
 *
 * <p>ModifyPhoneNumberRequest</p>
 */
public class ModifyPhoneNumberRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactFlowId")
    private String contactFlowId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Number")
    @com.aliyun.core.annotation.Validation(required = true)
    private String number;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Usage")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 200, minLength = 1)
    private String usage;

    private ModifyPhoneNumberRequest(Builder builder) {
        super(builder);
        this.contactFlowId = builder.contactFlowId;
        this.instanceId = builder.instanceId;
        this.number = builder.number;
        this.usage = builder.usage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyPhoneNumberRequest create() {
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
     * @return number
     */
    public String getNumber() {
        return this.number;
    }

    /**
     * @return usage
     */
    public String getUsage() {
        return this.usage;
    }

    public static final class Builder extends Request.Builder<ModifyPhoneNumberRequest, Builder> {
        private String contactFlowId; 
        private String instanceId; 
        private String number; 
        private String usage; 

        private Builder() {
            super();
        } 

        private Builder(ModifyPhoneNumberRequest request) {
            super(request);
            this.contactFlowId = request.contactFlowId;
            this.instanceId = request.instanceId;
            this.number = request.number;
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
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0102134****</p>
         */
        public Builder number(String number) {
            this.putQueryParameter("Number", number);
            this.number = number;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Bidirection</p>
         */
        public Builder usage(String usage) {
            this.putQueryParameter("Usage", usage);
            this.usage = usage;
            return this;
        }

        @Override
        public ModifyPhoneNumberRequest build() {
            return new ModifyPhoneNumberRequest(this);
        } 

    } 

}
