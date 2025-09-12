// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_finplus20220913.models;

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
 * {@link ListComputeTask2ResponseBody} extends {@link TeaModel}
 *
 * <p>ListComputeTask2ResponseBody</p>
 */
public class ListComputeTask2ResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Msg")
    private String msg;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListComputeTask2ResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListComputeTask2ResponseBody create() {
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
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
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
        private String msg; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListComputeTask2ResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.msg = model.msg;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

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
         * Msg.
         */
        public Builder msg(String msg) {
            this.msg = msg;
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

        public ListComputeTask2ResponseBody build() {
            return new ListComputeTask2ResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListComputeTask2ResponseBody} extends {@link TeaModel}
     *
     * <p>ListComputeTask2ResponseBody</p>
     */
    public static class TaskResultList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bcId")
        private Long bcId;

        @com.aliyun.core.annotation.NameInMap("code")
        private Integer code;

        @com.aliyun.core.annotation.NameInMap("lineNum")
        private Long lineNum;

        private TaskResultList(Builder builder) {
            this.bcId = builder.bcId;
            this.code = builder.code;
            this.lineNum = builder.lineNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskResultList create() {
            return builder().build();
        }

        /**
         * @return bcId
         */
        public Long getBcId() {
            return this.bcId;
        }

        /**
         * @return code
         */
        public Integer getCode() {
            return this.code;
        }

        /**
         * @return lineNum
         */
        public Long getLineNum() {
            return this.lineNum;
        }

        public static final class Builder {
            private Long bcId; 
            private Integer code; 
            private Long lineNum; 

            private Builder() {
            } 

            private Builder(TaskResultList model) {
                this.bcId = model.bcId;
                this.code = model.code;
                this.lineNum = model.lineNum;
            } 

            /**
             * bcId.
             */
            public Builder bcId(Long bcId) {
                this.bcId = bcId;
                return this;
            }

            /**
             * code.
             */
            public Builder code(Integer code) {
                this.code = code;
                return this;
            }

            /**
             * lineNum.
             */
            public Builder lineNum(Long lineNum) {
                this.lineNum = lineNum;
                return this;
            }

            public TaskResultList build() {
                return new TaskResultList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListComputeTask2ResponseBody} extends {@link TeaModel}
     *
     * <p>ListComputeTask2ResponseBody</p>
     */
    public static class DataData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("appId")
        private Long appId;

        @com.aliyun.core.annotation.NameInMap("bcId")
        private Long bcId;

        @com.aliyun.core.annotation.NameInMap("computeOssFileTitle")
        private String computeOssFileTitle;

        @com.aliyun.core.annotation.NameInMap("datasetIds")
        private String datasetIds;

        @com.aliyun.core.annotation.NameInMap("extInfo")
        private String extInfo;

        @com.aliyun.core.annotation.NameInMap("fileNum")
        private Long fileNum;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("remarks")
        private String remarks;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("taskResultList")
        private java.util.List<TaskResultList> taskResultList;

        private DataData(Builder builder) {
            this.appId = builder.appId;
            this.bcId = builder.bcId;
            this.computeOssFileTitle = builder.computeOssFileTitle;
            this.datasetIds = builder.datasetIds;
            this.extInfo = builder.extInfo;
            this.fileNum = builder.fileNum;
            this.name = builder.name;
            this.remarks = builder.remarks;
            this.status = builder.status;
            this.taskResultList = builder.taskResultList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataData create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public Long getAppId() {
            return this.appId;
        }

        /**
         * @return bcId
         */
        public Long getBcId() {
            return this.bcId;
        }

        /**
         * @return computeOssFileTitle
         */
        public String getComputeOssFileTitle() {
            return this.computeOssFileTitle;
        }

        /**
         * @return datasetIds
         */
        public String getDatasetIds() {
            return this.datasetIds;
        }

        /**
         * @return extInfo
         */
        public String getExtInfo() {
            return this.extInfo;
        }

        /**
         * @return fileNum
         */
        public Long getFileNum() {
            return this.fileNum;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return remarks
         */
        public String getRemarks() {
            return this.remarks;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskResultList
         */
        public java.util.List<TaskResultList> getTaskResultList() {
            return this.taskResultList;
        }

        public static final class Builder {
            private Long appId; 
            private Long bcId; 
            private String computeOssFileTitle; 
            private String datasetIds; 
            private String extInfo; 
            private Long fileNum; 
            private String name; 
            private String remarks; 
            private String status; 
            private java.util.List<TaskResultList> taskResultList; 

            private Builder() {
            } 

            private Builder(DataData model) {
                this.appId = model.appId;
                this.bcId = model.bcId;
                this.computeOssFileTitle = model.computeOssFileTitle;
                this.datasetIds = model.datasetIds;
                this.extInfo = model.extInfo;
                this.fileNum = model.fileNum;
                this.name = model.name;
                this.remarks = model.remarks;
                this.status = model.status;
                this.taskResultList = model.taskResultList;
            } 

            /**
             * appId.
             */
            public Builder appId(Long appId) {
                this.appId = appId;
                return this;
            }

            /**
             * bcId.
             */
            public Builder bcId(Long bcId) {
                this.bcId = bcId;
                return this;
            }

            /**
             * computeOssFileTitle.
             */
            public Builder computeOssFileTitle(String computeOssFileTitle) {
                this.computeOssFileTitle = computeOssFileTitle;
                return this;
            }

            /**
             * datasetIds.
             */
            public Builder datasetIds(String datasetIds) {
                this.datasetIds = datasetIds;
                return this;
            }

            /**
             * extInfo.
             */
            public Builder extInfo(String extInfo) {
                this.extInfo = extInfo;
                return this;
            }

            /**
             * fileNum.
             */
            public Builder fileNum(Long fileNum) {
                this.fileNum = fileNum;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * remarks.
             */
            public Builder remarks(String remarks) {
                this.remarks = remarks;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * taskResultList.
             */
            public Builder taskResultList(java.util.List<TaskResultList> taskResultList) {
                this.taskResultList = taskResultList;
                return this;
            }

            public DataData build() {
                return new DataData(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListComputeTask2ResponseBody} extends {@link TeaModel}
     *
     * <p>ListComputeTask2ResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("data")
        private java.util.List<DataData> data;

        @com.aliyun.core.annotation.NameInMap("totalNum")
        private Integer totalNum;

        private Data(Builder builder) {
            this.data = builder.data;
            this.totalNum = builder.totalNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List<DataData> getData() {
            return this.data;
        }

        /**
         * @return totalNum
         */
        public Integer getTotalNum() {
            return this.totalNum;
        }

        public static final class Builder {
            private java.util.List<DataData> data; 
            private Integer totalNum; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.data = model.data;
                this.totalNum = model.totalNum;
            } 

            /**
             * data.
             */
            public Builder data(java.util.List<DataData> data) {
                this.data = data;
                return this;
            }

            /**
             * totalNum.
             */
            public Builder totalNum(Integer totalNum) {
                this.totalNum = totalNum;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
