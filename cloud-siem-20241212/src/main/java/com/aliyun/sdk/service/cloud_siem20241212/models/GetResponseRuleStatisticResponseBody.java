// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link GetResponseRuleStatisticResponseBody} extends {@link TeaModel}
 *
 * <p>GetResponseRuleStatisticResponseBody</p>
 */
public class GetResponseRuleStatisticResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResponseStatistic")
    private ResponseStatistic responseStatistic;

    private GetResponseRuleStatisticResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.responseStatistic = builder.responseStatistic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResponseRuleStatisticResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return responseStatistic
     */
    public ResponseStatistic getResponseStatistic() {
        return this.responseStatistic;
    }

    public static final class Builder {
        private String requestId; 
        private ResponseStatistic responseStatistic; 

        private Builder() {
        } 

        private Builder(GetResponseRuleStatisticResponseBody model) {
            this.requestId = model.requestId;
            this.responseStatistic = model.responseStatistic;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResponseStatistic.
         */
        public Builder responseStatistic(ResponseStatistic responseStatistic) {
            this.responseStatistic = responseStatistic;
            return this;
        }

        public GetResponseRuleStatisticResponseBody build() {
            return new GetResponseRuleStatisticResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetResponseRuleStatisticResponseBody} extends {@link TeaModel}
     *
     * <p>GetResponseRuleStatisticResponseBody</p>
     */
    public static class ResponseStatistic extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResponseRuleAllCount")
        private Integer responseRuleAllCount;

        @com.aliyun.core.annotation.NameInMap("ResponseRuleOnlineCount")
        private Integer responseRuleOnlineCount;

        private ResponseStatistic(Builder builder) {
            this.responseRuleAllCount = builder.responseRuleAllCount;
            this.responseRuleOnlineCount = builder.responseRuleOnlineCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResponseStatistic create() {
            return builder().build();
        }

        /**
         * @return responseRuleAllCount
         */
        public Integer getResponseRuleAllCount() {
            return this.responseRuleAllCount;
        }

        /**
         * @return responseRuleOnlineCount
         */
        public Integer getResponseRuleOnlineCount() {
            return this.responseRuleOnlineCount;
        }

        public static final class Builder {
            private Integer responseRuleAllCount; 
            private Integer responseRuleOnlineCount; 

            private Builder() {
            } 

            private Builder(ResponseStatistic model) {
                this.responseRuleAllCount = model.responseRuleAllCount;
                this.responseRuleOnlineCount = model.responseRuleOnlineCount;
            } 

            /**
             * ResponseRuleAllCount.
             */
            public Builder responseRuleAllCount(Integer responseRuleAllCount) {
                this.responseRuleAllCount = responseRuleAllCount;
                return this;
            }

            /**
             * ResponseRuleOnlineCount.
             */
            public Builder responseRuleOnlineCount(Integer responseRuleOnlineCount) {
                this.responseRuleOnlineCount = responseRuleOnlineCount;
                return this;
            }

            public ResponseStatistic build() {
                return new ResponseStatistic(this);
            } 

        } 

    }
}
