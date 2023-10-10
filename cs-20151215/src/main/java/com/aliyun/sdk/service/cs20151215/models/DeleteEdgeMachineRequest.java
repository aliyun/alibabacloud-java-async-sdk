// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteEdgeMachineRequest} extends {@link RequestModel}
 *
 * <p>DeleteEdgeMachineRequest</p>
 */
public class DeleteEdgeMachineRequest extends Request {
    @Path
    @NameInMap("edge_machineid")
    @Validation(required = true)
    private String edgeMachineid;

    @Query
    @NameInMap("force")
    private String force;

    private DeleteEdgeMachineRequest(Builder builder) {
        super(builder);
        this.edgeMachineid = builder.edgeMachineid;
        this.force = builder.force;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteEdgeMachineRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return edgeMachineid
     */
    public String getEdgeMachineid() {
        return this.edgeMachineid;
    }

    /**
     * @return force
     */
    public String getForce() {
        return this.force;
    }

    public static final class Builder extends Request.Builder<DeleteEdgeMachineRequest, Builder> {
        private String edgeMachineid; 
        private String force; 

        private Builder() {
            super();
        } 

        private Builder(DeleteEdgeMachineRequest request) {
            super(request);
            this.edgeMachineid = request.edgeMachineid;
            this.force = request.force;
        } 

        /**
         * The ID of the cloud-native box.
         */
        public Builder edgeMachineid(String edgeMachineid) {
            this.putPathParameter("edge_machineid", edgeMachineid);
            this.edgeMachineid = edgeMachineid;
            return this;
        }

        /**
         * Specifies whether to forcefully delete the cloud-native box. Valid values:
         * <p>
         * 
         * *   `true`: forcefully deletes the cloud-native box.
         * *   `false`: does not forcefully delete the cloud-native box.
         * 
         * Default value: `false`.
         */
        public Builder force(String force) {
            this.putQueryParameter("force", force);
            this.force = force;
            return this;
        }

        @Override
        public DeleteEdgeMachineRequest build() {
            return new DeleteEdgeMachineRequest(this);
        } 

    } 

}
