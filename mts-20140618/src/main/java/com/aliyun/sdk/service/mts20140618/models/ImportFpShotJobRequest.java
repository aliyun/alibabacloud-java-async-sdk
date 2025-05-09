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
 * {@link ImportFpShotJobRequest} extends {@link RequestModel}
 *
 * <p>ImportFpShotJobRequest</p>
 */
public class ImportFpShotJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FpDBId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fpDBId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FpImportConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fpImportConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Input")
    @com.aliyun.core.annotation.Validation(required = true)
    private String input;

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
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private ImportFpShotJobRequest(Builder builder) {
        super(builder);
        this.fpDBId = builder.fpDBId;
        this.fpImportConfig = builder.fpImportConfig;
        this.input = builder.input;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pipelineId = builder.pipelineId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportFpShotJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fpDBId
     */
    public String getFpDBId() {
        return this.fpDBId;
    }

    /**
     * @return fpImportConfig
     */
    public String getFpImportConfig() {
        return this.fpImportConfig;
    }

    /**
     * @return input
     */
    public String getInput() {
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
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<ImportFpShotJobRequest, Builder> {
        private String fpDBId; 
        private String fpImportConfig; 
        private String input; 
        private String ownerAccount; 
        private Long ownerId; 
        private String pipelineId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(ImportFpShotJobRequest request) {
            super(request);
            this.fpDBId = request.fpDBId;
            this.fpImportConfig = request.fpImportConfig;
            this.input = request.input;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.pipelineId = request.pipelineId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.userData = request.userData;
        } 

        /**
         * <p>The ID of the text fingerprint library to which the text file is imported. You can specify only one job of importing text files to a text fingerprint library at a time. You can obtain the library ID from the response parameters of the <a href="https://help.aliyun.com/document_detail/170149.html">CreateFpShotDB</a> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>88c6ca184c0e47098a5b665e2a12****</p>
         */
        public Builder fpDBId(String fpDBId) {
            this.putQueryParameter("FpDBId", fpDBId);
            this.fpDBId = fpDBId;
            return this;
        }

        /**
         * <p>The job configurations. The value must be a JSON object. Example: <code>{&quot;SaveType&quot;:&quot;onlysave&quot;}</code>. The <code>SaveType</code> field indicates the storage type. Valid values of the SaveType field:</p>
         * <ul>
         * <li><strong>save</strong>: The fingerprints of the text file are saved to the text fingerprint library only if the text file is not duplicated with content in the text fingerprint library.</li>
         * <li><strong>onlysave</strong>: The fingerprints of the text file are saved to the text fingerprint library.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;SaveType&quot;:&quot;onlysave&quot;}</p>
         */
        public Builder fpImportConfig(String fpImportConfig) {
            this.putQueryParameter("FpImportConfig", fpImportConfig);
            this.fpImportConfig = fpImportConfig;
            return this;
        }

        /**
         * <p>The Object Storage Service (OSS) URL of the text file to be imported to the text fingerprint library. The value must be a JSON object. Example: {&quot;Bucket&quot;:&quot;example-bucket&quot;,&quot;Location&quot;:&quot;oss-cn-shanghai&quot;,&quot;Object&quot;:&quot;example.flv&quot;}.</p>
         * <blockquote>
         * <p>The OSS bucket must reside in the same region as your MPS service.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{“Bucket”:”example-bucket”,“Location”:”oss-cn-shanghai”,“Object”:”example.txt”}</p>
         */
        public Builder input(String input) {
            this.putQueryParameter("Input", input);
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
         * <p>The ID of the ApsaraVideo Media Processing (MPS) queue. To view the ID of the MPS queue, perform the following steps: Log on to the <strong>MPS console</strong>. In the left-side navigation pane, choose <strong>Global Settings</strong> &gt; <strong>Pipelines</strong>. The MPS queue is associated with a specified Message Service (MNS) topic. You can submit jobs for different services to different MPS queues. If you do not specify this parameter, the job is submitted to the default MPS queue and no MNS topic is associated with the MPS queue.</p>
         * 
         * <strong>example:</strong>
         * <p>ae687c02fe944327ba9631e50da2****</p>
         */
        public Builder pipelineId(String pipelineId) {
            this.putQueryParameter("PipelineId", pipelineId);
            this.pipelineId = pipelineId;
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
         * <p>The user-defined data. The value can contain letters, digits, and special characters. The value can be up to 128 bytes in length.</p>
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public ImportFpShotJobRequest build() {
            return new ImportFpShotJobRequest(this);
        } 

    } 

}
