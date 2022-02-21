// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20180713.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOrderInstanceListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOrderInstanceListResponseBody</p>
 */
public class DescribeOrderInstanceListResponseBody extends TeaModel {
    @NameInMap("OrderList")
    private java.util.List < OrderList> orderList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeOrderInstanceListResponseBody(Builder builder) {
        this.orderList = builder.orderList;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOrderInstanceListResponseBody create() {
        return builder().build();
    }

    /**
     * @return orderList
     */
    public java.util.List < OrderList> getOrderList() {
        return this.orderList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < OrderList> orderList; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * OrderList.
         */
        public Builder orderList(java.util.List < OrderList> orderList) {
            this.orderList = orderList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeOrderInstanceListResponseBody build() {
            return new DescribeOrderInstanceListResponseBody(this);
        } 

    } 

    public static class OrderList extends TeaModel {
        @NameInMap("CertType")
        private String certType;

        @NameInMap("Id")
        private Long id;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Source")
        private String source;

        @NameInMap("Status")
        private String status;

        private OrderList(Builder builder) {
            this.certType = builder.certType;
            this.id = builder.id;
            this.instanceId = builder.instanceId;
            this.source = builder.source;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrderList create() {
            return builder().build();
        }

        /**
         * @return certType
         */
        public String getCertType() {
            return this.certType;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String certType; 
            private Long id; 
            private String instanceId; 
            private String source; 
            private String status; 

            /**
             * CertType.
             */
            public Builder certType(String certType) {
                this.certType = certType;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public OrderList build() {
                return new OrderList(this);
            } 

        } 

    }
}
