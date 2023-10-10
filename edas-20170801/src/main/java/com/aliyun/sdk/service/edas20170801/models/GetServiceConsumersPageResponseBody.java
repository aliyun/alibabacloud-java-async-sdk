// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetServiceConsumersPageResponseBody} extends {@link TeaModel}
 *
 * <p>GetServiceConsumersPageResponseBody</p>
 */
public class GetServiceConsumersPageResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("Success")
    private Boolean success;

    private GetServiceConsumersPageResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceConsumersPageResponseBody create() {
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
         * The message that is returned for the request.
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

        public GetServiceConsumersPageResponseBody build() {
            return new GetServiceConsumersPageResponseBody(this);
        } 

    } 

    public static class Content extends TeaModel {
        @NameInMap("EdasAppName")
        private String edasAppName;

        @NameInMap("EdassAppId")
        private String edassAppId;

        @NameInMap("Ip")
        private String ip;

        private Content(Builder builder) {
            this.edasAppName = builder.edasAppName;
            this.edassAppId = builder.edassAppId;
            this.ip = builder.ip;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return edasAppName
         */
        public String getEdasAppName() {
            return this.edasAppName;
        }

        /**
         * @return edassAppId
         */
        public String getEdassAppId() {
            return this.edassAppId;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        public static final class Builder {
            private String edasAppName; 
            private String edassAppId; 
            private String ip; 

            /**
             * The name of the service consumer.
             */
            public Builder edasAppName(String edasAppName) {
                this.edasAppName = edasAppName;
                return this;
            }

            /**
             * The ID of the service consumer.
             */
            public Builder edassAppId(String edassAppId) {
                this.edassAppId = edassAppId;
                return this;
            }

            /**
             * The IP address of the service consumer.
             */
            public Builder ip(String ip) {
                this.ip = ip;
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
             * The data array that is returned.
             */
            public Builder content(java.util.List < Content> content) {
                this.content = content;
                return this;
            }

            /**
             * The number of entries to return on each page.
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
