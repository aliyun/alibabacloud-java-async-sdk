// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dianjin20240628.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteLibraryRequest} extends {@link RequestModel}
 *
 * <p>DeleteLibraryRequest</p>
 */
public class DeleteLibraryRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("libraryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String libraryId;

    private DeleteLibraryRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.libraryId = builder.libraryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteLibraryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return libraryId
     */
    public String getLibraryId() {
        return this.libraryId;
    }

    public static final class Builder extends Request.Builder<DeleteLibraryRequest, Builder> {
        private String workspaceId; 
        private String libraryId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteLibraryRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.libraryId = request.libraryId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-xxxxx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>skdfefxxx</p>
         */
        public Builder libraryId(String libraryId) {
            this.putQueryParameter("libraryId", libraryId);
            this.libraryId = libraryId;
            return this;
        }

        @Override
        public DeleteLibraryRequest build() {
            return new DeleteLibraryRequest(this);
        } 

    } 

}
