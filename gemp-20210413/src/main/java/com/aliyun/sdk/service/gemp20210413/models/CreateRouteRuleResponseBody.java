// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRouteRuleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRouteRuleResponseBody</p>
 */
public class CreateRouteRuleResponseBody extends TeaModel {
    @NameInMap("data")
    private Data data;

    @NameInMap("requestId")
    private String requestId;

    private CreateRouteRuleResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRouteRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * 结果
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * 请求
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateRouteRuleResponseBody build() {
            return new CreateRouteRuleResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("routeRuleId")
        private Long routeRuleId;

        private Data(Builder builder) {
            this.routeRuleId = builder.routeRuleId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return routeRuleId
         */
        public Long getRouteRuleId() {
            return this.routeRuleId;
        }

        public static final class Builder {
            private Long routeRuleId; 

            /**
             * 规则ID
             */
            public Builder routeRuleId(Long routeRuleId) {
                this.routeRuleId = routeRuleId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
