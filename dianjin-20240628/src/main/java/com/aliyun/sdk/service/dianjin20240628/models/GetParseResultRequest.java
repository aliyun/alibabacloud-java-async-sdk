// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dianjin20240628.models;

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
 * {@link GetParseResultRequest} extends {@link RequestModel}
 *
 * <p>GetParseResultRequest</p>
 */
public class GetParseResultRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("docId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String docId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("libraryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String libraryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("useUrlResult")
    private Boolean useUrlResult;

    private GetParseResultRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.docId = builder.docId;
        this.libraryId = builder.libraryId;
        this.useUrlResult = builder.useUrlResult;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetParseResultRequest create() {
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
     * @return docId
     */
    public String getDocId() {
        return this.docId;
    }

    /**
     * @return libraryId
     */
    public String getLibraryId() {
        return this.libraryId;
    }

    /**
     * @return useUrlResult
     */
    public Boolean getUseUrlResult() {
        return this.useUrlResult;
    }

    public static final class Builder extends Request.Builder<GetParseResultRequest, Builder> {
        private String workspaceId; 
        private String docId; 
        private String libraryId; 
        private Boolean useUrlResult; 

        private Builder() {
            super();
        } 

        private Builder(GetParseResultRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.docId = request.docId;
            this.libraryId = request.libraryId;
            this.useUrlResult = request.useUrlResult;
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
         * <p>873648346573245</p>
         */
        public Builder docId(String docId) {
            this.putBodyParameter("docId", docId);
            this.docId = docId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sjdgdsfg</p>
         */
        public Builder libraryId(String libraryId) {
            this.putBodyParameter("libraryId", libraryId);
            this.libraryId = libraryId;
            return this;
        }

        /**
         * useUrlResult.
         */
        public Builder useUrlResult(Boolean useUrlResult) {
            this.putBodyParameter("useUrlResult", useUrlResult);
            this.useUrlResult = useUrlResult;
            return this;
        }

        @Override
        public GetParseResultRequest build() {
            return new GetParseResultRequest(this);
        } 

    } 

}
