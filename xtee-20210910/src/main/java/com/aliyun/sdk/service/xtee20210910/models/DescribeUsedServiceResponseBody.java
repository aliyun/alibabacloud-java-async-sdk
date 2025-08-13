// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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
 * {@link DescribeUsedServiceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUsedServiceResponseBody</p>
 */
public class DescribeUsedServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("records")
    private java.util.List<Records> records;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Records> getRecords() {
        return this.records;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Records> records; 

        private Builder() {
        } 

        private Builder(DescribeUsedServiceResponseBody model) {
            this.requestId = model.requestId;
            this.records = model.records;
        } 

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Record details</p>
         */
        public Builder records(java.util.List<Records> records) {
            this.records = records;
            return this;
        }

        public DescribeUsedServiceResponseBody build() {
            return new DescribeUsedServiceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeUsedServiceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUsedServiceResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Records model) {
                this.enName = model.enName;
                this.name = model.name;
                this.serviceCode = model.serviceCode;
            } 

            /**
             * <p>English name</p>
             * 
             * <strong>example:</strong>
             * <p>account_abuse</p>
             */
            public Builder enName(String enName) {
                this.enName = enName;
                return this;
            }

            /**
             * <p>Service name</p>
             * 
             * <strong>example:</strong>
             * <p>注册风险识别服务</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Service code</p>
             * 
             * <strong>example:</strong>
             * <p>account_abuse</p>
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
