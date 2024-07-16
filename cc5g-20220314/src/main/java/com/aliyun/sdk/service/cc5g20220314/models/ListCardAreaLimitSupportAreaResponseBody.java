// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCardAreaLimitSupportAreaResponseBody} extends {@link TeaModel}
 *
 * <p>ListCardAreaLimitSupportAreaResponseBody</p>
 */
public class ListCardAreaLimitSupportAreaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Provinces")
    private java.util.List < String > provinces;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListCardAreaLimitSupportAreaResponseBody(Builder builder) {
        this.provinces = builder.provinces;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCardAreaLimitSupportAreaResponseBody create() {
        return builder().build();
    }

    /**
     * @return provinces
     */
    public java.util.List < String > getProvinces() {
        return this.provinces;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > provinces; 
        private String requestId; 

        /**
         * Provinces.
         */
        public Builder provinces(java.util.List < String > provinces) {
            this.provinces = provinces;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListCardAreaLimitSupportAreaResponseBody build() {
            return new ListCardAreaLimitSupportAreaResponseBody(this);
        } 

    } 

}
