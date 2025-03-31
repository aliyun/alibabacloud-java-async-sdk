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
 * {@link DeleteFunctionVersionRequest} extends {@link RequestModel}
 *
 * <p>DeleteFunctionVersionRequest</p>
 */
public class DeleteFunctionVersionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("functionName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String functionName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("versionId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>函数版本。</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
