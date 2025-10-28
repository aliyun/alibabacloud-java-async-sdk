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
 * {@link GetServiceListPageResponseBody} extends {@link TeaModel}
 *
 * <p>GetServiceListPageResponseBody</p>
 */
public class GetServiceListPageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Success")
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

        private Builder(GetServiceListPageResponseBody model) {
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
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The message that is returned for the request.</p>
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

        public GetServiceListPageResponseBody build() {
            return new GetServiceListPageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetServiceListPageResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceListPageResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EdasAppId")
        private String edasAppId;

        @com.aliyun.core.annotation.NameInMap("EdasAppName")
        private String edasAppName;

        @com.aliyun.core.annotation.NameInMap("Group")
        private String group;

        @com.aliyun.core.annotation.NameInMap("InstanceNum")
        private Integer instanceNum;

        @com.aliyun.core.annotation.NameInMap("RegisterType")
        private String registerType;

        @com.aliyun.core.annotation.NameInMap("ServiceId")
        private String serviceId;

        @com.aliyun.core.annotation.NameInMap("ServiceName")
        private String serviceName;

        @com.aliyun.core.annotation.NameInMap("Version")
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

            private Builder() {
            } 

            private Builder(Content model) {
                this.edasAppId = model.edasAppId;
                this.edasAppName = model.edasAppName;
                this.group = model.group;
                this.instanceNum = model.instanceNum;
                this.registerType = model.registerType;
                this.serviceId = model.serviceId;
                this.serviceName = model.serviceName;
                this.version = model.version;
            } 

            /**
             * <p>The ID of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>efbda488-7b33-432f-<strong><strong>-36530047</strong></strong></p>
             */
            public Builder edasAppId(String edasAppId) {
                this.edasAppId = edasAppId;
                return this;
            }

            /**
             * <p>The name of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>k8s-lq-cartservice</p>
             */
            public Builder edasAppName(String edasAppName) {
                this.edasAppName = edasAppName;
                return this;
            }

            /**
             * <p>The service group.</p>
             * 
             * <strong>example:</strong>
             * <p>DUBBO</p>
             */
            public Builder group(String group) {
                this.group = group;
                return this;
            }

            /**
             * <p>The number of instances.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder instanceNum(Integer instanceNum) {
                this.instanceNum = instanceNum;
                return this;
            }

            /**
             * <p>The type of the service registry.</p>
             * 
             * <strong>example:</strong>
             * <p>xx</p>
             */
            public Builder registerType(String registerType) {
                this.registerType = registerType;
                return this;
            }

            /**
             * <p>The ID of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>xx</p>
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * <p>The name of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>com.alibabacloud.hipstershop.CartService</p>
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * <p>The version number.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
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
    /**
     * 
     * {@link GetServiceListPageResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceListPageResponseBody</p>
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
             * <p>The data array that is returned.</p>
             */
            public Builder content(java.util.List<Content> content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The number of entries returned per page.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The total number of returned entries.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
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
