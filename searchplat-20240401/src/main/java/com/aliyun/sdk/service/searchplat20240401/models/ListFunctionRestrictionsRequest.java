// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchplat20240401.models;

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
 * {@link ListFunctionRestrictionsRequest} extends {@link RequestModel}
 *
 * <p>ListFunctionRestrictionsRequest</p>
 */
public class ListFunctionRestrictionsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceName")
    private String workspaceName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("functionName")
    private String functionName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("restrictionName")
    private String restrictionName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("modelType")
    private String modelType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("region")
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("source")
    private String source;

    private ListFunctionRestrictionsRequest(Builder builder) {
        super(builder);
        this.workspaceName = builder.workspaceName;
        this.functionName = builder.functionName;
        this.restrictionName = builder.restrictionName;
        this.modelType = builder.modelType;
        this.region = builder.region;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFunctionRestrictionsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceName
     */
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    /**
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * @return restrictionName
     */
    public String getRestrictionName() {
        return this.restrictionName;
    }

    /**
     * @return modelType
     */
    public String getModelType() {
        return this.modelType;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    public static final class Builder extends Request.Builder<ListFunctionRestrictionsRequest, Builder> {
        private String workspaceName; 
        private String functionName; 
        private String restrictionName; 
        private String modelType; 
        private String region; 
        private String source; 

        private Builder() {
            super();
        } 

        private Builder(ListFunctionRestrictionsRequest request) {
            super(request);
            this.workspaceName = request.workspaceName;
            this.functionName = request.functionName;
            this.restrictionName = request.restrictionName;
            this.modelType = request.modelType;
            this.region = request.region;
            this.source = request.source;
        } 

        /**
         * workspaceName.
         */
        public Builder workspaceName(String workspaceName) {
            this.putPathParameter("workspaceName", workspaceName);
            this.workspaceName = workspaceName;
            return this;
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
         * restrictionName.
         */
        public Builder restrictionName(String restrictionName) {
            this.putPathParameter("restrictionName", restrictionName);
            this.restrictionName = restrictionName;
            return this;
        }

        /**
         * modelType.
         */
        public Builder modelType(String modelType) {
            this.putQueryParameter("modelType", modelType);
            this.modelType = modelType;
            return this;
        }

        /**
         * region.
         */
        public Builder region(String region) {
            this.putQueryParameter("region", region);
            this.region = region;
            return this;
        }

        /**
         * source.
         */
        public Builder source(String source) {
            this.putQueryParameter("source", source);
            this.source = source;
            return this;
        }

        @Override
        public ListFunctionRestrictionsRequest build() {
            return new ListFunctionRestrictionsRequest(this);
        } 

    } 

}
