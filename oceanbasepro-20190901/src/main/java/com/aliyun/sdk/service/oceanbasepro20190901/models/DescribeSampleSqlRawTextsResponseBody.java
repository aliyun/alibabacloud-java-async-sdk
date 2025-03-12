// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

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
 * {@link DescribeSampleSqlRawTextsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSampleSqlRawTextsResponseBody</p>
 */
public class DescribeSampleSqlRawTextsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeSampleSqlRawTextsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSampleSqlRawTextsResponseBody create() {
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeSampleSqlRawTextsResponseBody build() {
            return new DescribeSampleSqlRawTextsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSampleSqlRawTextsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSampleSqlRawTextsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SqlText")
        private java.util.List<String> sqlText;

        private Data(Builder builder) {
            this.sqlText = builder.sqlText;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return sqlText
         */
        public java.util.List<String> getSqlText() {
            return this.sqlText;
        }

        public static final class Builder {
            private java.util.List<String> sqlText; 

            /**
             * SqlText.
             */
            public Builder sqlText(java.util.List<String> sqlText) {
                this.sqlText = sqlText;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
