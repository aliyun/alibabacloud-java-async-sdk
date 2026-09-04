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
 * {@link RLProgressStep} extends {@link TeaModel}
 *
 * <p>RLProgressStep</p>
 */
public class RLProgressStep extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Current")
    private Integer current;

    @com.aliyun.core.annotation.NameInMap("EtaSec")
    private Long etaSec;

    @com.aliyun.core.annotation.NameInMap("PaceSec")
    private Double paceSec;

    @com.aliyun.core.annotation.NameInMap("Pct")
    private Double pct;

    @com.aliyun.core.annotation.NameInMap("Time")
    private Long time;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private RLProgressStep(Builder builder) {
        this.current = builder.current;
        this.etaSec = builder.etaSec;
        this.paceSec = builder.paceSec;
        this.pct = builder.pct;
        this.time = builder.time;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RLProgressStep create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return current
     */
    public Integer getCurrent() {
        return this.current;
    }

    /**
     * @return etaSec
     */
    public Long getEtaSec() {
        return this.etaSec;
    }

    /**
     * @return paceSec
     */
    public Double getPaceSec() {
        return this.paceSec;
    }

    /**
     * @return pct
     */
    public Double getPct() {
        return this.pct;
    }

    /**
     * @return time
     */
    public Long getTime() {
        return this.time;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Integer current; 
        private Long etaSec; 
        private Double paceSec; 
        private Double pct; 
        private Long time; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(RLProgressStep model) {
            this.current = model.current;
            this.etaSec = model.etaSec;
            this.paceSec = model.paceSec;
            this.pct = model.pct;
            this.time = model.time;
            this.total = model.total;
        } 

        /**
         * <p>当前 step</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder current(Integer current) {
            this.current = current;
            return this;
        }

        /**
         * <p>预计剩余秒数，等于 (Total-Current) 乘 PaceSec</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder etaSec(Long etaSec) {
            this.etaSec = etaSec;
            return this;
        }

        /**
         * <p>单步耗时（相邻两个 Step 标记差分，秒）</p>
         * 
         * <strong>example:</strong>
         * <p>14</p>
         */
        public Builder paceSec(Double paceSec) {
            this.paceSec = paceSec;
            return this;
        }

        /**
         * <p>进度百分比，Current 占 Total 的比例</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder pct(Double pct) {
            this.pct = pct;
            return this;
        }

        /**
         * <p>最新 Step 标记时间（unix 秒）</p>
         * 
         * <strong>example:</strong>
         * <p>1787474487</p>
         */
        public Builder time(Long time) {
            this.time = time;
            return this;
        }

        /**
         * <p>总步数（取自配置 dump）</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public RLProgressStep build() {
            return new RLProgressStep(this);
        } 

    } 

}
