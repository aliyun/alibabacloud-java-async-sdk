// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

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
 * {@link CreateCloudAccountRequest} extends {@link RequestModel}
 *
 * <p>CreateCloudAccountRequest</p>
 */
public class CreateCloudAccountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DisplayName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String displayName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Email")
    @com.aliyun.core.annotation.Validation(required = true)
    private String email;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParentFolderId")
    private String parentFolderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PayerAccountId")
    private String payerAccountId;

    private CreateCloudAccountRequest(Builder builder) {
        super(builder);
        this.displayName = builder.displayName;
        this.email = builder.email;
        this.parentFolderId = builder.parentFolderId;
        this.payerAccountId = builder.payerAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCloudAccountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return parentFolderId
     */
    public String getParentFolderId() {
        return this.parentFolderId;
    }

    /**
     * @return payerAccountId
     */
    public String getPayerAccountId() {
        return this.payerAccountId;
    }

    public static final class Builder extends Request.Builder<CreateCloudAccountRequest, Builder> {
        private String displayName; 
        private String email; 
        private String parentFolderId; 
        private String payerAccountId; 

        private Builder() {
            super();
        } 

        private Builder(CreateCloudAccountRequest request) {
            super(request);
            this.displayName = request.displayName;
            this.email = request.email;
            this.parentFolderId = request.parentFolderId;
            this.payerAccountId = request.payerAccountId;
        } 

        /**
         * <p>The display name of the member account.</p>
         * <p>The name must be 2 to 50 characters in length and can contain letters, digits, underscores (_), periods (.), and hyphens (-).</p>
         * <p>The name must be unique in the current resource directory.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>admin-****</p>
         */
        public Builder displayName(String displayName) {
            this.putQueryParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>The email address used to log on to the cloud account.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:someone@example.com">someone@example.com</a></p>
         */
        public Builder email(String email) {
            this.putQueryParameter("Email", email);
            this.email = email;
            return this;
        }

        /**
         * <p>The ID of the parent folder.</p>
         * 
         * <strong>example:</strong>
         * <p>fd-bVaRIG****</p>
         */
        public Builder parentFolderId(String parentFolderId) {
            this.putQueryParameter("ParentFolderId", parentFolderId);
            this.parentFolderId = parentFolderId;
            return this;
        }

        /**
         * <p>The ID of the settlement account. If you do not specify this parameter, the current account is used for settlement.</p>
         * 
         * <strong>example:</strong>
         * <p>12323344****</p>
         */
        public Builder payerAccountId(String payerAccountId) {
            this.putQueryParameter("PayerAccountId", payerAccountId);
            this.payerAccountId = payerAccountId;
            return this;
        }

        @Override
        public CreateCloudAccountRequest build() {
            return new CreateCloudAccountRequest(this);
        } 

    } 

}
