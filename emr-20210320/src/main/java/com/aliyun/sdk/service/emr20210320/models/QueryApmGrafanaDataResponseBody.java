// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryApmGrafanaDataResponseBody} extends {@link TeaModel}
 *
 * <p>QueryApmGrafanaDataResponseBody</p>
 */
public class QueryApmGrafanaDataResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private QueryApmGrafanaDataResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryApmGrafanaDataResponseBody create() {
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
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * 请求ID。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryApmGrafanaDataResponseBody build() {
            return new QueryApmGrafanaDataResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("QueryGrafanaData")
        private String queryGrafanaData;

        private Data(Builder builder) {
            this.queryGrafanaData = builder.queryGrafanaData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return queryGrafanaData
         */
        public String getQueryGrafanaData() {
            return this.queryGrafanaData;
        }

        public static final class Builder {
            private String queryGrafanaData; 

            /**
             * QueryGrafanaData.
             */
            public Builder queryGrafanaData(String queryGrafanaData) {
                this.queryGrafanaData = queryGrafanaData;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
