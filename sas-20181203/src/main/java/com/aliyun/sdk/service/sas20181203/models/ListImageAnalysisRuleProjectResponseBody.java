// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListImageAnalysisRuleProjectResponseBody} extends {@link TeaModel}
 *
 * <p>ListImageAnalysisRuleProjectResponseBody</p>
 */
public class ListImageAnalysisRuleProjectResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Count")
    private Integer count;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TimeCost")
    private Long timeCost;

    private ListImageAnalysisRuleProjectResponseBody(Builder builder) {
        this.code = builder.code;
        this.count = builder.count;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.timeCost = builder.timeCost;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListImageAnalysisRuleProjectResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
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

    /**
     * @return timeCost
     */
    public Long getTimeCost() {
        return this.timeCost;
    }

    public static final class Builder {
        private String code; 
        private Integer count; 
        private java.util.List < Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private Long timeCost; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Count.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
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

        /**
         * TimeCost.
         */
        public Builder timeCost(Long timeCost) {
            this.timeCost = timeCost;
            return this;
        }

        public ListImageAnalysisRuleProjectResponseBody build() {
            return new ListImageAnalysisRuleProjectResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Content")
        private String content;

        @NameInMap("IsCompress")
        private Boolean isCompress;

        @NameInMap("IsEncrypt")
        private Boolean isEncrypt;

        @NameInMap("Name")
        private String name;

        @NameInMap("OutputConfig")
        private String outputConfig;

        @NameInMap("OutputHandler")
        private String outputHandler;

        @NameInMap("Project")
        private String project;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("Version")
        private String version;

        private Data(Builder builder) {
            this.content = builder.content;
            this.isCompress = builder.isCompress;
            this.isEncrypt = builder.isEncrypt;
            this.name = builder.name;
            this.outputConfig = builder.outputConfig;
            this.outputHandler = builder.outputHandler;
            this.project = builder.project;
            this.status = builder.status;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return isCompress
         */
        public Boolean getIsCompress() {
            return this.isCompress;
        }

        /**
         * @return isEncrypt
         */
        public Boolean getIsEncrypt() {
            return this.isEncrypt;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return outputConfig
         */
        public String getOutputConfig() {
            return this.outputConfig;
        }

        /**
         * @return outputHandler
         */
        public String getOutputHandler() {
            return this.outputHandler;
        }

        /**
         * @return project
         */
        public String getProject() {
            return this.project;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String content; 
            private Boolean isCompress; 
            private Boolean isEncrypt; 
            private String name; 
            private String outputConfig; 
            private String outputHandler; 
            private String project; 
            private Integer status; 
            private String version; 

            /**
             * 规则内容
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * 是否gzip压缩
             */
            public Builder isCompress(Boolean isCompress) {
                this.isCompress = isCompress;
                return this;
            }

            /**
             * 是否加密
             */
            public Builder isEncrypt(Boolean isEncrypt) {
                this.isEncrypt = isEncrypt;
                return this;
            }

            /**
             * 规则名称
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * 输出配置
             */
            public Builder outputConfig(String outputConfig) {
                this.outputConfig = outputConfig;
                return this;
            }

            /**
             * 处理handler
             */
            public Builder outputHandler(String outputHandler) {
                this.outputHandler = outputHandler;
                return this;
            }

            /**
             * 项目名称
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * 规则状态
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * 规则版本
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
