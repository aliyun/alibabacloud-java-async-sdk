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
 * {@link CreateInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateInstanceRequest</p>
 */
public class CreateInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallingNumber")
    private java.util.List<String> callingNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceDescription")
    private String instanceDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxConcurrentConversation")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer maxConcurrentConversation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NluServiceType")
    private String nluServiceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private CreateInstanceRequest(Builder builder) {
        super(builder);
        this.callingNumber = builder.callingNumber;
        this.instanceDescription = builder.instanceDescription;
        this.instanceName = builder.instanceName;
        this.maxConcurrentConversation = builder.maxConcurrentConversation;
        this.nluServiceType = builder.nluServiceType;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInstanceRequest create() {
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

    /**
     * @return nluServiceType
     */
    public String getNluServiceType() {
        return this.nluServiceType;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<CreateInstanceRequest, Builder> {
        private java.util.List<String> callingNumber; 
        private String instanceDescription; 
        private String instanceName; 
        private Integer maxConcurrentConversation; 
        private String nluServiceType; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(CreateInstanceRequest request) {
            super(request);
            this.callingNumber = request.callingNumber;
            this.instanceDescription = request.instanceDescription;
            this.instanceName = request.instanceName;
            this.maxConcurrentConversation = request.maxConcurrentConversation;
            this.nluServiceType = request.nluServiceType;
            this.resourceGroupId = request.resourceGroupId;
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
         * <p>4</p>
         */
        public Builder maxConcurrentConversation(Integer maxConcurrentConversation) {
            this.putQueryParameter("MaxConcurrentConversation", maxConcurrentConversation);
            this.maxConcurrentConversation = maxConcurrentConversation;
            return this;
        }

        /**
         * NluServiceType.
         */
        public Builder nluServiceType(String nluServiceType) {
            this.putQueryParameter("NluServiceType", nluServiceType);
            this.nluServiceType = nluServiceType;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public CreateInstanceRequest build() {
            return new CreateInstanceRequest(this);
        } 

    } 

}
