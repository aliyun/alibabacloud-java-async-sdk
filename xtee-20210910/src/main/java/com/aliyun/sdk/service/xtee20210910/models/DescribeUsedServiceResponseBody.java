// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUsedServiceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUsedServiceResponseBody</p>
 */
public class DescribeUsedServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("records")
    private java.util.List < Records> records;

    private DescribeUsedServiceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.records = builder.records;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUsedServiceResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return records
     */
    public java.util.List < Records> getRecords() {
        return this.records;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Records> records; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * records.
         */
        public Builder records(java.util.List < Records> records) {
            this.records = records;
            return this;
        }

        public DescribeUsedServiceResponseBody build() {
            return new DescribeUsedServiceResponseBody(this);
        } 

    } 

    public static class Records extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enName")
        private String enName;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("serviceCode")
        private String serviceCode;

        private Records(Builder builder) {
            this.enName = builder.enName;
            this.name = builder.name;
            this.serviceCode = builder.serviceCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return enName
         */
        public String getEnName() {
            return this.enName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return serviceCode
         */
        public String getServiceCode() {
            return this.serviceCode;
        }

        public static final class Builder {
            private String enName; 
            private String name; 
            private String serviceCode; 

            /**
             * enName.
             */
            public Builder enName(String enName) {
                this.enName = enName;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * serviceCode.
             */
            public Builder serviceCode(String serviceCode) {
                this.serviceCode = serviceCode;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
}
