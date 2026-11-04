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
 * {@link AddBulkPhoneNumbersRequest} extends {@link RequestModel}
 *
 * <p>AddBulkPhoneNumbersRequest</p>
 */
public class AddBulkPhoneNumbersRequest extends Request {
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
    private java.util.List<String> phoneNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillGroupId")
    private java.util.List<String> skillGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Usage")
    @com.aliyun.core.annotation.Validation(required = true)
    private String usage;

    private AddBulkPhoneNumbersRequest(Builder builder) {
        super(builder);
        this.contactFlowId = builder.contactFlowId;
        this.instanceId = builder.instanceId;
        this.phoneNumber = builder.phoneNumber;
        this.skillGroupId = builder.skillGroupId;
        this.usage = builder.usage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddBulkPhoneNumbersRequest create() {
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
    public java.util.List<String> getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * @return skillGroupId
     */
    public java.util.List<String> getSkillGroupId() {
        return this.skillGroupId;
    }

    /**
     * @return usage
     */
    public String getUsage() {
        return this.usage;
    }

    public static final class Builder extends Request.Builder<AddBulkPhoneNumbersRequest, Builder> {
        private String contactFlowId; 
        private String instanceId; 
        private java.util.List<String> phoneNumber; 
        private java.util.List<String> skillGroupId; 
        private String usage; 

        private Builder() {
            super();
        } 

        private Builder(AddBulkPhoneNumbersRequest request) {
            super(request);
            this.contactFlowId = request.contactFlowId;
            this.instanceId = request.instanceId;
            this.phoneNumber = request.phoneNumber;
            this.skillGroupId = request.skillGroupId;
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
        public Builder phoneNumber(java.util.List<String> phoneNumber) {
            this.putQueryParameter("PhoneNumber", phoneNumber);
            this.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * SkillGroupId.
         */
        public Builder skillGroupId(java.util.List<String> skillGroupId) {
            this.putQueryParameter("SkillGroupId", skillGroupId);
            this.skillGroupId = skillGroupId;
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
        public AddBulkPhoneNumbersRequest build() {
            return new AddBulkPhoneNumbersRequest(this);
        } 

    } 

}
