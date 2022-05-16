// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiplugin20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListGroupsResponseBody</p>
 */
public class ListGroupsResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorCode")
    private Integer errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    private ListGroupsResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGroupsResponseBody create() {
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
    public Integer getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private Integer errorCode; 
        private String errorMessage; 
        private String requestId; 

        /**
         * 返回数据。
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * 错误码。
         */
        public Builder errorCode(Integer errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * 错误信息。
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * 请求ID。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListGroupsResponseBody build() {
            return new ListGroupsResponseBody(this);
        } 

    } 

    public static class Groups extends TeaModel {
        @NameInMap("Algorithm")
        private String algorithm;

        @NameInMap("Amount")
        private Integer amount;

        @NameInMap("Column")
        private String column;

        @NameInMap("CreatedTime")
        private String createdTime;

        @NameInMap("Filter")
        private String filter;

        @NameInMap("Id")
        private String id;

        @NameInMap("InferenceJobId")
        private String inferenceJobId;

        @NameInMap("Name")
        private String name;

        @NameInMap("PhoneNumber")
        private Boolean phoneNumber;

        @NameInMap("Project")
        private String project;

        @NameInMap("Remark")
        private String remark;

        @NameInMap("Source")
        private Integer source;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("Table")
        private String table;

        @NameInMap("Text")
        private String text;

        @NameInMap("UpdatedTime")
        private String updatedTime;

        @NameInMap("Uri")
        private String uri;

        private Groups(Builder builder) {
            this.algorithm = builder.algorithm;
            this.amount = builder.amount;
            this.column = builder.column;
            this.createdTime = builder.createdTime;
            this.filter = builder.filter;
            this.id = builder.id;
            this.inferenceJobId = builder.inferenceJobId;
            this.name = builder.name;
            this.phoneNumber = builder.phoneNumber;
            this.project = builder.project;
            this.remark = builder.remark;
            this.source = builder.source;
            this.status = builder.status;
            this.table = builder.table;
            this.text = builder.text;
            this.updatedTime = builder.updatedTime;
            this.uri = builder.uri;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Groups create() {
            return builder().build();
        }

        /**
         * @return algorithm
         */
        public String getAlgorithm() {
            return this.algorithm;
        }

        /**
         * @return amount
         */
        public Integer getAmount() {
            return this.amount;
        }

        /**
         * @return column
         */
        public String getColumn() {
            return this.column;
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return filter
         */
        public String getFilter() {
            return this.filter;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return inferenceJobId
         */
        public String getInferenceJobId() {
            return this.inferenceJobId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return phoneNumber
         */
        public Boolean getPhoneNumber() {
            return this.phoneNumber;
        }

        /**
         * @return project
         */
        public String getProject() {
            return this.project;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return source
         */
        public Integer getSource() {
            return this.source;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return table
         */
        public String getTable() {
            return this.table;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        /**
         * @return updatedTime
         */
        public String getUpdatedTime() {
            return this.updatedTime;
        }

        /**
         * @return uri
         */
        public String getUri() {
            return this.uri;
        }

        public static final class Builder {
            private String algorithm; 
            private Integer amount; 
            private String column; 
            private String createdTime; 
            private String filter; 
            private String id; 
            private String inferenceJobId; 
            private String name; 
            private Boolean phoneNumber; 
            private String project; 
            private String remark; 
            private Integer source; 
            private Integer status; 
            private String table; 
            private String text; 
            private String updatedTime; 
            private String uri; 

            /**
             * 关联算法，人群来源为算法。
             */
            public Builder algorithm(String algorithm) {
                this.algorithm = algorithm;
                return this;
            }

            /**
             * 人群数量。
             */
            public Builder amount(Integer amount) {
                this.amount = amount;
                return this;
            }

            /**
             * 手机号列名，人群来源为CSV文件，MaxCompute，并且包含手机号时需指定。
             */
            public Builder column(String column) {
                this.column = column;
                return this;
            }

            /**
             * 创建时间 (UTC+8)。
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * 过滤条件，人群来源为MaxCompute时可指定。
             */
            public Builder filter(String filter) {
                this.filter = filter;
                return this;
            }

            /**
             * 人群Id。
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * 预测任务Id，人群来源为算法。
             */
            public Builder inferenceJobId(String inferenceJobId) {
                this.inferenceJobId = inferenceJobId;
                return this;
            }

            /**
             * 人群名称。
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * 是否包含手机号，包含手机号的人群可用于触达计划。
             */
            public Builder phoneNumber(Boolean phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            /**
             * MaxCompute(ODPS)项目名，人群来源为MaxCompute时需指定。
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * 人群备注。
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * 人群来源。
             * <p>
             * - 0: 文本，每行一个手机号，最多100个。
             * - 1: 文本文件，每行一个手机号，可通过控制台上传或指定自定义OSS地址，指定自定义OSS地址前需确保已在控制台完成一键授权。
             * - 2: CSV文件，需指定手机号列名，可通过控制台上传或指定自定义OSS地址，指定自定义OSS地址前需确保已在控制台完成一键授权。
             * - 3: MaxCompute(ODPS)表，需指定手机号列名。
             * - 4: 算法。
             */
            public Builder source(Integer source) {
                this.source = source;
                return this;
            }

            /**
             * 人群状态。
             * <p>
             * - 0: 检查中。
             * - 1: 已通过。
             * - 2: 未通过。
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * MaxCompute(ODPS)表名，人群来源为MaxCompute时需指定。
             */
            public Builder table(String table) {
                this.table = table;
                return this;
            }

            /**
             * 文本，人群来源为文本时需指定。
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * 更新时间 (UTC+8)。
             */
            public Builder updatedTime(String updatedTime) {
                this.updatedTime = updatedTime;
                return this;
            }

            /**
             * 文件地址，人群来源为文本文件，CSV文件，MaxCompute时需指定。
             */
            public Builder uri(String uri) {
                this.uri = uri;
                return this;
            }

            public Groups build() {
                return new Groups(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Groups")
        private java.util.List < Groups> groups;

        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.groups = builder.groups;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return groups
         */
        public java.util.List < Groups> getGroups() {
            return this.groups;
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

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < Groups> groups; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * 人群列表。
             */
            public Builder groups(java.util.List < Groups> groups) {
                this.groups = groups;
                return this;
            }

            /**
             * 分页数，从1开始，默认为1。
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * 分页大小，默认为10。
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * 总人群数量。
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
