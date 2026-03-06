// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link QuotaNodeStatistics} extends {@link TeaModel}
 *
 * <p>QuotaNodeStatistics</p>
 */
public class QuotaNodeStatistics extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ActualMinHyperNodeNum")
    private Long actualMinHyperNodeNum;

    @com.aliyun.core.annotation.NameInMap("ActualMinNodeNum")
    private Long actualMinNodeNum;

    @com.aliyun.core.annotation.NameInMap("AllocatedHyperNodeDetails")
    private java.util.List<AllocatedHyperNodeDetail> allocatedHyperNodeDetails;

    @com.aliyun.core.annotation.NameInMap("AllocatedHyperNodeNum")
    private Long allocatedHyperNodeNum;

    @com.aliyun.core.annotation.NameInMap("AllocatedNodeNum")
    private Long allocatedNodeNum;

    @com.aliyun.core.annotation.NameInMap("EmptyNodeNum")
    private Long emptyNodeNum;

    private QuotaNodeStatistics(Builder builder) {
        this.actualMinHyperNodeNum = builder.actualMinHyperNodeNum;
        this.actualMinNodeNum = builder.actualMinNodeNum;
        this.allocatedHyperNodeDetails = builder.allocatedHyperNodeDetails;
        this.allocatedHyperNodeNum = builder.allocatedHyperNodeNum;
        this.allocatedNodeNum = builder.allocatedNodeNum;
        this.emptyNodeNum = builder.emptyNodeNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuotaNodeStatistics create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actualMinHyperNodeNum
     */
    public Long getActualMinHyperNodeNum() {
        return this.actualMinHyperNodeNum;
    }

    /**
     * @return actualMinNodeNum
     */
    public Long getActualMinNodeNum() {
        return this.actualMinNodeNum;
    }

    /**
     * @return allocatedHyperNodeDetails
     */
    public java.util.List<AllocatedHyperNodeDetail> getAllocatedHyperNodeDetails() {
        return this.allocatedHyperNodeDetails;
    }

    /**
     * @return allocatedHyperNodeNum
     */
    public Long getAllocatedHyperNodeNum() {
        return this.allocatedHyperNodeNum;
    }

    /**
     * @return allocatedNodeNum
     */
    public Long getAllocatedNodeNum() {
        return this.allocatedNodeNum;
    }

    /**
     * @return emptyNodeNum
     */
    public Long getEmptyNodeNum() {
        return this.emptyNodeNum;
    }

    public static final class Builder {
        private Long actualMinHyperNodeNum; 
        private Long actualMinNodeNum; 
        private java.util.List<AllocatedHyperNodeDetail> allocatedHyperNodeDetails; 
        private Long allocatedHyperNodeNum; 
        private Long allocatedNodeNum; 
        private Long emptyNodeNum; 

        private Builder() {
        } 

        private Builder(QuotaNodeStatistics model) {
            this.actualMinHyperNodeNum = model.actualMinHyperNodeNum;
            this.actualMinNodeNum = model.actualMinNodeNum;
            this.allocatedHyperNodeDetails = model.allocatedHyperNodeDetails;
            this.allocatedHyperNodeNum = model.allocatedHyperNodeNum;
            this.allocatedNodeNum = model.allocatedNodeNum;
            this.emptyNodeNum = model.emptyNodeNum;
        } 

        /**
         * ActualMinHyperNodeNum.
         */
        public Builder actualMinHyperNodeNum(Long actualMinHyperNodeNum) {
            this.actualMinHyperNodeNum = actualMinHyperNodeNum;
            return this;
        }

        /**
         * ActualMinNodeNum.
         */
        public Builder actualMinNodeNum(Long actualMinNodeNum) {
            this.actualMinNodeNum = actualMinNodeNum;
            return this;
        }

        /**
         * AllocatedHyperNodeDetails.
         */
        public Builder allocatedHyperNodeDetails(java.util.List<AllocatedHyperNodeDetail> allocatedHyperNodeDetails) {
            this.allocatedHyperNodeDetails = allocatedHyperNodeDetails;
            return this;
        }

        /**
         * AllocatedHyperNodeNum.
         */
        public Builder allocatedHyperNodeNum(Long allocatedHyperNodeNum) {
            this.allocatedHyperNodeNum = allocatedHyperNodeNum;
            return this;
        }

        /**
         * AllocatedNodeNum.
         */
        public Builder allocatedNodeNum(Long allocatedNodeNum) {
            this.allocatedNodeNum = allocatedNodeNum;
            return this;
        }

        /**
         * EmptyNodeNum.
         */
        public Builder emptyNodeNum(Long emptyNodeNum) {
            this.emptyNodeNum = emptyNodeNum;
            return this;
        }

        public QuotaNodeStatistics build() {
            return new QuotaNodeStatistics(this);
        } 

    } 

}
