// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendOutboundCommandRequest} extends {@link RequestModel}
 *
 * <p>SendOutboundCommandRequest</p>
 */
public class SendOutboundCommandRequest extends Request {
    @Query
    @NameInMap("AccountName")
    @Validation(required = true)
    private String accountName;

    @Query
    @NameInMap("CalledNumber")
    @Validation(required = true)
    private String calledNumber;

    @Query
    @NameInMap("CallingNumber")
    private String callingNumber;

    @Query
    @NameInMap("CustomerInfo")
    private String customerInfo;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private SendOutboundCommandRequest(Builder builder) {
        super(builder);
        this.accountName = builder.accountName;
        this.calledNumber = builder.calledNumber;
        this.callingNumber = builder.callingNumber;
        this.customerInfo = builder.customerInfo;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendOutboundCommandRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountName
     */
    public String getAccountName() {
        return this.accountName;
    }

    /**
     * @return calledNumber
     */
    public String getCalledNumber() {
        return this.calledNumber;
    }

    /**
     * @return callingNumber
     */
    public String getCallingNumber() {
        return this.callingNumber;
    }

    /**
     * @return customerInfo
     */
    public String getCustomerInfo() {
        return this.customerInfo;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<SendOutboundCommandRequest, Builder> {
        private String accountName; 
        private String calledNumber; 
        private String callingNumber; 
        private String customerInfo; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(SendOutboundCommandRequest response) {
            super(response);
            this.accountName = response.accountName;
            this.calledNumber = response.calledNumber;
            this.callingNumber = response.callingNumber;
            this.customerInfo = response.customerInfo;
            this.instanceId = response.instanceId;
        } 

        /**
         * AccountName.
         */
        public Builder accountName(String accountName) {
            this.putQueryParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * CalledNumber.
         */
        public Builder calledNumber(String calledNumber) {
            this.putQueryParameter("CalledNumber", calledNumber);
            this.calledNumber = calledNumber;
            return this;
        }

        /**
         * CallingNumber.
         */
        public Builder callingNumber(String callingNumber) {
            this.putQueryParameter("CallingNumber", callingNumber);
            this.callingNumber = callingNumber;
            return this;
        }

        /**
         * CustomerInfo.
         */
        public Builder customerInfo(String customerInfo) {
            this.putQueryParameter("CustomerInfo", customerInfo);
            this.customerInfo = customerInfo;
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
        public SendOutboundCommandRequest build() {
            return new SendOutboundCommandRequest(this);
        } 

    } 

}
