// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDagsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDagsResponseBody</p>
 */
public class ListDagsResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ListDagsResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDagsResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private Data data; 
        private String errorCode; 
        private String errorMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        /**
         * The entities returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Indicates whether the request is successful.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error code returned.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The ID of the request. You can locate logs and troubleshoot issues based on the ID.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The error message returned.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The details of DAGs.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListDagsResponseBody build() {
            return new ListDagsResponseBody(this);
        } 

    } 

    public static class Dags extends TeaModel {
        @NameInMap("Bizdate")
        private Long bizdate;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("CreateUser")
        private String createUser;

        @NameInMap("DagId")
        private Long dagId;

        @NameInMap("FinishTime")
        private Long finishTime;

        @NameInMap("Gmtdate")
        private Long gmtdate;

        @NameInMap("ModifyTime")
        private Long modifyTime;

        @NameInMap("Name")
        private String name;

        @NameInMap("OpSeq")
        private Long opSeq;

        @NameInMap("ProjectId")
        private Long projectId;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("Type")
        private String type;

        private Dags(Builder builder) {
            this.bizdate = builder.bizdate;
            this.createTime = builder.createTime;
            this.createUser = builder.createUser;
            this.dagId = builder.dagId;
            this.finishTime = builder.finishTime;
            this.gmtdate = builder.gmtdate;
            this.modifyTime = builder.modifyTime;
            this.name = builder.name;
            this.opSeq = builder.opSeq;
            this.projectId = builder.projectId;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Dags create() {
            return builder().build();
        }

        /**
         * @return bizdate
         */
        public Long getBizdate() {
            return this.bizdate;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createUser
         */
        public String getCreateUser() {
            return this.createUser;
        }

        /**
         * @return dagId
         */
        public Long getDagId() {
            return this.dagId;
        }

        /**
         * @return finishTime
         */
        public Long getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return gmtdate
         */
        public Long getGmtdate() {
            return this.gmtdate;
        }

        /**
         * @return modifyTime
         */
        public Long getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return opSeq
         */
        public Long getOpSeq() {
            return this.opSeq;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long bizdate; 
            private Long createTime; 
            private String createUser; 
            private Long dagId; 
            private Long finishTime; 
            private Long gmtdate; 
            private Long modifyTime; 
            private String name; 
            private Long opSeq; 
            private Long projectId; 
            private Long startTime; 
            private String status; 
            private String type; 

            /**
             * The name of the DAG.
             */
            public Builder bizdate(Long bizdate) {
                this.bizdate = bizdate;
                return this;
            }

            /**
             * The ID of the workspace.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The data timestamp.
             */
            public Builder createUser(String createUser) {
                this.createUser = createUser;
                return this;
            }

            /**
             * The time at which the DAG was scheduled to run.
             */
            public Builder dagId(Long dagId) {
                this.dagId = dagId;
                return this;
            }

            /**
             * The time at which the DAG was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder finishTime(Long finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * The time at which the DAG started to run.
             */
            public Builder gmtdate(Long gmtdate) {
                this.gmtdate = gmtdate;
                return this;
            }

            /**
             * The sequence number of the operation.
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * The time at which the DAG was last modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * OpSeq.
             */
            public Builder opSeq(Long opSeq) {
                this.opSeq = opSeq;
                return this;
            }

            /**
             * The ID of the DAG.
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * The user who created the DAG.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The time at which the DAG finished running. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The status of the DAG. Valid values: CREATED, RUNNING, FAILURE, and SUCCESS.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Dags build() {
                return new Dags(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Dags")
        private java.util.List < Dags> dags;

        private Data(Builder builder) {
            this.dags = builder.dags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return dags
         */
        public java.util.List < Dags> getDags() {
            return this.dags;
        }

        public static final class Builder {
            private java.util.List < Dags> dags; 

            /**
             * The type of the DAG. Valid values: MANUAL, SMOKE_TEST, SUPPLY_DATA, and BUSINESS_PROCESS_DAG.
             */
            public Builder dags(java.util.List < Dags> dags) {
                this.dags = dags;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
