// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFolderRequest} extends {@link RequestModel}
 *
 * <p>GetFolderRequest</p>
 */
public class GetFolderRequest extends Request {
    @Query
    @NameInMap("FolderId")
    @Validation(required = true)
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
         * The ID of the folder.
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
