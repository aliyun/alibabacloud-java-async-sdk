// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link ListJobsResponseBody} extends {@link TeaModel}
 *
 * <p>ListJobsResponseBody</p>
 */
public class ListJobsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalSize")
    private Integer totalSize;

    private ListJobsResponseBody(Builder builder) {
        this.code = builder.code;
        this.currentPage = builder.currentPage;
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.message = builder.message;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalSize = builder.totalSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListJobsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
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
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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

    /**
     * @return totalSize
     */
    public Integer getTotalSize() {
        return this.totalSize;
    }

    public static final class Builder {
        private String code; 
        private Integer currentPage; 
        private Data data; 
        private String errorCode; 
        private String message; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer totalSize; 

        /**
         * <p>The HTTP status code. Valid values:</p>
         * <ul>
         * <li><strong>2xx</strong>: The call was successful.</li>
         * <li><strong>3xx</strong>: The call was redirected.</li>
         * <li><strong>4xx</strong>: The call failed.</li>
         * <li><strong>5xx</strong>: A server error occurred.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The job templates.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code returned. Take note of the following rules:</p>
         * <ul>
         * <li>If the call is successful, <strong>ErrorCode</strong> is not returned.</li>
         * <li>If the call fails, <strong>ErrorCode</strong> is returned. For more information, see the &quot;<strong>Error codes</strong>&quot; section in this topic.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Null</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The number of entries returned on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B4D805CA-926D-41B1-8E63-7AD0C1ED****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the applications were obtained. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of job templates.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }

        public ListJobsResponseBody build() {
            return new ListJobsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListJobsResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>key</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>value</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListJobsResponseBody</p>
     */
    public static class Applications extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Active")
        private Long active;

        @com.aliyun.core.annotation.NameInMap("AppDescription")
        private String appDescription;

        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("CompletionTime")
        private Long completionTime;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Integer cpu;

        @com.aliyun.core.annotation.NameInMap("Failed")
        private Long failed;

        @com.aliyun.core.annotation.NameInMap("LastChangeorderState")
        private String lastChangeorderState;

        @com.aliyun.core.annotation.NameInMap("LastJobState")
        private String lastJobState;

        @com.aliyun.core.annotation.NameInMap("LastStartTime")
        private Long lastStartTime;

        @com.aliyun.core.annotation.NameInMap("Mem")
        private Integer mem;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("NamespaceId")
        private String namespaceId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Succeeded")
        private Long succeeded;

        @com.aliyun.core.annotation.NameInMap("Suspend")
        private Boolean suspend;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("TriggerConfig")
        private String triggerConfig;

        private Applications(Builder builder) {
            this.active = builder.active;
            this.appDescription = builder.appDescription;
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.completionTime = builder.completionTime;
            this.cpu = builder.cpu;
            this.failed = builder.failed;
            this.lastChangeorderState = builder.lastChangeorderState;
            this.lastJobState = builder.lastJobState;
            this.lastStartTime = builder.lastStartTime;
            this.mem = builder.mem;
            this.message = builder.message;
            this.namespaceId = builder.namespaceId;
            this.regionId = builder.regionId;
            this.succeeded = builder.succeeded;
            this.suspend = builder.suspend;
            this.tags = builder.tags;
            this.triggerConfig = builder.triggerConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Applications create() {
            return builder().build();
        }

        /**
         * @return active
         */
        public Long getActive() {
            return this.active;
        }

        /**
         * @return appDescription
         */
        public String getAppDescription() {
            return this.appDescription;
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return completionTime
         */
        public Long getCompletionTime() {
            return this.completionTime;
        }

        /**
         * @return cpu
         */
        public Integer getCpu() {
            return this.cpu;
        }

        /**
         * @return failed
         */
        public Long getFailed() {
            return this.failed;
        }

        /**
         * @return lastChangeorderState
         */
        public String getLastChangeorderState() {
            return this.lastChangeorderState;
        }

        /**
         * @return lastJobState
         */
        public String getLastJobState() {
            return this.lastJobState;
        }

        /**
         * @return lastStartTime
         */
        public Long getLastStartTime() {
            return this.lastStartTime;
        }

        /**
         * @return mem
         */
        public Integer getMem() {
            return this.mem;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return namespaceId
         */
        public String getNamespaceId() {
            return this.namespaceId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return succeeded
         */
        public Long getSucceeded() {
            return this.succeeded;
        }

        /**
         * @return suspend
         */
        public Boolean getSuspend() {
            return this.suspend;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        /**
         * @return triggerConfig
         */
        public String getTriggerConfig() {
            return this.triggerConfig;
        }

        public static final class Builder {
            private Long active; 
            private String appDescription; 
            private String appId; 
            private String appName; 
            private Long completionTime; 
            private Integer cpu; 
            private Long failed; 
            private String lastChangeorderState; 
            private String lastJobState; 
            private Long lastStartTime; 
            private Integer mem; 
            private String message; 
            private String namespaceId; 
            private String regionId; 
            private Long succeeded; 
            private Boolean suspend; 
            private java.util.List<Tags> tags; 
            private String triggerConfig; 

            /**
             * <p>The number of running instances.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder active(Long active) {
                this.active = active;
                return this;
            }

            /**
             * <p>The description of the job template.</p>
             * 
             * <strong>example:</strong>
             * <p>description</p>
             */
            public Builder appDescription(String appDescription) {
                this.appDescription = appDescription;
                return this;
            }

            /**
             * <p>The ID of the job template.</p>
             * 
             * <strong>example:</strong>
             * <p>f7730764-d88f-4b9a-8d8e-cd8efbfe****</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The name of the job template.</p>
             * 
             * <strong>example:</strong>
             * <p>demo-app</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The time when the job was last completed.</p>
             * 
             * <strong>example:</strong>
             * <p>1657522839</p>
             */
            public Builder completionTime(Long completionTime) {
                this.completionTime = completionTime;
                return this;
            }

            /**
             * Cpu.
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The number of instances that failed to run.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder failed(Long failed) {
                this.failed = failed;
                return this;
            }

            /**
             * <p>Indicates whether the latest change order was executed. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The latest change order failed to be executed.</li>
             * <li><strong>1</strong>: The latest change order was executed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder lastChangeorderState(String lastChangeorderState) {
                this.lastChangeorderState = lastChangeorderState;
                return this;
            }

            /**
             * <p>The running status of the latest job. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The job is not executed.</li>
             * <li><strong>1</strong>: The job was executed.</li>
             * <li><strong>2</strong>: The job failed to be executed.</li>
             * <li><strong>3</strong>: The job is being executed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder lastJobState(String lastJobState) {
                this.lastJobState = lastJobState;
                return this;
            }

            /**
             * <p>The time when the job was last started.</p>
             * 
             * <strong>example:</strong>
             * <p>1657522800</p>
             */
            public Builder lastStartTime(Long lastStartTime) {
                this.lastStartTime = lastStartTime;
                return this;
            }

            /**
             * Mem.
             */
            public Builder mem(Integer mem) {
                this.mem = mem;
                return this;
            }

            /**
             * <p>The returned message.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The namespace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing:demo</p>
             */
            public Builder namespaceId(String namespaceId) {
                this.namespaceId = namespaceId;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The number of instances that were successfully run.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder succeeded(Long succeeded) {
                this.succeeded = succeeded;
                return this;
            }

            /**
             * <p>Indicates whether the job template is suspended.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder suspend(Boolean suspend) {
                this.suspend = suspend;
                return this;
            }

            /**
             * <p>The tag of the job template.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * TriggerConfig.
             */
            public Builder triggerConfig(String triggerConfig) {
                this.triggerConfig = triggerConfig;
                return this;
            }

            public Applications build() {
                return new Applications(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListJobsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Applications")
        private java.util.List<Applications> applications;

        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalSize")
        private Integer totalSize;

        private Data(Builder builder) {
            this.applications = builder.applications;
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalSize = builder.totalSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return applications
         */
        public java.util.List<Applications> getApplications() {
            return this.applications;
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalSize
         */
        public Integer getTotalSize() {
            return this.totalSize;
        }

        public static final class Builder {
            private java.util.List<Applications> applications; 
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalSize; 

            /**
             * <p>The job templates.</p>
             */
            public Builder applications(java.util.List<Applications> applications) {
                this.applications = applications;
                return this;
            }

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of entries returned on each page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of job templates.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder totalSize(Integer totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
