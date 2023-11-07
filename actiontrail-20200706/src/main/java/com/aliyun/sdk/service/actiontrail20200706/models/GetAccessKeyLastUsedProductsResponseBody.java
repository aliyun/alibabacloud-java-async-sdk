// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAccessKeyLastUsedProductsResponseBody} extends {@link TeaModel}
 *
 * <p>GetAccessKeyLastUsedProductsResponseBody</p>
 */
public class GetAccessKeyLastUsedProductsResponseBody extends TeaModel {
    @NameInMap("Products")
    @Validation(required = true)
    private java.util.List < Products> products;

    @NameInMap("RequestId")
    @Validation(required = true)
    private String requestId;

    private GetAccessKeyLastUsedProductsResponseBody(Builder builder) {
        this.products = builder.products;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAccessKeyLastUsedProductsResponseBody create() {
        return builder().build();
    }

    /**
     * @return products
     */
    public java.util.List < Products> getProducts() {
        return this.products;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Products> products; 
        private String requestId; 

        /**
         * The list of returned Alibaba Cloud services.
         */
        public Builder products(java.util.List < Products> products) {
            this.products = products;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAccessKeyLastUsedProductsResponseBody build() {
            return new GetAccessKeyLastUsedProductsResponseBody(this);
        } 

    } 

    public static class Products extends TeaModel {
        @NameInMap("Detail")
        private String detail;

        @NameInMap("ServiceName")
        private String serviceName;

        @NameInMap("ServiceNameCn")
        private String serviceNameCn;

        @NameInMap("ServiceNameEn")
        private String serviceNameEn;

        @NameInMap("Source")
        private String source;

        @NameInMap("UsedTimestamp")
        private Long usedTimestamp;

        private Products(Builder builder) {
            this.detail = builder.detail;
            this.serviceName = builder.serviceName;
            this.serviceNameCn = builder.serviceNameCn;
            this.serviceNameEn = builder.serviceNameEn;
            this.source = builder.source;
            this.usedTimestamp = builder.usedTimestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Products create() {
            return builder().build();
        }

        /**
         * @return detail
         */
        public String getDetail() {
            return this.detail;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return serviceNameCn
         */
        public String getServiceNameCn() {
            return this.serviceNameCn;
        }

        /**
         * @return serviceNameEn
         */
        public String getServiceNameEn() {
            return this.serviceNameEn;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return usedTimestamp
         */
        public Long getUsedTimestamp() {
            return this.usedTimestamp;
        }

        public static final class Builder {
            private String detail; 
            private String serviceName; 
            private String serviceNameCn; 
            private String serviceNameEn; 
            private String source; 
            private Long usedTimestamp; 

            /**
             * The event details.
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * The Alibaba Cloud service.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * The Chinese name of the Alibaba Cloud service.
             */
            public Builder serviceNameCn(String serviceNameCn) {
                this.serviceNameCn = serviceNameCn;
                return this;
            }

            /**
             * The English name of the Alibaba Cloud service.
             */
            public Builder serviceNameEn(String serviceNameEn) {
                this.serviceNameEn = serviceNameEn;
                return this;
            }

            /**
             * The event source.
             * <p>
             * 
             * Valid values:
             * 
             * *   Internal
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     other events
             * 
             *     <!-- -->
             * 
             * *   ManagementEvent
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     management events
             * 
             *     <!-- -->
             * 
             * *   DataEvent
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     data events
             * 
             *     <!-- -->
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * A pagination token. It can be used in the next request to retrieve a new page of results. Unit: millisecond.
             */
            public Builder usedTimestamp(Long usedTimestamp) {
                this.usedTimestamp = usedTimestamp;
                return this;
            }

            public Products build() {
                return new Products(this);
            } 

        } 

    }
}
