// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

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
 * {@link ShopStatusChangeResult} extends {@link TeaModel}
 *
 * <p>ShopStatusChangeResult</p>
 */
public class ShopStatusChangeResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("operate")
    private Boolean operate;

    private ShopStatusChangeResult(Builder builder) {
        this.operate = builder.operate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ShopStatusChangeResult create() {
        return builder().build();
    }

    /**
     * @return operate
     */
    public Boolean getOperate() {
        return this.operate;
    }

    public static final class Builder {
        private Boolean operate; 

        /**
         * operate.
         */
        public Builder operate(Boolean operate) {
            this.operate = operate;
            return this;
        }

        public ShopStatusChangeResult build() {
            return new ShopStatusChangeResult(this);
        } 

    } 

}
