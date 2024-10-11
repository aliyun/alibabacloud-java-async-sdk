// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListExportZookeeperDataResponseBody} extends {@link TeaModel}
 *
 * <p>ListExportZookeeperDataResponseBody</p>
 */
public class ListExportZookeeperDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("DynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private String httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListExportZookeeperDataResponseBody(Builder builder) {
        this.data = builder.data;
        this.dynamicMessage = builder.dynamicMessage;
        this.errorCode = builder.errorCode;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListExportZookeeperDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return httpStatusCode
     */
    public String getHttpStatusCode() {
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
        private java.util.List < Data> data; 
        private String dynamicMessage; 
        private String errorCode; 
        private String httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The details of the data.</p>
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The dynamic part in the error message. This parameter is used to replace the **%s** variable in the <strong>ErrMessage</strong> parameter.</p>
         * <blockquote>
         * <p>If the return value of the <strong>ErrMessage</strong> parameter is <strong>The Value of Input Parameter %s is not valid</strong> and the return value of the <strong>DynamicMessage</strong> parameter is <strong>DtsJobId</strong>, the specified <strong>DtsJobId</strong> parameter is invalid.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>The specified parameter is invalid.</p>
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * <p>The error code returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-100-000</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(String httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>The request was successfully processed.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>8BD1E58D-0755-42AC-A599-E6B55112****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The request was successful.</li>
         * <li><code>false</code>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListExportZookeeperDataResponseBody build() {
            return new ListExportZookeeperDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListExportZookeeperDataResponseBody} extends {@link TeaModel}
     *
     * <p>ListExportZookeeperDataResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContentMap")
        private String contentMap;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("ExportType")
        private String exportType;

        @com.aliyun.core.annotation.NameInMap("Extend")
        private String extend;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Integer id;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("KubeoneTaskIds")
        private String kubeoneTaskIds;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        private Data(Builder builder) {
            this.contentMap = builder.contentMap;
            this.createTime = builder.createTime;
            this.exportType = builder.exportType;
            this.extend = builder.extend;
            this.id = builder.id;
            this.instanceId = builder.instanceId;
            this.kubeoneTaskIds = builder.kubeoneTaskIds;
            this.status = builder.status;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return contentMap
         */
        public String getContentMap() {
            return this.contentMap;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return exportType
         */
        public String getExportType() {
            return this.exportType;
        }

        /**
         * @return extend
         */
        public String getExtend() {
            return this.extend;
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return kubeoneTaskIds
         */
        public String getKubeoneTaskIds() {
            return this.kubeoneTaskIds;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String contentMap; 
            private Long createTime; 
            private String exportType; 
            private String extend; 
            private Integer id; 
            private String instanceId; 
            private String kubeoneTaskIds; 
            private String status; 
            private Long updateTime; 

            /**
             * <p>The details of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder contentMap(String contentMap) {
                this.contentMap = contentMap;
                return this;
            }

            /**
             * <p>The time when the task was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1631001140913</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The type of the object that is exported. Valid values:</p>
             * <ul>
             * <li>transactionLog: transaction logs</li>
             * <li>snapshot: snapshots</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>snapshot</p>
             */
            public Builder exportType(String exportType) {
                this.exportType = exportType;
                return this;
            }

            /**
             * <p>The extension information that is in the JSON format. The extension information facilitates addition of parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder extend(String extend) {
                this.extend = extend;
                return this;
            }

            /**
             * <p>The ID of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The ID of the instance</p>
             * 
             * <strong>example:</strong>
             * <p>mse-cn-st21ri2****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The ID of the associated task at the underlying layer. This parameter is used only to troubleshoot failures.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder kubeoneTaskIds(String kubeoneTaskIds) {
                this.kubeoneTaskIds = kubeoneTaskIds;
                return this;
            }

            /**
             * <p>The status of the task. Valid values:</p>
             * <ul>
             * <li>CREATE: The task is being created.</li>
             * <li>RUNNING: The task is being executed.</li>
             * <li>FINISH: The task is completed.</li>
             * <li>FAILED: The task failed.</li>
             * <li>EXPIRE: The task has expired.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>FINISH</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The time when the task was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>1632979237663</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
