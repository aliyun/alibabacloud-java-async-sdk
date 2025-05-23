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
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
             * CheckingStatus.
             */
            public Builder checkingStatus(Integer checkingStatus) {
                this.checkingStatus = checkingStatus;
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
             * CreatorId.
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * ExecuteTime.
             */
            public Builder executeTime(Long executeTime) {
                this.executeTime = executeTime;
                return this;
            }

            /**
             * FromEnvironment.
             */
            public Builder fromEnvironment(Integer fromEnvironment) {
                this.fromEnvironment = fromEnvironment;
                return this;
            }

            /**
             * HandlerId.
             */
            public Builder handlerId(String handlerId) {
                this.handlerId = handlerId;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * ToEnvironment.
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
             * DeployedItems.
             */
            public Builder deployedItems(java.util.List<DeployedItems> deployedItems) {
                this.deployedItems = deployedItems;
                return this;
            }

            /**
             * Deployment.
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
