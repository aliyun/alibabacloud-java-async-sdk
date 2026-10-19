// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

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
 * {@link DescribeDBInstanceSpecInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceSpecInfoResponseBody</p>
 */
public class DescribeDBInstanceSpecInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CPU")
    private String CPU;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("Memory")
    private String memory;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDBInstanceSpecInfoResponseBody(Builder builder) {
        this.CPU = builder.CPU;
        this.description = builder.description;
        this.memory = builder.memory;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstanceSpecInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return CPU
     */
    public String getCPU() {
        return this.CPU;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return memory
     */
    public String getMemory() {
        return this.memory;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String CPU; 
        private String description; 
        private String memory; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeDBInstanceSpecInfoResponseBody model) {
            this.CPU = model.CPU;
            this.description = model.description;
            this.memory = model.memory;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The number of CPU cores.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder CPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        /**
         * <p>The description of the instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>2核8GB（独享型）</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The memory size, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        public Builder memory(String memory) {
            this.memory = memory;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6B82A9EF-9961-5A31-A19F-009B709xxxxx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBInstanceSpecInfoResponseBody build() {
            return new DescribeDBInstanceSpecInfoResponseBody(this);
        } 

    } 

}
