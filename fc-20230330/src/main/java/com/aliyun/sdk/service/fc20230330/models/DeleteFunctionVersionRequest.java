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
    @NameInMap("versionID")
    @Validation(required = true)
    private Integer versionID;

    private DeleteFunctionVersionRequest(Builder builder) {
        super(builder);
        this.functionName = builder.functionName;
        this.versionID = builder.versionID;
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
     * @return versionID
     */
    public Integer getVersionID() {
        return this.versionID;
    }

    public static final class Builder extends Request.Builder<DeleteFunctionVersionRequest, Builder> {
        private String functionName; 
        private Integer versionID; 

        private Builder() {
            super();
        } 

        private Builder(DeleteFunctionVersionRequest request) {
            super(request);
            this.functionName = request.functionName;
            this.versionID = request.versionID;
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
         * versionID.
         */
        public Builder versionID(Integer versionID) {
            this.putPathParameter("versionID", versionID);
            this.versionID = versionID;
            return this;
        }

        @Override
        public DeleteFunctionVersionRequest build() {
            return new DeleteFunctionVersionRequest(this);
        } 

    } 

}
