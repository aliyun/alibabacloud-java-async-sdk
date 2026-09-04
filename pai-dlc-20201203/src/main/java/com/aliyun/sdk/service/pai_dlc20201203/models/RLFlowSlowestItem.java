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
 * {@link RLFlowSlowestItem} extends {@link TeaModel}
 *
 * <p>RLFlowSlowestItem</p>
 */
public class RLFlowSlowestItem extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PromptUid")
    private String promptUid;

    @com.aliyun.core.annotation.NameInMap("SampleIndex")
    private String sampleIndex;

    @com.aliyun.core.annotation.NameInMap("Sec")
    private Double sec;

    private RLFlowSlowestItem(Builder builder) {
        this.promptUid = builder.promptUid;
        this.sampleIndex = builder.sampleIndex;
        this.sec = builder.sec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RLFlowSlowestItem create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return promptUid
     */
    public String getPromptUid() {
        return this.promptUid;
    }

    /**
     * @return sampleIndex
     */
    public String getSampleIndex() {
        return this.sampleIndex;
    }

    /**
     * @return sec
     */
    public Double getSec() {
        return this.sec;
    }

    public static final class Builder {
        private String promptUid; 
        private String sampleIndex; 
        private Double sec; 

        private Builder() {
        } 

        private Builder(RLFlowSlowestItem model) {
            this.promptUid = model.promptUid;
            this.sampleIndex = model.sampleIndex;
            this.sec = model.sec;
        } 

        /**
         * <p>样本 uid</p>
         * 
         * <strong>example:</strong>
         * <p>321fa56f-e1e5-4eb3-8047-db7a230c9a75</p>
         */
        public Builder promptUid(String promptUid) {
            this.promptUid = promptUid;
            return this;
        }

        /**
         * <p>轨迹序号</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder sampleIndex(String sampleIndex) {
            this.sampleIndex = sampleIndex;
            return this;
        }

        /**
         * <p>该阶段耗时（秒）</p>
         * 
         * <strong>example:</strong>
         * <p>9.2</p>
         */
        public Builder sec(Double sec) {
            this.sec = sec;
            return this;
        }

        public RLFlowSlowestItem build() {
            return new RLFlowSlowestItem(this);
        } 

    } 

}
