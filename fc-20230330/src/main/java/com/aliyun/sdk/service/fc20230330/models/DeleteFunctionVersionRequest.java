// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteFunctionVersionRequest} extends {@link RequestModel}
 *
 * <p>DeleteFunctionVersionRequest</p>
 */
public class DeleteFunctionVersionRequest extends Request {
    @Path
    @NameInMap("functionName")
    @Validation(required = true)
    private String functionName;

    @Path
    @NameInMap("versionId")
    @Validation(required = true)
    private Integer versionId;

    private DeleteFunctionVersionRequest(Builder builder) {
        super(builder);
        this.functionName = builder.functionName;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteFunctionVersionRequest create() {
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
     * @return versionId
     */
    public Integer getVersionId() {
        return this.versionId;
    }

    public static final class Builder extends Request.Builder<DeleteFunctionVersionRequest, Builder> {
        private String functionName; 
        private Integer versionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteFunctionVersionRequest request) {
            super(request);
            this.functionName = request.functionName;
            this.versionId = request.versionId;
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
         * The function version.
         */
        public Builder versionId(Integer versionId) {
            this.putPathParameter("versionId", versionId);
            this.versionId = versionId;
            return this;
        }

        @Override
        public DeleteFunctionVersionRequest build() {
            return new DeleteFunctionVersionRequest(this);
        } 

    } 

}
