// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAvailableHoneypotResponseBody} extends {@link TeaModel}
 *
 * <p>ListAvailableHoneypotResponseBody</p>
 */
public class ListAvailableHoneypotResponseBody extends TeaModel {
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

    private ListAvailableHoneypotResponseBody(Builder builder) {
        this.code = builder.code;
        this.count = builder.count;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAvailableHoneypotResponseBody create() {
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

    public static final class Builder {
        private String code; 
        private Integer count; 
        private java.util.List < Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

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

        public ListAvailableHoneypotResponseBody build() {
            return new ListAvailableHoneypotResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("HoneypotImageDisplayName")
        private String honeypotImageDisplayName;

        @NameInMap("HoneypotImageId")
        private String honeypotImageId;

        @NameInMap("HoneypotImageName")
        private String honeypotImageName;

        @NameInMap("HoneypotImageType")
        private String honeypotImageType;

        @NameInMap("HoneypotImageVersion")
        private String honeypotImageVersion;

        @NameInMap("Multiports")
        private String multiports;

        @NameInMap("Proto")
        private String proto;

        @NameInMap("ServicePort")
        private String servicePort;

        @NameInMap("Template")
        private String template;

        private Data(Builder builder) {
            this.honeypotImageDisplayName = builder.honeypotImageDisplayName;
            this.honeypotImageId = builder.honeypotImageId;
            this.honeypotImageName = builder.honeypotImageName;
            this.honeypotImageType = builder.honeypotImageType;
            this.honeypotImageVersion = builder.honeypotImageVersion;
            this.multiports = builder.multiports;
            this.proto = builder.proto;
            this.servicePort = builder.servicePort;
            this.template = builder.template;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return honeypotImageDisplayName
         */
        public String getHoneypotImageDisplayName() {
            return this.honeypotImageDisplayName;
        }

        /**
         * @return honeypotImageId
         */
        public String getHoneypotImageId() {
            return this.honeypotImageId;
        }

        /**
         * @return honeypotImageName
         */
        public String getHoneypotImageName() {
            return this.honeypotImageName;
        }

        /**
         * @return honeypotImageType
         */
        public String getHoneypotImageType() {
            return this.honeypotImageType;
        }

        /**
         * @return honeypotImageVersion
         */
        public String getHoneypotImageVersion() {
            return this.honeypotImageVersion;
        }

        /**
         * @return multiports
         */
        public String getMultiports() {
            return this.multiports;
        }

        /**
         * @return proto
         */
        public String getProto() {
            return this.proto;
        }

        /**
         * @return servicePort
         */
        public String getServicePort() {
            return this.servicePort;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        public static final class Builder {
            private String honeypotImageDisplayName; 
            private String honeypotImageId; 
            private String honeypotImageName; 
            private String honeypotImageType; 
            private String honeypotImageVersion; 
            private String multiports; 
            private String proto; 
            private String servicePort; 
            private String template; 

            /**
             * 蜜罐镜像展示名称
             */
            public Builder honeypotImageDisplayName(String honeypotImageDisplayName) {
                this.honeypotImageDisplayName = honeypotImageDisplayName;
                return this;
            }

            /**
             * 蜜罐镜像ID
             */
            public Builder honeypotImageId(String honeypotImageId) {
                this.honeypotImageId = honeypotImageId;
                return this;
            }

            /**
             * 蜜罐镜像名称
             */
            public Builder honeypotImageName(String honeypotImageName) {
                this.honeypotImageName = honeypotImageName;
                return this;
            }

            /**
             * 蜜罐镜像类型
             */
            public Builder honeypotImageType(String honeypotImageType) {
                this.honeypotImageType = honeypotImageType;
                return this;
            }

            /**
             * 蜜罐镜像版本
             */
            public Builder honeypotImageVersion(String honeypotImageVersion) {
                this.honeypotImageVersion = honeypotImageVersion;
                return this;
            }

            /**
             * 蜜罐支持的端口
             */
            public Builder multiports(String multiports) {
                this.multiports = multiports;
                return this;
            }

            /**
             * 蜜罐支持的协议
             */
            public Builder proto(String proto) {
                this.proto = proto;
                return this;
            }

            /**
             * 蜜罐服务端口
             */
            public Builder servicePort(String servicePort) {
                this.servicePort = servicePort;
                return this;
            }

            /**
             * 蜜罐配置参数模板
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
