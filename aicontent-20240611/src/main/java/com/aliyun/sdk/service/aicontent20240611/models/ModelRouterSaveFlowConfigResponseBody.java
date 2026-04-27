// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link ModelRouterSaveFlowConfigResponseBody} extends {@link TeaModel}
 *
 * <p>ModelRouterSaveFlowConfigResponseBody</p>
 */
public class ModelRouterSaveFlowConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("errCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("errMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private ModelRouterSaveFlowConfigResponseBody(Builder builder) {
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelRouterSaveFlowConfigResponseBody create() {
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
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
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
        private String errCode; 
        private String errMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ModelRouterSaveFlowConfigResponseBody model) {
            this.data = model.data;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.httpStatusCode = model.httpStatusCode;
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
         * errMessage.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * httpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * requestId.
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

        public ModelRouterSaveFlowConfigResponseBody build() {
            return new ModelRouterSaveFlowConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ModelRouterSaveFlowConfigResponseBody} extends {@link TeaModel}
     *
     * <p>ModelRouterSaveFlowConfigResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("modelId")
        private Integer modelId;

        @com.aliyun.core.annotation.NameInMap("rpm")
        private Integer rpm;

        @com.aliyun.core.annotation.NameInMap("smoothFlowEnabled")
        private Boolean smoothFlowEnabled;

        @com.aliyun.core.annotation.NameInMap("tpm")
        private Integer tpm;

        private Data(Builder builder) {
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.modelId = builder.modelId;
            this.rpm = builder.rpm;
            this.smoothFlowEnabled = builder.smoothFlowEnabled;
            this.tpm = builder.tpm;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return modelId
         */
        public Integer getModelId() {
            return this.modelId;
        }

        /**
         * @return rpm
         */
        public Integer getRpm() {
            return this.rpm;
        }

        /**
         * @return smoothFlowEnabled
         */
        public Boolean getSmoothFlowEnabled() {
            return this.smoothFlowEnabled;
        }

        /**
         * @return tpm
         */
        public Integer getTpm() {
            return this.tpm;
        }

        public static final class Builder {
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private Integer modelId; 
            private Integer rpm; 
            private Boolean smoothFlowEnabled; 
            private Integer tpm; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.modelId = model.modelId;
                this.rpm = model.rpm;
                this.smoothFlowEnabled = model.smoothFlowEnabled;
                this.tpm = model.tpm;
            } 

            /**
             * gmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * gmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * modelId.
             */
            public Builder modelId(Integer modelId) {
                this.modelId = modelId;
                return this;
            }

            /**
             * rpm.
             */
            public Builder rpm(Integer rpm) {
                this.rpm = rpm;
                return this;
            }

            /**
             * smoothFlowEnabled.
             */
            public Builder smoothFlowEnabled(Boolean smoothFlowEnabled) {
                this.smoothFlowEnabled = smoothFlowEnabled;
                return this;
            }

            /**
             * tpm.
             */
            public Builder tpm(Integer tpm) {
                this.tpm = tpm;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
