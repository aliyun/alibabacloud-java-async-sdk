// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImportedLogCountResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImportedLogCountResponseBody</p>
 */
public class DescribeImportedLogCountResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeImportedLogCountResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImportedLogCountResponseBody create() {
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

        public DescribeImportedLogCountResponseBody build() {
            return new DescribeImportedLogCountResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("ImportedLogCount")
        private Integer importedLogCount;

        @NameInMap("TotalLogCount")
        private Integer totalLogCount;

        @NameInMap("UnImportedLogCount")
        private Integer unImportedLogCount;

        private Data(Builder builder) {
            this.importedLogCount = builder.importedLogCount;
            this.totalLogCount = builder.totalLogCount;
            this.unImportedLogCount = builder.unImportedLogCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return importedLogCount
         */
        public Integer getImportedLogCount() {
            return this.importedLogCount;
        }

        /**
         * @return totalLogCount
         */
        public Integer getTotalLogCount() {
            return this.totalLogCount;
        }

        /**
         * @return unImportedLogCount
         */
        public Integer getUnImportedLogCount() {
            return this.unImportedLogCount;
        }

        public static final class Builder {
            private Integer importedLogCount; 
            private Integer totalLogCount; 
            private Integer unImportedLogCount; 

            /**
             * ImportedLogCount.
             */
            public Builder importedLogCount(Integer importedLogCount) {
                this.importedLogCount = importedLogCount;
                return this;
            }

            /**
             * TotalLogCount.
             */
            public Builder totalLogCount(Integer totalLogCount) {
                this.totalLogCount = totalLogCount;
                return this;
            }

            /**
             * UnImportedLogCount.
             */
            public Builder unImportedLogCount(Integer unImportedLogCount) {
                this.unImportedLogCount = unImportedLogCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
