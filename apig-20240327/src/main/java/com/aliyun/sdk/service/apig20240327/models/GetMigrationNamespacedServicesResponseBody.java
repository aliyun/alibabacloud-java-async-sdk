// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link GetMigrationNamespacedServicesResponseBody} extends {@link TeaModel}
 *
 * <p>GetMigrationNamespacedServicesResponseBody</p>
 */
public class GetMigrationNamespacedServicesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetMigrationNamespacedServicesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMigrationNamespacedServicesResponseBody create() {
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetMigrationNamespacedServicesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetMigrationNamespacedServicesResponseBody build() {
            return new GetMigrationNamespacedServicesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMigrationNamespacedServicesResponseBody} extends {@link TeaModel}
     *
     * <p>GetMigrationNamespacedServicesResponseBody</p>
     */
    public static class Services extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("slbId")
        private String slbId;

        private Services(Builder builder) {
            this.name = builder.name;
            this.slbId = builder.slbId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Services create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return slbId
         */
        public String getSlbId() {
            return this.slbId;
        }

        public static final class Builder {
            private String name; 
            private String slbId; 

            private Builder() {
            } 

            private Builder(Services model) {
                this.name = model.name;
                this.slbId = model.slbId;
            } 

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * slbId.
             */
            public Builder slbId(String slbId) {
                this.slbId = slbId;
                return this;
            }

            public Services build() {
                return new Services(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetMigrationNamespacedServicesResponseBody} extends {@link TeaModel}
     *
     * <p>GetMigrationNamespacedServicesResponseBody</p>
     */
    public static class NamespacedServices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("services")
        private java.util.List<Services> services;

        private NamespacedServices(Builder builder) {
            this.namespace = builder.namespace;
            this.services = builder.services;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NamespacedServices create() {
            return builder().build();
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return services
         */
        public java.util.List<Services> getServices() {
            return this.services;
        }

        public static final class Builder {
            private String namespace; 
            private java.util.List<Services> services; 

            private Builder() {
            } 

            private Builder(NamespacedServices model) {
                this.namespace = model.namespace;
                this.services = model.services;
            } 

            /**
             * namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * services.
             */
            public Builder services(java.util.List<Services> services) {
                this.services = services;
                return this;
            }

            public NamespacedServices build() {
                return new NamespacedServices(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetMigrationNamespacedServicesResponseBody} extends {@link TeaModel}
     *
     * <p>GetMigrationNamespacedServicesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("namespacedServices")
        private java.util.List<NamespacedServices> namespacedServices;

        private Data(Builder builder) {
            this.namespacedServices = builder.namespacedServices;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return namespacedServices
         */
        public java.util.List<NamespacedServices> getNamespacedServices() {
            return this.namespacedServices;
        }

        public static final class Builder {
            private java.util.List<NamespacedServices> namespacedServices; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.namespacedServices = model.namespacedServices;
            } 

            /**
             * namespacedServices.
             */
            public Builder namespacedServices(java.util.List<NamespacedServices> namespacedServices) {
                this.namespacedServices = namespacedServices;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
