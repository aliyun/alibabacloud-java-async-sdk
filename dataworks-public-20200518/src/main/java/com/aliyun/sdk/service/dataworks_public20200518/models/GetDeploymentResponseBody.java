// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDeploymentResponseBody} extends {@link TeaModel}
 *
 * <p>GetDeploymentResponseBody</p>
 */
public class GetDeploymentResponseBody extends TeaModel {
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

    private GetDeploymentResponseBody(Builder builder) {
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

    public static GetDeploymentResponseBody create() {
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
         * The data about the deployment task.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The error code returned.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message returned.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The HTTP status code returned.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The ID of the request. You can troubleshoot errors based on the ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request is successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetDeploymentResponseBody build() {
            return new GetDeploymentResponseBody(this);
        } 

    } 

    public static class DeployedItems extends TeaModel {
        @NameInMap("FileId")
        private Long fileId;

        @NameInMap("FileVersion")
        private Long fileVersion;

        @NameInMap("Status")
        private Integer status;

        private DeployedItems(Builder builder) {
            this.fileId = builder.fileId;
            this.fileVersion = builder.fileVersion;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeployedItems create() {
            return builder().build();
        }

        /**
         * @return fileId
         */
        public Long getFileId() {
            return this.fileId;
        }

        /**
         * @return fileVersion
         */
        public Long getFileVersion() {
            return this.fileVersion;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long fileId; 
            private Long fileVersion; 
            private Integer status; 

            /**
             * FileId.
             */
            public Builder fileId(Long fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * FileVersion.
             */
            public Builder fileVersion(Long fileVersion) {
                this.fileVersion = fileVersion;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public DeployedItems build() {
                return new DeployedItems(this);
            } 

        } 

    }
    public static class Deployment extends TeaModel {
        @NameInMap("CheckingStatus")
        private Integer checkingStatus;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("CreatorId")
        private String creatorId;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("ExecuteTime")
        private Long executeTime;

        @NameInMap("FromEnvironment")
        private Integer fromEnvironment;

        @NameInMap("HandlerId")
        private String handlerId;

        @NameInMap("Name")
        private String name;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("ToEnvironment")
        private Integer toEnvironment;

        private Deployment(Builder builder) {
            this.checkingStatus = builder.checkingStatus;
            this.createTime = builder.createTime;
            this.creatorId = builder.creatorId;
            this.errorMessage = builder.errorMessage;
            this.executeTime = builder.executeTime;
            this.fromEnvironment = builder.fromEnvironment;
            this.handlerId = builder.handlerId;
            this.name = builder.name;
            this.status = builder.status;
            this.toEnvironment = builder.toEnvironment;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Deployment create() {
            return builder().build();
        }

        /**
         * @return checkingStatus
         */
        public Integer getCheckingStatus() {
            return this.checkingStatus;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creatorId
         */
        public String getCreatorId() {
            return this.creatorId;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return executeTime
         */
        public Long getExecuteTime() {
            return this.executeTime;
        }

        /**
         * @return fromEnvironment
         */
        public Integer getFromEnvironment() {
            return this.fromEnvironment;
        }

        /**
         * @return handlerId
         */
        public String getHandlerId() {
            return this.handlerId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return toEnvironment
         */
        public Integer getToEnvironment() {
            return this.toEnvironment;
        }

        public static final class Builder {
            private Integer checkingStatus; 
            private Long createTime; 
            private String creatorId; 
            private String errorMessage; 
            private Long executeTime; 
            private Integer fromEnvironment; 
            private String handlerId; 
            private String name; 
            private Integer status; 
            private Integer toEnvironment; 

            /**
             * The check status of one or more files in the deployment task. If the value of the ToEnvironment parameter is 1, the files can be deployed to the production environment only when the value of the Status parameter is 1 and the CheckingStatus parameter is empty. Valid values:
             * <p>
             * 
             * *   7: The file failed the check.
             * *   8: The file is being checked.
             */
            public Builder checkingStatus(Integer checkingStatus) {
                this.checkingStatus = checkingStatus;
                return this;
            }

            /**
             * The time when the deployment task was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account used by the user who created the deployment task.
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * The error message that was returned when the deployment task failed. In this case, the value of the Status parameter is 2.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * The time when the deployment task was run. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder executeTime(Long executeTime) {
                this.executeTime = executeTime;
                return this;
            }

            /**
             * The environment in which the deployment task was run. Valid values: 0 and 1. A value of 0 indicates the on-premises environment. A value of 1 indicates the development environment.
             */
            public Builder fromEnvironment(Integer fromEnvironment) {
                this.fromEnvironment = fromEnvironment;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account used by the user who ran the deployment task.
             */
            public Builder handlerId(String handlerId) {
                this.handlerId = handlerId;
                return this;
            }

            /**
             * The name of the deployment task. The value is the same as the name of the specific deployment task that is displayed on the Release Package page in the Deploy module.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The status of the deployment task. Valid values: 0, 1, and 2. A value of 0 indicates that the task is ready. A value of 1 indicates that the task was successful. A value of 2 indicates that the task failed.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The environment to which the file was deployed. Valid values: 1 and 2. A value of 1 indicates the development environment. A value of 2 indicates the production environment.
             */
            public Builder toEnvironment(Integer toEnvironment) {
                this.toEnvironment = toEnvironment;
                return this;
            }

            public Deployment build() {
                return new Deployment(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("DeployedItems")
        private java.util.List < DeployedItems> deployedItems;

        @NameInMap("Deployment")
        private Deployment deployment;

        private Data(Builder builder) {
            this.deployedItems = builder.deployedItems;
            this.deployment = builder.deployment;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return deployedItems
         */
        public java.util.List < DeployedItems> getDeployedItems() {
            return this.deployedItems;
        }

        /**
         * @return deployment
         */
        public Deployment getDeployment() {
            return this.deployment;
        }

        public static final class Builder {
            private java.util.List < DeployedItems> deployedItems; 
            private Deployment deployment; 

            /**
             * DeployedItems.
             */
            public Builder deployedItems(java.util.List < DeployedItems> deployedItems) {
                this.deployedItems = deployedItems;
                return this;
            }

            /**
             * The details of the deployment task.
             */
            public Builder deployment(Deployment deployment) {
                this.deployment = deployment;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
