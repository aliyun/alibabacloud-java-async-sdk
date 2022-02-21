// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClassesResponseBody} extends {@link TeaModel}
 *
 * <p>ListClassesResponseBody</p>
 */
public class ListClassesResponseBody extends TeaModel {
    @NameInMap("Items")
    private java.util.List < Items> items;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestId")
    private String requestId;

    private ListClassesResponseBody(Builder builder) {
        this.items = builder.items;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClassesResponseBody create() {
        return builder().build();
    }

    /**
     * @return items
     */
    public java.util.List < Items> getItems() {
        return this.items;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Items> items; 
        private String regionId; 
        private String requestId; 

        /**
         * Items.
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListClassesResponseBody build() {
            return new ListClassesResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("ClassCode")
        private String classCode;

        @NameInMap("ClassGroup")
        private String classGroup;

        @NameInMap("Cpu")
        private String cpu;

        @NameInMap("MaxConnections")
        private String maxConnections;

        @NameInMap("MaxIOMBPS")
        private String maxIOMBPS;

        @NameInMap("MaxIOPS")
        private String maxIOPS;

        @NameInMap("MemoryClass")
        private String memoryClass;

        @NameInMap("ReferencePrice")
        private String referencePrice;

        private Items(Builder builder) {
            this.classCode = builder.classCode;
            this.classGroup = builder.classGroup;
            this.cpu = builder.cpu;
            this.maxConnections = builder.maxConnections;
            this.maxIOMBPS = builder.maxIOMBPS;
            this.maxIOPS = builder.maxIOPS;
            this.memoryClass = builder.memoryClass;
            this.referencePrice = builder.referencePrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return classCode
         */
        public String getClassCode() {
            return this.classCode;
        }

        /**
         * @return classGroup
         */
        public String getClassGroup() {
            return this.classGroup;
        }

        /**
         * @return cpu
         */
        public String getCpu() {
            return this.cpu;
        }

        /**
         * @return maxConnections
         */
        public String getMaxConnections() {
            return this.maxConnections;
        }

        /**
         * @return maxIOMBPS
         */
        public String getMaxIOMBPS() {
            return this.maxIOMBPS;
        }

        /**
         * @return maxIOPS
         */
        public String getMaxIOPS() {
            return this.maxIOPS;
        }

        /**
         * @return memoryClass
         */
        public String getMemoryClass() {
            return this.memoryClass;
        }

        /**
         * @return referencePrice
         */
        public String getReferencePrice() {
            return this.referencePrice;
        }

        public static final class Builder {
            private String classCode; 
            private String classGroup; 
            private String cpu; 
            private String maxConnections; 
            private String maxIOMBPS; 
            private String maxIOPS; 
            private String memoryClass; 
            private String referencePrice; 

            /**
             * ClassCode.
             */
            public Builder classCode(String classCode) {
                this.classCode = classCode;
                return this;
            }

            /**
             * ClassGroup.
             */
            public Builder classGroup(String classGroup) {
                this.classGroup = classGroup;
                return this;
            }

            /**
             * Cpu.
             */
            public Builder cpu(String cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * MaxConnections.
             */
            public Builder maxConnections(String maxConnections) {
                this.maxConnections = maxConnections;
                return this;
            }

            /**
             * MaxIOMBPS.
             */
            public Builder maxIOMBPS(String maxIOMBPS) {
                this.maxIOMBPS = maxIOMBPS;
                return this;
            }

            /**
             * MaxIOPS.
             */
            public Builder maxIOPS(String maxIOPS) {
                this.maxIOPS = maxIOPS;
                return this;
            }

            /**
             * MemoryClass.
             */
            public Builder memoryClass(String memoryClass) {
                this.memoryClass = memoryClass;
                return this;
            }

            /**
             * ReferencePrice.
             */
            public Builder referencePrice(String referencePrice) {
                this.referencePrice = referencePrice;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
