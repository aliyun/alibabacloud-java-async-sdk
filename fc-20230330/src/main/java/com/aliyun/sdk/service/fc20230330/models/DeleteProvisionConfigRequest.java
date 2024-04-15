// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteProvisionConfigRequest} extends {@link RequestModel}
 *
 * <p>DeleteProvisionConfigRequest</p>
 */
public class DeleteProvisionConfigRequest extends Request {
    @Path
    @NameInMap("functionName")
    @Validation(required = true)
    private String functionName;

    @Query
    @NameInMap("qualifier")
    private String qualifier;

    private DeleteProvisionConfigRequest(Builder builder) {
        super(builder);
        this.functionName = builder.functionName;
        this.qualifier = builder.qualifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteProvisionConfigRequest create() {
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
     * @return qualifier
     */
    public String getQualifier() {
        return this.qualifier;
    }

    public static final class Builder extends Request.Builder<DeleteProvisionConfigRequest, Builder> {
        private String functionName; 
        private String qualifier; 

        private Builder() {
            super();
        } 

        private Builder(DeleteProvisionConfigRequest request) {
            super(request);
            this.functionName = request.functionName;
            this.qualifier = request.qualifier;
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
         * The function alias or LATEST.
         */
        public Builder qualifier(String qualifier) {
            this.putQueryParameter("qualifier", qualifier);
            this.qualifier = qualifier;
            return this;
        }

        @Override
        public DeleteProvisionConfigRequest build() {
            return new DeleteProvisionConfigRequest(this);
        } 

    } 

}
