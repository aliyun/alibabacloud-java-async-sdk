// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableRouteRuleResponseBody} extends {@link TeaModel}
 *
 * <p>EnableRouteRuleResponseBody</p>
 */
public class EnableRouteRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Integer data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private EnableRouteRuleResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableRouteRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Integer getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer data; 
        private String requestId; 

        /**
         * data.
         */
        public Builder data(Integer data) {
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

        public EnableRouteRuleResponseBody build() {
            return new EnableRouteRuleResponseBody(this);
        } 

    } 

}
