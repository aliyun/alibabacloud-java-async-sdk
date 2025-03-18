// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link DeleteEdgeMachineRequest} extends {@link RequestModel}
 *
 * <p>DeleteEdgeMachineRequest</p>
 */
public class DeleteEdgeMachineRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("edge_machineid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String edgeMachineid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("force")
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
         * <p>The ID of the cloud-native box.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cc0725ddf688744979cd98445f67e****</p>
         */
        public Builder edgeMachineid(String edgeMachineid) {
            this.putPathParameter("edge_machineid", edgeMachineid);
            this.edgeMachineid = edgeMachineid;
            return this;
        }

        /**
         * <p>Specifies whether to forcefully delete the cloud-native box. Valid values:</p>
         * <ul>
         * <li><code>true</code>: forcefully deletes the cloud-native box.</li>
         * <li><code>false</code>: does not forcefully delete the cloud-native box.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true/false</p>
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
