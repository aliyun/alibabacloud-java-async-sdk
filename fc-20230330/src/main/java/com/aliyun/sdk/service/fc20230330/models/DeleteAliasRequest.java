// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link DeleteAliasRequest} extends {@link RequestModel}
 *
 * <p>DeleteAliasRequest</p>
 */
public class DeleteAliasRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("functionName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String functionName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("aliasName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aliasName;

    private DeleteAliasRequest(Builder builder) {
        super(builder);
        this.functionName = builder.functionName;
        this.aliasName = builder.aliasName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAliasRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * @return aliasName
     */
    public String getAliasName() {
        return this.aliasName;
    }

    public static final class Builder extends Request.Builder<DeleteAliasRequest, Builder> {
        private String functionName; 
        private String aliasName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAliasRequest request) {
            super(request);
            this.functionName = request.functionName;
            this.aliasName = request.aliasName;
        } 

        /**
         * <p>The function name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-func</p>
         */
        public Builder functionName(String functionName) {
            this.putPathParameter("functionName", functionName);
            this.functionName = functionName;
            return this;
        }

        /**
         * <p>The function alias.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-alias</p>
         */
        public Builder aliasName(String aliasName) {
            this.putPathParameter("aliasName", aliasName);
            this.aliasName = aliasName;
            return this;
        }

        @Override
        public DeleteAliasRequest build() {
            return new DeleteAliasRequest(this);
        } 

    } 

}
