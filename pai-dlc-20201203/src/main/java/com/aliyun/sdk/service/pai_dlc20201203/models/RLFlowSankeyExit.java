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
 * {@link RLFlowSankeyExit} extends {@link TeaModel}
 *
 * <p>RLFlowSankeyExit</p>
 */
public class RLFlowSankeyExit extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("From")
    private String from;

    @com.aliyun.core.annotation.NameInMap("FromIdx")
    private Integer fromIdx;

    @com.aliyun.core.annotation.NameInMap("Label")
    private String label;

    private RLFlowSankeyExit(Builder builder) {
        this.count = builder.count;
        this.from = builder.from;
        this.fromIdx = builder.fromIdx;
        this.label = builder.label;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RLFlowSankeyExit create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return from
     */
    public String getFrom() {
        return this.from;
    }

    /**
     * @return fromIdx
     */
    public Integer getFromIdx() {
        return this.fromIdx;
    }

    /**
     * @return label
     */
    public String getLabel() {
        return this.label;
    }

    public static final class Builder {
        private Integer count; 
        private String from; 
        private Integer fromIdx; 
        private String label; 

        private Builder() {
        } 

        private Builder(RLFlowSankeyExit model) {
            this.count = model.count;
            this.from = model.from;
            this.fromIdx = model.fromIdx;
            this.label = model.label;
        } 

        /**
         * <p>The number of trajectories on the outflow edge.</p>
         * 
         * <strong>example:</strong>
         * <p>96</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The key of the outflow source column.</p>
         * 
         * <strong>example:</strong>
         * <p>DataLoader</p>
         */
        public Builder from(String from) {
            this.from = from;
            return this;
        }

        /**
         * <p>The index of the outflow source column (0-based).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder fromIdx(Integer fromIdx) {
            this.fromIdx = fromIdx;
            return this;
        }

        /**
         * <p>The Chinese name of the outflow destination. Valid values vary by the column where the outflow is located: 在途·未下发 / 在途·生成中 / 在途·待采样 / 在途·待训练.</p>
         * 
         * <strong>example:</strong>
         * <p>生成轨迹</p>
         */
        public Builder label(String label) {
            this.label = label;
            return this;
        }

        public RLFlowSankeyExit build() {
            return new RLFlowSankeyExit(this);
        } 

    } 

}
