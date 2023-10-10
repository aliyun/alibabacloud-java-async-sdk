// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetServiceListPageResponseBody} extends {@link TeaModel}
 *
 * <p>GetServiceListPageResponseBody</p>
 */
public class GetServiceListPageResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("Success")
    private Boolean success;

    private GetServiceListPageResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceListPageResponseBody create() {
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
         * The returned data.
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

        public GetServiceListPageResponseBody build() {
            return new GetServiceListPageResponseBody(this);
        } 

    } 

    public static class Content extends TeaModel {
        @NameInMap("EdasAppId")
        private String edasAppId;

        @NameInMap("EdasAppName")
        private String edasAppName;

        @NameInMap("Group")
        private String group;

        @NameInMap("InstanceNum")
        private Integer instanceNum;

        @NameInMap("RegisterType")
        private String registerType;

        @NameInMap("ServiceId")
        private String serviceId;

        @NameInMap("ServiceName")
        private String serviceName;

        @NameInMap("Version")
        private String version;

        private Content(Builder builder) {
            this.edasAppId = builder.edasAppId;
            this.edasAppName = builder.edasAppName;
            this.group = builder.group;
            this.instanceNum = builder.instanceNum;
            this.registerType = builder.registerType;
            this.serviceId = builder.serviceId;
            this.serviceName = builder.serviceName;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return edasAppId
         */
        public String getEdasAppId() {
            return this.edasAppId;
        }

        /**
         * @return edasAppName
         */
        public String getEdasAppName() {
            return this.edasAppName;
        }

        /**
         * @return group
         */
        public String getGroup() {
            return this.group;
        }

        /**
         * @return instanceNum
         */
        public Integer getInstanceNum() {
            return this.instanceNum;
        }

        /**
         * @return registerType
         */
        public String getRegisterType() {
            return this.registerType;
        }

        /**
         * @return serviceId
         */
        public String getServiceId() {
            return this.serviceId;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String edasAppId; 
            private String edasAppName; 
            private String group; 
            private Integer instanceNum; 
            private String registerType; 
            private String serviceId; 
            private String serviceName; 
            private String version; 

            /**
             * The ID of the application.
             */
            public Builder edasAppId(String edasAppId) {
                this.edasAppId = edasAppId;
                return this;
            }

            /**
             * The name of the application.
             */
            public Builder edasAppName(String edasAppName) {
                this.edasAppName = edasAppName;
                return this;
            }

            /**
             * The service group.
             */
            public Builder group(String group) {
                this.group = group;
                return this;
            }

            /**
             * The number of instances.
             */
            public Builder instanceNum(Integer instanceNum) {
                this.instanceNum = instanceNum;
                return this;
            }

            /**
             * The type of the service registry.
             */
            public Builder registerType(String registerType) {
                this.registerType = registerType;
                return this;
            }

            /**
             * The ID of the service.
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * The name of the service.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * The version number.
             */
            public Builder version(String version) {
                this.version = version;
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
