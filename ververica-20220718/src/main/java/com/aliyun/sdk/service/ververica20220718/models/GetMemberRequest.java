// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMemberRequest} extends {@link RequestModel}
 *
 * <p>GetMemberRequest</p>
 */
public class GetMemberRequest extends Request {
    @Path
    @NameInMap("namespace")
    @Validation(required = true)
    private String namespace;

    @Path
    @NameInMap("member")
    @Validation(required = true)
    private String member;

    @Header
    @NameInMap("workspace")
    @Validation(required = true)
    private String workspace;

    private GetMemberRequest(Builder builder) {
        super(builder);
        this.namespace = builder.namespace;
        this.member = builder.member;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMemberRequest create() {
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
     * @return member
     */
    public String getMember() {
        return this.member;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<GetMemberRequest, Builder> {
        private String namespace; 
        private String member; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(GetMemberRequest request) {
            super(request);
            this.namespace = request.namespace;
            this.member = request.member;
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
         * member.
         */
        public Builder member(String member) {
            this.putPathParameter("member", member);
            this.member = member;
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
        public GetMemberRequest build() {
            return new GetMemberRequest(this);
        } 

    } 

}
