// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_dbaudit20191209.models;

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
 * {@link DescribeInstanceStorageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceStorageResponseBody</p>
 */
public class DescribeInstanceStorageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceStorages")
    private java.util.List<InstanceStorages> instanceStorages;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeInstanceStorageResponseBody(Builder builder) {
        this.instanceStorages = builder.instanceStorages;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceStorageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceStorages
     */
    public java.util.List<InstanceStorages> getInstanceStorages() {
        return this.instanceStorages;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<InstanceStorages> instanceStorages; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeInstanceStorageResponseBody model) {
            this.instanceStorages = model.instanceStorages;
            this.requestId = model.requestId;
        } 

        /**
         * InstanceStorages.
         */
        public Builder instanceStorages(java.util.List<InstanceStorages> instanceStorages) {
            this.instanceStorages = instanceStorages;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceStorageResponseBody build() {
            return new DescribeInstanceStorageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceStorageResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceStorageResponseBody</p>
     */
    public static class InstanceStorages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StorageCapacity")
        private Long storageCapacity;

        @com.aliyun.core.annotation.NameInMap("StorageCategory")
        private String storageCategory;

        @com.aliyun.core.annotation.NameInMap("StorageSpace")
        private String storageSpace;

        @com.aliyun.core.annotation.NameInMap("StorageTime")
        private Long storageTime;

        @com.aliyun.core.annotation.NameInMap("StorageUsed")
        private Long storageUsed;

        private InstanceStorages(Builder builder) {
            this.storageCapacity = builder.storageCapacity;
            this.storageCategory = builder.storageCategory;
            this.storageSpace = builder.storageSpace;
            this.storageTime = builder.storageTime;
            this.storageUsed = builder.storageUsed;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceStorages create() {
            return builder().build();
        }

        /**
         * @return storageCapacity
         */
        public Long getStorageCapacity() {
            return this.storageCapacity;
        }

        /**
         * @return storageCategory
         */
        public String getStorageCategory() {
            return this.storageCategory;
        }

        /**
         * @return storageSpace
         */
        public String getStorageSpace() {
            return this.storageSpace;
        }

        /**
         * @return storageTime
         */
        public Long getStorageTime() {
            return this.storageTime;
        }

        /**
         * @return storageUsed
         */
        public Long getStorageUsed() {
            return this.storageUsed;
        }

        public static final class Builder {
            private Long storageCapacity; 
            private String storageCategory; 
            private String storageSpace; 
            private Long storageTime; 
            private Long storageUsed; 

            private Builder() {
            } 

            private Builder(InstanceStorages model) {
                this.storageCapacity = model.storageCapacity;
                this.storageCategory = model.storageCategory;
                this.storageSpace = model.storageSpace;
                this.storageTime = model.storageTime;
                this.storageUsed = model.storageUsed;
            } 

            /**
             * StorageCapacity.
             */
            public Builder storageCapacity(Long storageCapacity) {
                this.storageCapacity = storageCapacity;
                return this;
            }

            /**
             * StorageCategory.
             */
            public Builder storageCategory(String storageCategory) {
                this.storageCategory = storageCategory;
                return this;
            }

            /**
             * StorageSpace.
             */
            public Builder storageSpace(String storageSpace) {
                this.storageSpace = storageSpace;
                return this;
            }

            /**
             * StorageTime.
             */
            public Builder storageTime(Long storageTime) {
                this.storageTime = storageTime;
                return this;
            }

            /**
             * StorageUsed.
             */
            public Builder storageUsed(Long storageUsed) {
                this.storageUsed = storageUsed;
                return this;
            }

            public InstanceStorages build() {
                return new InstanceStorages(this);
            } 

        } 

    }
}
