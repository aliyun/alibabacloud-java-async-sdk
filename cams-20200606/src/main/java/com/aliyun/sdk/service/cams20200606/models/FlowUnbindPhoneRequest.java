// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

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
 * {@link FlowUnbindPhoneRequest} extends {@link RequestModel}
 *
 * <p>FlowUnbindPhoneRequest</p>
 */
public class FlowUnbindPhoneRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelType")
    private String channelType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FlowCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String flowCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FlowVersion")
    private String flowVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhoneNumbers")
    private java.util.List<String> phoneNumbers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private FlowUnbindPhoneRequest(Builder builder) {
        super(builder);
        this.channelType = builder.channelType;
        this.flowCode = builder.flowCode;
        this.flowVersion = builder.flowVersion;
        this.ownerId = builder.ownerId;
        this.phoneNumbers = builder.phoneNumbers;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FlowUnbindPhoneRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return channelType
     */
    public String getChannelType() {
        return this.channelType;
    }

    /**
     * @return flowCode
     */
    public String getFlowCode() {
        return this.flowCode;
    }

    /**
     * @return flowVersion
     */
    public String getFlowVersion() {
        return this.flowVersion;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return phoneNumbers
     */
    public java.util.List<String> getPhoneNumbers() {
        return this.phoneNumbers;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<FlowUnbindPhoneRequest, Builder> {
        private String channelType; 
        private String flowCode; 
        private String flowVersion; 
        private Long ownerId; 
        private java.util.List<String> phoneNumbers; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(FlowUnbindPhoneRequest request) {
            super(request);
            this.channelType = request.channelType;
            this.flowCode = request.flowCode;
            this.flowVersion = request.flowVersion;
            this.ownerId = request.ownerId;
            this.phoneNumbers = request.phoneNumbers;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The message channel type. Valid values:</p>
         * <ul>
         * <li><p>INSTAGRAM</p>
         * </li>
         * <li><p>WHATSAPP</p>
         * </li>
         * <li><p>MESSENGER</p>
         * </li>
         * </ul>
         * <p>&lt;props=&quot;intl&quot;&gt;- VIBER</p>
         * 
         * <strong>example:</strong>
         * <p>WHATSAPP</p>
         */
        public Builder channelType(String channelType) {
            this.putQueryParameter("ChannelType", channelType);
            this.channelType = channelType;
            return this;
        }

        /**
         * <p>The flow code. You can view the flow code on the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Flow Editor</a> page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>9ccc41**************************</p>
         */
        public Builder flowCode(String flowCode) {
            this.putQueryParameter("FlowCode", flowCode);
            this.flowCode = flowCode;
            return this;
        }

        /**
         * <p>The flow version. You can click the flow name on the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Flow Editor</a> page to go to the canvas page of the flow editor and view the flow version.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder flowVersion(String flowVersion) {
            this.putQueryParameter("FlowVersion", flowVersion);
            this.flowVersion = flowVersion;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The list of phone numbers, PageIds, AccountIds&lt;props=&quot;intl&quot;&gt;, and ServiceIds under the channel instance.</p>
         */
        public Builder phoneNumbers(java.util.List<String> phoneNumbers) {
            String phoneNumbersShrink = shrink(phoneNumbers, "PhoneNumbers", "json");
            this.putQueryParameter("PhoneNumbers", phoneNumbersShrink);
            this.phoneNumbers = phoneNumbers;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        @Override
        public FlowUnbindPhoneRequest build() {
            return new FlowUnbindPhoneRequest(this);
        } 

    } 

}
