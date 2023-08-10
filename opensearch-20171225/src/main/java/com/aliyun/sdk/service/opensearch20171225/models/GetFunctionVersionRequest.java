// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFunctionVersionRequest} extends {@link RequestModel}
 *
 * <p>GetFunctionVersionRequest</p>
 */
public class GetFunctionVersionRequest extends Request {
    @Path
    @NameInMap("functionName")
    @Validation(required = true)
    private String functionName;

    @Path
    @NameInMap("versionId")
    @Validation(required = true)
    private Integer versionId;

    private GetFunctionVersionRequest(Builder builder) {
        super(builder);
        this.functionName = builder.functionName;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFunctionVersionRequest create() {
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

    public static final class Builder extends Request.Builder<GetFunctionVersionRequest, Builder> {
        private String functionName; 
        private Integer versionId; 

        private Builder() {
            super();
        } 

        private Builder(GetFunctionVersionRequest request) {
            super(request);
            this.functionName = request.functionName;
            this.versionId = request.versionId;
        } 

        /**
         * The name of the feature.
         */
        public Builder functionName(String functionName) {
            this.putPathParameter("functionName", functionName);
            this.functionName = functionName;
            return this;
        }

        /**
         * The ID of the version.
         */
        public Builder versionId(Integer versionId) {
            this.putPathParameter("versionId", versionId);
            this.versionId = versionId;
            return this;
        }

        @Override
        public GetFunctionVersionRequest build() {
            return new GetFunctionVersionRequest(this);
        } 

    } 

}
