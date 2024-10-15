// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20231229.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListChunksRequest} extends {@link RequestModel}
 *
 * <p>ListChunksRequest</p>
 */
public class ListChunksRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Fields")
    private java.util.List < String > fields;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Filed")
    private String filed;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IndexId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String indexId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    private ListChunksRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.fields = builder.fields;
        this.filed = builder.filed;
        this.indexId = builder.indexId;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListChunksRequest create() {
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
     * @return fields
     */
    public java.util.List < String > getFields() {
        return this.fields;
    }

    /**
     * @return filed
     */
    public String getFiled() {
        return this.filed;
    }

    /**
     * @return indexId
     */
    public String getIndexId() {
        return this.indexId;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<ListChunksRequest, Builder> {
        private String workspaceId; 
        private java.util.List < String > fields; 
        private String filed; 
        private String indexId; 
        private Integer pageNum; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListChunksRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.fields = request.fields;
            this.filed = request.filed;
            this.indexId = request.indexId;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
        } 

        /**
         * <p>The ID of the workspace to which the knowledge base belongs. To view the workspace ID, you can click the Workspace Details icon in the upper-left corner on the <a href="https://bailian.console.aliyun.com/#/home">homepage</a> of the console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws_3AXoiweeTyTd03IN</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>An array of field names. This parameter is used to filter non-private fields (prefixed with_underscores) in the Metadata parameter returned by this operation. By default, this parameter is left empty, which means all non-private fields in the Metadata parameter are returned. If you only want specified non-private fields, such as title, set this parameter to title.</p>
         */
        public Builder fields(java.util.List < String > fields) {
            this.putBodyParameter("Fields", fields);
            this.fields = fields;
            return this;
        }

        /**
         * <p>The primary key ID of the document, which is the <code>FieldID</code> parameter returned by the <a href="https://help.aliyun.com/zh/model-studio/developer-reference/api-bailian-2023-12-29-addfile">AddFile</a> operation. This parameter is not required for structured knowledge base, but is required for unstructured knowledge base. To view the ID, you can click the ID icon next to the file name on the <a href="https://bailian.console.aliyun.com/#/data-center">Data Management</a> page. You can filter returned chunks by the document ID. This parameter is left empty by default.</p>
         * 
         * <strong>example:</strong>
         * <p>file_5f03dfea56da4050ab68d61871fc4cb3_10151493</p>
         */
        public Builder filed(String filed) {
            this.putBodyParameter("Filed", filed);
            this.filed = filed;
            return this;
        }

        /**
         * <p>The primary key ID of the knowledge base, which is the <code>Data.Id</code> parameter returned by the <a href="https://help.aliyun.com/zh/model-studio/developer-reference/api-bailian-2023-12-29-createindex">CreateIndex</a> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>otoru9en4v</p>
         */
        public Builder indexId(String indexId) {
            this.putBodyParameter("IndexId", indexId);
            this.indexId = indexId;
            return this;
        }

        /**
         * <p>The number of the pages to return. Pages start from page 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNum(Integer pageNum) {
            this.putBodyParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * <p>The number of chunks to display on each page. Maximum value: 100. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListChunksRequest build() {
            return new ListChunksRequest(this);
        } 

    } 

}
