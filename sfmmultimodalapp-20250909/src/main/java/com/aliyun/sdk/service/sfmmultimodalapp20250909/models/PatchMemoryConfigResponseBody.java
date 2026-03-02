// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sfmmultimodalapp20250909.models;

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
 * {@link PatchMemoryConfigResponseBody} extends {@link TeaModel}
 *
 * <p>PatchMemoryConfigResponseBody</p>
 */
public class PatchMemoryConfigResponseBody extends TeaModel {
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

    private PatchMemoryConfigResponseBody(Builder builder) {
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

    public static PatchMemoryConfigResponseBody create() {
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

        private Builder(PatchMemoryConfigResponseBody model) {
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

        public PatchMemoryConfigResponseBody build() {
            return new PatchMemoryConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link PatchMemoryConfigResponseBody} extends {@link TeaModel}
     *
     * <p>PatchMemoryConfigResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AutoUpdate")
        private Boolean autoUpdate;

        @com.aliyun.core.annotation.NameInMap("ExpirationTime")
        private Integer expirationTime;

        @com.aliyun.core.annotation.NameInMap("Prompt")
        private String prompt;

        @com.aliyun.core.annotation.NameInMap("Threshold")
        private Double threshold;

        @com.aliyun.core.annotation.NameInMap("TopK")
        private Integer topK;

        @com.aliyun.core.annotation.NameInMap("UserDefinedId")
        private String userDefinedId;

        @com.aliyun.core.annotation.NameInMap("WorkspaceId")
        private String workspaceId;

        private Data(Builder builder) {
            this.appId = builder.appId;
            this.autoUpdate = builder.autoUpdate;
            this.expirationTime = builder.expirationTime;
            this.prompt = builder.prompt;
            this.threshold = builder.threshold;
            this.topK = builder.topK;
            this.userDefinedId = builder.userDefinedId;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return autoUpdate
         */
        public Boolean getAutoUpdate() {
            return this.autoUpdate;
        }

        /**
         * @return expirationTime
         */
        public Integer getExpirationTime() {
            return this.expirationTime;
        }

        /**
         * @return prompt
         */
        public String getPrompt() {
            return this.prompt;
        }

        /**
         * @return threshold
         */
        public Double getThreshold() {
            return this.threshold;
        }

        /**
         * @return topK
         */
        public Integer getTopK() {
            return this.topK;
        }

        /**
         * @return userDefinedId
         */
        public String getUserDefinedId() {
            return this.userDefinedId;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private String appId; 
            private Boolean autoUpdate; 
            private Integer expirationTime; 
            private String prompt; 
            private Double threshold; 
            private Integer topK; 
            private String userDefinedId; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.appId = model.appId;
                this.autoUpdate = model.autoUpdate;
                this.expirationTime = model.expirationTime;
                this.prompt = model.prompt;
                this.threshold = model.threshold;
                this.topK = model.topK;
                this.userDefinedId = model.userDefinedId;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * AutoUpdate.
             */
            public Builder autoUpdate(Boolean autoUpdate) {
                this.autoUpdate = autoUpdate;
                return this;
            }

            /**
             * ExpirationTime.
             */
            public Builder expirationTime(Integer expirationTime) {
                this.expirationTime = expirationTime;
                return this;
            }

            /**
             * Prompt.
             */
            public Builder prompt(String prompt) {
                this.prompt = prompt;
                return this;
            }

            /**
             * Threshold.
             */
            public Builder threshold(Double threshold) {
                this.threshold = threshold;
                return this;
            }

            /**
             * TopK.
             */
            public Builder topK(Integer topK) {
                this.topK = topK;
                return this;
            }

            /**
             * UserDefinedId.
             */
            public Builder userDefinedId(String userDefinedId) {
                this.userDefinedId = userDefinedId;
                return this;
            }

            /**
             * WorkspaceId.
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
