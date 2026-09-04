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
 * {@link RLProgressSync} extends {@link TeaModel}
 *
 * <p>RLProgressSync</p>
 */
public class RLProgressSync extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Cost")
    private Double cost;

    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    private RLProgressSync(Builder builder) {
        this.cost = builder.cost;
        this.state = builder.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RLProgressSync create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cost
     */
    public Double getCost() {
        return this.cost;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    public static final class Builder {
        private Double cost; 
        private String state; 

        private Builder() {
        } 

        private Builder(RLProgressSync model) {
            this.cost = model.cost;
            this.state = model.state;
        } 

        /**
         * <p>参数同步耗时（秒），仅 State 为 end 时有值</p>
         * 
         * <strong>example:</strong>
         * <p>1.5</p>
         */
        public Builder cost(Double cost) {
            this.cost = cost;
            return this;
        }

        /**
         * <p>begin / end</p>
         * 
         * <strong>example:</strong>
         * <p>end</p>
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        public RLProgressSync build() {
            return new RLProgressSync(this);
        } 

    } 

}
