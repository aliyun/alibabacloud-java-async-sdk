// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

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
 * {@link DescribeASMGatewayImportedServicesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeASMGatewayImportedServicesResponseBody</p>
 */
public class DescribeASMGatewayImportedServicesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ImportedServices")
    private java.util.List<ImportedServices> importedServices;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return importedServices
     */
    public java.util.List<ImportedServices> getImportedServices() {
        return this.importedServices;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<ImportedServices> importedServices; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeASMGatewayImportedServicesResponseBody model) {
            this.importedServices = model.importedServices;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of the imported services.</p>
         */
        public Builder importedServices(java.util.List<ImportedServices> importedServices) {
            this.importedServices = importedServices;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>11fd0027-c27e-41bb-a565-75583054****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeASMGatewayImportedServicesResponseBody build() {
            return new DescribeASMGatewayImportedServicesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeASMGatewayImportedServicesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeASMGatewayImportedServicesResponseBody</p>
     */
    public static class ImportedServices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ServiceName")
        private String serviceName;

        @com.aliyun.core.annotation.NameInMap("ServiceNamespace")
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

            private Builder() {
            } 

            private Builder(ImportedServices model) {
                this.serviceName = model.serviceName;
                this.serviceNamespace = model.serviceNamespace;
            } 

            /**
             * <p>The name of a service.</p>
             * 
             * <strong>example:</strong>
             * <p>productpage</p>
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * <p>The namespace in which the service resides.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
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
