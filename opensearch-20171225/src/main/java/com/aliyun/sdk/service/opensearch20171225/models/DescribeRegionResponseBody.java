// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRegionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRegionResponseBody</p>
 */
public class DescribeRegionResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    @NameInMap("result")
    private Result result;

    private DescribeRegionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRegionResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The result that was returned.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public DescribeRegionResponseBody build() {
            return new DescribeRegionResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("config")
        private java.util.Map < String, ? > config;

        @NameInMap("regionId")
        private String regionId;

        private Result(Builder builder) {
            this.config = builder.config;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public java.util.Map < String, ? > getConfig() {
            return this.config;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private java.util.Map < String, ? > config; 
            private String regionId; 

            /**
             * The configurations.
             */
            public Builder config(java.util.Map < String, ? > config) {
                this.config = config;
                return this;
            }

            /**
             * The ID of the region. Valid values:
             * <p>
             * 
             * cn-hangzhou: China (Hangzhou)
             * 
             * cn-shanghai: China (Shanghai)
             * 
             * cn-qingdao: China (Qingdao)
             * 
             * cn-beijing: China (Beijing)
             * 
             * cn-zhangjiakou: China (Zhangjiakou)
             * 
             * cn-shenzhen: China (Shenzhen)
             * 
             * ap-southeast-1: Singapore (Singapore)
             * 
             * cn-internal: Internal Center
             * 
             * cn-zhangbei-in: Internal Center (Zhangjiakou)
             * 
             * us-west-1-in: Internal Center (US)
             * 
             * rus-west-1-in: Internal Center (Russia)
             * 
             * cn-daily: Daily Environment
             * 
             * cn-test: Joint Debugging
             * 
             * pre-hangzhou: China (Hangzhou)-Staging
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
