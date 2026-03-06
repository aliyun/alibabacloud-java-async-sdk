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
 * {@link AllocatedHyperNodeDetail} extends {@link TeaModel}
 *
 * <p>AllocatedHyperNodeDetail</p>
 */
public class AllocatedHyperNodeDetail extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AllocatedNodeNum")
    private Long allocatedNodeNum;

    @com.aliyun.core.annotation.NameInMap("EmptyNodeNum")
    private Long emptyNodeNum;

    @com.aliyun.core.annotation.NameInMap("HyperNodeName")
    private String hyperNodeName;

    @com.aliyun.core.annotation.NameInMap("TotalNodeNum")
    private Long totalNodeNum;

    private AllocatedHyperNodeDetail(Builder builder) {
        this.allocatedNodeNum = builder.allocatedNodeNum;
        this.emptyNodeNum = builder.emptyNodeNum;
        this.hyperNodeName = builder.hyperNodeName;
        this.totalNodeNum = builder.totalNodeNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AllocatedHyperNodeDetail create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return hyperNodeName
     */
    public String getHyperNodeName() {
        return this.hyperNodeName;
    }

    /**
     * @return totalNodeNum
     */
    public Long getTotalNodeNum() {
        return this.totalNodeNum;
    }

    public static final class Builder {
        private Long allocatedNodeNum; 
        private Long emptyNodeNum; 
        private String hyperNodeName; 
        private Long totalNodeNum; 

        private Builder() {
        } 

        private Builder(AllocatedHyperNodeDetail model) {
            this.allocatedNodeNum = model.allocatedNodeNum;
            this.emptyNodeNum = model.emptyNodeNum;
            this.hyperNodeName = model.hyperNodeName;
            this.totalNodeNum = model.totalNodeNum;
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

        /**
         * HyperNodeName.
         */
        public Builder hyperNodeName(String hyperNodeName) {
            this.hyperNodeName = hyperNodeName;
            return this;
        }

        /**
         * TotalNodeNum.
         */
        public Builder totalNodeNum(Long totalNodeNum) {
            this.totalNodeNum = totalNodeNum;
            return this;
        }

        public AllocatedHyperNodeDetail build() {
            return new AllocatedHyperNodeDetail(this);
        } 

    } 

}
