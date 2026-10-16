// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

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
 * {@link SetDeletionProtectionRequest} extends {@link RequestModel}
 *
 * <p>SetDeletionProtectionRequest</p>
 */
public class SetDeletionProtectionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeletionProtectionDescription")
    private String deletionProtectionDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableDeletionProtection")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean enableDeletionProtection;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyId")
    private String keyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KmsInstanceId")
    private String kmsInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProtectedResourceArn")
    private String protectedResourceArn;

    private SetDeletionProtectionRequest(Builder builder) {
        super(builder);
        this.deletionProtectionDescription = builder.deletionProtectionDescription;
        this.enableDeletionProtection = builder.enableDeletionProtection;
        this.keyId = builder.keyId;
        this.kmsInstanceId = builder.kmsInstanceId;
        this.protectedResourceArn = builder.protectedResourceArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDeletionProtectionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deletionProtectionDescription
     */
    public String getDeletionProtectionDescription() {
        return this.deletionProtectionDescription;
    }

    /**
     * @return enableDeletionProtection
     */
    public Boolean getEnableDeletionProtection() {
        return this.enableDeletionProtection;
    }

    /**
     * @return keyId
     */
    public String getKeyId() {
        return this.keyId;
    }

    /**
     * @return kmsInstanceId
     */
    public String getKmsInstanceId() {
        return this.kmsInstanceId;
    }

    /**
     * @return protectedResourceArn
     */
    public String getProtectedResourceArn() {
        return this.protectedResourceArn;
    }

    public static final class Builder extends Request.Builder<SetDeletionProtectionRequest, Builder> {
        private String deletionProtectionDescription; 
        private Boolean enableDeletionProtection; 
        private String keyId; 
        private String kmsInstanceId; 
        private String protectedResourceArn; 

        private Builder() {
            super();
        } 

        private Builder(SetDeletionProtectionRequest request) {
            super(request);
            this.deletionProtectionDescription = request.deletionProtectionDescription;
            this.enableDeletionProtection = request.enableDeletionProtection;
            this.keyId = request.keyId;
            this.kmsInstanceId = request.kmsInstanceId;
            this.protectedResourceArn = request.protectedResourceArn;
        } 

        /**
         * <p>The description of deletion protection.  </p>
         * <blockquote>
         * <p>This parameter is valid only when EnableDeletionProtection is set to true.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>The CMK is being used by XXX. Deletion protection is set.</p>
         */
        public Builder deletionProtectionDescription(String deletionProtectionDescription) {
            this.putQueryParameter("DeletionProtectionDescription", deletionProtectionDescription);
            this.deletionProtectionDescription = deletionProtectionDescription;
            return this;
        }

        /**
         * <p>Specifies whether to enable deletion protection. Valid values:</p>
         * <ul>
         * <li><p>true: enables deletion protection.</p>
         * </li>
         * <li><p>false (default): disables deletion protection.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableDeletionProtection(Boolean enableDeletionProtection) {
            this.putQueryParameter("EnableDeletionProtection", enableDeletionProtection);
            this.enableDeletionProtection = enableDeletionProtection;
            return this;
        }

        /**
         * <p>The ID of the key.</p>
         * 
         * <strong>example:</strong>
         * <p>key-hzz65f3a68554s6ms****</p>
         */
        public Builder keyId(String keyId) {
            this.putQueryParameter("KeyId", keyId);
            this.keyId = keyId;
            return this;
        }

        /**
         * KmsInstanceId.
         */
        public Builder kmsInstanceId(String kmsInstanceId) {
            this.putQueryParameter("KmsInstanceId", kmsInstanceId);
            this.kmsInstanceId = kmsInstanceId;
            return this;
        }

        /**
         * <p>The ARN of the CMK for which you want to set deletion protection.<br>You can call the <a href="https://help.aliyun.com/document_detail/28952.html">DescribeKey</a> operation to query the CMK ARN (Arn).</p>
         * 
         * <strong>example:</strong>
         * <p>acs:kms:cn-hangzhou:123213123****:key/0225f411-b21d-46d1-be5b-93931c82****</p>
         */
        public Builder protectedResourceArn(String protectedResourceArn) {
            this.putQueryParameter("ProtectedResourceArn", protectedResourceArn);
            this.protectedResourceArn = protectedResourceArn;
            return this;
        }

        @Override
        public SetDeletionProtectionRequest build() {
            return new SetDeletionProtectionRequest(this);
        } 

    } 

}
