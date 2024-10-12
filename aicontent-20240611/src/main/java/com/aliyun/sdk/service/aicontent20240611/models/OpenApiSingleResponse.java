// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link OpenApiSingleResponse} extends {@link TeaModel}
 *
 * <p>OpenApiSingleResponse</p>
 */
public class OpenApiSingleResponse extends Response {
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

    private OpenApiSingleResponse(BuilderImpl builder) {
        super(builder);
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static OpenApiSingleResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
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

    public interface Builder extends Response.Builder<OpenApiSingleResponse, Builder> {

        Builder data(Data data);

        Builder errCode(String errCode);

        Builder errMessage(String errMessage);

        Builder httpStatusCode(Integer httpStatusCode);

        Builder requestId(String requestId);

        Builder success(Boolean success);

        @Override
        OpenApiSingleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OpenApiSingleResponse, Builder>
            implements Builder {
        private Data data; 
        private String errCode; 
        private String errMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OpenApiSingleResponse response) {
            super(response);
            this.data = response.data;
            this.errCode = response.errCode;
            this.errMessage = response.errMessage;
            this.httpStatusCode = response.httpStatusCode;
            this.requestId = response.requestId;
            this.success = response.success;
        } 

        /**
         * data.
         */
        @Override
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * errCode.
         */
        @Override
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * errMessage.
         */
        @Override
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * httpStatusCode.
         */
        @Override
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * requestId.
         */
        @Override
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        @Override
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        @Override
        public OpenApiSingleResponse build() {
            return new OpenApiSingleResponse(this);
        } 

    } 

    /**
     * 
     * {@link OpenApiSingleResponse} extends {@link TeaModel}
     *
     * <p>OpenApiSingleResponse</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("modelTrainStatus")
        private String modelTrainStatus;

        private Data(Builder builder) {
            this.modelTrainStatus = builder.modelTrainStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return modelTrainStatus
         */
        public String getModelTrainStatus() {
            return this.modelTrainStatus;
        }

        public static final class Builder {
            private String modelTrainStatus; 

            /**
             * modelTrainStatus.
             */
            public Builder modelTrainStatus(String modelTrainStatus) {
                this.modelTrainStatus = modelTrainStatus;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
