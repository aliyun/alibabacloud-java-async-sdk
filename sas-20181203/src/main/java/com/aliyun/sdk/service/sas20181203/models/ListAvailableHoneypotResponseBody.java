// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ListAvailableHoneypotResponseBody} extends {@link TeaModel}
 *
 * <p>ListAvailableHoneypotResponseBody</p>
 */
public class ListAvailableHoneypotResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
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
        private java.util.List<Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListAvailableHoneypotResponseBody model) {
            this.code = model.code;
            this.count = model.count;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The status code returned. The status code <strong>200</strong> indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The number of images that are used for the honeypot.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>An array consisting of the information about the images that are used for the honeypot.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The error message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>6C24D883-984D-52FD-BB66-5F89F86E4837</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request was successful.</li>
         * <li><strong>false</strong>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListAvailableHoneypotResponseBody build() {
            return new ListAvailableHoneypotResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAvailableHoneypotResponseBody} extends {@link TeaModel}
     *
     * <p>ListAvailableHoneypotResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HoneypotImageDisplayName")
        private String honeypotImageDisplayName;

        @com.aliyun.core.annotation.NameInMap("HoneypotImageId")
        private String honeypotImageId;

        @com.aliyun.core.annotation.NameInMap("HoneypotImageName")
        private String honeypotImageName;

        @com.aliyun.core.annotation.NameInMap("HoneypotImageType")
        private String honeypotImageType;

        @com.aliyun.core.annotation.NameInMap("HoneypotImageVersion")
        private String honeypotImageVersion;

        @com.aliyun.core.annotation.NameInMap("Multiports")
        private String multiports;

        @com.aliyun.core.annotation.NameInMap("Proto")
        private String proto;

        @com.aliyun.core.annotation.NameInMap("ServicePort")
        private String servicePort;

        @com.aliyun.core.annotation.NameInMap("Template")
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.honeypotImageDisplayName = model.honeypotImageDisplayName;
                this.honeypotImageId = model.honeypotImageId;
                this.honeypotImageName = model.honeypotImageName;
                this.honeypotImageType = model.honeypotImageType;
                this.honeypotImageVersion = model.honeypotImageVersion;
                this.multiports = model.multiports;
                this.proto = model.proto;
                this.servicePort = model.servicePort;
                this.template = model.template;
            } 

            /**
             * <p>The display name of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>RuoYi</p>
             */
            public Builder honeypotImageDisplayName(String honeypotImageDisplayName) {
                this.honeypotImageDisplayName = honeypotImageDisplayName;
                return this;
            }

            /**
             * <p>The ID of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>sha256:007095d6de9c7a343e9fc1f74a7efc9c5de9d5454789d2fa505a1b3fc62****</p>
             */
            public Builder honeypotImageId(String honeypotImageId) {
                this.honeypotImageId = honeypotImageId;
                return this;
            }

            /**
             * <p>The name of the image that is used for the honeypot.</p>
             * 
             * <strong>example:</strong>
             * <p>ruoyi</p>
             */
            public Builder honeypotImageName(String honeypotImageName) {
                this.honeypotImageName = honeypotImageName;
                return this;
            }

            /**
             * <p>The type of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>Web</p>
             */
            public Builder honeypotImageType(String honeypotImageType) {
                this.honeypotImageType = honeypotImageType;
                return this;
            }

            /**
             * <p>The version of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.2</p>
             */
            public Builder honeypotImageVersion(String honeypotImageVersion) {
                this.honeypotImageVersion = honeypotImageVersion;
                return this;
            }

            /**
             * <p>The port that is supported by the honeypot. The value is in the JSON format. Valid values:</p>
             * <ul>
             * <li><strong>log_type</strong>: the log type</li>
             * <li><strong>proto</strong>: the supported protocol</li>
             * <li><strong>description</strong>: the description</li>
             * <li><strong>ports</strong>: the supported ports</li>
             * <li><strong>port_str</strong>: the supported port number of the string type</li>
             * <li><strong>type</strong>: the type</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;log_type&quot;:&quot;web&quot;,&quot;proto&quot;:&quot;tcp&quot;,&quot;description&quot;:&quot;webServerPort&quot;,&quot;ports&quot;:[80.0],&quot;port_str&quot;:&quot;80&quot;,&quot;type&quot;:&quot;web&quot;}]</p>
             */
            public Builder multiports(String multiports) {
                this.multiports = multiports;
                return this;
            }

            /**
             * <p>The protocol that is supported by the honeypot.</p>
             * 
             * <strong>example:</strong>
             * <p>tcp</p>
             */
            public Builder proto(String proto) {
                this.proto = proto;
                return this;
            }

            /**
             * <p>The service port of the honeypot.</p>
             * 
             * <strong>example:</strong>
             * <p>27017.0</p>
             */
            public Builder servicePort(String servicePort) {
                this.servicePort = servicePort;
                return this;
            }

            /**
             * <p>The configuration template of the honeypot.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
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
