// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link ModifyInstanceRequest} extends {@link RequestModel}
 *
 * <p>ModifyInstanceRequest</p>
 */
public class ModifyInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallingNumber")
    private java.util.List<String> callingNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceDescription")
    private String instanceDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxConcurrentConversation")
    @com.aliyun.core.annotation.Validation(required = true)
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
    public java.util.List<String> getCallingNumber() {
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
        private java.util.List<String> callingNumber; 
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
        public Builder callingNumber(java.util.List<String> callingNumber) {
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>90515b5-6115-4ccf-83e2-52d5bfaf2ddf</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
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
