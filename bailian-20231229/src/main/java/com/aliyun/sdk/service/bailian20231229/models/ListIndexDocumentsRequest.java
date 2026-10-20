// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20231229.models;

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
 * {@link ListIndexDocumentsRequest} extends {@link RequestModel}
 *
 * <p>ListIndexDocumentsRequest</p>
 */
public class ListIndexDocumentsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DocumentName")
    private String documentName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DocumentStatus")
    private String documentStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableNameLike")
    private String enableNameLike;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IndexId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String indexId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    private ListIndexDocumentsRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.documentName = builder.documentName;
        this.documentStatus = builder.documentStatus;
        this.enableNameLike = builder.enableNameLike;
        this.indexId = builder.indexId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIndexDocumentsRequest create() {
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
     * @return documentName
     */
    public String getDocumentName() {
        return this.documentName;
    }

    /**
     * @return documentStatus
     */
    public String getDocumentStatus() {
        return this.documentStatus;
    }

    /**
     * @return enableNameLike
     */
    public String getEnableNameLike() {
        return this.enableNameLike;
    }

    /**
     * @return indexId
     */
    public String getIndexId() {
        return this.indexId;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<ListIndexDocumentsRequest, Builder> {
        private String workspaceId; 
        private String documentName; 
        private String documentStatus; 
        private String enableNameLike; 
        private String indexId; 
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListIndexDocumentsRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.documentName = request.documentName;
            this.documentStatus = request.documentStatus;
            this.enableNameLike = request.enableNameLike;
            this.indexId = request.indexId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * <p>The workspace ID of the knowledge base. For information about how to obtain the workspace ID, see <a href="https://help.aliyun.com/document_detail/2587495.html">How to use a workspace</a>. The bailian 2023-12-29 version does not provide an API for listing workspaces. Obtain the workspace ID from the Model Studio console before calling this operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-3z7uw7fwz0vexxxx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>Filters the returned file list by file name (excluding the file extension). Default value: empty, which means no filtering by file name.</p>
         * 
         * <strong>example:</strong>
         * <p>product-overview</p>
         */
        public Builder documentName(String documentName) {
            this.putQueryParameter("DocumentName", documentName);
            this.documentName = documentName;
            return this;
        }

        /**
         * <p>Filters the returned file list by file import status. Valid values:</p>
         * <ul>
         * <li>INSERT_ERROR: Failed to import to the index.</li>
         * <li>RUNNING: Index building in progress.</li>
         * <li>DELETED: Deleted.</li>
         * <li>FINISH: Index building succeeded.</li>
         * <li>PARSE_FAILED: Parsing failed.</li>
         * <li>DOC_PARSING: Parsing in progress.</li>
         * </ul>
         * <p>Default value: empty, which means no filtering by file import status.</p>
         * 
         * <strong>example:</strong>
         * <p>FINISH</p>
         */
        public Builder documentStatus(String documentStatus) {
            this.putQueryParameter("DocumentStatus", documentStatus);
            this.documentStatus = documentStatus;
            return this;
        }

        /**
         * <p>Specifies whether to enable fuzzy matching for file names. This parameter is used together with the <code>DocumentName</code> parameter. Valid values:</p>
         * <ul>
         * <li>true: Performs fuzzy matching on the returned file list based on the file name.</li>
         * <li>false: Performs exact matching based on the file name.</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableNameLike(String enableNameLike) {
            this.putQueryParameter("EnableNameLike", enableNameLike);
            this.enableNameLike = enableNameLike;
            return this;
        }

        /**
         * <p>The knowledge base ID, which is the <code>Data.Id</code> returned by the <strong>CreateIndex</strong> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>79c0alxxxx</p>
         */
        public Builder indexId(String indexId) {
            this.putQueryParameter("IndexId", indexId);
            this.indexId = indexId;
            return this;
        }

        /**
         * <p>The page number to query. Minimum value: 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of files to display per page in a paged query. No maximum limit.
         * Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListIndexDocumentsRequest build() {
            return new ListIndexDocumentsRequest(this);
        } 

    } 

}
