// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetProvisionConfigRequest} extends {@link RequestModel}
 *
 * <p>GetProvisionConfigRequest</p>
 */
public class GetProvisionConfigRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("functionName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String functionName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("qualifier")
    private String qualifier;

    private GetProvisionConfigRequest(Builder builder) {
        super(builder);
        this.functionName = builder.functionName;
        this.qualifier = builder.qualifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProvisionConfigRequest create() {
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

    public static final class Builder extends Request.Builder<GetProvisionConfigRequest, Builder> {
        private String functionName; 
        private String qualifier; 

        private Builder() {
            super();
        } 

        private Builder(GetProvisionConfigRequest request) {
            super(request);
            this.functionName = request.functionName;
            this.qualifier = request.qualifier;
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
         * <p>The function alias or LATEST.</p>
         * 
         * <strong>example:</strong>
         * <p>LATEST</p>
         */
        public Builder qualifier(String qualifier) {
            this.putQueryParameter("qualifier", qualifier);
            this.qualifier = qualifier;
            return this;
        }

        @Override
        public GetProvisionConfigRequest build() {
            return new GetProvisionConfigRequest(this);
        } 

    } 

}
