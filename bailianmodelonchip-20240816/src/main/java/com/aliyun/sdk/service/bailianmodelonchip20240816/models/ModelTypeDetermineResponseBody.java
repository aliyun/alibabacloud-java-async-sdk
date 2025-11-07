// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailianmodelonchip20240816.models;

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
 * {@link ModelTypeDetermineResponseBody} extends {@link TeaModel}
 *
 * <p>ModelTypeDetermineResponseBody</p>
 */
public class ModelTypeDetermineResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private String success;

    private ModelTypeDetermineResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelTypeDetermineResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
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
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private String success; 

        private Builder() {
        } 

        private Builder(ModelTypeDetermineResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
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
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>7B0FC4BC-9E4B-5AD7-9D35-6559BDC0788E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public ModelTypeDetermineResponseBody build() {
            return new ModelTypeDetermineResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ModelTypeDetermineResponseBody} extends {@link TeaModel}
     *
     * <p>ModelTypeDetermineResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("followUp")
        private Boolean followUp;

        @com.aliyun.core.annotation.NameInMap("rewriteText")
        private String rewriteText;

        @com.aliyun.core.annotation.NameInMap("vl")
        private Boolean vl;

        private Data(Builder builder) {
            this.followUp = builder.followUp;
            this.rewriteText = builder.rewriteText;
            this.vl = builder.vl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return followUp
         */
        public Boolean getFollowUp() {
            return this.followUp;
        }

        /**
         * @return rewriteText
         */
        public String getRewriteText() {
            return this.rewriteText;
        }

        /**
         * @return vl
         */
        public Boolean getVl() {
            return this.vl;
        }

        public static final class Builder {
            private Boolean followUp; 
            private String rewriteText; 
            private Boolean vl; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.followUp = model.followUp;
                this.rewriteText = model.rewriteText;
                this.vl = model.vl;
            } 

            /**
             * followUp.
             */
            public Builder followUp(Boolean followUp) {
                this.followUp = followUp;
                return this;
            }

            /**
             * rewriteText.
             */
            public Builder rewriteText(String rewriteText) {
                this.rewriteText = rewriteText;
                return this;
            }

            /**
             * vl.
             */
            public Builder vl(Boolean vl) {
                this.vl = vl;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
