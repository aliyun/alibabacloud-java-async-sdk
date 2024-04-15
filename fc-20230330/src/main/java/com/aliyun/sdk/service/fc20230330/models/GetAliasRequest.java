// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAliasRequest} extends {@link RequestModel}
 *
 * <p>GetAliasRequest</p>
 */
public class GetAliasRequest extends Request {
    @Path
    @NameInMap("functionName")
    @Validation(required = true)
    private String functionName;

    @Path
    @NameInMap("aliasName")
    @Validation(required = true)
    private String aliasName;

    private GetAliasRequest(Builder builder) {
        super(builder);
        this.functionName = builder.functionName;
        this.aliasName = builder.aliasName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAliasRequest create() {
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

    public static final class Builder extends Request.Builder<GetAliasRequest, Builder> {
        private String functionName; 
        private String aliasName; 

        private Builder() {
            super();
        } 

        private Builder(GetAliasRequest request) {
            super(request);
            this.functionName = request.functionName;
            this.aliasName = request.aliasName;
        } 

        /**
         * The function name.
         */
        public Builder functionName(String functionName) {
            this.putPathParameter("functionName", functionName);
            this.functionName = functionName;
            return this;
        }

        /**
         * The function alias.
         */
        public Builder aliasName(String aliasName) {
            this.putPathParameter("aliasName", aliasName);
            this.aliasName = aliasName;
            return this;
        }

        @Override
        public GetAliasRequest build() {
            return new GetAliasRequest(this);
        } 

    } 

}
