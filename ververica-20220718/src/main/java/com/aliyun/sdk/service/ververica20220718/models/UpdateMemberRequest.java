// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateMemberRequest} extends {@link RequestModel}
 *
 * <p>UpdateMemberRequest</p>
 */
public class UpdateMemberRequest extends Request {
    @Path
    @NameInMap("namespace")
    @Validation(required = true)
    private String namespace;

    @Body
    @NameInMap("body")
    private Member body;

    @Header
    @NameInMap("workspace")
    @Validation(required = true)
    private String workspace;

    private UpdateMemberRequest(Builder builder) {
        super(builder);
        this.namespace = builder.namespace;
        this.body = builder.body;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMemberRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return body
     */
    public Member getBody() {
        return this.body;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<UpdateMemberRequest, Builder> {
        private String namespace; 
        private Member body; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMemberRequest request) {
            super(request);
            this.namespace = request.namespace;
            this.body = request.body;
            this.workspace = request.workspace;
        } 

        /**
         * namespace.
         */
        public Builder namespace(String namespace) {
            this.putPathParameter("namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * body.
         */
        public Builder body(Member body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * workspace.
         */
        public Builder workspace(String workspace) {
            this.putHeaderParameter("workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        @Override
        public UpdateMemberRequest build() {
            return new UpdateMemberRequest(this);
        } 

    } 

}
