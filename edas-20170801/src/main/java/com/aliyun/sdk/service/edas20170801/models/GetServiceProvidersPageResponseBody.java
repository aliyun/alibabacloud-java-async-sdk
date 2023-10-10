// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetServiceProvidersPageResponseBody} extends {@link TeaModel}
 *
 * <p>GetServiceProvidersPageResponseBody</p>
 */
public class GetServiceProvidersPageResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("Success")
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

        /**
         * The HTTP status code that is returned.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The data that is returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The message returned for the request.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Indicates whether the request is successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetServiceProvidersPageResponseBody build() {
            return new GetServiceProvidersPageResponseBody(this);
        } 

    } 

    public static class Content extends TeaModel {
        @NameInMap("Iannotations")
        private String iannotations;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("Port")
        private String port;

        @NameInMap("SerializeType")
        private String serializeType;

        @NameInMap("Timeout")
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

            /**
             * Iannotations.
             */
            public Builder iannotations(String iannotations) {
                this.iannotations = iannotations;
                return this;
            }

            /**
             * The IP address of the service provider.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The port number of the service provider.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * The serialization type.
             */
            public Builder serializeType(String serializeType) {
                this.serializeType = serializeType;
                return this;
            }

            /**
             * The service timeout period.
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
    public static class Data extends TeaModel {
        @NameInMap("Content")
        private java.util.List < Content> content;

        @NameInMap("Size")
        private Integer size;

        @NameInMap("TotalElements")
        private Integer totalElements;

        @NameInMap("TotalPages")
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
        public java.util.List < Content> getContent() {
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
            private java.util.List < Content> content; 
            private Integer size; 
            private Integer totalElements; 
            private Integer totalPages; 

            /**
             * The data array returned.
             */
            public Builder content(java.util.List < Content> content) {
                this.content = content;
                return this;
            }

            /**
             * The number of entries returned per page.
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * The total number of returned entries.
             */
            public Builder totalElements(Integer totalElements) {
                this.totalElements = totalElements;
                return this;
            }

            /**
             * The total number of returned pages.
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
