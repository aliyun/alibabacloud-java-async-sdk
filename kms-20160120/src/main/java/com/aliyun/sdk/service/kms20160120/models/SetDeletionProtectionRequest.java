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
    @com.aliyun.core.annotation.NameInMap("ProtectedResourceArn")
    private String protectedResourceArn;

    private SetDeletionProtectionRequest(Builder builder) {
        super(builder);
        this.deletionProtectionDescription = builder.deletionProtectionDescription;
        this.enableDeletionProtection = builder.enableDeletionProtection;
        this.keyId = builder.keyId;
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
     * @return protectedResourceArn
     */
    public String getProtectedResourceArn() {
        return this.protectedResourceArn;
    }

    public static final class Builder extends Request.Builder<SetDeletionProtectionRequest, Builder> {
        private String deletionProtectionDescription; 
        private Boolean enableDeletionProtection; 
        private String keyId; 
        private String protectedResourceArn; 

        private Builder() {
            super();
        } 

        private Builder(SetDeletionProtectionRequest request) {
            super(request);
            this.deletionProtectionDescription = request.deletionProtectionDescription;
            this.enableDeletionProtection = request.enableDeletionProtection;
            this.keyId = request.keyId;
            this.protectedResourceArn = request.protectedResourceArn;
        } 

        /**
         * <p>The description of deletion protection.</p>
         * <blockquote>
         * <p> This parameter takes effect only when you set the EnableDeletionProtection parameter to true.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>This key is being used by XXX service. You are protected from deletion.</p>
         */
        public Builder deletionProtectionDescription(String deletionProtectionDescription) {
            this.putQueryParameter("DeletionProtectionDescription", deletionProtectionDescription);
            this.deletionProtectionDescription = deletionProtectionDescription;
            return this;
        }

        /**
         * <p>Specifies whether to enable deletion protection. Valid values:</p>
         * <ul>
         * <li>true: enables deletion protection.</li>
         * <li>false: disables deletion protection.</li>
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
         * KeyId.
         */
        public Builder keyId(String keyId) {
            this.putQueryParameter("KeyId", keyId);
            this.keyId = keyId;
            return this;
        }

        /**
         * <p>The ARN of the CMK for which you want to set deletion protection.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/28952.html">DescribeKey</a> operation to query the CMK ARN.</p>
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
