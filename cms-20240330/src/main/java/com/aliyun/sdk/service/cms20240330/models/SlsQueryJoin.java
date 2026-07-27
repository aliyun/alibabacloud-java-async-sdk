// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link SlsQueryJoin} extends {@link TeaModel}
 *
 * <p>SlsQueryJoin</p>
 */
public class SlsQueryJoin extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("conditions")
    private java.util.List<SlsJoinCondition> conditions;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private SlsQueryJoin(Builder builder) {
        this.conditions = builder.conditions;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SlsQueryJoin create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return conditions
     */
    public java.util.List<SlsJoinCondition> getConditions() {
        return this.conditions;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private java.util.List<SlsJoinCondition> conditions; 
        private String type; 

        private Builder() {
        } 

        private Builder(SlsQueryJoin model) {
            this.conditions = model.conditions;
            this.type = model.type;
        } 

        /**
         * conditions.
         */
        public Builder conditions(java.util.List<SlsJoinCondition> conditions) {
            this.conditions = conditions;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public SlsQueryJoin build() {
            return new SlsQueryJoin(this);
        } 

    } 

}
