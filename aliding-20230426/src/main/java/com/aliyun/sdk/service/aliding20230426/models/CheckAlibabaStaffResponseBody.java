// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CheckAlibabaStaffResponseBody} extends {@link TeaModel}
 *
 * <p>CheckAlibabaStaffResponseBody</p>
 */
public class CheckAlibabaStaffResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("isAlibabaStaff")
    private Boolean isAlibabaStaff;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("vendorRequestId")
    private String vendorRequestId;

    @com.aliyun.core.annotation.NameInMap("vendorType")
    private String vendorType;

    private CheckAlibabaStaffResponseBody(Builder builder) {
        this.isAlibabaStaff = builder.isAlibabaStaff;
        this.requestId = builder.requestId;
        this.vendorRequestId = builder.vendorRequestId;
        this.vendorType = builder.vendorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckAlibabaStaffResponseBody create() {
        return builder().build();
    }

    /**
     * @return isAlibabaStaff
     */
    public Boolean getIsAlibabaStaff() {
        return this.isAlibabaStaff;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
        private Boolean isAlibabaStaff; 
        private String requestId; 
        private String vendorRequestId; 
        private String vendorType; 

        /**
         * isAlibabaStaff.
         */
        public Builder isAlibabaStaff(Boolean isAlibabaStaff) {
            this.isAlibabaStaff = isAlibabaStaff;
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

        public CheckAlibabaStaffResponseBody build() {
            return new CheckAlibabaStaffResponseBody(this);
        } 

    } 

}
