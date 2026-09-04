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
 * {@link RLFlowSankeyColumn} extends {@link TeaModel}
 *
 * <p>RLFlowSankeyColumn</p>
 */
public class RLFlowSankeyColumn extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("Key")
    private String key;

    @com.aliyun.core.annotation.NameInMap("Label")
    private String label;

    private RLFlowSankeyColumn(Builder builder) {
        this.count = builder.count;
        this.key = builder.key;
        this.label = builder.label;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RLFlowSankeyColumn create() {
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
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return label
     */
    public String getLabel() {
        return this.label;
    }

    public static final class Builder {
        private Integer count; 
        private String key; 
        private String label; 

        private Builder() {
        } 

        private Builder(RLFlowSankeyColumn model) {
            this.count = model.count;
            this.key = model.key;
            this.label = model.label;
        } 

        /**
         * <p>该列轨迹数（已单调化：到达后一环节视为必然经过前面环节）</p>
         * 
         * <strong>example:</strong>
         * <p>96</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>列标识：gen / run / rollout / sampled / trained</p>
         * 
         * <strong>example:</strong>
         * <p>traj</p>
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * <p>列中文名：轨迹生成 / Agent 启动 / Rollout 完成 / 采样入批 / 完成训练</p>
         * 
         * <strong>example:</strong>
         * <p>生成轨迹</p>
         */
        public Builder label(String label) {
            this.label = label;
            return this;
        }

        public RLFlowSankeyColumn build() {
            return new RLFlowSankeyColumn(this);
        } 

    } 

}
