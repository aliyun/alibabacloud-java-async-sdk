// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

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
 * {@link UpdateWaterMarkTemplateRequest} extends {@link RequestModel}
 *
 * <p>UpdateWaterMarkTemplateRequest</p>
 */
public class UpdateWaterMarkTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Config")
    @com.aliyun.core.annotation.Validation(required = true)
    private String config;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

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
    @com.aliyun.core.annotation.NameInMap("WaterMarkTemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String waterMarkTemplateId;

    private UpdateWaterMarkTemplateRequest(Builder builder) {
        super(builder);
        this.config = builder.config;
        this.name = builder.name;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.waterMarkTemplateId = builder.waterMarkTemplateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWaterMarkTemplateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
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
     * @return waterMarkTemplateId
     */
    public String getWaterMarkTemplateId() {
        return this.waterMarkTemplateId;
    }

    public static final class Builder extends Request.Builder<UpdateWaterMarkTemplateRequest, Builder> {
        private String config; 
        private String name; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String waterMarkTemplateId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateWaterMarkTemplateRequest request) {
            super(request);
            this.config = request.config;
            this.name = request.name;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.waterMarkTemplateId = request.waterMarkTemplateId;
        } 

        /**
         * <p>The updated configuration of the watermark template. The value is a JSON object. For more information, see <a href="https://help.aliyun.com/document_detail/29253.html">Parameter details</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Width&quot;:&quot;10&quot;,&quot;Height&quot;:&quot;30&quot;,&quot;Dx&quot;:&quot;10&quot;,&quot;Dy&quot;:&quot;5&quot;,&quot;Type&quot;:&quot;Image&quot;,&quot;Timeline&quot;:{&quot;Start&quot;:&quot;0&quot;,&quot;Duration&quot;:&quot;10&quot;}}</p>
         */
        public Builder config(String config) {
            this.putQueryParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * <p>The new name of the watermark template. The value can contain letters and digits and can be up to 128 bytes in size.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example-watermark-****</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
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
         * <p>The ID of the watermark template that you want to update. To obtain the ID of the watermark template, you can log on to the <strong>ApsaraVideo Media Processing (MPS) console</strong> and choose <strong>Global Settings</strong> &gt; <strong>Watermark Templates</strong> in the left-side navigation pane.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3780bd69b2b74540bc7b1096f564****</p>
         */
        public Builder waterMarkTemplateId(String waterMarkTemplateId) {
            this.putQueryParameter("WaterMarkTemplateId", waterMarkTemplateId);
            this.waterMarkTemplateId = waterMarkTemplateId;
            return this;
        }

        @Override
        public UpdateWaterMarkTemplateRequest build() {
            return new UpdateWaterMarkTemplateRequest(this);
        } 

    } 

}
