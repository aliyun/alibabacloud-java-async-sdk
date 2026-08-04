// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link DeptBalanceSummaryDTO} extends {@link TeaModel}
 *
 * <p>DeptBalanceSummaryDTO</p>
 */
public class DeptBalanceSummaryDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("monthly")
    private BalancePoolSummaryDTO monthly;

    @com.aliyun.core.annotation.NameInMap("permanent")
    private BalancePoolSummaryDTO permanent;

    private DeptBalanceSummaryDTO(Builder builder) {
        this.monthly = builder.monthly;
        this.permanent = builder.permanent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeptBalanceSummaryDTO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return monthly
     */
    public BalancePoolSummaryDTO getMonthly() {
        return this.monthly;
    }

    /**
     * @return permanent
     */
    public BalancePoolSummaryDTO getPermanent() {
        return this.permanent;
    }

    public static final class Builder {
        private BalancePoolSummaryDTO monthly; 
        private BalancePoolSummaryDTO permanent; 

        private Builder() {
        } 

        private Builder(DeptBalanceSummaryDTO model) {
            this.monthly = model.monthly;
            this.permanent = model.permanent;
        } 

        /**
         * monthly.
         */
        public Builder monthly(BalancePoolSummaryDTO monthly) {
            this.monthly = monthly;
            return this;
        }

        /**
         * permanent.
         */
        public Builder permanent(BalancePoolSummaryDTO permanent) {
            this.permanent = permanent;
            return this;
        }

        public DeptBalanceSummaryDTO build() {
            return new DeptBalanceSummaryDTO(this);
        } 

    } 

}
