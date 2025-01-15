// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

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
 * {@link GetFolderRequest} extends {@link RequestModel}
 *
 * <p>GetFolderRequest</p>
 */
public class GetFolderRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FolderId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String folderId;

    private GetFolderRequest(Builder builder) {
        super(builder);
        this.folderId = builder.folderId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFolderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return folderId
     */
    public String getFolderId() {
        return this.folderId;
    }

    public static final class Builder extends Request.Builder<GetFolderRequest, Builder> {
        private String folderId; 

        private Builder() {
            super();
        } 

        private Builder(GetFolderRequest request) {
            super(request);
            this.folderId = request.folderId;
        } 

        /**
         * <p>The ID of the folder.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fd-Jyl5U7****</p>
         */
        public Builder folderId(String folderId) {
            this.putQueryParameter("FolderId", folderId);
            this.folderId = folderId;
            return this;
        }

        @Override
        public GetFolderRequest build() {
            return new GetFolderRequest(this);
        } 

    } 

}
