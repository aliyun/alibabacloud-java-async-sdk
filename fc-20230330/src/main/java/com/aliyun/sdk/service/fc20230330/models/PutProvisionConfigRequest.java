// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutProvisionConfigRequest} extends {@link RequestModel}
 *
 * <p>PutProvisionConfigRequest</p>
 */
public class PutProvisionConfigRequest extends Request {
    @Path
    @NameInMap("functionName")
    @Validation(required = true)
    private String functionName;

    @Query
    @NameInMap("qualifier")
    private String qualifier;

    @Body
    @NameInMap("request")
    @Validation(required = true)
    private PutProvisionConfigInput request;

    private PutProvisionConfigRequest(Builder builder) {
        super(builder);
        this.functionName = builder.functionName;
        this.qualifier = builder.qualifier;
        this.request = builder.request;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutProvisionConfigRequest create() {
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

    /**
     * @return request
     */
    public PutProvisionConfigInput getRequest() {
        return this.request;
    }

    public static final class Builder extends Request.Builder<PutProvisionConfigRequest, Builder> {
        private String functionName; 
        private String qualifier; 
        private PutProvisionConfigInput request; 

        private Builder() {
            super();
        } 

        private Builder(PutProvisionConfigRequest request) {
            super(request);
            this.functionName = request.functionName;
            this.qualifier = request.qualifier;
            this.request = request.request;
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
         * qualifier.
         */
        public Builder qualifier(String qualifier) {
            this.putQueryParameter("qualifier", qualifier);
            this.qualifier = qualifier;
            return this;
        }

        /**
         * request.
         */
        public Builder request(PutProvisionConfigInput request) {
            this.putBodyParameter("request", request);
            this.request = request;
            return this;
        }

        @Override
        public PutProvisionConfigRequest build() {
            return new PutProvisionConfigRequest(this);
        } 

    } 

}
