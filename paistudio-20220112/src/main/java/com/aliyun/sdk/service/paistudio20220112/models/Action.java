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
 * {@link Action} extends {@link TeaModel}
 *
 * <p>Action</p>
 */
public class Action extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ActionType")
    private String actionType;

    private Action(Builder builder) {
        this.actionType = builder.actionType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Action create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actionType
     */
    public String getActionType() {
        return this.actionType;
    }

    public static final class Builder {
        private String actionType; 

        private Builder() {
        } 

        private Builder(Action model) {
            this.actionType = model.actionType;
        } 

        /**
         * ActionType.
         */
        public Builder actionType(String actionType) {
            this.actionType = actionType;
            return this;
        }

        public Action build() {
            return new Action(this);
        } 

    } 

}
