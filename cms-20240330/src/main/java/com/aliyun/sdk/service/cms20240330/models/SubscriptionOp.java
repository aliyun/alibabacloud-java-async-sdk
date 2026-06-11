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
 * {@link SubscriptionOp} extends {@link TeaModel}
 *
 * <p>SubscriptionOp</p>
 */
public class SubscriptionOp extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("op")
    private String op;

    @com.aliyun.core.annotation.NameInMap("payload")
    private SubscriptionForModify payload;

    @com.aliyun.core.annotation.NameInMap("uuid")
    private String uuid;

    private SubscriptionOp(Builder builder) {
        this.op = builder.op;
        this.payload = builder.payload;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubscriptionOp create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return op
     */
    public String getOp() {
        return this.op;
    }

    /**
     * @return payload
     */
    public SubscriptionForModify getPayload() {
        return this.payload;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder {
        private String op; 
        private SubscriptionForModify payload; 
        private String uuid; 

        private Builder() {
        } 

        private Builder(SubscriptionOp model) {
            this.op = model.op;
            this.payload = model.payload;
            this.uuid = model.uuid;
        } 

        /**
         * op.
         */
        public Builder op(String op) {
            this.op = op;
            return this;
        }

        /**
         * <p>create/update 必填</p>
         */
        public Builder payload(SubscriptionForModify payload) {
            this.payload = payload;
            return this;
        }

        /**
         * <p>update/remove 必填</p>
         */
        public Builder uuid(String uuid) {
            this.uuid = uuid;
            return this;
        }

        public SubscriptionOp build() {
            return new SubscriptionOp(this);
        } 

    } 

}
