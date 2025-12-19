// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link AppOperationAddress} extends {@link TeaModel}
 *
 * <p>AppOperationAddress</p>
 */
public class AppOperationAddress extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Actions")
    private java.util.List<AppOperateAction> actions;

    private AppOperationAddress(Builder builder) {
        this.actions = builder.actions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AppOperationAddress create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actions
     */
    public java.util.List<AppOperateAction> getActions() {
        return this.actions;
    }

    public static final class Builder {
        private java.util.List<AppOperateAction> actions; 

        private Builder() {
        } 

        private Builder(AppOperationAddress model) {
            this.actions = model.actions;
        } 

        /**
         * Actions.
         */
        public Builder actions(java.util.List<AppOperateAction> actions) {
            this.actions = actions;
            return this;
        }

        public AppOperationAddress build() {
            return new AppOperationAddress(this);
        } 

    } 

}
