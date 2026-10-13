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
         * <p>The list of calling numbers.</p>
         * <blockquote>
         * <p>This parameter is optional.</p>
         * </blockquote>
         */
        public Builder callingNumber(java.util.List<String> callingNumber) {
            this.putQueryParameter("CallingNumber", callingNumber);
            this.callingNumber = callingNumber;
            return this;
        }

        /**
         * <p>The description of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>这个是第一的实例</p>
         */
        public Builder instanceDescription(String instanceDescription) {
            this.putQueryParameter("InstanceDescription", instanceDescription);
            this.instanceDescription = instanceDescription;
            return this;
        }

        /**
         * <p>The name of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>第一个实例</p>
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The maximum number of concurrent conversations for the instance.</p>
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
         * <p>The service type.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the default value is Managed.</p>
         * </blockquote>
         * <ul>
         * <li><p>DialogStudio: Conversation Engine 3.0.</p>
         * </li>
         * <li><p>Authorized: A chatbot for the public cloud. This value is used when a public cloud customer purchases a private Intelligent Speech Interaction service and grants authorization. To grant authorization, go to Scenario Management, click Edit, and then select Custom Service in the Invoke Service section.</p>
         * </li>
         * <li><p>Provided: A chatbot for on-premises deployment.</p>
         * </li>
         * <li><p>Managed: The legacy outbound call canvas. This is the default public Intelligent Speech Interaction service for the outbound call product.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DialogStudio</p>
         */
        public Builder nluServiceType(String nluServiceType) {
            this.putQueryParameter("NluServiceType", nluServiceType);
            this.nluServiceType = nluServiceType;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * <blockquote>
         * <p>You can call the ListResourceGroups operation to obtain this ID. For more information, see the Resource Management documentation at https\://api.aliyun.com/document/ResourceManager/2020-03-31/ListResourceGroups</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmwd4qr3z773y</p>
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
