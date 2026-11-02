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
 * {@link UpdateAttributePassingSettingRequest} extends {@link RequestModel}
 *
 * <p>UpdateAttributePassingSettingRequest</p>
 */
public class UpdateAttributePassingSettingRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectoryId")
    private String directoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIdentityPassing")
    private String sourceIdentityPassing;

    private UpdateAttributePassingSettingRequest(Builder builder) {
        super(builder);
        this.directoryId = builder.directoryId;
        this.sourceIdentityPassing = builder.sourceIdentityPassing;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAttributePassingSettingRequest create() {
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
     * @return sourceIdentityPassing
     */
    public String getSourceIdentityPassing() {
        return this.sourceIdentityPassing;
    }

    public static final class Builder extends Request.Builder<UpdateAttributePassingSettingRequest, Builder> {
        private String directoryId; 
        private String sourceIdentityPassing; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAttributePassingSettingRequest request) {
            super(request);
            this.directoryId = request.directoryId;
            this.sourceIdentityPassing = request.sourceIdentityPassing;
        } 

        /**
         * <p>The directory ID.</p>
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
         * <p>The SourceIdentity pass-through mode. Three pass-through modes are supported. If this parameter is not specified, the existing configuration is not modified.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>IdP: Uses the SourceIdentity attribute value carried in the SAML assertion from the external identity provider (IdP). The attribute value must be 2 to 64 characters in length and can contain only letters, digits, and the following special characters: =,.@-_.</li>
         * <li>UserName: Uses the CloudSSO username as the SourceIdentity. The system automatically adds a reserved prefix, resulting in the format acs:sso:<username>, with a total length of no more than 64 characters.</li>
         * <li>Disabled: Does not pass through SourceIdentity.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Disabled</p>
         */
        public Builder sourceIdentityPassing(String sourceIdentityPassing) {
            this.putQueryParameter("SourceIdentityPassing", sourceIdentityPassing);
            this.sourceIdentityPassing = sourceIdentityPassing;
            return this;
        }

        @Override
        public UpdateAttributePassingSettingRequest build() {
            return new UpdateAttributePassingSettingRequest(this);
        } 

    } 

}
