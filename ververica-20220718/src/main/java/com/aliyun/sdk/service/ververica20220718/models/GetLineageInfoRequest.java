// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetLineageInfoRequest} extends {@link RequestModel}
 *
 * <p>GetLineageInfoRequest</p>
 */
public class GetLineageInfoRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private GetLineageInfoParams body;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspace;

    private GetLineageInfoRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLineageInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public GetLineageInfoParams getBody() {
        return this.body;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<GetLineageInfoRequest, Builder> {
        private GetLineageInfoParams body; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(GetLineageInfoRequest request) {
            super(request);
            this.body = request.body;
            this.workspace = request.workspace;
        } 

        /**
         * <p>The parameters about the lineage information.</p>
         */
        public Builder body(GetLineageInfoParams body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * <p>The workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>710d6a64d8****</p>
         */
        public Builder workspace(String workspace) {
            this.putHeaderParameter("workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        @Override
        public GetLineageInfoRequest build() {
            return new GetLineageInfoRequest(this);
        } 

    } 

}
