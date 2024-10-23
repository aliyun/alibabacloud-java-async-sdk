// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListFormRemarksResponseBody} extends {@link TeaModel}
 *
 * <p>ListFormRemarksResponseBody</p>
 */
public class ListFormRemarksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("formRemarkVoMap")
    private java.util.Map < String, ? > formRemarkVoMap;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("vendorRequestId")
    private String vendorRequestId;

    @com.aliyun.core.annotation.NameInMap("vendorType")
    private String vendorType;

    private ListFormRemarksResponseBody(Builder builder) {
        this.formRemarkVoMap = builder.formRemarkVoMap;
        this.requestId = builder.requestId;
        this.vendorRequestId = builder.vendorRequestId;
        this.vendorType = builder.vendorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFormRemarksResponseBody create() {
        return builder().build();
    }

    /**
     * @return formRemarkVoMap
     */
    public java.util.Map < String, ? > getFormRemarkVoMap() {
        return this.formRemarkVoMap;
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
        private java.util.Map < String, ? > formRemarkVoMap; 
        private String requestId; 
        private String vendorRequestId; 
        private String vendorType; 

        /**
         * formRemarkVoMap.
         */
        public Builder formRemarkVoMap(java.util.Map < String, ? > formRemarkVoMap) {
            this.formRemarkVoMap = formRemarkVoMap;
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

        public ListFormRemarksResponseBody build() {
            return new ListFormRemarksResponseBody(this);
        } 

    } 

}
