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
         * <p>Error code. OK indicates a successful request.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>HTTP status code returned by the backend.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Query result.</p>
         */
        public Builder listResult(ListResult listResult) {
            this.listResult = listResult;
            return this;
        }

        /**
         * <p>Error message.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Whether the request is successful.</p>
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
             * <p>Change type. 0: Create / 1: Update / 2: Delete.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder changeType(Integer changeType) {
                this.changeType = changeType;
                return this;
            }

            /**
             * <p>Creation time in the yyyy-MM-dd HH:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-10-10 10:00:00</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>Modification time in the yyyy-MM-dd HH:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-10-10 10:00:00</p>
             */
            public Builder gmtModify(String gmtModify) {
                this.gmtModify = gmtModify;
                return this;
            }

            /**
             * <p>Pending deployment record ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1241844456</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>n_123456</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>Object ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1234567</p>
             */
            public Builder objectId(String objectId) {
                this.objectId = objectId;
                return this;
            }

            /**
             * <p>Object name.</p>
             * 
             * <strong>example:</strong>
             * <p>对象A</p>
             */
            public Builder objectName(String objectName) {
                this.objectName = objectName;
                return this;
            }

            /**
             * <p>Object type. Valid values:</p>
             * <ul>
             * <li>MaxCompute SQL task: MAX_COMPUTE_SQL</li>
             * <li>MaxCompute MR task: MAX_COMPUTE_MR</li>
             * <li>Spark JAR on MaxCompute: SPARK_JAR_ON_MAX_COMPUTE</li>
             * <li>Shell task: SHELL</li>
             * <li>Python task: PYTHON</li>
             * <li>Perl script: PERL</li>
             * <li>Check: CHECK</li>
             * <li>Sync task: DATA_X</li>
             * <li>Virtual node: VIRTUAL</li>
             * <li>Resource: IDE_RESOURCE</li>
             * <li>Function: UDF</li>
             * <li>Hive SQL task: HIVE_SQL</li>
             * <li>Hadoop MR task: HADOOP_MR</li>
             * <li>Spark JAR on Hive task: SPARK_JAR_ON_HIVE</li>
             * <li>Flink SQL task: FLINK_SQL</li>
             * <li>Flink SQL template task: FLINK_TEMPLATE_SQL</li>
             * <li>Stream computing template: STREAM_TEMPLATE</li>
             * <li>Metatable: META_TABLE</li>
             * <li>Stream computing function: STREAM_UDF</li>
             * <li>Real-time Flink DataStream: FLINK_DATASTREAM</li>
             * <li>Real-time custom data source: STREAM_CUSTOM_DATASOURCE</li>
             * <li>AnalyticDB for PostgreSQL task: ADB_FOR_PG</li>
             * <li>TDH SQL task: INCEPTOR_SQL</li>
             * <li>Mirror table: MIRROR_TABLE</li>
             * <li>Intermediate table: MIDDLE_TABLE</li>
             * <li>Application table: APPLICATION_TABLE</li>
             * <li>Impala SQL task: IMPALA_SQL</li>
             * <li>Offline pipeline task: OFFLINE_PIPELINE</li>
             * <li>Real-time pipeline task: REAL_TIME_PIPELINE</li>
             * <li>Dimension logical table: DIM_LOGICAL_TABLE</li>
             * <li>Fact logical table: FCT_LOGICAL_TABLE</li>
             * <li>Business condition: BIZ_CONDITION</li>
             * <li>Atomic metric: ATOM_INDEX</li>
             * <li>Derived metric: DERIVED_INDEX</li>
             * <li>Calculated derived metric: CALC_DERIVED_INDEX</li>
             * <li>PAI task: PAI_DESIGNER</li>
             * <li>ArgoDB SQL task: ARGODB_SQL</li>
             * <li>Hologres SQL task: HOLOGRES_SQL</li>
             * <li>Impala SQL task: IMPALA_SQL</li>
             * <li>StarRocks SQL task: STARROCKS_SQL</li>
             * <li>Database SQL task: DATABASE_SQL</li>
             * <li>Spark SQL task: SPARK_SQL</li>
             * <li>Compute template: TASK_TEMPLATE</li>
             * <li>External trigger node: EXTERNAL_TRIGGER</li>
             * <li>Gauss SQL task: GAUSS_SQL</li>
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
             * <p>Object version.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder objectVersion(String objectVersion) {
                this.objectVersion = objectVersion;
                return this;
            }

            /**
             * <p>Project ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1241844456</p>
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>Submission comment.</p>
             * 
             * <strong>example:</strong>
             * <p>提交信息</p>
             */
            public Builder submitComment(String submitComment) {
                this.submitComment = submitComment;
                return this;
            }

            /**
             * <p>Submitter ID.</p>
             * 
             * <strong>example:</strong>
             * <p>307999999</p>
             */
            public Builder submitter(String submitter) {
                this.submitter = submitter;
                return this;
            }

            /**
             * <p>Submitter name.</p>
             * 
             * <strong>example:</strong>
             * <p>张三</p>
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
             * <p>List of pending deployment records.</p>
             */
            public Builder data(java.util.List<Data> data) {
                this.data = data;
                return this;
            }

            /**
             * <p>Total count.</p>
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
