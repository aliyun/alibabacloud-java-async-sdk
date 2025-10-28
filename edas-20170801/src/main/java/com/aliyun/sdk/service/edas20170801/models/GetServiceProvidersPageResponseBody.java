// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link GetServiceProvidersPageResponseBody} extends {@link TeaModel}
 *
 * <p>GetServiceProvidersPageResponseBody</p>
 */
public class GetServiceProvidersPageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetServiceProvidersPageResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceProvidersPageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String message; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetServiceProvidersPageResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.success = model.success;
        } 

        /**
         * <p>The HTTP status code that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data structure.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The message returned for the request.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetServiceProvidersPageResponseBody build() {
            return new GetServiceProvidersPageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetServiceProvidersPageResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceProvidersPageResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Iannotations")
        private String iannotations;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("SerializeType")
        private String serializeType;

        @com.aliyun.core.annotation.NameInMap("Timeout")
        private String timeout;

        private Content(Builder builder) {
            this.iannotations = builder.iannotations;
            this.ip = builder.ip;
            this.port = builder.port;
            this.serializeType = builder.serializeType;
            this.timeout = builder.timeout;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return iannotations
         */
        public String getIannotations() {
            return this.iannotations;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return serializeType
         */
        public String getSerializeType() {
            return this.serializeType;
        }

        /**
         * @return timeout
         */
        public String getTimeout() {
            return this.timeout;
        }

        public static final class Builder {
            private String iannotations; 
            private String ip; 
            private String port; 
            private String serializeType; 
            private String timeout; 

            private Builder() {
            } 

            private Builder(Content model) {
                this.iannotations = model.iannotations;
                this.ip = model.ip;
                this.port = model.port;
                this.serializeType = model.serializeType;
                this.timeout = model.timeout;
            } 

            /**
             * <p>The remarks of the service provider.</p>
             * 
             * <strong>example:</strong>
             * <p>172.178.XX.XX</p>
             */
            public Builder iannotations(String iannotations) {
                this.iannotations = iannotations;
                return this;
            }

            /**
             * <p>The IP address of the service provider.</p>
             * 
             * <strong>example:</strong>
             * <p>10.20.XX.XX</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The port number of the service provider.</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The serialization type.</p>
             * 
             * <strong>example:</strong>
             * <p>hessian2</p>
             */
            public Builder serializeType(String serializeType) {
                this.serializeType = serializeType;
                return this;
            }

            /**
             * <p>The service timeout period.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder timeout(String timeout) {
                this.timeout = timeout;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetServiceProvidersPageResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceProvidersPageResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private java.util.List<Content> content;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Integer size;

        @com.aliyun.core.annotation.NameInMap("TotalElements")
        private Integer totalElements;

        @com.aliyun.core.annotation.NameInMap("TotalPages")
        private Integer totalPages;

        private Data(Builder builder) {
            this.content = builder.content;
            this.size = builder.size;
            this.totalElements = builder.totalElements;
            this.totalPages = builder.totalPages;
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
        public java.util.List<Content> getContent() {
            return this.content;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        /**
         * @return totalElements
         */
        public Integer getTotalElements() {
            return this.totalElements;
        }

        /**
         * @return totalPages
         */
        public Integer getTotalPages() {
            return this.totalPages;
        }

        public static final class Builder {
            private java.util.List<Content> content; 
            private Integer size; 
            private Integer totalElements; 
            private Integer totalPages; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.content = model.content;
                this.size = model.size;
                this.totalElements = model.totalElements;
                this.totalPages = model.totalPages;
            } 

            /**
             * <p>The data array returned.</p>
             */
            public Builder content(java.util.List<Content> content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The number of entries returned per page.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The total number of returned entries.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalElements(Integer totalElements) {
                this.totalElements = totalElements;
                return this;
            }

            /**
             * <p>The total number of returned pages.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalPages(Integer totalPages) {
                this.totalPages = totalPages;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
