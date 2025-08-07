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
 * {@link InsertDropDownListResponseBody} extends {@link TeaModel}
 *
 * <p>InsertDropDownListResponseBody</p>
 */
public class InsertDropDownListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("a1Notation")
    private String a1Notation;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("vendorRequestId")
    private String vendorRequestId;

    @com.aliyun.core.annotation.NameInMap("vendorType")
    private String vendorType;

    private InsertDropDownListResponseBody(Builder builder) {
        this.a1Notation = builder.a1Notation;
        this.requestId = builder.requestId;
        this.vendorRequestId = builder.vendorRequestId;
        this.vendorType = builder.vendorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InsertDropDownListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return a1Notation
     */
    public String getA1Notation() {
        return this.a1Notation;
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
        private String a1Notation; 
        private String requestId; 
        private String vendorRequestId; 
        private String vendorType; 

        private Builder() {
        } 

        private Builder(InsertDropDownListResponseBody model) {
            this.a1Notation = model.a1Notation;
            this.requestId = model.requestId;
            this.vendorRequestId = model.vendorRequestId;
            this.vendorType = model.vendorType;
        } 

        /**
         * a1Notation.
         */
        public Builder a1Notation(String a1Notation) {
            this.a1Notation = a1Notation;
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

        public InsertDropDownListResponseBody build() {
            return new InsertDropDownListResponseBody(this);
        } 

    } 

}
