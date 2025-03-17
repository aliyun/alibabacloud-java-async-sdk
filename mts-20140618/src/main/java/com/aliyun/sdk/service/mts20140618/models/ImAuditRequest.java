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
 * {@link ImAuditRequest} extends {@link RequestModel}
 *
 * <p>ImAuditRequest</p>
 */
public class ImAuditRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizType")
    private String bizType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Contents")
    private String contents;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Images")
    private String images;

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
    @com.aliyun.core.annotation.NameInMap("Scenes")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scenes;

    private ImAuditRequest(Builder builder) {
        super(builder);
        this.bizType = builder.bizType;
        this.contents = builder.contents;
        this.images = builder.images;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.scenes = builder.scenes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImAuditRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return contents
     */
    public String getContents() {
        return this.contents;
    }

    /**
     * @return images
     */
    public String getImages() {
        return this.images;
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
     * @return scenes
     */
    public String getScenes() {
        return this.scenes;
    }

    public static final class Builder extends Request.Builder<ImAuditRequest, Builder> {
        private String bizType; 
        private String contents; 
        private String images; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String scenes; 

        private Builder() {
            super();
        } 

        private Builder(ImAuditRequest request) {
            super(request);
            this.bizType = request.bizType;
            this.contents = request.contents;
            this.images = request.images;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.scenes = request.scenes;
        } 

        /**
         * <p>The business type. By default, the public business type is used.</p>
         * 
         * <strong>example:</strong>
         * <p>139440480445****</p>
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * <p>The custom text entries. You can specify up to 5 text entries. The value must be a JSON array. You must specify at least one of the Images and Contents parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;Hello&quot;,&quot;Who are you&quot;,&quot;Where am I&quot;]</p>
         */
        public Builder contents(String contents) {
            this.putQueryParameter("Contents", contents);
            this.contents = contents;
            return this;
        }

        /**
         * <p>The image URLs. You can specify up to 5 image URLs. The value must be a JSON array. To view the URLs of the images, you can log on to the <strong>ApsaraVideo Media Processing (MPS) console</strong> and choose <strong>Media Management</strong> &gt; <strong>Media List</strong> in the left-side navigation pane. You must set at least one of the Images and Contents parameters. The image to be moderated must meet the following limits. Otherwise, the moderation task may fail.</p>
         * <ul>
         * <li>The image size cannot exceed 20 MB, the height or width of the image cannot exceed 30,000 pixels, and the image cannot exceed 0.25 billion pixels.</li>
         * <li>We recommend that you upload images of at least 256 × 256 pixels to ensure required moderation result.</li>
         * </ul>
         */
        public Builder images(String images) {
            this.putQueryParameter("Images", images);
            this.images = images;
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
         * <p>The moderation scenarios. Separate multiple scenarios with commas (,). For example, if you specify {&quot;porn&quot;,&quot;terrorism&quot;} for this parameter, both pornographic content detection and terrorist content detection are performed on the images and text. Valid values:</p>
         * <ul>
         * <li>porn: pornography</li>
         * <li>terrorism: terrorist content</li>
         * <li>ad: ad violation</li>
         * <li>qrcode: QR code</li>
         * <li>live: undesirable scene</li>
         * <li>logo: special logo</li>
         * <li>antispam: text anti-spam (valid only for text)</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;porn&quot;,&quot;terrorism&quot;,&quot;ad&quot;]</p>
         */
        public Builder scenes(String scenes) {
            this.putQueryParameter("Scenes", scenes);
            this.scenes = scenes;
            return this;
        }

        @Override
        public ImAuditRequest build() {
            return new ImAuditRequest(this);
        } 

    } 

}
