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
 * {@link GetSecurityInfoPreferenceRequest} extends {@link RequestModel}
 *
 * <p>GetSecurityInfoPreferenceRequest</p>
 */
public class GetSecurityInfoPreferenceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectoryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String directoryId;

    private GetSecurityInfoPreferenceRequest(Builder builder) {
        super(builder);
        this.directoryId = builder.directoryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSecurityInfoPreferenceRequest create() {
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

    public static final class Builder extends Request.Builder<GetSecurityInfoPreferenceRequest, Builder> {
        private String directoryId; 

        private Builder() {
            super();
        } 

        private Builder(GetSecurityInfoPreferenceRequest request) {
            super(request);
            this.directoryId = request.directoryId;
        } 

        /**
         * <p>The ID of the directory.</p>
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
        public GetSecurityInfoPreferenceRequest build() {
            return new GetSecurityInfoPreferenceRequest(this);
        } 

    } 

}
