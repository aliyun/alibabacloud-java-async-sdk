// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAliasRequest} extends {@link RequestModel}
 *
 * <p>UpdateAliasRequest</p>
 */
public class UpdateAliasRequest extends Request {
    @Path
    @NameInMap("functionName")
    @Validation(required = true)
    private String functionName;

    @Path
    @NameInMap("aliasName")
    @Validation(required = true)
    private String aliasName;

    @Body
    @NameInMap("body")
    @Validation(required = true)
    private UpdateAliasInput body;

    private UpdateAliasRequest(Builder builder) {
        super(builder);
        this.functionName = builder.functionName;
        this.aliasName = builder.aliasName;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAliasRequest create() {
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

    /**
     * @return body
     */
    public UpdateAliasInput getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UpdateAliasRequest, Builder> {
        private String functionName; 
        private String aliasName; 
        private UpdateAliasInput body; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAliasRequest request) {
            super(request);
            this.functionName = request.functionName;
            this.aliasName = request.aliasName;
            this.body = request.body;
        } 

        /**
         * functionName.
         */
        public Builder functionName(String functionName) {
            this.putPathParameter("functionName", functionName);
            this.functionName = functionName;
            return this;
        }

        /**
         * aliasName.
         */
        public Builder aliasName(String aliasName) {
            this.putPathParameter("aliasName", aliasName);
            this.aliasName = aliasName;
            return this;
        }

        /**
         * body.
         */
        public Builder body(UpdateAliasInput body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public UpdateAliasRequest build() {
            return new UpdateAliasRequest(this);
        } 

    } 

}
