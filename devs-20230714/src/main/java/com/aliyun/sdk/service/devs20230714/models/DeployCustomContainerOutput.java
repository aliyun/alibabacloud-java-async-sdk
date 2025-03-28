// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

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
 * {@link DeployCustomContainerOutput} extends {@link TeaModel}
 *
 * <p>DeployCustomContainerOutput</p>
 */
public class DeployCustomContainerOutput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("errCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("errMsg")
    private String errMsg;

    @com.aliyun.core.annotation.NameInMap("requestId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private DeployCustomContainerOutput(Builder builder) {
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMsg = builder.errMsg;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeployCustomContainerOutput create() {
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
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMsg
     */
    public String getErrMsg() {
        return this.errMsg;
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
        private String errCode; 
        private String errMsg; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DeployCustomContainerOutput model) {
            this.data = model.data;
            this.errCode = model.errCode;
            this.errMsg = model.errMsg;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * errCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * errMsg.
         */
        public Builder errMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DeployCustomContainerOutput build() {
            return new DeployCustomContainerOutput(this);
        } 

    } 

    /**
     * 
     * {@link DeployCustomContainerOutput} extends {@link TeaModel}
     *
     * <p>DeployCustomContainerOutput</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("deploymentTaskID")
        private String deploymentTaskID;

        @com.aliyun.core.annotation.NameInMap("errorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("finished")
        private Boolean finished;

        @com.aliyun.core.annotation.NameInMap("nasConfigStr")
        private String nasConfigStr;

        @com.aliyun.core.annotation.NameInMap("serviceName")
        private String serviceName;

        @com.aliyun.core.annotation.NameInMap("traceID")
        private String traceID;

        @com.aliyun.core.annotation.NameInMap("urlInternet")
        private String urlInternet;

        @com.aliyun.core.annotation.NameInMap("urlIntranet")
        private String urlIntranet;

        @com.aliyun.core.annotation.NameInMap("vpcConfigStr")
        private String vpcConfigStr;

        private Data(Builder builder) {
            this.deploymentTaskID = builder.deploymentTaskID;
            this.errorMessage = builder.errorMessage;
            this.finished = builder.finished;
            this.nasConfigStr = builder.nasConfigStr;
            this.serviceName = builder.serviceName;
            this.traceID = builder.traceID;
            this.urlInternet = builder.urlInternet;
            this.urlIntranet = builder.urlIntranet;
            this.vpcConfigStr = builder.vpcConfigStr;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return deploymentTaskID
         */
        public String getDeploymentTaskID() {
            return this.deploymentTaskID;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return finished
         */
        public Boolean getFinished() {
            return this.finished;
        }

        /**
         * @return nasConfigStr
         */
        public String getNasConfigStr() {
            return this.nasConfigStr;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return traceID
         */
        public String getTraceID() {
            return this.traceID;
        }

        /**
         * @return urlInternet
         */
        public String getUrlInternet() {
            return this.urlInternet;
        }

        /**
         * @return urlIntranet
         */
        public String getUrlIntranet() {
            return this.urlIntranet;
        }

        /**
         * @return vpcConfigStr
         */
        public String getVpcConfigStr() {
            return this.vpcConfigStr;
        }

        public static final class Builder {
            private String deploymentTaskID; 
            private String errorMessage; 
            private Boolean finished; 
            private String nasConfigStr; 
            private String serviceName; 
            private String traceID; 
            private String urlInternet; 
            private String urlIntranet; 
            private String vpcConfigStr; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.deploymentTaskID = model.deploymentTaskID;
                this.errorMessage = model.errorMessage;
                this.finished = model.finished;
                this.nasConfigStr = model.nasConfigStr;
                this.serviceName = model.serviceName;
                this.traceID = model.traceID;
                this.urlInternet = model.urlInternet;
                this.urlIntranet = model.urlIntranet;
                this.vpcConfigStr = model.vpcConfigStr;
            } 

            /**
             * deploymentTaskID.
             */
            public Builder deploymentTaskID(String deploymentTaskID) {
                this.deploymentTaskID = deploymentTaskID;
                return this;
            }

            /**
             * errorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * finished.
             */
            public Builder finished(Boolean finished) {
                this.finished = finished;
                return this;
            }

            /**
             * nasConfigStr.
             */
            public Builder nasConfigStr(String nasConfigStr) {
                this.nasConfigStr = nasConfigStr;
                return this;
            }

            /**
             * serviceName.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * traceID.
             */
            public Builder traceID(String traceID) {
                this.traceID = traceID;
                return this;
            }

            /**
             * urlInternet.
             */
            public Builder urlInternet(String urlInternet) {
                this.urlInternet = urlInternet;
                return this;
            }

            /**
             * urlIntranet.
             */
            public Builder urlIntranet(String urlIntranet) {
                this.urlIntranet = urlIntranet;
                return this;
            }

            /**
             * vpcConfigStr.
             */
            public Builder vpcConfigStr(String vpcConfigStr) {
                this.vpcConfigStr = vpcConfigStr;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
