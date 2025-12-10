// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20210202.models;

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
 * {@link DeleteExperimentFolderRequest} extends {@link RequestModel}
 *
 * <p>DeleteExperimentFolderRequest</p>
 */
public class DeleteExperimentFolderRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("FolderId")
    private String folderId;

    private DeleteExperimentFolderRequest(Builder builder) {
        super(builder);
        this.folderId = builder.folderId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteExperimentFolderRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteExperimentFolderRequest, Builder> {
        private String folderId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteExperimentFolderRequest request) {
            super(request);
            this.folderId = request.folderId;
        } 

        /**
         * FolderId.
         */
        public Builder folderId(String folderId) {
            this.putPathParameter("FolderId", folderId);
            this.folderId = folderId;
            return this;
        }

        @Override
        public DeleteExperimentFolderRequest build() {
            return new DeleteExperimentFolderRequest(this);
        } 

    } 

}
