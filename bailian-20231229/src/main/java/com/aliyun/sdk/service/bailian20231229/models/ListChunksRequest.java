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
    private java.util.List<String> fields;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileId")
    private String fileId;

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
        this.fileId = builder.fileId;
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
    public java.util.List<String> getFields() {
        return this.fields;
    }

    /**
     * @return fileId
     */
    public String getFileId() {
        return this.fileId;
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
        private java.util.List<String> fields; 
        private String fileId; 
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
            this.fileId = request.fileId;
            this.filed = request.filed;
            this.indexId = request.indexId;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
        } 

        /**
         * <p>The workspace ID of the knowledge base. For information about how to obtain the workspace ID, see <a href="https://help.aliyun.com/document_detail/2587495.html">How to use a workspace</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-3z7uw7fwz0vxxxx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>An array of field names used to filter non-private fields (those not prefixed with an underscore _) in the Metadata field returned by this operation. By default, Fields is empty, and all non-private fields in Metadata are returned. To return only specific non-private fields in Metadata, such as title, pass title in this parameter.</p>
         * <p>Default value: empty.</p>
         */
        public Builder fields(java.util.List<String> fields) {
            this.putBodyParameter("Fields", fields);
            this.fields = fields;
            return this;
        }

        /**
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <p>The file ID, which is the <code>FileId</code> returned by the <strong>AddFile</strong> operation. This field is not required for data query or image Q&amp;A knowledge bases. This field is required for document search or audio/video search knowledge bases. You can also obtain the file ID by clicking the ID icon next to the file name on the Files tab of <a href="https://bailian.console.aliyun.com/?tab=app#/data-center">Application Data</a>. You can use the file ID to filter the returned chunks. Default value: empty.</p>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <p>The file ID, which is the <code>FileId</code> returned by the <strong>AddFile</strong> operation. This field is not required for data query or image Q&amp;A knowledge bases. This field is required for document search knowledge bases. You can also obtain the file ID by clicking the ID icon next to the file name on the Files tab of
         * <a href="https://modelstudio.console.alibabacloud.com/?tab=app#/data-center">Application Data</a>. You can use the file ID to filter the returned chunks. Default value: empty.</p>
         * <p>.</p>
         * 
         * <strong>example:</strong>
         * <p>file_5f03dfea56da4050ab68d61871fc4cb3_xxxxxxxx</p>
         */
        public Builder fileId(String fileId) {
            this.putBodyParameter("FileId", fileId);
            this.fileId = fileId;
            return this;
        }

        /**
         * <p>The file ID field in the legacy Model Studio SDK. The usage and default value are identical to those of the <code>FileId</code> field. If you are using the following versions (or later) of the Model Studio SDK, use the <code>FileId</code> field instead. If you are using the SWIFT Model Studio SDK, continue to use this field.</p>
         * <ul>
         * <li>Java (async): 1.0.18</li>
         * <li>Java: 1.10.2</li>
         * <li>TypeScript: 1.10.2</li>
         * <li>Go: 1.10.2</li>
         * <li>PHP: 1.10.2</li>
         * <li>Python: 1.10.2</li>
         * <li>C#: 1.10.2</li>
         * <li>C++: 1.10.17</li>
         * </ul>
         * <blockquote>
         * <p><strong>How to check the Model Studio SDK version</strong>: Visit the &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Model Studio SDK center</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Model Studio SDK center</a>, click &quot;<strong>Install</strong>&quot; in the left-side navigation pane, set the API version to &quot;<strong>2023-12-29</strong>&quot;, select your programming language, and then click &quot;<strong>History Versions</strong>&quot; to view the version.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>file_5f03dfea56da4050ab68d61871fc4cb3_xxxxxxxx</p>
         */
        public Builder filed(String filed) {
            this.putBodyParameter("Filed", filed);
            this.filed = filed;
            return this;
        }

        /**
         * <p>The knowledge base ID, which is the <code>Data.Id</code> returned by the <strong>CreateIndex</strong> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>otoru9xxxx</p>
         */
        public Builder indexId(String indexId) {
            this.putBodyParameter("IndexId", indexId);
            this.indexId = indexId;
            return this;
        }

        /**
         * <p>The page number to query. Minimum value: 1. Default value: 1.</p>
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
         * <p>The number of text chunks to display per page in a paged query. Maximum value: 100. Default value: 10.</p>
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
