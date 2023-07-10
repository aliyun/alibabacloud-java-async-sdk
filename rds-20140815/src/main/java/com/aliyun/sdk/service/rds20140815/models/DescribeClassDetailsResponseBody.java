// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClassDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClassDetailsResponseBody</p>
 */
public class DescribeClassDetailsResponseBody extends TeaModel {
    @NameInMap("Category")
    private String category;

    @NameInMap("ClassCode")
    private String classCode;

    @NameInMap("ClassGroup")
    private String classGroup;

    @NameInMap("Cpu")
    private String cpu;

    @NameInMap("DBInstanceStorageType")
    private String DBInstanceStorageType;

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

    @NameInMap("RequestId")
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
         * Category.
         */
        public Builder category(String category) {
            this.category = category;
            return this;
        }

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
         * DBInstanceStorageType.
         */
        public Builder DBInstanceStorageType(String DBInstanceStorageType) {
            this.DBInstanceStorageType = DBInstanceStorageType;
            return this;
        }

        /**
         * InstructionSetArch.
         */
        public Builder instructionSetArch(String instructionSetArch) {
            this.instructionSetArch = instructionSetArch;
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

        /**
         * RequestId.
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
