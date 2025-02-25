// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link ListClassesResponseBody} extends {@link TeaModel}
 *
 * <p>ListClassesResponseBody</p>
 */
public class ListClassesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
    public java.util.List<Items> getItems() {
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
        private java.util.List<Items> items; 
        private String regionId; 
        private String requestId; 

        /**
         * <p>The list of instance specifications.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>CF8D35BF-263D-4F7B-883A-1163B79A9EC6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListClassesResponseBody build() {
            return new ListClassesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListClassesResponseBody} extends {@link TeaModel}
     *
     * <p>ListClassesResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClassCode")
        private String classCode;

        @com.aliyun.core.annotation.NameInMap("ClassGroup")
        private String classGroup;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private String cpu;

        @com.aliyun.core.annotation.NameInMap("EncryptedMemory")
        private String encryptedMemory;

        @com.aliyun.core.annotation.NameInMap("InstructionSetArch")
        private String instructionSetArch;

        @com.aliyun.core.annotation.NameInMap("MaxConnections")
        private String maxConnections;

        @com.aliyun.core.annotation.NameInMap("MaxIOMBPS")
        private String maxIOMBPS;

        @com.aliyun.core.annotation.NameInMap("MaxIOPS")
        private String maxIOPS;

        @com.aliyun.core.annotation.NameInMap("MemoryClass")
        private String memoryClass;

        @com.aliyun.core.annotation.NameInMap("ReferencePrice")
        private String referencePrice;

        @com.aliyun.core.annotation.NameInMap("category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("storageType")
        private String storageType;

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
            this.category = builder.category;
            this.storageType = builder.storageType;
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

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return storageType
         */
        public String getStorageType() {
            return this.storageType;
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
            private String category; 
            private String storageType; 

            /**
             * <p>The code of the instance type. For more information, see <a href="https://help.aliyun.com/document_detail/26312.html">Primary ApsaraDB RDS instance types</a> and <a href="https://help.aliyun.com/document_detail/145759.html">Read-only ApsaraDB RDS instance types</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>mysql.n1.micro.1</p>
             */
            public Builder classCode(String classCode) {
                this.classCode = classCode;
                return this;
            }

            /**
             * <p>The instance family. For more information, see <a href="https://help.aliyun.com/document_detail/57184.html">Overview of instance families</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>General</p>
             */
            public Builder classGroup(String classGroup) {
                this.classGroup = classGroup;
                return this;
            }

            /**
             * <p>The number of CPU cores that are supported by the instance type. Unit: cores.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder cpu(String cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The size of the encrypted memory that is supported by the security-enhanced instance type. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder encryptedMemory(String encryptedMemory) {
                this.encryptedMemory = encryptedMemory;
                return this;
            }

            /**
             * <p>The architecture of the instance type. Valid values:</p>
             * <ul>
             * <li>If the architecture of the instance type is <strong>x86</strong>, an empty string is returned by default.</li>
             * <li>If the architecture of the instance type is <strong>ARM</strong>, <strong>arm</strong> is returned.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>arm</p>
             */
            public Builder instructionSetArch(String instructionSetArch) {
                this.instructionSetArch = instructionSetArch;
                return this;
            }

            /**
             * <p>The maximum number of connections that are supported by the instance type. Unit: connections.</p>
             * 
             * <strong>example:</strong>
             * <p>2000</p>
             */
            public Builder maxConnections(String maxConnections) {
                this.maxConnections = maxConnections;
                return this;
            }

            /**
             * <p>The maximum I/O bandwidth that is supported by the instance type. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>1024Mbps</p>
             */
            public Builder maxIOMBPS(String maxIOMBPS) {
                this.maxIOMBPS = maxIOMBPS;
                return this;
            }

            /**
             * <p>The maximum input/output operations per second (IOPS) that is supported by the instance type. Unit: operations per second.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder maxIOPS(String maxIOPS) {
                this.maxIOPS = maxIOPS;
                return this;
            }

            /**
             * <p>The memory size that is supported by the instance type. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>1 GB (RDS Basic Edition)</p>
             */
            public Builder memoryClass(String memoryClass) {
                this.memoryClass = memoryClass;
                return this;
            }

            /**
             * <p>The fee that you must pay for the instance type.</p>
             * <ul>
             * <li>Unit: cents (USD).</li>
             * </ul>
             * <blockquote>
             * <ul>
             * <li>If you set <strong>CommodityCode</strong> to a value that indicates the pay-as-you-go billing method, the ReferencePrice parameter specifies the hourly fee that you must pay.</li>
             * <li>If you set <strong>CommodityCode</strong> to a value that indicates the subscription billing method, the ReferencePrice parameter specifies the monthly fee that you must pay.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2500</p>
             */
            public Builder referencePrice(String referencePrice) {
                this.referencePrice = referencePrice;
                return this;
            }

            /**
             * <p>The RDS edition of the instance. Valid values:</p>
             * <ul>
             * <li><p>Regular instance</p>
             * <ul>
             * <li><strong>Basic</strong>: RDS Basic Edition</li>
             * <li><strong>HighAvailability</strong>: RDS High-availability Edition</li>
             * <li><strong>cluster</strong>: RDS Cluster Edition for ApsaraDB RDS for MySQL or PostgreSQL</li>
             * <li><strong>AlwaysOn</strong>: RDS Cluster Edition for ApsaraDB RDS for SQL Server</li>
             * <li><strong>Finance</strong>: RDS Basic Edition for serverless instances</li>
             * </ul>
             * </li>
             * <li><p>Serverless instance</p>
             * <ul>
             * <li><strong>serverless_basic</strong>: RDS Basic Edition for serverless instances. This edition is available only for instances that run MySQL and PostgreSQL.</li>
             * <li><strong>serverless_standard</strong>: RDS High-availability Edition for serverless instances. This edition is available only for instances that run MySQL and PostgreSQL.</li>
             * <li><strong>serverless_ha</strong>: RDS High-availability Edition for serverless instances. This edition is available only for instances that run SQL Server.</li>
             * </ul>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Basic</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The storage type of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_essd</p>
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
