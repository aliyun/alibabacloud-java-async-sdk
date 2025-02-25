// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListCallTaskResponseBody} extends {@link TeaModel}
 *
 * <p>ListCallTaskResponseBody</p>
 */
public class ListCallTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
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
         * <p>The response code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The task information.</p>
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5B0F201F-DCDA-45C2-AA92-1AE177F94991</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListCallTaskResponseBody build() {
            return new ListCallTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCallTaskResponseBody} extends {@link TeaModel}
     *
     * <p>ListCallTaskResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizType")
        private String bizType;

        @com.aliyun.core.annotation.NameInMap("CompleteTime")
        private String completeTime;

        @com.aliyun.core.annotation.NameInMap("CompletedCount")
        private Long completedCount;

        @com.aliyun.core.annotation.NameInMap("CompletedRate")
        private Integer completedRate;

        @com.aliyun.core.annotation.NameInMap("Data")
        private String data;

        @com.aliyun.core.annotation.NameInMap("DataType")
        private String dataType;

        @com.aliyun.core.annotation.NameInMap("FireTime")
        private String fireTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Resource")
        private String resource;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StopTime")
        private String stopTime;

        @com.aliyun.core.annotation.NameInMap("TaskName")
        private String taskName;

        @com.aliyun.core.annotation.NameInMap("TemplateCode")
        private String templateCode;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
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
             * <p>The type of the task template. Valid values:</p>
             * <ul>
             * <li><strong>VMS_VOICE_TTS</strong>: the TTS notification template.</li>
             * <li><strong>VMS_VOICE_CODE</strong>: the voice notification template.</li>
             * <li><strong>VMS_TTS</strong>: the voice verification code template.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>VMS_VOICE_TTS</p>
             */
            public Builder bizType(String bizType) {
                this.bizType = bizType;
                return this;
            }

            /**
             * <p>The time when the task was completed. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1614330986000</p>
             */
            public Builder completeTime(String completeTime) {
                this.completeTime = completeTime;
                return this;
            }

            /**
             * <p>The number of tasks that were complete.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder completedCount(Long completedCount) {
                this.completedCount = completedCount;
                return this;
            }

            /**
             * <p>The task progress.</p>
             * 
             * <strong>example:</strong>
             * <p>26%</p>
             */
            public Builder completedRate(Integer completedRate) {
                this.completedRate = completedRate;
                return this;
            }

            /**
             * <p>This parameter is unavailable.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder data(String data) {
                this.data = data;
                return this;
            }

            /**
             * <p>The type of the called number.</p>
             * 
             * <strong>example:</strong>
             * <p>LIST</p>
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * <p>The time when the scheduled task was started. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1614330978000</p>
             */
            public Builder fireTime(String fireTime) {
                this.fireTime = fireTime;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123879546214</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The calling number.</p>
             * 
             * <strong>example:</strong>
             * <p>0571000****</p>
             */
            public Builder resource(String resource) {
                this.resource = resource;
                return this;
            }

            /**
             * <p>The task state. Valid values:</p>
             * <ul>
             * <li><strong>INIT</strong>: The task was in the initial state.</li>
             * <li><strong>RELEASE</strong>: The task was being parsed.</li>
             * <li><strong>RUNNING</strong>: The task was running.</li>
             * <li><strong>STOP</strong>: The task was manually suspended.</li>
             * <li><strong>SYSTEM_STOP</strong>: The task was suspended by the system.</li>
             * <li><strong>CANCEL</strong>: The task was manually canceled.</li>
             * <li><strong>SYSTEM_CANCEL</strong>: The task was canceled by the system.</li>
             * <li><strong>DONE</strong>: The task was complete.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DONE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>This parameter is unavailable.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder stopTime(String stopTime) {
                this.stopTime = stopTime;
                return this;
            }

            /**
             * <p>The task name.</p>
             * 
             * <strong>example:</strong>
             * <p>Aliyun</p>
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * <p>The ID of the voice template.</p>
             * 
             * <strong>example:</strong>
             * <p>TTS_2100****</p>
             */
            public Builder templateCode(String templateCode) {
                this.templateCode = templateCode;
                return this;
            }

            /**
             * <p>The template name.</p>
             * 
             * <strong>example:</strong>
             * <p>Test Template</p>
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * <p>The total number of called numbers.</p>
             * 
             * <strong>example:</strong>
             * <p>600</p>
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
