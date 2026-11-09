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
         * <p>The return code. This parameter is empty if the request is successful and data is found. If the query result is empty, NO_DATA is returned. If the request fails, the corresponding error code is returned. For example, if the format of the statistical parameter is invalid, InvalidParameter.DateFormat is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>NO_DATA</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The list of session trend data, sorted in ascending order by hour and minute. If there is no session data on the specified date, an empty array is returned, and the return code is NO_DATA.</p>
         */
        public Builder indexData(java.util.List<IndexData> indexData) {
            this.indexData = indexData;
            return this;
        }

        /**
         * <p>The return message. This parameter is empty if the request is successful. If the request fails, the corresponding error description is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>The parameter DateFormat is invalid.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request, used to locate call records and troubleshoot issues. The example value is partially desensitized.</p>
         * 
         * <strong>example:</strong>
         * <p>D4A13D91-****</p>
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
             * <p>The hour to which the session data belongs. Valid values: 00 to 23 (full hours).</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder hh(String hh) {
                this.hh = hh;
                return this;
            }

            /**
             * <p>The minute to which the session data belongs, aggregated in 10-minute intervals. Valid values: 00 to 50 (specifically 00, 10, 20, 30, 40, and 50).</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder mi(String mi) {
                this.mi = mi;
                return this;
            }

            /**
             * <p>The total number of sessions within the hour and minute interval (10-minute granularity).</p>
             * 
             * <strong>example:</strong>
             * <p>128</p>
             */
            public Builder sessionCntMi(Long sessionCntMi) {
                this.sessionCntMi = sessionCntMi;
                return this;
            }

            /**
             * <p>The statistical date to which the session data belongs, in the yyyyMMdd format, which is the same as the StatDate request parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>20261106</p>
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
