// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link AgentSandboxInfo} extends {@link TeaModel}
 *
 * <p>AgentSandboxInfo</p>
 */
public class AgentSandboxInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CPUCount")
    private Long CPUCount;

    @com.aliyun.core.annotation.NameInMap("CollectedAt")
    private String collectedAt;

    @com.aliyun.core.annotation.NameInMap("DiskTotal")
    private Long diskTotal;

    @com.aliyun.core.annotation.NameInMap("MemoryMB")
    private Long memoryMB;

    private AgentSandboxInfo(Builder builder) {
        this.CPUCount = builder.CPUCount;
        this.collectedAt = builder.collectedAt;
        this.diskTotal = builder.diskTotal;
        this.memoryMB = builder.memoryMB;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AgentSandboxInfo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return CPUCount
     */
    public Long getCPUCount() {
        return this.CPUCount;
    }

    /**
     * @return collectedAt
     */
    public String getCollectedAt() {
        return this.collectedAt;
    }

    /**
     * @return diskTotal
     */
    public Long getDiskTotal() {
        return this.diskTotal;
    }

    /**
     * @return memoryMB
     */
    public Long getMemoryMB() {
        return this.memoryMB;
    }

    public static final class Builder {
        private Long CPUCount; 
        private String collectedAt; 
        private Long diskTotal; 
        private Long memoryMB; 

        private Builder() {
        } 

        private Builder(AgentSandboxInfo model) {
            this.CPUCount = model.CPUCount;
            this.collectedAt = model.collectedAt;
            this.diskTotal = model.diskTotal;
            this.memoryMB = model.memoryMB;
        } 

        /**
         * CPUCount.
         */
        public Builder CPUCount(Long CPUCount) {
            this.CPUCount = CPUCount;
            return this;
        }

        /**
         * CollectedAt.
         */
        public Builder collectedAt(String collectedAt) {
            this.collectedAt = collectedAt;
            return this;
        }

        /**
         * DiskTotal.
         */
        public Builder diskTotal(Long diskTotal) {
            this.diskTotal = diskTotal;
            return this;
        }

        /**
         * MemoryMB.
         */
        public Builder memoryMB(Long memoryMB) {
            this.memoryMB = memoryMB;
            return this;
        }

        public AgentSandboxInfo build() {
            return new AgentSandboxInfo(this);
        } 

    } 

}
