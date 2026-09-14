// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link GetDeploymentPackageResponseBody} extends {@link TeaModel}
 *
 * <p>GetDeploymentPackageResponseBody</p>
 */
public class GetDeploymentPackageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetDeploymentPackageResponseBody(Builder builder) {
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

    public static GetDeploymentPackageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetDeploymentPackageResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The details of the deployment package.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>Invalid.Tenant.ConnectionNotExists</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>You have no permission.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The request ID. You can use this ID to locate logs and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>0bc1ec92159376****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful.</p>
         * <ul>
         * <li><strong>true</strong>: The call was successful.</li>
         * <li><strong>false</strong>: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetDeploymentPackageResponseBody build() {
            return new GetDeploymentPackageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDeploymentPackageResponseBody} extends {@link TeaModel}
     *
     * <p>GetDeploymentPackageResponseBody</p>
     */
    public static class DeployedItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileId")
        private Long fileId;

        @com.aliyun.core.annotation.NameInMap("FileVersion")
        private Long fileVersion;

        @com.aliyun.core.annotation.NameInMap("Status")
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

            private Builder() {
            } 

            private Builder(DeployedItems model) {
                this.fileId = model.fileId;
                this.fileVersion = model.fileVersion;
                this.status = model.status;
            } 

            /**
             * <p>The ID of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>5076****</p>
             */
            public Builder fileId(Long fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * <p>The version of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder fileVersion(Long fileVersion) {
                this.fileVersion = fileVersion;
                return this;
            }

            /**
             * <p>The status of the deployed item. Valid values:</p>
             * <ul>
             * <li>UNPUBLISHED(0): not published</li>
             * <li>SUCCESS(1): published successfully</li>
             * <li>ERROR(2): publishing failed</li>
             * <li>CLONED(3): cloned successfully</li>
             * <li>DEPLOY_ERROR(4): publishing failed</li>
             * <li>CLONING(5): cloning in progress</li>
             * <li>REJECT(6): publishing rejected</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    /**
     * 
     * {@link GetDeploymentPackageResponseBody} extends {@link TeaModel}
     *
     * <p>GetDeploymentPackageResponseBody</p>
     */
    public static class Deployment extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckingStatus")
        private Integer checkingStatus;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("CreatorId")
        private String creatorId;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("ExecuteTime")
        private Long executeTime;

        @com.aliyun.core.annotation.NameInMap("FromEnvironment")
        private Integer fromEnvironment;

        @com.aliyun.core.annotation.NameInMap("HandlerId")
        private String handlerId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("ToEnvironment")
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

            private Builder() {
            } 

            private Builder(Deployment model) {
                this.checkingStatus = model.checkingStatus;
                this.createTime = model.createTime;
                this.creatorId = model.creatorId;
                this.errorMessage = model.errorMessage;
                this.executeTime = model.executeTime;
                this.fromEnvironment = model.fromEnvironment;
                this.handlerId = model.handlerId;
                this.name = model.name;
                this.status = model.status;
                this.toEnvironment = model.toEnvironment;
            } 

            /**
             * <p>The check status of the nodes involved in the deployment package. When the target environment is the development environment (toEnvironment=1), you can publish the file to the production environment only when the Status of the deployment package is 1 and CheckingStatus is empty.</p>
             * <ul>
             * <li>7: The check failed.</li>
             * <li>8: The check is in progress.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder checkingStatus(Integer checkingStatus) {
                this.checkingStatus = checkingStatus;
                return this;
            }

            /**
             * <p>The timestamp when the deployment package was generated, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1593877765000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The Alibaba Cloud user ID of the user who created the deployment package.</p>
             * 
             * <strong>example:</strong>
             * <p>20030****</p>
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * <p>The error message recorded when the deployment package fails to run (status is 2).</p>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The timestamp when the deployment package started to run, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1593877765000</p>
             */
            public Builder executeTime(Long executeTime) {
                this.executeTime = executeTime;
                return this;
            }

            /**
             * <p>The environment from which the deployment is initiated. Valid values:</p>
             * <ul>
             * <li>0: local</li>
             * <li>1: development environment</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder fromEnvironment(Integer fromEnvironment) {
                this.fromEnvironment = fromEnvironment;
                return this;
            }

            /**
             * <p>The Alibaba Cloud user ID of the user who executed the deployment package.</p>
             * 
             * <strong>example:</strong>
             * <p>2003****</p>
             */
            public Builder handlerId(String handlerId) {
                this.handlerId = handlerId;
                return this;
            }

            /**
             * <p>The name of the deployment package, which is displayed on the Task Publish &gt; Deployment Package List page.</p>
             * 
             * <strong>example:</strong>
             * <p>ods_user_info_d-2020-07-04_20030****</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The current status of the deployment package. Valid values:</p>
             * <ul>
             * <li>0: ready</li>
             * <li>1: successful</li>
             * <li>2: failed</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The target environment to which the file information is published. Valid values:</p>
             * <ul>
             * <li>1: development environment</li>
             * <li>2: production environment</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    /**
     * 
     * {@link GetDeploymentPackageResponseBody} extends {@link TeaModel}
     *
     * <p>GetDeploymentPackageResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeployedItems")
        private java.util.List<DeployedItems> deployedItems;

        @com.aliyun.core.annotation.NameInMap("Deployment")
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
        public java.util.List<DeployedItems> getDeployedItems() {
            return this.deployedItems;
        }

        /**
         * @return deployment
         */
        public Deployment getDeployment() {
            return this.deployment;
        }

        public static final class Builder {
            private java.util.List<DeployedItems> deployedItems; 
            private Deployment deployment; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.deployedItems = model.deployedItems;
                this.deployment = model.deployment;
            } 

            /**
             * <p>The details of the deployed items.</p>
             */
            public Builder deployedItems(java.util.List<DeployedItems> deployedItems) {
                this.deployedItems = deployedItems;
                return this;
            }

            /**
             * <p>The details of the deployment package.</p>
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
