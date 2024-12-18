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
 * {@link CreateAnnualDocSummaryTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateAnnualDocSummaryTaskRequest</p>
 */
public class CreateAnnualDocSummaryTaskRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("anaYears")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Integer> anaYears;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("docInfos")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<DocInfos> docInfos;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("enableTable")
    private Boolean enableTable;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("instruction")
    private String instruction;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("modelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelId;

    private CreateAnnualDocSummaryTaskRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.anaYears = builder.anaYears;
        this.docInfos = builder.docInfos;
        this.enableTable = builder.enableTable;
        this.instruction = builder.instruction;
        this.modelId = builder.modelId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAnnualDocSummaryTaskRequest create() {
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
     * @return anaYears
     */
    public java.util.List<Integer> getAnaYears() {
        return this.anaYears;
    }

    /**
     * @return docInfos
     */
    public java.util.List<DocInfos> getDocInfos() {
        return this.docInfos;
    }

    /**
     * @return enableTable
     */
    public Boolean getEnableTable() {
        return this.enableTable;
    }

    /**
     * @return instruction
     */
    public String getInstruction() {
        return this.instruction;
    }

    /**
     * @return modelId
     */
    public String getModelId() {
        return this.modelId;
    }

    public static final class Builder extends Request.Builder<CreateAnnualDocSummaryTaskRequest, Builder> {
        private String workspaceId; 
        private java.util.List<Integer> anaYears; 
        private java.util.List<DocInfos> docInfos; 
        private Boolean enableTable; 
        private String instruction; 
        private String modelId; 

        private Builder() {
            super();
        } 

        private Builder(CreateAnnualDocSummaryTaskRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.anaYears = request.anaYears;
            this.docInfos = request.docInfos;
            this.enableTable = request.enableTable;
            this.instruction = request.instruction;
            this.modelId = request.modelId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-xxxx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder anaYears(java.util.List<Integer> anaYears) {
            this.putBodyParameter("anaYears", anaYears);
            this.anaYears = anaYears;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder docInfos(java.util.List<DocInfos> docInfos) {
            this.putBodyParameter("docInfos", docInfos);
            this.docInfos = docInfos;
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
         * instruction.
         */
        public Builder instruction(String instruction) {
            this.putBodyParameter("instruction", instruction);
            this.instruction = instruction;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-plus</p>
         */
        public Builder modelId(String modelId) {
            this.putBodyParameter("modelId", modelId);
            this.modelId = modelId;
            return this;
        }

        @Override
        public CreateAnnualDocSummaryTaskRequest build() {
            return new CreateAnnualDocSummaryTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateAnnualDocSummaryTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateAnnualDocSummaryTaskRequest</p>
     */
    public static class DocInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("docId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String docId;

        @com.aliyun.core.annotation.NameInMap("docYear")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer docYear;

        @com.aliyun.core.annotation.NameInMap("endPage")
        private Integer endPage;

        @com.aliyun.core.annotation.NameInMap("libraryId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String libraryId;

        @com.aliyun.core.annotation.NameInMap("startPage")
        private Integer startPage;

        private DocInfos(Builder builder) {
            this.docId = builder.docId;
            this.docYear = builder.docYear;
            this.endPage = builder.endPage;
            this.libraryId = builder.libraryId;
            this.startPage = builder.startPage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DocInfos create() {
            return builder().build();
        }

        /**
         * @return docId
         */
        public String getDocId() {
            return this.docId;
        }

        /**
         * @return docYear
         */
        public Integer getDocYear() {
            return this.docYear;
        }

        /**
         * @return endPage
         */
        public Integer getEndPage() {
            return this.endPage;
        }

        /**
         * @return libraryId
         */
        public String getLibraryId() {
            return this.libraryId;
        }

        /**
         * @return startPage
         */
        public Integer getStartPage() {
            return this.startPage;
        }

        public static final class Builder {
            private String docId; 
            private Integer docYear; 
            private Integer endPage; 
            private String libraryId; 
            private Integer startPage; 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>198386463432</p>
             */
            public Builder docId(String docId) {
                this.docId = docId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>2023</p>
             */
            public Builder docYear(Integer docYear) {
                this.docYear = docYear;
                return this;
            }

            /**
             * endPage.
             */
            public Builder endPage(Integer endPage) {
                this.endPage = endPage;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>rdxrmo6amk</p>
             */
            public Builder libraryId(String libraryId) {
                this.libraryId = libraryId;
                return this;
            }

            /**
             * startPage.
             */
            public Builder startPage(Integer startPage) {
                this.startPage = startPage;
                return this;
            }

            public DocInfos build() {
                return new DocInfos(this);
            } 

        } 

    }
}
