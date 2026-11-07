// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link QuerySessionDataResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySessionDataResponseBody</p>
 */
public class QuerySessionDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("IndexData")
    private java.util.List<IndexData> indexData;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QuerySessionDataResponseBody(Builder builder) {
        this.code = builder.code;
        this.indexData = builder.indexData;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySessionDataResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return indexData
     */
    public java.util.List<IndexData> getIndexData() {
        return this.indexData;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<IndexData> indexData; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(QuerySessionDataResponseBody model) {
            this.code = model.code;
            this.indexData = model.indexData;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * IndexData.
         */
        public Builder indexData(java.util.List<IndexData> indexData) {
            this.indexData = indexData;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QuerySessionDataResponseBody build() {
            return new QuerySessionDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QuerySessionDataResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySessionDataResponseBody</p>
     */
    public static class IndexData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Hh")
        private String hh;

        @com.aliyun.core.annotation.NameInMap("Mi")
        private String mi;

        @com.aliyun.core.annotation.NameInMap("SessionCntMi")
        private Long sessionCntMi;

        @com.aliyun.core.annotation.NameInMap("StatDate")
        private String statDate;

        private IndexData(Builder builder) {
            this.hh = builder.hh;
            this.mi = builder.mi;
            this.sessionCntMi = builder.sessionCntMi;
            this.statDate = builder.statDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IndexData create() {
            return builder().build();
        }

        /**
         * @return hh
         */
        public String getHh() {
            return this.hh;
        }

        /**
         * @return mi
         */
        public String getMi() {
            return this.mi;
        }

        /**
         * @return sessionCntMi
         */
        public Long getSessionCntMi() {
            return this.sessionCntMi;
        }

        /**
         * @return statDate
         */
        public String getStatDate() {
            return this.statDate;
        }

        public static final class Builder {
            private String hh; 
            private String mi; 
            private Long sessionCntMi; 
            private String statDate; 

            private Builder() {
            } 

            private Builder(IndexData model) {
                this.hh = model.hh;
                this.mi = model.mi;
                this.sessionCntMi = model.sessionCntMi;
                this.statDate = model.statDate;
            } 

            /**
             * Hh.
             */
            public Builder hh(String hh) {
                this.hh = hh;
                return this;
            }

            /**
             * Mi.
             */
            public Builder mi(String mi) {
                this.mi = mi;
                return this;
            }

            /**
             * SessionCntMi.
             */
            public Builder sessionCntMi(Long sessionCntMi) {
                this.sessionCntMi = sessionCntMi;
                return this;
            }

            /**
             * StatDate.
             */
            public Builder statDate(String statDate) {
                this.statDate = statDate;
                return this;
            }

            public IndexData build() {
                return new IndexData(this);
            } 

        } 

    }
}
