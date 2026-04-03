// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link GetClusterCheckSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>GetClusterCheckSummaryResponseBody</p>
 */
public class GetClusterCheckSummaryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetClusterCheckSummaryResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetClusterCheckSummaryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetClusterCheckSummaryResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Return data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0B48AB3C-84FC-424D-A01D-B9270EF46038</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetClusterCheckSummaryResponseBody build() {
            return new GetClusterCheckSummaryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetClusterCheckSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetClusterCheckSummaryResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NotPassCount")
        private Integer notPassCount;

        @com.aliyun.core.annotation.NameInMap("NotPassHighCount")
        private Integer notPassHighCount;

        @com.aliyun.core.annotation.NameInMap("NotPassLowCount")
        private Integer notPassLowCount;

        @com.aliyun.core.annotation.NameInMap("NotPassMediumCount")
        private Integer notPassMediumCount;

        private Data(Builder builder) {
            this.notPassCount = builder.notPassCount;
            this.notPassHighCount = builder.notPassHighCount;
            this.notPassLowCount = builder.notPassLowCount;
            this.notPassMediumCount = builder.notPassMediumCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return notPassCount
         */
        public Integer getNotPassCount() {
            return this.notPassCount;
        }

        /**
         * @return notPassHighCount
         */
        public Integer getNotPassHighCount() {
            return this.notPassHighCount;
        }

        /**
         * @return notPassLowCount
         */
        public Integer getNotPassLowCount() {
            return this.notPassLowCount;
        }

        /**
         * @return notPassMediumCount
         */
        public Integer getNotPassMediumCount() {
            return this.notPassMediumCount;
        }

        public static final class Builder {
            private Integer notPassCount; 
            private Integer notPassHighCount; 
            private Integer notPassLowCount; 
            private Integer notPassMediumCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.notPassCount = model.notPassCount;
                this.notPassHighCount = model.notPassHighCount;
                this.notPassLowCount = model.notPassLowCount;
                this.notPassMediumCount = model.notPassMediumCount;
            } 

            /**
             * <p>Total number of items that failed the check.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder notPassCount(Integer notPassCount) {
                this.notPassCount = notPassCount;
                return this;
            }

            /**
             * <p>Number of high-risk inspection items that have not passed.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder notPassHighCount(Integer notPassHighCount) {
                this.notPassHighCount = notPassHighCount;
                return this;
            }

            /**
             * <p>Number of low-risk inspection items that have not passed.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder notPassLowCount(Integer notPassLowCount) {
                this.notPassLowCount = notPassLowCount;
                return this;
            }

            /**
             * <p>Number of medium-risk failed inspection items.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder notPassMediumCount(Integer notPassMediumCount) {
                this.notPassMediumCount = notPassMediumCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
