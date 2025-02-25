// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    @com.aliyun.core.annotation.NameInMap("ProtectedResourceArn")
    @com.aliyun.core.annotation.Validation(required = true)
    private String protectedResourceArn;

    private SetDeletionProtectionRequest(Builder builder) {
        super(builder);
        this.deletionProtectionDescription = builder.deletionProtectionDescription;
        this.enableDeletionProtection = builder.enableDeletionProtection;
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
     * @return protectedResourceArn
     */
    public String getProtectedResourceArn() {
        return this.protectedResourceArn;
    }

    public static final class Builder extends Request.Builder<SetDeletionProtectionRequest, Builder> {
        private String deletionProtectionDescription; 
        private Boolean enableDeletionProtection; 
        private String protectedResourceArn; 

        private Builder() {
            super();
        } 

        private Builder(SetDeletionProtectionRequest request) {
            super(request);
            this.deletionProtectionDescription = request.deletionProtectionDescription;
            this.enableDeletionProtection = request.enableDeletionProtection;
            this.protectedResourceArn = request.protectedResourceArn;
        } 

        /**
         * The description of deletion protection.
         * <p>
         * 
         * >  This parameter takes effect only when you set the EnableDeletionProtection parameter to true.
         */
        public Builder deletionProtectionDescription(String deletionProtectionDescription) {
            this.putQueryParameter("DeletionProtectionDescription", deletionProtectionDescription);
            this.deletionProtectionDescription = deletionProtectionDescription;
            return this;
        }

        /**
         * Specifies whether to enable deletion protection. Valid values:
         * <p>
         * 
         * *   true: enables deletion protection.
         * *   false: disables deletion protection.
         */
        public Builder enableDeletionProtection(Boolean enableDeletionProtection) {
            this.putQueryParameter("EnableDeletionProtection", enableDeletionProtection);
            this.enableDeletionProtection = enableDeletionProtection;
            return this;
        }

        /**
         * The ARN of the CMK for which you want to set deletion protection.
         * <p>
         * 
         * You can call the [DescribeKey](~~28952~~) operation to query the CMK ARN.
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
