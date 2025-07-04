// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link JoinConfiguration} extends {@link TeaModel}
 *
 * <p>JoinConfiguration</p>
 */
public class JoinConfiguration extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("condition")
    private String condition;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private JoinConfiguration(Builder builder) {
        this.condition = builder.condition;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static JoinConfiguration create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return condition
     */
    public String getCondition() {
        return this.condition;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String condition; 
        private String type; 

        private Builder() {
        } 

        private Builder(JoinConfiguration model) {
            this.condition = model.condition;
            this.type = model.type;
        } 

        /**
         * condition.
         */
        public Builder condition(String condition) {
            this.condition = condition;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public JoinConfiguration build() {
            return new JoinConfiguration(this);
        } 

    } 

}
