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
 * {@link GetBatchTaskUdfLineagesResponseBody} extends {@link TeaModel}
 *
 * <p>GetBatchTaskUdfLineagesResponseBody</p>
 */
public class GetBatchTaskUdfLineagesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetBatchTaskUdfLineagesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBatchTaskUdfLineagesResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetBatchTaskUdfLineagesResponseBody build() {
            return new GetBatchTaskUdfLineagesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetBatchTaskUdfLineagesResponseBody} extends {@link TeaModel}
     *
     * <p>GetBatchTaskUdfLineagesResponseBody</p>
     */
    public static class ColumnList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataType")
        private String dataType;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PartitionKey")
        private Boolean partitionKey;

        @com.aliyun.core.annotation.NameInMap("PrimaryKey")
        private Boolean primaryKey;

        private ColumnList(Builder builder) {
            this.dataType = builder.dataType;
            this.description = builder.description;
            this.id = builder.id;
            this.name = builder.name;
            this.partitionKey = builder.partitionKey;
            this.primaryKey = builder.primaryKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ColumnList create() {
            return builder().build();
        }

        /**
         * @return dataType
         */
        public String getDataType() {
            return this.dataType;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return partitionKey
         */
        public Boolean getPartitionKey() {
            return this.partitionKey;
        }

        /**
         * @return primaryKey
         */
        public Boolean getPrimaryKey() {
            return this.primaryKey;
        }

        public static final class Builder {
            private String dataType; 
            private String description; 
            private String id; 
            private String name; 
            private Boolean partitionKey; 
            private Boolean primaryKey; 

            /**
             * DataType.
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * PartitionKey.
             */
            public Builder partitionKey(Boolean partitionKey) {
                this.partitionKey = partitionKey;
                return this;
            }

            /**
             * PrimaryKey.
             */
            public Builder primaryKey(Boolean primaryKey) {
                this.primaryKey = primaryKey;
                return this;
            }

            public ColumnList build() {
                return new ColumnList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBatchTaskUdfLineagesResponseBody} extends {@link TeaModel}
     *
     * <p>GetBatchTaskUdfLineagesResponseBody</p>
     */
    public static class InputLineageList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizUnitId")
        private String bizUnitId;

        @com.aliyun.core.annotation.NameInMap("BizUnitName")
        private String bizUnitName;

        @com.aliyun.core.annotation.NameInMap("ColumnList")
        private java.util.List<ColumnList> columnList;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Env")
        private String env;

        @com.aliyun.core.annotation.NameInMap("FullTable")
        private Boolean fullTable;

        @com.aliyun.core.annotation.NameInMap("Guid")
        private String guid;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OwnerName")
        private String ownerName;

        @com.aliyun.core.annotation.NameInMap("OwnerUserId")
        private String ownerUserId;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("SubType")
        private String subType;

        private InputLineageList(Builder builder) {
            this.bizUnitId = builder.bizUnitId;
            this.bizUnitName = builder.bizUnitName;
            this.columnList = builder.columnList;
            this.description = builder.description;
            this.displayName = builder.displayName;
            this.env = builder.env;
            this.fullTable = builder.fullTable;
            this.guid = builder.guid;
            this.name = builder.name;
            this.ownerName = builder.ownerName;
            this.ownerUserId = builder.ownerUserId;
            this.projectId = builder.projectId;
            this.projectName = builder.projectName;
            this.subType = builder.subType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InputLineageList create() {
            return builder().build();
        }

        /**
         * @return bizUnitId
         */
        public String getBizUnitId() {
            return this.bizUnitId;
        }

        /**
         * @return bizUnitName
         */
        public String getBizUnitName() {
            return this.bizUnitName;
        }

        /**
         * @return columnList
         */
        public java.util.List<ColumnList> getColumnList() {
            return this.columnList;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
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
         * @return guid
         */
        public String getGuid() {
            return this.guid;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ownerName
         */
        public String getOwnerName() {
            return this.ownerName;
        }

        /**
         * @return ownerUserId
         */
        public String getOwnerUserId() {
            return this.ownerUserId;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return subType
         */
        public String getSubType() {
            return this.subType;
        }

        public static final class Builder {
            private String bizUnitId; 
            private String bizUnitName; 
            private java.util.List<ColumnList> columnList; 
            private String description; 
            private String displayName; 
            private String env; 
            private Boolean fullTable; 
            private String guid; 
            private String name; 
            private String ownerName; 
            private String ownerUserId; 
            private String projectId; 
            private String projectName; 
            private String subType; 

            /**
             * BizUnitId.
             */
            public Builder bizUnitId(String bizUnitId) {
                this.bizUnitId = bizUnitId;
                return this;
            }

            /**
             * BizUnitName.
             */
            public Builder bizUnitName(String bizUnitName) {
                this.bizUnitName = bizUnitName;
                return this;
            }

            /**
             * ColumnList.
             */
            public Builder columnList(java.util.List<ColumnList> columnList) {
                this.columnList = columnList;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * Env.
             */
            public Builder env(String env) {
                this.env = env;
                return this;
            }

            /**
             * FullTable.
             */
            public Builder fullTable(Boolean fullTable) {
                this.fullTable = fullTable;
                return this;
            }

            /**
             * Guid.
             */
            public Builder guid(String guid) {
                this.guid = guid;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * OwnerName.
             */
            public Builder ownerName(String ownerName) {
                this.ownerName = ownerName;
                return this;
            }

            /**
             * OwnerUserId.
             */
            public Builder ownerUserId(String ownerUserId) {
                this.ownerUserId = ownerUserId;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * ProjectName.
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * SubType.
             */
            public Builder subType(String subType) {
                this.subType = subType;
                return this;
            }

            public InputLineageList build() {
                return new InputLineageList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBatchTaskUdfLineagesResponseBody} extends {@link TeaModel}
     *
     * <p>GetBatchTaskUdfLineagesResponseBody</p>
     */
    public static class OutputLineageListColumnList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataType")
        private String dataType;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PartitionKey")
        private Boolean partitionKey;

        @com.aliyun.core.annotation.NameInMap("PrimaryKey")
        private Boolean primaryKey;

        private OutputLineageListColumnList(Builder builder) {
            this.dataType = builder.dataType;
            this.description = builder.description;
            this.id = builder.id;
            this.name = builder.name;
            this.partitionKey = builder.partitionKey;
            this.primaryKey = builder.primaryKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OutputLineageListColumnList create() {
            return builder().build();
        }

        /**
         * @return dataType
         */
        public String getDataType() {
            return this.dataType;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return partitionKey
         */
        public Boolean getPartitionKey() {
            return this.partitionKey;
        }

        /**
         * @return primaryKey
         */
        public Boolean getPrimaryKey() {
            return this.primaryKey;
        }

        public static final class Builder {
            private String dataType; 
            private String description; 
            private String id; 
            private String name; 
            private Boolean partitionKey; 
            private Boolean primaryKey; 

            /**
             * DataType.
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * PartitionKey.
             */
            public Builder partitionKey(Boolean partitionKey) {
                this.partitionKey = partitionKey;
                return this;
            }

            /**
             * PrimaryKey.
             */
            public Builder primaryKey(Boolean primaryKey) {
                this.primaryKey = primaryKey;
                return this;
            }

            public OutputLineageListColumnList build() {
                return new OutputLineageListColumnList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBatchTaskUdfLineagesResponseBody} extends {@link TeaModel}
     *
     * <p>GetBatchTaskUdfLineagesResponseBody</p>
     */
    public static class OutputLineageList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizUnitId")
        private String bizUnitId;

        @com.aliyun.core.annotation.NameInMap("BizUnitName")
        private String bizUnitName;

        @com.aliyun.core.annotation.NameInMap("ColumnList")
        private java.util.List<OutputLineageListColumnList> columnList;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Env")
        private String env;

        @com.aliyun.core.annotation.NameInMap("FullTable")
        private Boolean fullTable;

        @com.aliyun.core.annotation.NameInMap("Guid")
        private String guid;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OwnerName")
        private String ownerName;

        @com.aliyun.core.annotation.NameInMap("OwnerUserId")
        private String ownerUserId;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("SubType")
        private String subType;

        private OutputLineageList(Builder builder) {
            this.bizUnitId = builder.bizUnitId;
            this.bizUnitName = builder.bizUnitName;
            this.columnList = builder.columnList;
            this.description = builder.description;
            this.displayName = builder.displayName;
            this.env = builder.env;
            this.fullTable = builder.fullTable;
            this.guid = builder.guid;
            this.name = builder.name;
            this.ownerName = builder.ownerName;
            this.ownerUserId = builder.ownerUserId;
            this.projectId = builder.projectId;
            this.projectName = builder.projectName;
            this.subType = builder.subType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OutputLineageList create() {
            return builder().build();
        }

        /**
         * @return bizUnitId
         */
        public String getBizUnitId() {
            return this.bizUnitId;
        }

        /**
         * @return bizUnitName
         */
        public String getBizUnitName() {
            return this.bizUnitName;
        }

        /**
         * @return columnList
         */
        public java.util.List<OutputLineageListColumnList> getColumnList() {
            return this.columnList;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
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
         * @return guid
         */
        public String getGuid() {
            return this.guid;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ownerName
         */
        public String getOwnerName() {
            return this.ownerName;
        }

        /**
         * @return ownerUserId
         */
        public String getOwnerUserId() {
            return this.ownerUserId;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return subType
         */
        public String getSubType() {
            return this.subType;
        }

        public static final class Builder {
            private String bizUnitId; 
            private String bizUnitName; 
            private java.util.List<OutputLineageListColumnList> columnList; 
            private String description; 
            private String displayName; 
            private String env; 
            private Boolean fullTable; 
            private String guid; 
            private String name; 
            private String ownerName; 
            private String ownerUserId; 
            private String projectId; 
            private String projectName; 
            private String subType; 

            /**
             * BizUnitId.
             */
            public Builder bizUnitId(String bizUnitId) {
                this.bizUnitId = bizUnitId;
                return this;
            }

            /**
             * BizUnitName.
             */
            public Builder bizUnitName(String bizUnitName) {
                this.bizUnitName = bizUnitName;
                return this;
            }

            /**
             * ColumnList.
             */
            public Builder columnList(java.util.List<OutputLineageListColumnList> columnList) {
                this.columnList = columnList;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * Env.
             */
            public Builder env(String env) {
                this.env = env;
                return this;
            }

            /**
             * FullTable.
             */
            public Builder fullTable(Boolean fullTable) {
                this.fullTable = fullTable;
                return this;
            }

            /**
             * Guid.
             */
            public Builder guid(String guid) {
                this.guid = guid;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * OwnerName.
             */
            public Builder ownerName(String ownerName) {
                this.ownerName = ownerName;
                return this;
            }

            /**
             * OwnerUserId.
             */
            public Builder ownerUserId(String ownerUserId) {
                this.ownerUserId = ownerUserId;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * ProjectName.
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * SubType.
             */
            public Builder subType(String subType) {
                this.subType = subType;
                return this;
            }

            public OutputLineageList build() {
                return new OutputLineageList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetBatchTaskUdfLineagesResponseBody} extends {@link TeaModel}
     *
     * <p>GetBatchTaskUdfLineagesResponseBody</p>
     */
    public static class LineageGroupList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InputLineageList")
        private java.util.List<InputLineageList> inputLineageList;

        @com.aliyun.core.annotation.NameInMap("OutputLineageList")
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

            /**
             * InputLineageList.
             */
            public Builder inputLineageList(java.util.List<InputLineageList> inputLineageList) {
                this.inputLineageList = inputLineageList;
                return this;
            }

            /**
             * OutputLineageList.
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
     * {@link GetBatchTaskUdfLineagesResponseBody} extends {@link TeaModel}
     *
     * <p>GetBatchTaskUdfLineagesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LineageGroupList")
        private java.util.List<LineageGroupList> lineageGroupList;

        private Data(Builder builder) {
            this.lineageGroupList = builder.lineageGroupList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return lineageGroupList
         */
        public java.util.List<LineageGroupList> getLineageGroupList() {
            return this.lineageGroupList;
        }

        public static final class Builder {
            private java.util.List<LineageGroupList> lineageGroupList; 

            /**
             * LineageGroupList.
             */
            public Builder lineageGroupList(java.util.List<LineageGroupList> lineageGroupList) {
                this.lineageGroupList = lineageGroupList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
