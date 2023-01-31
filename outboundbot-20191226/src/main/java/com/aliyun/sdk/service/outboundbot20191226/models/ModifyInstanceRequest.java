// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyInstanceRequest} extends {@link RequestModel}
 *
 * <p>ModifyInstanceRequest</p>
 */
public class ModifyInstanceRequest extends Request {
    @Query
    @NameInMap("CallingNumber")
    private java.util.List < String > callingNumber;

    @Query
    @NameInMap("InstanceDescription")
    private String instanceDescription;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("InstanceName")
    private String instanceName;

    @Query
    @NameInMap("MaxConcurrentConversation")
    @Validation(required = true)
    private Integer maxConcurrentConversation;

    private ModifyInstanceRequest(Builder builder) {
        super(builder);
        this.callingNumber = builder.callingNumber;
        this.instanceDescription = builder.instanceDescription;
        this.instanceId = builder.instanceId;
        this.instanceName = builder.instanceName;
        this.maxConcurrentConversation = builder.maxConcurrentConversation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callingNumber
     */
    public java.util.List < String > getCallingNumber() {
        return this.callingNumber;
    }

    /**
     * @return instanceDescription
     */
    public String getInstanceDescription() {
        return this.instanceDescription;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return maxConcurrentConversation
     */
    public Integer getMaxConcurrentConversation() {
        return this.maxConcurrentConversation;
    }

    public static final class Builder extends Request.Builder<ModifyInstanceRequest, Builder> {
        private java.util.List < String > callingNumber; 
        private String instanceDescription; 
        private String instanceId; 
        private String instanceName; 
        private Integer maxConcurrentConversation; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceRequest request) {
            super(request);
            this.callingNumber = request.callingNumber;
            this.instanceDescription = request.instanceDescription;
            this.instanceId = request.instanceId;
            this.instanceName = request.instanceName;
            this.maxConcurrentConversation = request.maxConcurrentConversation;
        } 

        /**
         * CallingNumber.
         */
        public Builder callingNumber(java.util.List < String > callingNumber) {
            this.putQueryParameter("CallingNumber", callingNumber);
            this.callingNumber = callingNumber;
            return this;
        }

        /**
         * InstanceDescription.
         */
        public Builder instanceDescription(String instanceDescription) {
            this.putQueryParameter("InstanceDescription", instanceDescription);
            this.instanceDescription = instanceDescription;
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
         * InstanceName.
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * MaxConcurrentConversation.
         */
        public Builder maxConcurrentConversation(Integer maxConcurrentConversation) {
            this.putQueryParameter("MaxConcurrentConversation", maxConcurrentConversation);
            this.maxConcurrentConversation = maxConcurrentConversation;
            return this;
        }

        @Override
        public ModifyInstanceRequest build() {
            return new ModifyInstanceRequest(this);
        } 

    } 

}
