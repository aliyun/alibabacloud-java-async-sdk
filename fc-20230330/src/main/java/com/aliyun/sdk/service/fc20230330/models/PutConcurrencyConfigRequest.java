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
 * {@link PutConcurrencyConfigRequest} extends {@link RequestModel}
 *
 * <p>PutConcurrencyConfigRequest</p>
 */
public class PutConcurrencyConfigRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("functionName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String functionName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    @com.aliyun.core.annotation.Validation(required = true)
    private PutConcurrencyInput body;

    private PutConcurrencyConfigRequest(Builder builder) {
        super(builder);
        this.functionName = builder.functionName;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutConcurrencyConfigRequest create() {
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
     * @return body
     */
    public PutConcurrencyInput getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<PutConcurrencyConfigRequest, Builder> {
        private String functionName; 
        private PutConcurrencyInput body; 

        private Builder() {
            super();
        } 

        private Builder(PutConcurrencyConfigRequest request) {
            super(request);
            this.functionName = request.functionName;
            this.body = request.body;
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
         * <p>The concurrency configurations.</p>
         * <p>This parameter is required.</p>
         */
        public Builder body(PutConcurrencyInput body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public PutConcurrencyConfigRequest build() {
            return new PutConcurrencyConfigRequest(this);
        } 

    } 

}
