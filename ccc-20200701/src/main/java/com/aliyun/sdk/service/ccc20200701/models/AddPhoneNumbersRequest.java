// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link AddPhoneNumbersRequest} extends {@link RequestModel}
 *
 * <p>AddPhoneNumbersRequest</p>
 */
public class AddPhoneNumbersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactFlowId")
    private String contactFlowId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NumberGroupId")
    private String numberGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NumberList")
    private String numberList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Usage")
    @com.aliyun.core.annotation.Validation(required = true)
    private String usage;

    private AddPhoneNumbersRequest(Builder builder) {
        super(builder);
        this.contactFlowId = builder.contactFlowId;
        this.instanceId = builder.instanceId;
        this.numberGroupId = builder.numberGroupId;
        this.numberList = builder.numberList;
        this.usage = builder.usage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddPhoneNumbersRequest create() {
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
     * @return numberGroupId
     */
    public String getNumberGroupId() {
        return this.numberGroupId;
    }

    /**
     * @return numberList
     */
    public String getNumberList() {
        return this.numberList;
    }

    /**
     * @return usage
     */
    public String getUsage() {
        return this.usage;
    }

    public static final class Builder extends Request.Builder<AddPhoneNumbersRequest, Builder> {
        private String contactFlowId; 
        private String instanceId; 
        private String numberGroupId; 
        private String numberList; 
        private String usage; 

        private Builder() {
            super();
        } 

        private Builder(AddPhoneNumbersRequest request) {
            super(request);
            this.contactFlowId = request.contactFlowId;
            this.instanceId = request.instanceId;
            this.numberGroupId = request.numberGroupId;
            this.numberList = request.numberList;
            this.usage = request.usage;
        } 

        /**
         * <p>ID of the IVR contact flow to attach. This parameter is valid only when the number usage includes inbound calls. It is optional and defaults to empty.</p>
         * 
         * <strong>example:</strong>
         * <p>dDMD_0mif4hv</p>
         */
        public Builder contactFlowId(String contactFlowId) {
            this.putQueryParameter("ContactFlowId", contactFlowId);
            this.contactFlowId = contactFlowId;
            return this;
        }

        /**
         * <p>Instance ID.</p>
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
         * <p>Number group ID. You can view number grouping information in the Cloud Contact Center console. This parameter is optional and defaults to empty.</p>
         * 
         * <strong>example:</strong>
         * <p>2cb77c29-5f60-4b90-b21e-9d2ba9833f14</p>
         */
        public Builder numberGroupId(String numberGroupId) {
            this.putQueryParameter("NumberGroupId", numberGroupId);
            this.numberGroupId = numberGroupId;
            return this;
        }

        /**
         * <p>List of phone numbers to add.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;0101234****&quot;, &quot;0105678****&quot;]</p>
         */
        public Builder numberList(String numberList) {
            this.putQueryParameter("NumberList", numberList);
            this.numberList = numberList;
            return this;
        }

        /**
         * <p>Usage of the phone number. Note: If the provided number is a 400 number, the usage must be set to Inbound.</p>
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
        public AddPhoneNumbersRequest build() {
            return new AddPhoneNumbersRequest(this);
        } 

    } 

}
