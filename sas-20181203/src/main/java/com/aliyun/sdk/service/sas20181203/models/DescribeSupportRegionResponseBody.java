// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSupportRegionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSupportRegionResponseBody</p>
 */
public class DescribeSupportRegionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SupportRegion")
    private java.util.List < String > supportRegion;

    private DescribeSupportRegionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.supportRegion = builder.supportRegion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSupportRegionResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return supportRegion
     */
    public java.util.List < String > getSupportRegion() {
        return this.supportRegion;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < String > supportRegion; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SupportRegion.
         */
        public Builder supportRegion(java.util.List < String > supportRegion) {
            this.supportRegion = supportRegion;
            return this;
        }

        public DescribeSupportRegionResponseBody build() {
            return new DescribeSupportRegionResponseBody(this);
        } 

    } 

}
