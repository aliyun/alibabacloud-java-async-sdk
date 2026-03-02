// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link StrategyItem} extends {@link TeaModel}
 *
 * <p>StrategyItem</p>
 */
public class StrategyItem extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("action")
    private String action;

    @com.aliyun.core.annotation.NameInMap("resource")
    private String resource;

    private StrategyItem(Builder builder) {
        this.action = builder.action;
        this.resource = builder.resource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StrategyItem create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return action
     */
    public String getAction() {
        return this.action;
    }

    /**
     * @return resource
     */
    public String getResource() {
        return this.resource;
    }

    public static final class Builder {
        private String action; 
        private String resource; 

        private Builder() {
        } 

        private Builder(StrategyItem model) {
            this.action = model.action;
            this.resource = model.resource;
        } 

        /**
         * action.
         */
        public Builder action(String action) {
            this.action = action;
            return this;
        }

        /**
         * resource.
         */
        public Builder resource(String resource) {
            this.resource = resource;
            return this;
        }

        public StrategyItem build() {
            return new StrategyItem(this);
        } 

    } 

}
