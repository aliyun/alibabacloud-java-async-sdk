// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link ResidentResourceAllocationStatus} extends {@link TeaModel}
 *
 * <p>ResidentResourceAllocationStatus</p>
 */
public class ResidentResourceAllocationStatus extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("lastAllocatedTime")
    private String lastAllocatedTime;

    @com.aliyun.core.annotation.NameInMap("lastAllocation")
    private java.util.List<ResidentResourceAllocation> lastAllocation;

    private ResidentResourceAllocationStatus(Builder builder) {
        this.lastAllocatedTime = builder.lastAllocatedTime;
        this.lastAllocation = builder.lastAllocation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResidentResourceAllocationStatus create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lastAllocatedTime
     */
    public String getLastAllocatedTime() {
        return this.lastAllocatedTime;
    }

    /**
     * @return lastAllocation
     */
    public java.util.List<ResidentResourceAllocation> getLastAllocation() {
        return this.lastAllocation;
    }

    public static final class Builder {
        private String lastAllocatedTime; 
        private java.util.List<ResidentResourceAllocation> lastAllocation; 

        private Builder() {
        } 

        private Builder(ResidentResourceAllocationStatus model) {
            this.lastAllocatedTime = model.lastAllocatedTime;
            this.lastAllocation = model.lastAllocation;
        } 

        /**
         * lastAllocatedTime.
         */
        public Builder lastAllocatedTime(String lastAllocatedTime) {
            this.lastAllocatedTime = lastAllocatedTime;
            return this;
        }

        /**
         * lastAllocation.
         */
        public Builder lastAllocation(java.util.List<ResidentResourceAllocation> lastAllocation) {
            this.lastAllocation = lastAllocation;
            return this;
        }

        public ResidentResourceAllocationStatus build() {
            return new ResidentResourceAllocationStatus(this);
        } 

    } 

}
