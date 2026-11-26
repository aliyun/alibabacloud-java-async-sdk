// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

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
 * {@link SetSecurityInfoRequest} extends {@link RequestModel}
 *
 * <p>SetSecurityInfoRequest</p>
 */
public class SetSecurityInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectoryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String directoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityEmail")
    @com.aliyun.core.annotation.Validation(required = true)
    private String securityEmail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VerifyType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String verifyType;

    private SetSecurityInfoRequest(Builder builder) {
        super(builder);
        this.directoryId = builder.directoryId;
        this.securityEmail = builder.securityEmail;
        this.userId = builder.userId;
        this.verifyType = builder.verifyType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetSecurityInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return securityEmail
     */
    public String getSecurityEmail() {
        return this.securityEmail;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return verifyType
     */
    public String getVerifyType() {
        return this.verifyType;
    }

    public static final class Builder extends Request.Builder<SetSecurityInfoRequest, Builder> {
        private String directoryId; 
        private String securityEmail; 
        private String userId; 
        private String verifyType; 

        private Builder() {
            super();
        } 

        private Builder(SetSecurityInfoRequest request) {
            super(request);
            this.directoryId = request.directoryId;
            this.securityEmail = request.securityEmail;
            this.userId = request.userId;
            this.verifyType = request.verifyType;
        } 

        /**
         * <p>The directory ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>d-00fc2p61****</p>
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>The security email address of the user.</p>
         * <p>The value can be up to 64 characters in length, must conform to the standard email format, and cannot contain whitespace characters. The security email address of each user in the same directory must be unique. The uniqueness check is case-insensitive, but the original case is preserved when the address is saved.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:Alice@example.com">Alice@example.com</a></p>
         */
        public Builder securityEmail(String securityEmail) {
            this.putQueryParameter("SecurityEmail", securityEmail);
            this.securityEmail = securityEmail;
            return this;
        }

        /**
         * <p>The user ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>u-00q8wbq42wiltcrk****</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * <p>The verification type for the security information. Valid values:</p>
         * <ul>
         * <li>SecurityEmail: security email address.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SecurityEmail</p>
         */
        public Builder verifyType(String verifyType) {
            this.putQueryParameter("VerifyType", verifyType);
            this.verifyType = verifyType;
            return this;
        }

        @Override
        public SetSecurityInfoRequest build() {
            return new SetSecurityInfoRequest(this);
        } 

    } 

}
