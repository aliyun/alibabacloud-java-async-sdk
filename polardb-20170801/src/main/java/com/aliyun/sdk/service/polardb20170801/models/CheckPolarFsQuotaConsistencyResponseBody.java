// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link CheckPolarFsQuotaConsistencyResponseBody} extends {@link TeaModel}
 *
 * <p>CheckPolarFsQuotaConsistencyResponseBody</p>
 */
public class CheckPolarFsQuotaConsistencyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PolarFsInstanceId")
    private String polarFsInstanceId;

    @com.aliyun.core.annotation.NameInMap("QuotaItem")
    private QuotaItem quotaItem;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CheckPolarFsQuotaConsistencyResponseBody(Builder builder) {
        this.polarFsInstanceId = builder.polarFsInstanceId;
        this.quotaItem = builder.quotaItem;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckPolarFsQuotaConsistencyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return polarFsInstanceId
     */
    public String getPolarFsInstanceId() {
        return this.polarFsInstanceId;
    }

    /**
     * @return quotaItem
     */
    public QuotaItem getQuotaItem() {
        return this.quotaItem;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String polarFsInstanceId; 
        private QuotaItem quotaItem; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CheckPolarFsQuotaConsistencyResponseBody model) {
            this.polarFsInstanceId = model.polarFsInstanceId;
            this.quotaItem = model.quotaItem;
            this.requestId = model.requestId;
        } 

        /**
         * PolarFsInstanceId.
         */
        public Builder polarFsInstanceId(String polarFsInstanceId) {
            this.polarFsInstanceId = polarFsInstanceId;
            return this;
        }

        /**
         * QuotaItem.
         */
        public Builder quotaItem(QuotaItem quotaItem) {
            this.quotaItem = quotaItem;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CheckPolarFsQuotaConsistencyResponseBody build() {
            return new CheckPolarFsQuotaConsistencyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CheckPolarFsQuotaConsistencyResponseBody} extends {@link TeaModel}
     *
     * <p>CheckPolarFsQuotaConsistencyResponseBody</p>
     */
    public static class QuotaItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Capacity")
        private Long capacity;

        @com.aliyun.core.annotation.NameInMap("Inodes")
        private Long inodes;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("UsedCapacity")
        private Long usedCapacity;

        @com.aliyun.core.annotation.NameInMap("UsedInodes")
        private Long usedInodes;

        private QuotaItem(Builder builder) {
            this.capacity = builder.capacity;
            this.inodes = builder.inodes;
            this.path = builder.path;
            this.usedCapacity = builder.usedCapacity;
            this.usedInodes = builder.usedInodes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QuotaItem create() {
            return builder().build();
        }

        /**
         * @return capacity
         */
        public Long getCapacity() {
            return this.capacity;
        }

        /**
         * @return inodes
         */
        public Long getInodes() {
            return this.inodes;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return usedCapacity
         */
        public Long getUsedCapacity() {
            return this.usedCapacity;
        }

        /**
         * @return usedInodes
         */
        public Long getUsedInodes() {
            return this.usedInodes;
        }

        public static final class Builder {
            private Long capacity; 
            private Long inodes; 
            private String path; 
            private Long usedCapacity; 
            private Long usedInodes; 

            private Builder() {
            } 

            private Builder(QuotaItem model) {
                this.capacity = model.capacity;
                this.inodes = model.inodes;
                this.path = model.path;
                this.usedCapacity = model.usedCapacity;
                this.usedInodes = model.usedInodes;
            } 

            /**
             * Capacity.
             */
            public Builder capacity(Long capacity) {
                this.capacity = capacity;
                return this;
            }

            /**
             * <p>Inodes</p>
             * 
             * <strong>example:</strong>
             * <p>50000</p>
             */
            public Builder inodes(Long inodes) {
                this.inodes = inodes;
                return this;
            }

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * UsedCapacity.
             */
            public Builder usedCapacity(Long usedCapacity) {
                this.usedCapacity = usedCapacity;
                return this;
            }

            /**
             * UsedInodes.
             */
            public Builder usedInodes(Long usedInodes) {
                this.usedInodes = usedInodes;
                return this;
            }

            public QuotaItem build() {
                return new QuotaItem(this);
            } 

        } 

    }
}
