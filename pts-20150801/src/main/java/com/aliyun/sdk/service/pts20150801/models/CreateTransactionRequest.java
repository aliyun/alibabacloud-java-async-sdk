// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20150801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTransactionRequest} extends {@link RequestModel}
 *
 * <p>CreateTransactionRequest</p>
 */
public class CreateTransactionRequest extends Request {
    @Query
    @NameInMap("ScriptId")
    @Validation(required = true)
    private Integer scriptId;

    @Query
    @NameInMap("TransactionName")
    @Validation(required = true)
    private String transactionName;

    private CreateTransactionRequest(Builder builder) {
        super(builder);
        this.scriptId = builder.scriptId;
        this.transactionName = builder.transactionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTransactionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return scriptId
     */
    public Integer getScriptId() {
        return this.scriptId;
    }

    /**
     * @return transactionName
     */
    public String getTransactionName() {
        return this.transactionName;
    }

    public static final class Builder extends Request.Builder<CreateTransactionRequest, Builder> {
        private Integer scriptId; 
        private String transactionName; 

        private Builder() {
            super();
        } 

        private Builder(CreateTransactionRequest request) {
            super(request);
            this.scriptId = request.scriptId;
            this.transactionName = request.transactionName;
        } 

        /**
         * ScriptId.
         */
        public Builder scriptId(Integer scriptId) {
            this.putQueryParameter("ScriptId", scriptId);
            this.scriptId = scriptId;
            return this;
        }

        /**
         * TransactionName.
         */
        public Builder transactionName(String transactionName) {
            this.putQueryParameter("TransactionName", transactionName);
            this.transactionName = transactionName;
            return this;
        }

        @Override
        public CreateTransactionRequest build() {
            return new CreateTransactionRequest(this);
        } 

    } 

}
