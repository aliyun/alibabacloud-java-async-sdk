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
 * {@link PutScalingConfigRequest} extends {@link RequestModel}
 *
 * <p>PutScalingConfigRequest</p>
 */
public class PutScalingConfigRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("functionName")
    private String functionName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private PutScalingConfigInput body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("qualifier")
    private String qualifier;

    private PutScalingConfigRequest(Builder builder) {
        super(builder);
        this.functionName = builder.functionName;
        this.body = builder.body;
        this.qualifier = builder.qualifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutScalingConfigRequest create() {
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
    public PutScalingConfigInput getBody() {
        return this.body;
    }

    /**
     * @return qualifier
     */
    public String getQualifier() {
        return this.qualifier;
    }

    public static final class Builder extends Request.Builder<PutScalingConfigRequest, Builder> {
        private String functionName; 
        private PutScalingConfigInput body; 
        private String qualifier; 

        private Builder() {
            super();
        } 

        private Builder(PutScalingConfigRequest request) {
            super(request);
            this.functionName = request.functionName;
            this.body = request.body;
            this.qualifier = request.qualifier;
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
         * body.
         */
        public Builder body(PutScalingConfigInput body) {
            this.putBodyParameter("body", body);
            this.body = body;
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

        @Override
        public PutScalingConfigRequest build() {
            return new PutScalingConfigRequest(this);
        } 

    } 

}
