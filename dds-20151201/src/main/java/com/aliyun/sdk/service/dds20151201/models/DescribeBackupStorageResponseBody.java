// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupStorageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupStorageResponseBody</p>
 */
public class DescribeBackupStorageResponseBody extends TeaModel {
    @NameInMap("FreeSize")
    private Long freeSize;

    @NameInMap("FullStorageSize")
    private Long fullStorageSize;

    @NameInMap("LogStorageSize")
    private Long logStorageSize;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeBackupStorageResponseBody(Builder builder) {
        this.freeSize = builder.freeSize;
        this.fullStorageSize = builder.fullStorageSize;
        this.logStorageSize = builder.logStorageSize;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackupStorageResponseBody create() {
        return builder().build();
    }

    /**
     * @return freeSize
     */
    public Long getFreeSize() {
        return this.freeSize;
    }

    /**
     * @return fullStorageSize
     */
    public Long getFullStorageSize() {
        return this.fullStorageSize;
    }

    /**
     * @return logStorageSize
     */
    public Long getLogStorageSize() {
        return this.logStorageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long freeSize; 
        private Long fullStorageSize; 
        private Long logStorageSize; 
        private String requestId; 

        /**
         * FreeSize.
         */
        public Builder freeSize(Long freeSize) {
            this.freeSize = freeSize;
            return this;
        }

        /**
         * FullStorageSize.
         */
        public Builder fullStorageSize(Long fullStorageSize) {
            this.fullStorageSize = fullStorageSize;
            return this;
        }

        /**
         * LogStorageSize.
         */
        public Builder logStorageSize(Long logStorageSize) {
            this.logStorageSize = logStorageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeBackupStorageResponseBody build() {
            return new DescribeBackupStorageResponseBody(this);
        } 

    } 

}
