// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dianjin20240628.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLibraryRequest} extends {@link RequestModel}
 *
 * <p>GetLibraryRequest</p>
 */
public class GetLibraryRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("libraryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String libraryId;

    private GetLibraryRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.libraryId = builder.libraryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLibraryRequest create() {
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

    public static final class Builder extends Request.Builder<GetLibraryRequest, Builder> {
        private String workspaceId; 
        private String libraryId; 

        private Builder() {
            super();
        } 

        private Builder(GetLibraryRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.libraryId = request.libraryId;
        } 

        /**
         * workspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * libraryId.
         */
        public Builder libraryId(String libraryId) {
            this.putQueryParameter("libraryId", libraryId);
            this.libraryId = libraryId;
            return this;
        }

        @Override
        public GetLibraryRequest build() {
            return new GetLibraryRequest(this);
        } 

    } 

}
