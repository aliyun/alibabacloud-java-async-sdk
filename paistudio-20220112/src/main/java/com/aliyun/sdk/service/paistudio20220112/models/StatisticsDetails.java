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
 * {@link StatisticsDetails} extends {@link TeaModel}
 *
 * <p>StatisticsDetails</p>
 */
public class StatisticsDetails extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Long count;

    @com.aliyun.core.annotation.NameInMap("IdleNum")
    private Long idleNum;

    private StatisticsDetails(Builder builder) {
        this.count = builder.count;
        this.idleNum = builder.idleNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StatisticsDetails create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return count
     */
    public Long getCount() {
        return this.count;
    }

    /**
     * @return idleNum
     */
    public Long getIdleNum() {
        return this.idleNum;
    }

    public static final class Builder {
        private Long count; 
        private Long idleNum; 

        private Builder() {
        } 

        private Builder(StatisticsDetails model) {
            this.count = model.count;
            this.idleNum = model.idleNum;
        } 

        /**
         * Count.
         */
        public Builder count(Long count) {
            this.count = count;
            return this;
        }

        /**
         * IdleNum.
         */
        public Builder idleNum(Long idleNum) {
            this.idleNum = idleNum;
            return this;
        }

        public StatisticsDetails build() {
            return new StatisticsDetails(this);
        } 

    } 

}
