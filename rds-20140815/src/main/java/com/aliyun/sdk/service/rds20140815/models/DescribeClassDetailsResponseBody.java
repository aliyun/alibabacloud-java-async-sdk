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
 * {@link DescribeClassDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClassDetailsResponseBody</p>
 */
public class DescribeClassDetailsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Category")
    private String category;

    @com.aliyun.core.annotation.NameInMap("ClassCode")
    private String classCode;

    @com.aliyun.core.annotation.NameInMap("ClassGroup")
    private String classGroup;

    @com.aliyun.core.annotation.NameInMap("Cpu")
    private String cpu;

    @com.aliyun.core.annotation.NameInMap("DBInstanceStorageType")
    private String DBInstanceStorageType;

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

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeClassDetailsResponseBody(Builder builder) {
        this.category = builder.category;
        this.classCode = builder.classCode;
        this.classGroup = builder.classGroup;
        this.cpu = builder.cpu;
        this.DBInstanceStorageType = builder.DBInstanceStorageType;
        this.instructionSetArch = builder.instructionSetArch;
        this.maxConnections = builder.maxConnections;
        this.maxIOMBPS = builder.maxIOMBPS;
        this.maxIOPS = builder.maxIOPS;
        this.memoryClass = builder.memoryClass;
        this.referencePrice = builder.referencePrice;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClassDetailsResponseBody create() {
        return builder().build();
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
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
     * @return DBInstanceStorageType
     */
    public String getDBInstanceStorageType() {
        return this.DBInstanceStorageType;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String category; 
        private String classCode; 
        private String classGroup; 
        private String cpu; 
        private String DBInstanceStorageType; 
        private String instructionSetArch; 
        private String maxConnections; 
        private String maxIOMBPS; 
        private String maxIOPS; 
        private String memoryClass; 
        private String referencePrice; 
        private String requestId; 

        /**
         * <p>The RDS edition of the instance. Valid values:</p>
         * <ul>
         * <li><strong>Basic</strong>: RDS Basic Edition</li>
         * <li><strong>HighAvailability</strong>: RDS High-availability Edition</li>
         * <li><strong>AlwaysOn</strong>: RDS Cluster Edition</li>
         * <li><strong>Finance</strong>: RDS Enterprise Edition</li>
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
         * <p>The code of the instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql.n2.medium.1</p>
         */
        public Builder classCode(String classCode) {
            this.classCode = classCode;
            return this;
        }

        /**
         * <p>The instance family of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>x</p>
         */
        public Builder classGroup(String classGroup) {
            this.classGroup = classGroup;
            return this;
        }

        /**
         * <p>The number of CPU cores that are supported by the instance type. Unit: cores.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder cpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        /**
         * <p>The storage type of the instance. Valid values:</p>
         * <ul>
         * <li><strong>local_ssd</strong>: local SSDs</li>
         * <li><strong>cloud_ssd</strong>: standard SSDs</li>
         * <li><strong>cloud_essd</strong>: enhanced SSDs (ESSDs) of performance level 1 (PL1)</li>
         * <li><strong>cloud_essd2</strong>: ESSDs of PL2</li>
         * <li><strong>cloud_essd3</strong>: ESSD of PL3</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>local_ssd</p>
         */
        public Builder DBInstanceStorageType(String DBInstanceStorageType) {
            this.DBInstanceStorageType = DBInstanceStorageType;
            return this;
        }

        /**
         * <p>The architecture of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>x86</p>
         */
        public Builder instructionSetArch(String instructionSetArch) {
            this.instructionSetArch = instructionSetArch;
            return this;
        }

        /**
         * <p>The maximum number of connections.</p>
         * 
         * <strong>example:</strong>
         * <p>4000</p>
         */
        public Builder maxConnections(String maxConnections) {
            this.maxConnections = maxConnections;
            return this;
        }

        /**
         * <p>The maximum I/O bandwidth that is supported by the instance type. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        public Builder maxIOMBPS(String maxIOMBPS) {
            this.maxIOMBPS = maxIOMBPS;
            return this;
        }

        /**
         * <p>The maximum input/output operations per second (IOPS) that is supported by the instance type. Unit: operations per second.</p>
         * 
         * <strong>example:</strong>
         * <p>N/A</p>
         */
        public Builder maxIOPS(String maxIOPS) {
            this.maxIOPS = maxIOPS;
            return this;
        }

        /**
         * <p>The memory size. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>2GB</p>
         */
        public Builder memoryClass(String memoryClass) {
            this.memoryClass = memoryClass;
            return this;
        }

        /**
         * <p>The price.</p>
         * <p>Unit: cents (US dollars).</p>
         * <blockquote>
         * <ul>
         * <li>If you set the CommodityCode parameter to a value that indicates the pay-as-you-go billing method, the ReferencePrice parameter specifies the hourly fee that you must pay.</li>
         * <li>If you set the CommodityCode parameter to a value that indicates the subscription billing method, the ReferencePrice parameter specifies the monthly fee that you must pay.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>13400</p>
         */
        public Builder referencePrice(String referencePrice) {
            this.referencePrice = referencePrice;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E9DD55F4-1A5F-48CA-BA57-DFB3CA8C4C34</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeClassDetailsResponseBody build() {
            return new DescribeClassDetailsResponseBody(this);
        } 

    } 

}
