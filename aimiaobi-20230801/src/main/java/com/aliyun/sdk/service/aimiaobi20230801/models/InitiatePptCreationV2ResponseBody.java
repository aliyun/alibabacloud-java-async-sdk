// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link InitiatePptCreationV2ResponseBody} extends {@link TeaModel}
 *
 * <p>InitiatePptCreationV2ResponseBody</p>
 */
public class InitiatePptCreationV2ResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private InitiatePptCreationV2ResponseBody(Builder builder) {
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

    public static InitiatePptCreationV2ResponseBody create() {
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
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(InitiatePptCreationV2ResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxx</p>
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

        public InitiatePptCreationV2ResponseBody build() {
            return new InitiatePptCreationV2ResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link InitiatePptCreationV2ResponseBody} extends {@link TeaModel}
     *
     * <p>InitiatePptCreationV2ResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppKey")
        private String appKey;

        @com.aliyun.core.annotation.NameInMap("ExportTaskId")
        private String exportTaskId;

        @com.aliyun.core.annotation.NameInMap("PptArtifactCover")
        private String pptArtifactCover;

        @com.aliyun.core.annotation.NameInMap("PptArtifactId")
        private String pptArtifactId;

        @com.aliyun.core.annotation.NameInMap("PptProcessId")
        private String pptProcessId;

        @com.aliyun.core.annotation.NameInMap("Signature")
        private String signature;

        private Data(Builder builder) {
            this.appKey = builder.appKey;
            this.exportTaskId = builder.exportTaskId;
            this.pptArtifactCover = builder.pptArtifactCover;
            this.pptArtifactId = builder.pptArtifactId;
            this.pptProcessId = builder.pptProcessId;
            this.signature = builder.signature;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appKey
         */
        public String getAppKey() {
            return this.appKey;
        }

        /**
         * @return exportTaskId
         */
        public String getExportTaskId() {
            return this.exportTaskId;
        }

        /**
         * @return pptArtifactCover
         */
        public String getPptArtifactCover() {
            return this.pptArtifactCover;
        }

        /**
         * @return pptArtifactId
         */
        public String getPptArtifactId() {
            return this.pptArtifactId;
        }

        /**
         * @return pptProcessId
         */
        public String getPptProcessId() {
            return this.pptProcessId;
        }

        /**
         * @return signature
         */
        public String getSignature() {
            return this.signature;
        }

        public static final class Builder {
            private String appKey; 
            private String exportTaskId; 
            private String pptArtifactCover; 
            private String pptArtifactId; 
            private String pptProcessId; 
            private String signature; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.appKey = model.appKey;
                this.exportTaskId = model.exportTaskId;
                this.pptArtifactCover = model.pptArtifactCover;
                this.pptArtifactId = model.pptArtifactId;
                this.pptProcessId = model.pptProcessId;
                this.signature = model.signature;
            } 

            /**
             * AppKey.
             */
            public Builder appKey(String appKey) {
                this.appKey = appKey;
                return this;
            }

            /**
             * ExportTaskId.
             */
            public Builder exportTaskId(String exportTaskId) {
                this.exportTaskId = exportTaskId;
                return this;
            }

            /**
             * PptArtifactCover.
             */
            public Builder pptArtifactCover(String pptArtifactCover) {
                this.pptArtifactCover = pptArtifactCover;
                return this;
            }

            /**
             * PptArtifactId.
             */
            public Builder pptArtifactId(String pptArtifactId) {
                this.pptArtifactId = pptArtifactId;
                return this;
            }

            /**
             * PptProcessId.
             */
            public Builder pptProcessId(String pptProcessId) {
                this.pptProcessId = pptProcessId;
                return this;
            }

            /**
             * Signature.
             */
            public Builder signature(String signature) {
                this.signature = signature;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
