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
         * The list of instance specifications.
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the request.
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

        @NameInMap("EncryptedMemory")
        private String encryptedMemory;

        @NameInMap("InstructionSetArch")
        private String instructionSetArch;

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
            this.encryptedMemory = builder.encryptedMemory;
            this.instructionSetArch = builder.instructionSetArch;
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
         * @return encryptedMemory
         */
        public String getEncryptedMemory() {
            return this.encryptedMemory;
        }

        /**
         * @return instructionSetArch
         */
        public String getInstructionSetArch() {
            return this.instructionSetArch;
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
            private String encryptedMemory; 
            private String instructionSetArch; 
            private String maxConnections; 
            private String maxIOMBPS; 
            private String maxIOPS; 
            private String memoryClass; 
            private String referencePrice; 

            /**
             * The code of the instance type. For more information, see [Primary ApsaraDB RDS instance types](~~26312~~) and [Read-only ApsaraDB RDS instance types](~~145759~~).
             */
            public Builder classCode(String classCode) {
                this.classCode = classCode;
                return this;
            }

            /**
             * The instance family. For more information, see [Overview of instance families](~~57184~~).
             */
            public Builder classGroup(String classGroup) {
                this.classGroup = classGroup;
                return this;
            }

            /**
             * The number of CPU cores that are supported by the instance type. Unit: cores.
             */
            public Builder cpu(String cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * The size of the encrypted memory that is supported by the security-enhanced instance type. Unit: GB.
             */
            public Builder encryptedMemory(String encryptedMemory) {
                this.encryptedMemory = encryptedMemory;
                return this;
            }

            /**
             * The architecture of the instance type. Valid values:
             * <p>
             * 
             * *   If the architecture of the instance type is **x86**, an empty string is returned by default.
             * *   If the architecture of the instance type is **ARM**, **arm** is returned.
             */
            public Builder instructionSetArch(String instructionSetArch) {
                this.instructionSetArch = instructionSetArch;
                return this;
            }

            /**
             * The maximum number of connections that are supported by the instance type. Unit: connections.
             */
            public Builder maxConnections(String maxConnections) {
                this.maxConnections = maxConnections;
                return this;
            }

            /**
             * The maximum I/O bandwidth that is supported by the instance type. Unit: Mbit/s.
             */
            public Builder maxIOMBPS(String maxIOMBPS) {
                this.maxIOMBPS = maxIOMBPS;
                return this;
            }

            /**
             * The maximum input/output operations per second (IOPS) that is supported by the instance type. Unit: operations per second.
             */
            public Builder maxIOPS(String maxIOPS) {
                this.maxIOPS = maxIOPS;
                return this;
            }

            /**
             * The memory size that is supported by the instance type. Unit: GB.
             */
            public Builder memoryClass(String memoryClass) {
                this.memoryClass = memoryClass;
                return this;
            }

            /**
             * The fee that you must pay for the instance type.
             * <p>
             * 
             * *   Unit: cents (USD).
             * 
             * > *   If you set **CommodityCode** to a value that indicates the pay-as-you-go billing method, the ReferencePrice parameter specifies the hourly fee that you must pay.
             * > *   If you set **CommodityCode** to a value that indicates the subscription billing method, the ReferencePrice parameter specifies the monthly fee that you must pay.
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
