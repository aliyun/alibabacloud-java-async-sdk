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

        public GetDeploymentResponseBody build() {
            return new GetDeploymentResponseBody(this);
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
    public static class Data extends TeaModel {
        @NameInMap("Deployment")
        private Deployment deployment;

        private Data(Builder builder) {
            this.deployment = builder.deployment;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return deployment
         */
        public Deployment getDeployment() {
            return this.deployment;
        }

        public static final class Builder {
            private Deployment deployment; 

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
