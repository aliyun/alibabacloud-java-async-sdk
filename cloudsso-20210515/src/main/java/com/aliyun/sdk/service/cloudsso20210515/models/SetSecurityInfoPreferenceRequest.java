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
 * {@link SetSecurityInfoPreferenceRequest} extends {@link RequestModel}
 *
 * <p>SetSecurityInfoPreferenceRequest</p>
 */
public class SetSecurityInfoPreferenceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllowUserManageSecurityEmail")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean allowUserManageSecurityEmail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectoryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String directoryId;

    private SetSecurityInfoPreferenceRequest(Builder builder) {
        super(builder);
        this.allowUserManageSecurityEmail = builder.allowUserManageSecurityEmail;
        this.directoryId = builder.directoryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetSecurityInfoPreferenceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allowUserManageSecurityEmail
     */
    public Boolean getAllowUserManageSecurityEmail() {
        return this.allowUserManageSecurityEmail;
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    public static final class Builder extends Request.Builder<SetSecurityInfoPreferenceRequest, Builder> {
        private Boolean allowUserManageSecurityEmail; 
        private String directoryId; 

        private Builder() {
            super();
        } 

        private Builder(SetSecurityInfoPreferenceRequest request) {
            super(request);
            this.allowUserManageSecurityEmail = request.allowUserManageSecurityEmail;
            this.directoryId = request.directoryId;
        } 

        /**
         * <p>Specifies whether to allow CloudSSO users in the directory to manage their security email addresses in the CloudSSO user portal, including setting, modifying, and deleting security email addresses, and sending verification emails. Valid values:</p>
         * <ul>
         * <li>true: allowed.</li>
         * <li>false: not allowed.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder allowUserManageSecurityEmail(Boolean allowUserManageSecurityEmail) {
            this.putQueryParameter("AllowUserManageSecurityEmail", allowUserManageSecurityEmail);
            this.allowUserManageSecurityEmail = allowUserManageSecurityEmail;
            return this;
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

        @Override
        public SetSecurityInfoPreferenceRequest build() {
            return new SetSecurityInfoPreferenceRequest(this);
        } 

    } 

}
