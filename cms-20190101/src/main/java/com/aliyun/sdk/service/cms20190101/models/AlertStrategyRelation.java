// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AlertStrategyRelation} extends {@link TeaModel}
 *
 * <p>AlertStrategyRelation</p>
 */
public class AlertStrategyRelation extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AlertName")
    private String alertName;

    @com.aliyun.core.annotation.NameInMap("StrategyUuid")
    private String strategyUuid;

    private AlertStrategyRelation(Builder builder) {
        this.alertName = builder.alertName;
        this.strategyUuid = builder.strategyUuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AlertStrategyRelation create() {
        return builder().build();
    }

    /**
     * @return alertName
     */
    public String getAlertName() {
        return this.alertName;
    }

    /**
     * @return strategyUuid
     */
    public String getStrategyUuid() {
        return this.strategyUuid;
    }

    public static final class Builder {
        private String alertName; 
        private String strategyUuid; 

        /**
         * AlertName.
         */
        public Builder alertName(String alertName) {
            this.alertName = alertName;
            return this;
        }

        /**
         * StrategyUuid.
         */
        public Builder strategyUuid(String strategyUuid) {
            this.strategyUuid = strategyUuid;
            return this;
        }

        public AlertStrategyRelation build() {
            return new AlertStrategyRelation(this);
        } 

    } 

}
