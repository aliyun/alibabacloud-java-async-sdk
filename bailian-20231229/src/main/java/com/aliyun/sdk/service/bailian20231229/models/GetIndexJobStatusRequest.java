// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20231229.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetIndexJobStatusRequest} extends {@link RequestModel}
 *
 * <p>GetIndexJobStatusRequest</p>
 */
public class GetIndexJobStatusRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IndexId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String indexId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    private GetIndexJobStatusRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.indexId = builder.indexId;
        this.jobId = builder.jobId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIndexJobStatusRequest create() {
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
     * @return indexId
     */
    public String getIndexId() {
        return this.indexId;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
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

    public static final class Builder extends Request.Builder<GetIndexJobStatusRequest, Builder> {
        private String workspaceId; 
        private String indexId; 
        private String jobId; 
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(GetIndexJobStatusRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.indexId = request.indexId;
            this.jobId = request.jobId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * <p>The ID of the workspace to which the knowledge base belongs. To view the workspace ID, you can click the Workspace Details icon in the upper-left corner on the <a href="https://bailian.console.aliyun.com/#/home">homepage</a> of the console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws_3Nt27MYcoK191ISp</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The primary key ID of the knowledge base, which is the <code>Data.Id</code> parameter returned by the <a href="https://help.aliyun.com/zh/model-studio/developer-reference/api-bailian-2023-12-29-createindex">CreateIndex</a> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>79c0aly8zw</p>
         */
        public Builder indexId(String indexId) {
            this.putQueryParameter("IndexId", indexId);
            this.indexId = indexId;
            return this;
        }

        /**
         * <p>The knowledge base job ID, which is the <code>Data.Id</code> parameter returned by the <a href="https://help.aliyun.com/zh/model-studio/developer-reference/api-bailian-2023-12-29-submitindexjob">SubmitIndexJob</a> or <a href="https://help.aliyun.com/zh/model-studio/developer-reference/api-bailian-2023-12-29-submitindexadddocumentsjob">SubmitIndexAddDocumentsJob</a> operations.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20230718xxxx-146c93bf</p>
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>Both the <a href="https://help.aliyun.com/zh/model-studio/developer-reference/api-bailian-2023-12-29-submitindexjob">SubmitIndexJob</a> and <a href="https://help.aliyun.com/zh/model-studio/developer-reference/api-bailian-2023-12-29-submitindexadddocumentsjob">SubmitIndexAddDocumentsJob</a> operations support batch import of documents. This operation returns both the overall <code>Status</code> of the job and the <code>Document.Status</code> of each document. If there are a large number of documents, you can use the <code>PageNumber</code> parameter to perform a paged query. Pages start from page 1. Default value: 1.</p>
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
         * <p>The number of document import jobs that are displayed on each page. No maximum value. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public GetIndexJobStatusRequest build() {
            return new GetIndexJobStatusRequest(this);
        } 

    } 

}
