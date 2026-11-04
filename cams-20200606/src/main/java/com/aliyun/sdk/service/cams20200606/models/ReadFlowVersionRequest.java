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
 * {@link ReadFlowVersionRequest} extends {@link RequestModel}
 *
 * <p>ReadFlowVersionRequest</p>
 */
public class ReadFlowVersionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizCode")
    private String bizCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizExtend")
    private java.util.Map<String, ?> bizExtend;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DraftVersion")
    private String draftVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FlowCode")
    private String flowCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FlowVersion")
    private String flowVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private ReadFlowVersionRequest(Builder builder) {
        super(builder);
        this.bizCode = builder.bizCode;
        this.bizExtend = builder.bizExtend;
        this.draftVersion = builder.draftVersion;
        this.flowCode = builder.flowCode;
        this.flowVersion = builder.flowVersion;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReadFlowVersionRequest create() {
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
     * @return draftVersion
     */
    public String getDraftVersion() {
        return this.draftVersion;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ReadFlowVersionRequest, Builder> {
        private String bizCode; 
        private java.util.Map<String, ?> bizExtend; 
        private String draftVersion; 
        private String flowCode; 
        private String flowVersion; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ReadFlowVersionRequest request) {
            super(request);
            this.bizCode = request.bizCode;
            this.bizExtend = request.bizExtend;
            this.draftVersion = request.draftVersion;
            this.flowCode = request.flowCode;
            this.flowVersion = request.flowVersion;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.status = request.status;
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
         * <p>The draft version.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample valueSample value</p>
         */
        public Builder draftVersion(String draftVersion) {
            this.putQueryParameter("DraftVersion", draftVersion);
            this.draftVersion = draftVersion;
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
         * <p>The flow version. You can click a flow name on the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">flow editor</a> page to go to the canvas orchestration page and view the flow version, or call <a href="https://help.aliyun.com/document_detail/2937202.html">ListFlowVersion</a> to retrieve the flow version.</p>
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
         * <p>The flow version status. Valid values:</p>
         * <ul>
         * <li>DRAFT: draft.</li>
         * <li>DELETED: deleted.</li>
         * <li>ONLINE: online.</li>
         * <li>OFFLINE: offline.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DRAFT</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ReadFlowVersionRequest build() {
            return new ReadFlowVersionRequest(this);
        } 

    } 

}
