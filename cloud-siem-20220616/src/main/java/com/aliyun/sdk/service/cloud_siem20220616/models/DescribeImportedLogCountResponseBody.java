// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

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
 * {@link DescribeImportedLogCountResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImportedLogCountResponseBody</p>
 */
public class DescribeImportedLogCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

        private Builder(DescribeImportedLogCountResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6276D891-*****-55B2-87B9-74D413F7****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeImportedLogCountResponseBody build() {
            return new DescribeImportedLogCountResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeImportedLogCountResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImportedLogCountResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ImportedLogCount")
        private Integer importedLogCount;

        @com.aliyun.core.annotation.NameInMap("TotalLogCount")
        private Integer totalLogCount;

        @com.aliyun.core.annotation.NameInMap("UnImportedLogCount")
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.importedLogCount = model.importedLogCount;
                this.totalLogCount = model.totalLogCount;
                this.unImportedLogCount = model.unImportedLogCount;
            } 

            /**
             * <p>The number of logs that are added.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder importedLogCount(Integer importedLogCount) {
                this.importedLogCount = importedLogCount;
                return this;
            }

            /**
             * <p>The total number of logs.</p>
             * 
             * <strong>example:</strong>
             * <p>59</p>
             */
            public Builder totalLogCount(Integer totalLogCount) {
                this.totalLogCount = totalLogCount;
                return this;
            }

            /**
             * <p>The number of logs that are not added.</p>
             * 
             * <strong>example:</strong>
             * <p>49</p>
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
