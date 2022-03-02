// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link SelectMetaStatus} extends {@link TeaModel}
 *
 * <p>SelectMetaStatus</p>
 */
public class SelectMetaStatus extends TeaModel {
    @NameInMap("ColsCount")
    private Long colsCount;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("Offset")
    private Long offset;

    @NameInMap("RowsCount")
    private Long rowsCount;

    @NameInMap("SplitsCount")
    private Long splitsCount;

    @NameInMap("Status")
    private Long status;

    @NameInMap("TotalScannedBytes")
    private Long totalScannedBytes;

    private SelectMetaStatus(Builder builder) {
        this.colsCount = builder.colsCount;
        this.errorMessage = builder.errorMessage;
        this.offset = builder.offset;
        this.rowsCount = builder.rowsCount;
        this.splitsCount = builder.splitsCount;
        this.status = builder.status;
        this.totalScannedBytes = builder.totalScannedBytes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SelectMetaStatus create() {
        return builder().build();
    }

    /**
     * @return colsCount
     */
    public Long getColsCount() {
        return this.colsCount;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return offset
     */
    public Long getOffset() {
        return this.offset;
    }

    /**
     * @return rowsCount
     */
    public Long getRowsCount() {
        return this.rowsCount;
    }

    /**
     * @return splitsCount
     */
    public Long getSplitsCount() {
        return this.splitsCount;
    }

    /**
     * @return status
     */
    public Long getStatus() {
        return this.status;
    }

    /**
     * @return totalScannedBytes
     */
    public Long getTotalScannedBytes() {
        return this.totalScannedBytes;
    }

    public static final class Builder {
        private Long colsCount; 
        private String errorMessage; 
        private Long offset; 
        private Long rowsCount; 
        private Long splitsCount; 
        private Long status; 
        private Long totalScannedBytes; 

        /**
         * description
         */
        public Builder colsCount(Long colsCount) {
            this.colsCount = colsCount;
            return this;
        }

        /**
         * description
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * description
         */
        public Builder offset(Long offset) {
            this.offset = offset;
            return this;
        }

        /**
         * description
         */
        public Builder rowsCount(Long rowsCount) {
            this.rowsCount = rowsCount;
            return this;
        }

        /**
         * description
         */
        public Builder splitsCount(Long splitsCount) {
            this.splitsCount = splitsCount;
            return this;
        }

        /**
         * description
         */
        public Builder status(Long status) {
            this.status = status;
            return this;
        }

        /**
         * description
         */
        public Builder totalScannedBytes(Long totalScannedBytes) {
            this.totalScannedBytes = totalScannedBytes;
            return this;
        }

        public SelectMetaStatus build() {
            return new SelectMetaStatus(this);
        } 

    } 

}
