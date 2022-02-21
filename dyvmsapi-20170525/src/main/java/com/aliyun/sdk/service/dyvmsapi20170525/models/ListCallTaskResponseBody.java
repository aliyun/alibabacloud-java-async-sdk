// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCallTaskResponseBody} extends {@link TeaModel}
 *
 * <p>ListCallTaskResponseBody</p>
 */
public class ListCallTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("PageNumber")
    private Long pageNumber;

    @NameInMap("PageSize")
    private Long pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Total")
    private Long total;

    private ListCallTaskResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCallTaskResponseBody create() {
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
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private java.util.List < Data> data; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long total; 

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
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
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
         * Total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListCallTaskResponseBody build() {
            return new ListCallTaskResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("BizType")
        private String bizType;

        @NameInMap("CompleteTime")
        private String completeTime;

        @NameInMap("CompletedCount")
        private Long completedCount;

        @NameInMap("CompletedRate")
        private Integer completedRate;

        @NameInMap("Data")
        private String data;

        @NameInMap("DataType")
        private String dataType;

        @NameInMap("FireTime")
        private String fireTime;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Resource")
        private String resource;

        @NameInMap("Status")
        private String status;

        @NameInMap("StopTime")
        private String stopTime;

        @NameInMap("TaskName")
        private String taskName;

        @NameInMap("TemplateCode")
        private String templateCode;

        @NameInMap("TemplateName")
        private String templateName;

        @NameInMap("TotalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.bizType = builder.bizType;
            this.completeTime = builder.completeTime;
            this.completedCount = builder.completedCount;
            this.completedRate = builder.completedRate;
            this.data = builder.data;
            this.dataType = builder.dataType;
            this.fireTime = builder.fireTime;
            this.id = builder.id;
            this.resource = builder.resource;
            this.status = builder.status;
            this.stopTime = builder.stopTime;
            this.taskName = builder.taskName;
            this.templateCode = builder.templateCode;
            this.templateName = builder.templateName;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bizType
         */
        public String getBizType() {
            return this.bizType;
        }

        /**
         * @return completeTime
         */
        public String getCompleteTime() {
            return this.completeTime;
        }

        /**
         * @return completedCount
         */
        public Long getCompletedCount() {
            return this.completedCount;
        }

        /**
         * @return completedRate
         */
        public Integer getCompletedRate() {
            return this.completedRate;
        }

        /**
         * @return data
         */
        public String getData() {
            return this.data;
        }

        /**
         * @return dataType
         */
        public String getDataType() {
            return this.dataType;
        }

        /**
         * @return fireTime
         */
        public String getFireTime() {
            return this.fireTime;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return resource
         */
        public String getResource() {
            return this.resource;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return stopTime
         */
        public String getStopTime() {
            return this.stopTime;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        /**
         * @return templateCode
         */
        public String getTemplateCode() {
            return this.templateCode;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private String bizType; 
            private String completeTime; 
            private Long completedCount; 
            private Integer completedRate; 
            private String data; 
            private String dataType; 
            private String fireTime; 
            private Long id; 
            private String resource; 
            private String status; 
            private String stopTime; 
            private String taskName; 
            private String templateCode; 
            private String templateName; 
            private Long totalCount; 

            /**
             * BizType.
             */
            public Builder bizType(String bizType) {
                this.bizType = bizType;
                return this;
            }

            /**
             * CompleteTime.
             */
            public Builder completeTime(String completeTime) {
                this.completeTime = completeTime;
                return this;
            }

            /**
             * CompletedCount.
             */
            public Builder completedCount(Long completedCount) {
                this.completedCount = completedCount;
                return this;
            }

            /**
             * CompletedRate.
             */
            public Builder completedRate(Integer completedRate) {
                this.completedRate = completedRate;
                return this;
            }

            /**
             * Data.
             */
            public Builder data(String data) {
                this.data = data;
                return this;
            }

            /**
             * DataType.
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * FireTime.
             */
            public Builder fireTime(String fireTime) {
                this.fireTime = fireTime;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Resource.
             */
            public Builder resource(String resource) {
                this.resource = resource;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * StopTime.
             */
            public Builder stopTime(String stopTime) {
                this.stopTime = stopTime;
                return this;
            }

            /**
             * TaskName.
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * TemplateCode.
             */
            public Builder templateCode(String templateCode) {
                this.templateCode = templateCode;
                return this;
            }

            /**
             * TemplateName.
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
