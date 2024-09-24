// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dianjin20240628.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFinReportSummaryTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateFinReportSummaryTaskRequest</p>
 */
public class CreateFinReportSummaryTaskRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("docId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String docId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("enableTable")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean enableTable;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("endPage")
    private Integer endPage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("instruction")
    private String instruction;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("libraryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String libraryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("modelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("startPage")
    private Integer startPage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("taskType")
    private String taskType;

    private CreateFinReportSummaryTaskRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.docId = builder.docId;
        this.enableTable = builder.enableTable;
        this.endPage = builder.endPage;
        this.instruction = builder.instruction;
        this.libraryId = builder.libraryId;
        this.modelId = builder.modelId;
        this.startPage = builder.startPage;
        this.taskType = builder.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFinReportSummaryTaskRequest create() {
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
     * @return enableTable
     */
    public Boolean getEnableTable() {
        return this.enableTable;
    }

    /**
     * @return endPage
     */
    public Integer getEndPage() {
        return this.endPage;
    }

    /**
     * @return instruction
     */
    public String getInstruction() {
        return this.instruction;
    }

    /**
     * @return libraryId
     */
    public String getLibraryId() {
        return this.libraryId;
    }

    /**
     * @return modelId
     */
    public String getModelId() {
        return this.modelId;
    }

    /**
     * @return startPage
     */
    public Integer getStartPage() {
        return this.startPage;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    public static final class Builder extends Request.Builder<CreateFinReportSummaryTaskRequest, Builder> {
        private String workspaceId; 
        private String docId; 
        private Boolean enableTable; 
        private Integer endPage; 
        private String instruction; 
        private String libraryId; 
        private String modelId; 
        private Integer startPage; 
        private String taskType; 

        private Builder() {
            super();
        } 

        private Builder(CreateFinReportSummaryTaskRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.docId = request.docId;
            this.enableTable = request.enableTable;
            this.endPage = request.endPage;
            this.instruction = request.instruction;
            this.libraryId = request.libraryId;
            this.modelId = request.modelId;
            this.startPage = request.startPage;
            this.taskType = request.taskType;
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
         * docId.
         */
        public Builder docId(String docId) {
            this.putBodyParameter("docId", docId);
            this.docId = docId;
            return this;
        }

        /**
         * enableTable.
         */
        public Builder enableTable(Boolean enableTable) {
            this.putBodyParameter("enableTable", enableTable);
            this.enableTable = enableTable;
            return this;
        }

        /**
         * endPage.
         */
        public Builder endPage(Integer endPage) {
            this.putBodyParameter("endPage", endPage);
            this.endPage = endPage;
            return this;
        }

        /**
         * instruction.
         */
        public Builder instruction(String instruction) {
            this.putBodyParameter("instruction", instruction);
            this.instruction = instruction;
            return this;
        }

        /**
         * libraryId.
         */
        public Builder libraryId(String libraryId) {
            this.putBodyParameter("libraryId", libraryId);
            this.libraryId = libraryId;
            return this;
        }

        /**
         * modelId.
         */
        public Builder modelId(String modelId) {
            this.putBodyParameter("modelId", modelId);
            this.modelId = modelId;
            return this;
        }

        /**
         * startPage.
         */
        public Builder startPage(Integer startPage) {
            this.putBodyParameter("startPage", startPage);
            this.startPage = startPage;
            return this;
        }

        /**
         * taskType.
         */
        public Builder taskType(String taskType) {
            this.putBodyParameter("taskType", taskType);
            this.taskType = taskType;
            return this;
        }

        @Override
        public CreateFinReportSummaryTaskRequest build() {
            return new CreateFinReportSummaryTaskRequest(this);
        } 

    } 

}
