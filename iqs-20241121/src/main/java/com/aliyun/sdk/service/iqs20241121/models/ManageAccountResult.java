// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241121.models;

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
 * {@link ManageAccountResult} extends {@link TeaModel}
 *
 * <p>ManageAccountResult</p>
 */
public class ManageAccountResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private ManageAccountResult(Builder builder) {
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ManageAccountResult create() {
        return builder().build();
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Boolean success; 

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ManageAccountResult build() {
            return new ManageAccountResult(this);
        } 

    } 

}
