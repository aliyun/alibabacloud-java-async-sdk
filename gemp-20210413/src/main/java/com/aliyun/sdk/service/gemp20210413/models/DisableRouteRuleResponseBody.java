// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableRouteRuleResponseBody} extends {@link TeaModel}
 *
 * <p>DisableRouteRuleResponseBody</p>
 */
public class DisableRouteRuleResponseBody extends TeaModel {
    @NameInMap("data")
    private Long data;

    @NameInMap("requestId")
    @Validation(required = true)
    private String requestId;

    private DisableRouteRuleResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableRouteRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Long getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long data; 
        private String requestId; 

        /**
         * C4BE3837-1A13-413B-A225-2C88188E8A43
         */
        public Builder data(Long data) {
            this.data = data;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DisableRouteRuleResponseBody build() {
            return new DisableRouteRuleResponseBody(this);
        } 

    } 

}
