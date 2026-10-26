// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20260120.models;

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
 * {@link GetDataMaskingColumnCountResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataMaskingColumnCountResponseBody</p>
 */
public class GetDataMaskingColumnCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ColumnCount")
    private ColumnCount columnCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetDataMaskingColumnCountResponseBody(Builder builder) {
        this.columnCount = builder.columnCount;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataMaskingColumnCountResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return columnCount
     */
    public ColumnCount getColumnCount() {
        return this.columnCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ColumnCount columnCount; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetDataMaskingColumnCountResponseBody model) {
            this.columnCount = model.columnCount;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The statistics on the number of encrypted columns.</p>
         */
        public Builder columnCount(ColumnCount columnCount) {
            this.columnCount = columnCount;
            return this;
        }

        /**
         * <p>The request ID, which can be used to locate the API call.</p>
         * 
         * <strong>example:</strong>
         * <p>7C6D8E9F-1234-5678-ABCD-0123456789AB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDataMaskingColumnCountResponseBody build() {
            return new GetDataMaskingColumnCountResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDataMaskingColumnCountResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataMaskingColumnCountResponseBody</p>
     */
    public static class ColumnCount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaskedCount")
        private Long maskedCount;

        @com.aliyun.core.annotation.NameInMap("MaskingFailedCount")
        private Long maskingFailedCount;

        @com.aliyun.core.annotation.NameInMap("SensitiveCount")
        private Long sensitiveCount;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private ColumnCount(Builder builder) {
            this.maskedCount = builder.maskedCount;
            this.maskingFailedCount = builder.maskingFailedCount;
            this.sensitiveCount = builder.sensitiveCount;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ColumnCount create() {
            return builder().build();
        }

        /**
         * @return maskedCount
         */
        public Long getMaskedCount() {
            return this.maskedCount;
        }

        /**
         * @return maskingFailedCount
         */
        public Long getMaskingFailedCount() {
            return this.maskingFailedCount;
        }

        /**
         * @return sensitiveCount
         */
        public Long getSensitiveCount() {
            return this.sensitiveCount;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Long maskedCount; 
            private Long maskingFailedCount; 
            private Long sensitiveCount; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(ColumnCount model) {
                this.maskedCount = model.maskedCount;
                this.maskingFailedCount = model.maskingFailedCount;
                this.sensitiveCount = model.sensitiveCount;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The number of encrypted columns in the current scope.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder maskedCount(Long maskedCount) {
                this.maskedCount = maskedCount;
                return this;
            }

            /**
             * <p>The number of columns that failed to be encrypted in the current scope.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder maskingFailedCount(Long maskingFailedCount) {
                this.maskingFailedCount = maskingFailedCount;
                return this;
            }

            /**
             * <p>The number of sensitive columns in the current scope.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder sensitiveCount(Long sensitiveCount) {
                this.sensitiveCount = sensitiveCount;
                return this;
            }

            /**
             * <p>The total number of columns in the current scope.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public ColumnCount build() {
                return new ColumnCount(this);
            } 

        } 

    }
}
