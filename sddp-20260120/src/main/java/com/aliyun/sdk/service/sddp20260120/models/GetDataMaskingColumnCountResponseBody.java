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
         * ColumnCount.
         */
        public Builder columnCount(ColumnCount columnCount) {
            this.columnCount = columnCount;
            return this;
        }

        /**
         * RequestId.
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
             * MaskedCount.
             */
            public Builder maskedCount(Long maskedCount) {
                this.maskedCount = maskedCount;
                return this;
            }

            /**
             * MaskingFailedCount.
             */
            public Builder maskingFailedCount(Long maskingFailedCount) {
                this.maskingFailedCount = maskingFailedCount;
                return this;
            }

            /**
             * SensitiveCount.
             */
            public Builder sensitiveCount(Long sensitiveCount) {
                this.sensitiveCount = sensitiveCount;
                return this;
            }

            /**
             * TotalCount.
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
