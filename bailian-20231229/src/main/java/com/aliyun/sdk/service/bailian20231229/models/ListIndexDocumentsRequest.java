// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20231229.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
            this.indexId = request.indexId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * DocumentName.
         */
        public Builder documentName(String documentName) {
            this.putQueryParameter("DocumentName", documentName);
            this.documentName = documentName;
            return this;
        }

        /**
         * DocumentStatus.
         */
        public Builder documentStatus(String documentStatus) {
            this.putQueryParameter("DocumentStatus", documentStatus);
            this.documentStatus = documentStatus;
            return this;
        }

        /**
         * IndexId.
         */
        public Builder indexId(String indexId) {
            this.putQueryParameter("IndexId", indexId);
            this.indexId = indexId;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
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
