// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link QuerySessionInfoResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySessionInfoResponseBody</p>
 */
public class QuerySessionInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("queryResourceInfoList")
    private java.util.List<QueryResourceInfoList> queryResourceInfoList;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("total")
    private Long total;

    private QuerySessionInfoResponseBody(Builder builder) {
        this.queryResourceInfoList = builder.queryResourceInfoList;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySessionInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return queryResourceInfoList
     */
    public java.util.List<QueryResourceInfoList> getQueryResourceInfoList() {
        return this.queryResourceInfoList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List<QueryResourceInfoList> queryResourceInfoList; 
        private String requestId; 
        private Long total; 

        /**
         * queryResourceInfoList.
         */
        public Builder queryResourceInfoList(java.util.List<QueryResourceInfoList> queryResourceInfoList) {
            this.queryResourceInfoList = queryResourceInfoList;
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
         * total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public QuerySessionInfoResponseBody build() {
            return new QuerySessionInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QuerySessionInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySessionInfoResponseBody</p>
     */
    public static class QueryResourceInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("sessionId")
        private String sessionId;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private QueryResourceInfoList(Builder builder) {
            this.sessionId = builder.sessionId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueryResourceInfoList create() {
            return builder().build();
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String sessionId; 
            private String status; 

            /**
             * sessionId.
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public QueryResourceInfoList build() {
                return new QueryResourceInfoList(this);
            } 

        } 

    }
}
