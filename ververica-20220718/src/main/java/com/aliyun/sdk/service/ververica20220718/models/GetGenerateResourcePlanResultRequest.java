// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetGenerateResourcePlanResultRequest} extends {@link RequestModel}
 *
 * <p>GetGenerateResourcePlanResultRequest</p>
 */
public class GetGenerateResourcePlanResultRequest extends Request {
    @Path
    @NameInMap("namespace")
    @Validation(required = true)
    private String namespace;

    @Path
    @NameInMap("ticketId")
    @Validation(required = true)
    private String ticketId;

    @Header
    @NameInMap("workspace")
    @Validation(required = true)
    private String workspace;

    private GetGenerateResourcePlanResultRequest(Builder builder) {
        super(builder);
        this.namespace = builder.namespace;
        this.ticketId = builder.ticketId;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGenerateResourcePlanResultRequest create() {
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
     * @return ticketId
     */
    public String getTicketId() {
        return this.ticketId;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<GetGenerateResourcePlanResultRequest, Builder> {
        private String namespace; 
        private String ticketId; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(GetGenerateResourcePlanResultRequest request) {
            super(request);
            this.namespace = request.namespace;
            this.ticketId = request.ticketId;
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
         * ticketId.
         */
        public Builder ticketId(String ticketId) {
            this.putPathParameter("ticketId", ticketId);
            this.ticketId = ticketId;
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
        public GetGenerateResourcePlanResultRequest build() {
            return new GetGenerateResourcePlanResultRequest(this);
        } 

    } 

}
