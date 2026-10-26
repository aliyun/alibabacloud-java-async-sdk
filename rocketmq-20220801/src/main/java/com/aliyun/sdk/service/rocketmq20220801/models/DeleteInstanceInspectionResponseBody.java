// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

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
 * {@link DeleteInstanceInspectionResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteInstanceInspectionResponseBody</p>
 */
public class DeleteInstanceInspectionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ok")
    private Boolean ok;

    private DeleteInstanceInspectionResponseBody(Builder builder) {
        this.ok = builder.ok;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteInstanceInspectionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ok
     */
    public Boolean getOk() {
        return this.ok;
    }

    public static final class Builder {
        private Boolean ok; 

        private Builder() {
        } 

        private Builder(DeleteInstanceInspectionResponseBody model) {
            this.ok = model.ok;
        } 

        /**
         * ok.
         */
        public Builder ok(Boolean ok) {
            this.ok = ok;
            return this;
        }

        public DeleteInstanceInspectionResponseBody build() {
            return new DeleteInstanceInspectionResponseBody(this);
        } 

    } 

}
