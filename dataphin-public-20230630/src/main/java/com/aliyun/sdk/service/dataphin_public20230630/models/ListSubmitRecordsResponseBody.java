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
 * {@link ListSubmitRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSubmitRecordsResponseBody</p>
 */
public class ListSubmitRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("ListResult")
    private ListResult listResult;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListSubmitRecordsResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.listResult = builder.listResult;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSubmitRecordsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return listResult
     */
    public ListResult getListResult() {
        return this.listResult;
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
        private Integer httpStatusCode; 
        private ListResult listResult; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListSubmitRecordsResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.listResult = model.listResult;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code. A value of OK indicates that the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The HTTP status code returned by the backend.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The query result.</p>
         */
        public Builder listResult(ListResult listResult) {
            this.listResult = listResult;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListSubmitRecordsResponseBody build() {
            return new ListSubmitRecordsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSubmitRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSubmitRecordsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChangeType")
        private Integer changeType;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModify")
        private String gmtModify;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("ObjectId")
        private String objectId;

        @com.aliyun.core.annotation.NameInMap("ObjectName")
        private String objectName;

        @com.aliyun.core.annotation.NameInMap("ObjectType")
        private String objectType;

        @com.aliyun.core.annotation.NameInMap("ObjectVersion")
        private String objectVersion;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("SubmitComment")
        private String submitComment;

        @com.aliyun.core.annotation.NameInMap("Submitter")
        private String submitter;

        @com.aliyun.core.annotation.NameInMap("SubmitterName")
        private String submitterName;

        private Data(Builder builder) {
            this.changeType = builder.changeType;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModify = builder.gmtModify;
            this.id = builder.id;
            this.nodeId = builder.nodeId;
            this.objectId = builder.objectId;
            this.objectName = builder.objectName;
            this.objectType = builder.objectType;
            this.objectVersion = builder.objectVersion;
            this.projectId = builder.projectId;
            this.submitComment = builder.submitComment;
            this.submitter = builder.submitter;
            this.submitterName = builder.submitterName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return changeType
         */
        public Integer getChangeType() {
            return this.changeType;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModify
         */
        public String getGmtModify() {
            return this.gmtModify;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return objectId
         */
        public String getObjectId() {
            return this.objectId;
        }

        /**
         * @return objectName
         */
        public String getObjectName() {
            return this.objectName;
        }

        /**
         * @return objectType
         */
        public String getObjectType() {
            return this.objectType;
        }

        /**
         * @return objectVersion
         */
        public String getObjectVersion() {
            return this.objectVersion;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return submitComment
         */
        public String getSubmitComment() {
            return this.submitComment;
        }

        /**
         * @return submitter
         */
        public String getSubmitter() {
            return this.submitter;
        }

        /**
         * @return submitterName
         */
        public String getSubmitterName() {
            return this.submitterName;
        }

        public static final class Builder {
            private Integer changeType; 
            private String gmtCreate; 
            private String gmtModify; 
            private Long id; 
            private String nodeId; 
            private String objectId; 
            private String objectName; 
            private String objectType; 
            private String objectVersion; 
            private String projectId; 
            private String submitComment; 
            private String submitter; 
            private String submitterName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.changeType = model.changeType;
                this.gmtCreate = model.gmtCreate;
                this.gmtModify = model.gmtModify;
                this.id = model.id;
                this.nodeId = model.nodeId;
                this.objectId = model.objectId;
                this.objectName = model.objectName;
                this.objectType = model.objectType;
                this.objectVersion = model.objectVersion;
                this.projectId = model.projectId;
                this.submitComment = model.submitComment;
                this.submitter = model.submitter;
                this.submitterName = model.submitterName;
            } 

            /**
             * <p>The change type. Valid values:</p>
             * <ul>
             * <li>0: create</li>
             * <li>1: update</li>
             * <li>2: delete</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder changeType(Integer changeType) {
                this.changeType = changeType;
                return this;
            }

            /**
             * <p>The time when the record was created. Format: yyyy-MM-dd HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-10-10 10:00:00</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the record was updated. Format: yyyy-MM-dd HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-10-10 10:00:00</p>
             */
            public Builder gmtModify(String gmtModify) {
                this.gmtModify = gmtModify;
                return this;
            }

            /**
             * <p>The ID of the pending publish record.</p>
             * 
             * <strong>example:</strong>
             * <p>1241844456</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The ID of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>n_123456</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The ID of the object.</p>
             * 
             * <strong>example:</strong>
             * <p>1234567</p>
             */
            public Builder objectId(String objectId) {
                this.objectId = objectId;
                return this;
            }

            /**
             * <p>The name of the object.</p>
             * 
             * <strong>example:</strong>
             * <p>Object A</p>
             */
            public Builder objectName(String objectName) {
                this.objectName = objectName;
                return this;
            }

            /**
             * <p>The object type. Valid values:</p>
             * <ul>
             * <li>MAX_COMPUTE_SQL: MaxCompute SQL node</li>
             * <li>MAX_COMPUTE_MR: MaxCompute MR node</li>
             * <li>SPARK_JAR_ON_MAX_COMPUTE: Spark JAR on MaxCompute node</li>
             * <li>SHELL: Shell node</li>
             * <li>PYTHON: Python node</li>
             * <li>PERL: Perl script</li>
             * <li>CHECK: Check node</li>
             * <li>DATA_X: Data synchronization node</li>
             * <li>VIRTUAL: Virtual node</li>
             * <li>IDE_RESOURCE: Resource</li>
             * <li>UDF: Function</li>
             * <li>HIVE_SQL: Hive SQL node</li>
             * <li>HADOOP_MR: Hadoop MR node</li>
             * <li>SPARK_JAR_ON_HIVE: Spark JAR on Hive node</li>
             * <li>FLINK_SQL: Flink SQL node</li>
             * <li>FLINK_TEMPLATE_SQL: Flink SQL template node</li>
             * <li>STREAM_TEMPLATE: Stream computing template</li>
             * <li>META_TABLE: Metatable</li>
             * <li>STREAM_UDF: Stream computing function</li>
             * <li>FLINK_DATASTREAM: Real-time Flink DataStream node</li>
             * <li>STREAM_CUSTOM_DATASOURCE: Real-time custom data source</li>
             * <li>ADB_FOR_PG: AnalyticDB for PostgreSQL node</li>
             * <li>INCEPTOR_SQL: Inceptor SQL node</li>
             * <li>MIRROR_TABLE: Mirror table</li>
             * <li>MIDDLE_TABLE: Intermediate table</li>
             * <li>APPLICATION_TABLE: Application table</li>
             * <li>IMPALA_SQL: Impala SQL node</li>
             * <li>OFFLINE_PIPELINE: Offline pipeline node</li>
             * <li>REAL_TIME_PIPELINE: Real-time pipeline node</li>
             * <li>DIM_LOGICAL_TABLE: Logical dimension table</li>
             * <li>FCT_LOGICAL_TABLE: Logical fact table</li>
             * <li>BIZ_CONDITION: Business filter</li>
             * <li>ATOM_INDEX: Atomic metric</li>
             * <li>DERIVED_INDEX: Derived metric</li>
             * <li>CALC_DERIVED_INDEX: Derivative metric</li>
             * <li>PAI_DESIGNER: PAI Designer node</li>
             * <li>ARGODB_SQL: ArgoDB SQL node</li>
             * <li>HOLOGRES_SQL: Hologres SQL node</li>
             * <li>IMPALA_SQL: Impala SQL node</li>
             * <li>STARROCKS_SQL: StarRocks SQL node</li>
             * <li>DATABASE_SQL: Database SQL node</li>
             * <li>SPARK_SQL: Spark SQL node</li>
             * <li>TASK_TEMPLATE: Task template</li>
             * <li>EXTERNAL_TRIGGER: External trigger node</li>
             * <li>GAUSS_SQL: Gauss SQL node</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2024-10-10 10:00:00</p>
             */
            public Builder objectType(String objectType) {
                this.objectType = objectType;
                return this;
            }

            /**
             * <p>The version of the object.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder objectVersion(String objectVersion) {
                this.objectVersion = objectVersion;
                return this;
            }

            /**
             * <p>The project ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1241844456</p>
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The submission comment.</p>
             * 
             * <strong>example:</strong>
             * <p>Submission comment</p>
             */
            public Builder submitComment(String submitComment) {
                this.submitComment = submitComment;
                return this;
            }

            /**
             * <p>The ID of the submitter.</p>
             * 
             * <strong>example:</strong>
             * <p>307999999</p>
             */
            public Builder submitter(String submitter) {
                this.submitter = submitter;
                return this;
            }

            /**
             * <p>The name of the submitter.</p>
             * 
             * <strong>example:</strong>
             * <p>Zhang San</p>
             */
            public Builder submitterName(String submitterName) {
                this.submitterName = submitterName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSubmitRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSubmitRecordsResponseBody</p>
     */
    public static class ListResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List<Data> data;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private ListResult(Builder builder) {
            this.data = builder.data;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListResult create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List<Data> getData() {
            return this.data;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<Data> data; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(ListResult model) {
                this.data = model.data;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The list of pending publish records.</p>
             */
            public Builder data(java.util.List<Data> data) {
                this.data = data;
                return this;
            }

            /**
             * <p>The total count.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public ListResult build() {
                return new ListResult(this);
            } 

        } 

    }
}
