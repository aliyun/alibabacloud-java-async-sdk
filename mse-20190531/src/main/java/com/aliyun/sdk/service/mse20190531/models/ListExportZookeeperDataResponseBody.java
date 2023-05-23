// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListExportZookeeperDataResponseBody} extends {@link TeaModel}
 *
 * <p>ListExportZookeeperDataResponseBody</p>
 */
public class ListExportZookeeperDataResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("DynamicMessage")
    private String dynamicMessage;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("HttpStatusCode")
    private String httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * cluster not found
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * systemError
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * system error
         */
        public Builder httpStatusCode(String httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * mse-200-021
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * mse-100-001
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * illegal request:%s
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListExportZookeeperDataResponseBody build() {
            return new ListExportZookeeperDataResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("ContentMap")
        private String contentMap;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("ExportType")
        private String exportType;

        @NameInMap("Extend")
        private String extend;

        @NameInMap("Id")
        private Integer id;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("KubeoneTaskIds")
        private String kubeoneTaskIds;

        @NameInMap("Status")
        private String status;

        @NameInMap("UpdateTime")
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
             * ContentMap.
             */
            public Builder contentMap(String contentMap) {
                this.contentMap = contentMap;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * ExportType.
             */
            public Builder exportType(String exportType) {
                this.exportType = exportType;
                return this;
            }

            /**
             * Extend.
             */
            public Builder extend(String extend) {
                this.extend = extend;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * KubeoneTaskIds.
             */
            public Builder kubeoneTaskIds(String kubeoneTaskIds) {
                this.kubeoneTaskIds = kubeoneTaskIds;
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
             * UpdateTime.
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
