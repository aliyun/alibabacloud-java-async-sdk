// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePolicyAdvancedConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePolicyAdvancedConfigResponseBody</p>
 */
public class DescribePolicyAdvancedConfigResponseBody extends TeaModel {
    @NameInMap("InternetSwitch")
    private String internetSwitch;

    @NameInMap("RequestId")
    private String requestId;

    private DescribePolicyAdvancedConfigResponseBody(Builder builder) {
        this.internetSwitch = builder.internetSwitch;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePolicyAdvancedConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return internetSwitch
     */
    public String getInternetSwitch() {
        return this.internetSwitch;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String internetSwitch; 
        private String requestId; 

        /**
         * Indicates whether the strict mode is enabled for the access control policy. Valid values:
         * <p>
         * 
         * *   **on**: The strict mode is enabled.
         * *   **off**: The strict mode is disabled.
         */
        public Builder internetSwitch(String internetSwitch) {
            this.internetSwitch = internetSwitch;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePolicyAdvancedConfigResponseBody build() {
            return new DescribePolicyAdvancedConfigResponseBody(this);
        } 

    } 

}
