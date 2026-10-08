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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListClassesResponseBody model) {
            this.items = model.items;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of instance type information.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The request ID.</p>
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

            private Builder() {
            } 

            private Builder(Items model) {
                this.classCode = model.classCode;
                this.classGroup = model.classGroup;
                this.cpu = model.cpu;
                this.encryptedMemory = model.encryptedMemory;
                this.instructionSetArch = model.instructionSetArch;
                this.maxConnections = model.maxConnections;
                this.maxIOMBPS = model.maxIOMBPS;
                this.maxIOPS = model.maxIOPS;
                this.memoryClass = model.memoryClass;
                this.referencePrice = model.referencePrice;
                this.category = model.category;
                this.storageType = model.storageType;
            } 

            /**
             * <p>The instance type code. For more information, see <a href="https://help.aliyun.com/document_detail/26312.html">Primary instance types</a> and <a href="https://help.aliyun.com/document_detail/145759.html">Read-only instance types</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>mysql.n1.micro.1</p>
             */
            public Builder classCode(String classCode) {
                this.classCode = classCode;
                return this;
            }

            /**
             * <p>The instance family. For more information, see <a href="https://help.aliyun.com/document_detail/57184.html">Instance families</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>general-purpose</p>
             */
            public Builder classGroup(String classGroup) {
                this.classGroup = classGroup;
                return this;
            }

            /**
             * <p>The number of CPU cores for the instance type. Unit: cores.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder cpu(String cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The encrypted memory size for the security-enhanced instance family. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder encryptedMemory(String encryptedMemory) {
                this.encryptedMemory = encryptedMemory;
                return this;
            }

            /**
             * <p>The architecture type of the instance type. Valid values:</p>
             * <ul>
             * <li>If the instance uses the <strong>x86</strong> architecture, this parameter is empty by default.</li>
             * <li>If the instance uses the <strong>arm</strong> architecture, <strong>arm</strong> is returned.</li>
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
             * <p>The maximum number of connections for the instance type.</p>
             * 
             * <strong>example:</strong>
             * <p>2000</p>
             */
            public Builder maxConnections(String maxConnections) {
                this.maxConnections = maxConnections;
                return this;
            }

            /**
             * <p>The maximum I/O bandwidth for the instance type. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>1024Mbps</p>
             */
            public Builder maxIOMBPS(String maxIOMBPS) {
                this.maxIOMBPS = maxIOMBPS;
                return this;
            }

            /**
             * <p>The maximum IOPS for the instance type.</p>
             * 
             * <strong>example:</strong>
             * <p>10000</p>
             */
            public Builder maxIOPS(String maxIOPS) {
                this.maxIOPS = maxIOPS;
                return this;
            }

            /**
             * <p>The memory size for the instance type. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>1GB</p>
             */
            public Builder memoryClass(String memoryClass) {
                this.memoryClass = memoryClass;
                return this;
            }

            /**
             * <p>The price for the instance type.</p>
             * <p>&lt;props=&quot;china&quot;&gt;</p>
             * <ul>
             * <li>Unit: cents (CNY).</li>
             * </ul>
             * <p>&lt;props=&quot;intl&quot;&gt;</p>
             * <ul>
             * <li>Unit: cents (USD).</li>
             * </ul>
             * <blockquote>
             * <ul>
             * <li>If you set the <strong>CommodityCode</strong> parameter to a pay-as-you-go commodity code, this parameter indicates the hourly price.</li>
             * <li>If you set the <strong>CommodityCode</strong> parameter to a subscription commodity code, this parameter indicates the monthly price.</li>
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
             * <p>The instance edition. Valid values:</p>
             * <ul>
             * <li>Regular instances<ul>
             * <li><strong>Basic</strong>: Basic Edition.</li>
             * <li><strong>HighAvailability</strong>: High availability series.</li>
             * <li><strong>cluster</strong>: MySQL or PostgreSQL Cluster Edition.</li>
             * <li><strong>AlwaysOn</strong>: SQL Server Cluster Edition.</li>
             * <li><strong>Finance</strong>: RDS Enterprise Edition.</li>
             * </ul>
             * </li>
             * <li>Serverless instances<ul>
             * <li><strong>serverless_basic</strong>: Serverless Basic Edition. (Applicable only to MySQL and PostgreSQL)</li>
             * <li><strong>serverless_standard</strong>: Serverless high availability series. (Applicable only to MySQL and PostgreSQL)</li>
             * <li><strong>serverless_ha</strong>: SQL Server Serverless high availability series.</li>
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
             * <p>The instance storage type.</p>
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
