// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddPhoneNumbersRequest} extends {@link RequestModel}
 *
 * <p>AddPhoneNumbersRequest</p>
 */
public class AddPhoneNumbersRequest extends Request {
    @Query
    @NameInMap("ContactFlowId")
    private String contactFlowId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("NumberGroupId")
    private String numberGroupId;

    @Query
    @NameInMap("NumberList")
    private String numberList;

    @Query
    @NameInMap("Usage")
    @Validation(required = true)
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
         * ContactFlowId.
         */
        public Builder contactFlowId(String contactFlowId) {
            this.putQueryParameter("ContactFlowId", contactFlowId);
            this.contactFlowId = contactFlowId;
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

        /**
         * NumberGroupId.
         */
        public Builder numberGroupId(String numberGroupId) {
            this.putQueryParameter("NumberGroupId", numberGroupId);
            this.numberGroupId = numberGroupId;
            return this;
        }

        /**
         * NumberList.
         */
        public Builder numberList(String numberList) {
            this.putQueryParameter("NumberList", numberList);
            this.numberList = numberList;
            return this;
        }

        /**
         * Usage.
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
