// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRdDefaultSyncListRequest} extends {@link RequestModel}
 *
 * <p>CreateRdDefaultSyncListRequest</p>
 */
public class CreateRdDefaultSyncListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FolderIds")
    private String folderIds;

    private CreateRdDefaultSyncListRequest(Builder builder) {
        super(builder);
        this.folderIds = builder.folderIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRdDefaultSyncListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return folderIds
     */
    public String getFolderIds() {
        return this.folderIds;
    }

    public static final class Builder extends Request.Builder<CreateRdDefaultSyncListRequest, Builder> {
        private String folderIds; 

        private Builder() {
            super();
        } 

        private Builder(CreateRdDefaultSyncListRequest request) {
            super(request);
            this.folderIds = request.folderIds;
        } 

        /**
         * FolderIds.
         */
        public Builder folderIds(String folderIds) {
            this.putQueryParameter("FolderIds", folderIds);
            this.folderIds = folderIds;
            return this;
        }

        @Override
        public CreateRdDefaultSyncListRequest build() {
            return new CreateRdDefaultSyncListRequest(this);
        } 

    } 

}
