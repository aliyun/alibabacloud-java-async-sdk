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
         * DirectoryId.
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * SourceIdentityPassing.
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
