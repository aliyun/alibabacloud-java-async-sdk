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
 * {@link UpdateFlowVersionRequest} extends {@link RequestModel}
 *
 * <p>UpdateFlowVersionRequest</p>
 */
public class UpdateFlowVersionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizCode")
    private String bizCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizExtend")
    private java.util.Map<String, ?> bizExtend;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FlowCode")
    private String flowCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FlowVersion")
    private String flowVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FlowViewModel")
    private String flowViewModel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private UpdateFlowVersionRequest(Builder builder) {
        super(builder);
        this.bizCode = builder.bizCode;
        this.bizExtend = builder.bizExtend;
        this.flowCode = builder.flowCode;
        this.flowVersion = builder.flowVersion;
        this.flowViewModel = builder.flowViewModel;
        this.ownerId = builder.ownerId;
        this.remark = builder.remark;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateFlowVersionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizCode
     */
    public String getBizCode() {
        return this.bizCode;
    }

    /**
     * @return bizExtend
     */
    public java.util.Map<String, ?> getBizExtend() {
        return this.bizExtend;
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
     * @return flowViewModel
     */
    public String getFlowViewModel() {
        return this.flowViewModel;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
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

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<UpdateFlowVersionRequest, Builder> {
        private String bizCode; 
        private java.util.Map<String, ?> bizExtend; 
        private String flowCode; 
        private String flowVersion; 
        private String flowViewModel; 
        private Long ownerId; 
        private String remark; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(UpdateFlowVersionRequest request) {
            super(request);
            this.bizCode = request.bizCode;
            this.bizExtend = request.bizExtend;
            this.flowCode = request.flowCode;
            this.flowVersion = request.flowVersion;
            this.flowViewModel = request.flowViewModel;
            this.ownerId = request.ownerId;
            this.remark = request.remark;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.type = request.type;
        } 

        /**
         * <p>The business tenant code. Default value: ALICOM_OPAAS.</p>
         * 
         * <strong>example:</strong>
         * <p>ALICOM_OPAAS</p>
         */
        public Builder bizCode(String bizCode) {
            this.putQueryParameter("BizCode", bizCode);
            this.bizCode = bizCode;
            return this;
        }

        /**
         * <p>The business extension information. Default value: an empty collection.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder bizExtend(java.util.Map<String, ?> bizExtend) {
            String bizExtendShrink = shrink(bizExtend, "BizExtend", "json");
            this.putQueryParameter("BizExtend", bizExtendShrink);
            this.bizExtend = bizExtend;
            return this;
        }

        /**
         * <p>The flow code. You can view the flow code on the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">flow editor</a> page.</p>
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
         * <p>The flow version. You can click a flow name on the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">flow editor</a> page to go to the flow editor canvas page and view the flow version.</p>
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
         * <p>The DSL data of the flow version. This is a JSON-formatted data string. You can orchestrate flow components on the flow editor canvas in advance, save the flow, and then click <strong>Settings</strong> &gt; <strong>Export</strong> in the upper-right corner of the canvas orchestration page to export a JSON-formatted data file for viewing.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;schema&quot;: {
         *     &quot;namespace&quot;: &quot;External&quot;,
         *     &quot;version&quot;: &quot;1.0&quot;,
         *     &quot;copyright&quot;: &quot;Alibaba Cloud&quot;
         *   },
         *   &quot;editor&quot;: &quot;H4sIAAAAAAAAA+1YbU/c***********************&quot;,
         *   &quot;flow&quot;: {
         *     &quot;triggerType&quot;: &quot;TriggeredByWhatsApp&quot;
         *   }
         * }</p>
         */
        public Builder flowViewModel(String flowViewModel) {
            this.putQueryParameter("FlowViewModel", flowViewModel);
            this.flowViewModel = flowViewModel;
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
         * <p>The version remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>Fix WhatsApp message sending error</p>
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
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

        /**
         * <p>The save type.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample value</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public UpdateFlowVersionRequest build() {
            return new UpdateFlowVersionRequest(this);
        } 

    } 

}
