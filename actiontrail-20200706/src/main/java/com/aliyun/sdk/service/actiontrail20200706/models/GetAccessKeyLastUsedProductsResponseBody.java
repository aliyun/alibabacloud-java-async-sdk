// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

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
 * {@link GetAccessKeyLastUsedProductsResponseBody} extends {@link TeaModel}
 *
 * <p>GetAccessKeyLastUsedProductsResponseBody</p>
 */
public class GetAccessKeyLastUsedProductsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Products")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Products> products;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    @com.aliyun.core.annotation.Validation(required = true)
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return products
     */
    public java.util.List<Products> getProducts() {
        return this.products;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Products> products; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetAccessKeyLastUsedProductsResponseBody model) {
            this.products = model.products;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of returned Alibaba Cloud services.</p>
         * <p>This parameter is required.</p>
         */
        public Builder products(java.util.List<Products> products) {
            this.products = products;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>145318BE-DEE1-4C57-AA7C-5BE7D34A6AE0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAccessKeyLastUsedProductsResponseBody build() {
            return new GetAccessKeyLastUsedProductsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAccessKeyLastUsedProductsResponseBody} extends {@link TeaModel}
     *
     * <p>GetAccessKeyLastUsedProductsResponseBody</p>
     */
    public static class Products extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Detail")
        private String detail;

        @com.aliyun.core.annotation.NameInMap("ServiceName")
        private String serviceName;

        @com.aliyun.core.annotation.NameInMap("ServiceNameCn")
        private String serviceNameCn;

        @com.aliyun.core.annotation.NameInMap("ServiceNameEn")
        private String serviceNameEn;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("UsedTimestamp")
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

            private Builder() {
            } 

            private Builder(Products model) {
                this.detail = model.detail;
                this.serviceName = model.serviceName;
                this.serviceNameCn = model.serviceNameCn;
                this.serviceNameEn = model.serviceNameEn;
                this.source = model.source;
                this.usedTimestamp = model.usedTimestamp;
            } 

            /**
             * <p>The event details.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *   &quot;eventId&quot;: &quot;239EB588-CD24-522E-B0B5-174A1A58****&quot;,
             *   &quot;eventVersion&quot;: 1,
             *   &quot;eventSource&quot;: &quot;ecs.cn-hangzhou.aliyuncs.com&quot;,
             *   &quot;sourceIpAddress&quot;: &quot;<code>10.10.**.**</code>&quot;,
             *   &quot;eventType&quot;: &quot;ApiCall&quot;,
             *   &quot;userIdentity&quot;: {
             *     &quot;accountId&quot;: &quot;104758519118****&quot;,
             *     &quot;principalId&quot;: &quot;24549429003625****&quot;,
             *     &quot;type&quot;: &quot;ram-user&quot;,
             *     &quot;userName&quot;: &quot;alice&quot;
             *   },
             *   &quot;serviceName&quot;: &quot;Ecs&quot;,
             *   &quot;apiVersion&quot;: &quot;2016-01-20&quot;,
             *   &quot;requestId&quot;: &quot;239EB588-CD24-522E-B0B5-174A1A588BE0&quot;,
             *   &quot;eventTime&quot;: &quot;2021-08-05T09:21:32Z&quot;,
             *   &quot;isGlobal&quot;: false,
             *   &quot;acsRegion&quot;: &quot;cn-hangzhou&quot;,
             *   &quot;eventName&quot;: &quot;DescribeInstances&quot;
             * }</p>
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * <p>The Alibaba Cloud service.</p>
             * 
             * <strong>example:</strong>
             * <p>Ecs</p>
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * <p>The Chinese name of the Alibaba Cloud service.</p>
             * 
             * <strong>example:</strong>
             * <p>Elastic Compute Service (ECS)</p>
             */
            public Builder serviceNameCn(String serviceNameCn) {
                this.serviceNameCn = serviceNameCn;
                return this;
            }

            /**
             * <p>The English name of the Alibaba Cloud service.</p>
             * 
             * <strong>example:</strong>
             * <p>Elastic Compute Service</p>
             */
            public Builder serviceNameEn(String serviceNameEn) {
                this.serviceNameEn = serviceNameEn;
                return this;
            }

            /**
             * <p>The event source.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>Internal</p>
             * <!-- -->
             * 
             * <p>:</p>
             * <!-- -->
             * 
             * <p>other events</p>
             * <!-- -->
             * </li>
             * <li><p>ManagementEvent</p>
             * <!-- -->
             * 
             * <p>:</p>
             * <!-- -->
             * 
             * <p>management events</p>
             * <!-- -->
             * </li>
             * <li><p>DataEvent</p>
             * <!-- -->
             * 
             * <p>:</p>
             * <!-- -->
             * 
             * <p>data events</p>
             * <!-- --></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ManagementEvent</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>A pagination token. It can be used in the next request to retrieve a new page of results. Unit: millisecond.</p>
             * 
             * <strong>example:</strong>
             * <p>1657247532000</p>
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
