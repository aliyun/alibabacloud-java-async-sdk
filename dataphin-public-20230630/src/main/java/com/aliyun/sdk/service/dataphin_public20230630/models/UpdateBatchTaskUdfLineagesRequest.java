// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link UpdateBatchTaskUdfLineagesRequest} extends {@link RequestModel}
 *
 * <p>UpdateBatchTaskUdfLineagesRequest</p>
 */
public class UpdateBatchTaskUdfLineagesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UpdateCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private UpdateCommand updateCommand;

    private UpdateBatchTaskUdfLineagesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.opTenantId = builder.opTenantId;
        this.updateCommand = builder.updateCommand;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateBatchTaskUdfLineagesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return updateCommand
     */
    public UpdateCommand getUpdateCommand() {
        return this.updateCommand;
    }

    public static final class Builder extends Request.Builder<UpdateBatchTaskUdfLineagesRequest, Builder> {
        private String regionId; 
        private Long opTenantId; 
        private UpdateCommand updateCommand; 

        private Builder() {
            super();
        } 

        private Builder(UpdateBatchTaskUdfLineagesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.opTenantId = request.opTenantId;
            this.updateCommand = request.updateCommand;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder updateCommand(UpdateCommand updateCommand) {
            String updateCommandShrink = shrink(updateCommand, "UpdateCommand", "json");
            this.putBodyParameter("UpdateCommand", updateCommandShrink);
            this.updateCommand = updateCommand;
            return this;
        }

        @Override
        public UpdateBatchTaskUdfLineagesRequest build() {
            return new UpdateBatchTaskUdfLineagesRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateBatchTaskUdfLineagesRequest} extends {@link TeaModel}
     *
     * <p>UpdateBatchTaskUdfLineagesRequest</p>
     */
    public static class InputLineageList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ColumnList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> columnList;

        @com.aliyun.core.annotation.NameInMap("Env")
        @com.aliyun.core.annotation.Validation(required = true)
        private String env;

        @com.aliyun.core.annotation.NameInMap("FullTable")
        @com.aliyun.core.annotation.Validation(required = true)
        private Boolean fullTable;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        private InputLineageList(Builder builder) {
            this.columnList = builder.columnList;
            this.env = builder.env;
            this.fullTable = builder.fullTable;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InputLineageList create() {
            return builder().build();
        }

        /**
         * @return columnList
         */
        public java.util.List<String> getColumnList() {
            return this.columnList;
        }

        /**
         * @return env
         */
        public String getEnv() {
            return this.env;
        }

        /**
         * @return fullTable
         */
        public Boolean getFullTable() {
            return this.fullTable;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private java.util.List<String> columnList; 
            private String env; 
            private Boolean fullTable; 
            private String name; 

            private Builder() {
            } 

            private Builder(InputLineageList model) {
                this.columnList = model.columnList;
                this.env = model.env;
                this.fullTable = model.fullTable;
                this.name = model.name;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder columnList(java.util.List<String> columnList) {
                this.columnList = columnList;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>dev</p>
             */
            public Builder env(String env) {
                this.env = env;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder fullTable(Boolean fullTable) {
                this.fullTable = fullTable;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>t_input</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public InputLineageList build() {
                return new InputLineageList(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateBatchTaskUdfLineagesRequest} extends {@link TeaModel}
     *
     * <p>UpdateBatchTaskUdfLineagesRequest</p>
     */
    public static class OutputLineageList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ColumnList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> columnList;

        @com.aliyun.core.annotation.NameInMap("Env")
        @com.aliyun.core.annotation.Validation(required = true)
        private String env;

        @com.aliyun.core.annotation.NameInMap("FullTable")
        @com.aliyun.core.annotation.Validation(required = true)
        private Boolean fullTable;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        private OutputLineageList(Builder builder) {
            this.columnList = builder.columnList;
            this.env = builder.env;
            this.fullTable = builder.fullTable;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OutputLineageList create() {
            return builder().build();
        }

        /**
         * @return columnList
         */
        public java.util.List<String> getColumnList() {
            return this.columnList;
        }

        /**
         * @return env
         */
        public String getEnv() {
            return this.env;
        }

        /**
         * @return fullTable
         */
        public Boolean getFullTable() {
            return this.fullTable;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private java.util.List<String> columnList; 
            private String env; 
            private Boolean fullTable; 
            private String name; 

            private Builder() {
            } 

            private Builder(OutputLineageList model) {
                this.columnList = model.columnList;
                this.env = model.env;
                this.fullTable = model.fullTable;
                this.name = model.name;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder columnList(java.util.List<String> columnList) {
                this.columnList = columnList;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>dev</p>
             */
            public Builder env(String env) {
                this.env = env;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder fullTable(Boolean fullTable) {
                this.fullTable = fullTable;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>t_output</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public OutputLineageList build() {
                return new OutputLineageList(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateBatchTaskUdfLineagesRequest} extends {@link TeaModel}
     *
     * <p>UpdateBatchTaskUdfLineagesRequest</p>
     */
    public static class LineageGroupList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InputLineageList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<InputLineageList> inputLineageList;

        @com.aliyun.core.annotation.NameInMap("OutputLineageList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<OutputLineageList> outputLineageList;

        private LineageGroupList(Builder builder) {
            this.inputLineageList = builder.inputLineageList;
            this.outputLineageList = builder.outputLineageList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LineageGroupList create() {
            return builder().build();
        }

        /**
         * @return inputLineageList
         */
        public java.util.List<InputLineageList> getInputLineageList() {
            return this.inputLineageList;
        }

        /**
         * @return outputLineageList
         */
        public java.util.List<OutputLineageList> getOutputLineageList() {
            return this.outputLineageList;
        }

        public static final class Builder {
            private java.util.List<InputLineageList> inputLineageList; 
            private java.util.List<OutputLineageList> outputLineageList; 

            private Builder() {
            } 

            private Builder(LineageGroupList model) {
                this.inputLineageList = model.inputLineageList;
                this.outputLineageList = model.outputLineageList;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder inputLineageList(java.util.List<InputLineageList> inputLineageList) {
                this.inputLineageList = inputLineageList;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder outputLineageList(java.util.List<OutputLineageList> outputLineageList) {
                this.outputLineageList = outputLineageList;
                return this;
            }

            public LineageGroupList build() {
                return new LineageGroupList(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateBatchTaskUdfLineagesRequest} extends {@link TeaModel}
     *
     * <p>UpdateBatchTaskUdfLineagesRequest</p>
     */
    public static class UpdateCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long fileId;

        @com.aliyun.core.annotation.NameInMap("LineageGroupList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<LineageGroupList> lineageGroupList;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long projectId;

        private UpdateCommand(Builder builder) {
            this.fileId = builder.fileId;
            this.lineageGroupList = builder.lineageGroupList;
            this.projectId = builder.projectId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateCommand create() {
            return builder().build();
        }

        /**
         * @return fileId
         */
        public Long getFileId() {
            return this.fileId;
        }

        /**
         * @return lineageGroupList
         */
        public java.util.List<LineageGroupList> getLineageGroupList() {
            return this.lineageGroupList;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        public static final class Builder {
            private Long fileId; 
            private java.util.List<LineageGroupList> lineageGroupList; 
            private Long projectId; 

            private Builder() {
            } 

            private Builder(UpdateCommand model) {
                this.fileId = model.fileId;
                this.lineageGroupList = model.lineageGroupList;
                this.projectId = model.projectId;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>12113111</p>
             */
            public Builder fileId(Long fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder lineageGroupList(java.util.List<LineageGroupList> lineageGroupList) {
                this.lineageGroupList = lineageGroupList;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>131211211</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            public UpdateCommand build() {
                return new UpdateCommand(this);
            } 

        } 

    }
}
