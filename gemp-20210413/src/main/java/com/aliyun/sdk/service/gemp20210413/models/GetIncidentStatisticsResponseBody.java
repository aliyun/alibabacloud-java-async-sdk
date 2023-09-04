// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetIncidentStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>GetIncidentStatisticsResponseBody</p>
 */
public class GetIncidentStatisticsResponseBody extends TeaModel {
    @NameInMap("data")
    private Data data;

    @NameInMap("requestId")
    private String requestId;

    private GetIncidentStatisticsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIncidentStatisticsResponseBody create() {
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
         * data
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * requestId
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetIncidentStatisticsResponseBody build() {
            return new GetIncidentStatisticsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("allFinish")
        private Integer allFinish;

        @NameInMap("allResponse")
        private Integer allResponse;

        @NameInMap("myFinish")
        private Integer myFinish;

        @NameInMap("myResponse")
        private Integer myResponse;

        private Data(Builder builder) {
            this.allFinish = builder.allFinish;
            this.allResponse = builder.allResponse;
            this.myFinish = builder.myFinish;
            this.myResponse = builder.myResponse;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return allFinish
         */
        public Integer getAllFinish() {
            return this.allFinish;
        }

        /**
         * @return allResponse
         */
        public Integer getAllResponse() {
            return this.allResponse;
        }

        /**
         * @return myFinish
         */
        public Integer getMyFinish() {
            return this.myFinish;
        }

        /**
         * @return myResponse
         */
        public Integer getMyResponse() {
            return this.myResponse;
        }

        public static final class Builder {
            private Integer allFinish; 
            private Integer allResponse; 
            private Integer myFinish; 
            private Integer myResponse; 

            /**
             * allFinish.
             */
            public Builder allFinish(Integer allFinish) {
                this.allFinish = allFinish;
                return this;
            }

            /**
             * allResponse.
             */
            public Builder allResponse(Integer allResponse) {
                this.allResponse = allResponse;
                return this;
            }

            /**
             * myFinish.
             */
            public Builder myFinish(Integer myFinish) {
                this.myFinish = myFinish;
                return this;
            }

            /**
             * myResponse.
             */
            public Builder myResponse(Integer myResponse) {
                this.myResponse = myResponse;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
