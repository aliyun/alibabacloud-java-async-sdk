// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

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
 * {@link ExecuteBatchTaskResponseBody} extends {@link TeaModel}
 *
 * <p>ExecuteBatchTaskResponseBody</p>
 */
public class ExecuteBatchTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("failNumber")
    private Integer failNumber;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("successNumber")
    private Integer successNumber;

    @com.aliyun.core.annotation.NameInMap("total")
    private Integer total;

    @com.aliyun.core.annotation.NameInMap("vendorRequestId")
    private String vendorRequestId;

    @com.aliyun.core.annotation.NameInMap("vendorType")
    private String vendorType;

    private ExecuteBatchTaskResponseBody(Builder builder) {
        this.failNumber = builder.failNumber;
        this.requestId = builder.requestId;
        this.successNumber = builder.successNumber;
        this.total = builder.total;
        this.vendorRequestId = builder.vendorRequestId;
        this.vendorType = builder.vendorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteBatchTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return failNumber
     */
    public Integer getFailNumber() {
        return this.failNumber;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return successNumber
     */
    public Integer getSuccessNumber() {
        return this.successNumber;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    /**
     * @return vendorRequestId
     */
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    /**
     * @return vendorType
     */
    public String getVendorType() {
        return this.vendorType;
    }

    public static final class Builder {
        private Integer failNumber; 
        private String requestId; 
        private Integer successNumber; 
        private Integer total; 
        private String vendorRequestId; 
        private String vendorType; 

        /**
         * failNumber.
         */
        public Builder failNumber(Integer failNumber) {
            this.failNumber = failNumber;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * successNumber.
         */
        public Builder successNumber(Integer successNumber) {
            this.successNumber = successNumber;
            return this;
        }

        /**
         * total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        /**
         * vendorRequestId.
         */
        public Builder vendorRequestId(String vendorRequestId) {
            this.vendorRequestId = vendorRequestId;
            return this;
        }

        /**
         * vendorType.
         */
        public Builder vendorType(String vendorType) {
            this.vendorType = vendorType;
            return this;
        }

        public ExecuteBatchTaskResponseBody build() {
            return new ExecuteBatchTaskResponseBody(this);
        } 

    } 

}
