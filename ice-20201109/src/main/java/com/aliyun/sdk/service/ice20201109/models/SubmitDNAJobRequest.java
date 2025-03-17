// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link SubmitDNAJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitDNAJobRequest</p>
 */
public class SubmitDNAJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Config")
    private String config;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Input")
    @com.aliyun.core.annotation.Validation(required = true)
    private Input input;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PipelineId")
    private String pipelineId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrimaryKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String primaryKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private String templateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private SubmitDNAJobRequest(Builder builder) {
        super(builder);
        this.config = builder.config;
        this.DBId = builder.DBId;
        this.input = builder.input;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pipelineId = builder.pipelineId;
        this.primaryKey = builder.primaryKey;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.templateId = builder.templateId;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitDNAJobRequest create() {
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
     * @return DBId
     */
    public String getDBId() {
        return this.DBId;
    }

    /**
     * @return input
     */
    public Input getInput() {
        return this.input;
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
     * @return pipelineId
     */
    public String getPipelineId() {
        return this.pipelineId;
    }

    /**
     * @return primaryKey
     */
    public String getPrimaryKey() {
        return this.primaryKey;
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
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<SubmitDNAJobRequest, Builder> {
        private String config; 
        private String DBId; 
        private Input input; 
        private String ownerAccount; 
        private Long ownerId; 
        private String pipelineId; 
        private String primaryKey; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String templateId; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(SubmitDNAJobRequest request) {
            super(request);
            this.config = request.config;
            this.DBId = request.DBId;
            this.input = request.input;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.pipelineId = request.pipelineId;
            this.primaryKey = request.primaryKey;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.templateId = request.templateId;
            this.userData = request.userData;
        } 

        /**
         * <p>The configurations of the media fingerprint analysis job. The value is a JSON object. If you specify this parameter, the template parameters are overwritten.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;SaveType&quot;: &quot;save&quot;,&quot;MediaType&quot;&quot;:&quot;video&quot;}</p>
         */
        public Builder config(String config) {
            this.putQueryParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * <p>The ID of the media fingerprint library. If you do not specify this parameter, the default media fingerprint library is used. For more information about how to create a media fingerprint library, see <a href="https://help.aliyun.com/document_detail/479275.html">CreateDNADB</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2288c6ca184c0e47098a5b665e2a12****</p>
         */
        public Builder DBId(String DBId) {
            this.putQueryParameter("DBId", DBId);
            this.DBId = DBId;
            return this;
        }

        /**
         * <p>The input file for media fingerprint analysis.</p>
         * <p>This parameter is required.</p>
         */
        public Builder input(Input input) {
            String inputShrink = shrink(input, "Input", "json");
            this.putQueryParameter("Input", inputShrink);
            this.input = input;
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
         * <p>The ID of the ApsaraVideo Media Processing (MPS) queue to which the media fingerprint analysis job is submitted.</p>
         * 
         * <strong>example:</strong>
         * <p>5246b8d12a62433ab77845074039****</p>
         */
        public Builder pipelineId(String pipelineId) {
            this.putQueryParameter("PipelineId", pipelineId);
            this.pipelineId = pipelineId;
            return this;
        }

        /**
         * <p>The primary key of the video. You must make sure that each primary key is unique.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3ca84a39a9024f19853b21be9cf9****</p>
         */
        public Builder primaryKey(String primaryKey) {
            this.putQueryParameter("PrimaryKey", primaryKey);
            this.primaryKey = primaryKey;
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
         * <p>The template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>S00000101-100060</p>
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>The user-defined data. The data can be up to 128 bytes in length.</p>
         * 
         * <strong>example:</strong>
         * <p>userData</p>
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public SubmitDNAJobRequest build() {
            return new SubmitDNAJobRequest(this);
        } 

    } 

    /**
     * 
     * {@link SubmitDNAJobRequest} extends {@link TeaModel}
     *
     * <p>SubmitDNAJobRequest</p>
     */
    public static class Input extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Media")
        @com.aliyun.core.annotation.Validation(required = true)
        private String media;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private Input(Builder builder) {
            this.media = builder.media;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Input create() {
            return builder().build();
        }

        /**
         * @return media
         */
        public String getMedia() {
            return this.media;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String media; 
            private String type; 

            private Builder() {
            } 

            private Builder(Input model) {
                this.media = model.media;
                this.type = model.type;
            } 

            /**
             * <p>The input file. The file can be an OSS object or a media asset. You can specify the path of an OSS object in one of the following formats:</p>
             * <p>1. oss://bucket/object</p>
             * <p>2. http(s)://bucket.oss-[regionId].aliyuncs.com/object</p>
             * <p>In the preceding paths, bucket indicates an OSS bucket that resides in the same region as the current project, and object indicates the path of the object in the bucket.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1b1b9cd148034739af413150fded****</p>
             */
            public Builder media(String media) {
                this.media = media;
                return this;
            }

            /**
             * <p>The type of the input file. Valid values:</p>
             * <ol>
             * <li>OSS: Object Storage Service (OSS) object.</li>
             * <li>Media: media asset.</li>
             * </ol>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Media</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Input build() {
                return new Input(this);
            } 

        } 

    }
}
