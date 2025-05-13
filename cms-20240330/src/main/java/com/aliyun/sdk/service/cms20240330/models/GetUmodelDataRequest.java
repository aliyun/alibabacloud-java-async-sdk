// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link GetUmodelDataRequest} extends {@link RequestModel}
 *
 * <p>GetUmodelDataRequest</p>
 */
public class GetUmodelDataRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspace;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("content")
    private Object content;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("method")
    @com.aliyun.core.annotation.Validation(required = true)
    private String method;

    private GetUmodelDataRequest(Builder builder) {
        super(builder);
        this.workspace = builder.workspace;
        this.regionId = builder.regionId;
        this.content = builder.content;
        this.method = builder.method;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUmodelDataRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return content
     */
    public Object getContent() {
        return this.content;
    }

    /**
     * @return method
     */
    public String getMethod() {
        return this.method;
    }

    public static final class Builder extends Request.Builder<GetUmodelDataRequest, Builder> {
        private String workspace; 
        private String regionId; 
        private Object content; 
        private String method; 

        private Builder() {
            super();
        } 

        private Builder(GetUmodelDataRequest request) {
            super(request);
            this.workspace = request.workspace;
            this.regionId = request.regionId;
            this.content = request.content;
            this.method = request.method;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>workspace-test</p>
         */
        public Builder workspace(String workspace) {
            this.putPathParameter("workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * content.
         */
        public Builder content(Object content) {
            this.putBodyParameter("content", content);
            this.content = content;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ListData</p>
         */
        public Builder method(String method) {
            this.putQueryParameter("method", method);
            this.method = method;
            return this;
        }

        @Override
        public GetUmodelDataRequest build() {
            return new GetUmodelDataRequest(this);
        } 

    } 

}
