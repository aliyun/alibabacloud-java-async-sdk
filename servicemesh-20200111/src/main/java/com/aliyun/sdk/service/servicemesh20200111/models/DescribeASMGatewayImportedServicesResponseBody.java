// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeASMGatewayImportedServicesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeASMGatewayImportedServicesResponseBody</p>
 */
public class DescribeASMGatewayImportedServicesResponseBody extends TeaModel {
    @NameInMap("ImportedServices")
    private java.util.List < ImportedServices> importedServices;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeASMGatewayImportedServicesResponseBody(Builder builder) {
        this.importedServices = builder.importedServices;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeASMGatewayImportedServicesResponseBody create() {
        return builder().build();
    }

    /**
     * @return importedServices
     */
    public java.util.List < ImportedServices> getImportedServices() {
        return this.importedServices;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < ImportedServices> importedServices; 
        private String requestId; 

        /**
         * ImportedServices.
         */
        public Builder importedServices(java.util.List < ImportedServices> importedServices) {
            this.importedServices = importedServices;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeASMGatewayImportedServicesResponseBody build() {
            return new DescribeASMGatewayImportedServicesResponseBody(this);
        } 

    } 

    public static class ImportedServices extends TeaModel {
        @NameInMap("ServiceName")
        private String serviceName;

        @NameInMap("ServiceNamespace")
        private String serviceNamespace;

        private ImportedServices(Builder builder) {
            this.serviceName = builder.serviceName;
            this.serviceNamespace = builder.serviceNamespace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImportedServices create() {
            return builder().build();
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return serviceNamespace
         */
        public String getServiceNamespace() {
            return this.serviceNamespace;
        }

        public static final class Builder {
            private String serviceName; 
            private String serviceNamespace; 

            /**
             * ServiceName.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * ServiceNamespace.
             */
            public Builder serviceNamespace(String serviceNamespace) {
                this.serviceNamespace = serviceNamespace;
                return this;
            }

            public ImportedServices build() {
                return new ImportedServices(this);
            } 

        } 

    }
}
