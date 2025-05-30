// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yunjian20211217.models;

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
 * {@link DeleteUrgentDemandItemRequest} extends {@link RequestModel}
 *
 * <p>DeleteUrgentDemandItemRequest</p>
 */
public class DeleteUrgentDemandItemRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("Yun-User-Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String yunUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("modifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modifier;

    private DeleteUrgentDemandItemRequest(Builder builder) {
        super(builder);
        this.yunUserId = builder.yunUserId;
        this.id = builder.id;
        this.modifier = builder.modifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteUrgentDemandItemRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return yunUserId
     */
    public String getYunUserId() {
        return this.yunUserId;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return modifier
     */
    public String getModifier() {
        return this.modifier;
    }

    public static final class Builder extends Request.Builder<DeleteUrgentDemandItemRequest, Builder> {
        private String yunUserId; 
        private Long id; 
        private String modifier; 

        private Builder() {
            super();
        } 

        private Builder(DeleteUrgentDemandItemRequest request) {
            super(request);
            this.yunUserId = request.yunUserId;
            this.id = request.id;
            this.modifier = request.modifier;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>111222</p>
         */
        public Builder yunUserId(String yunUserId) {
            this.putHeaderParameter("Yun-User-Id", yunUserId);
            this.yunUserId = yunUserId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>111222</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>111222</p>
         */
        public Builder modifier(String modifier) {
            this.putQueryParameter("modifier", modifier);
            this.modifier = modifier;
            return this;
        }

        @Override
        public DeleteUrgentDemandItemRequest build() {
            return new DeleteUrgentDemandItemRequest(this);
        } 

    } 

}
