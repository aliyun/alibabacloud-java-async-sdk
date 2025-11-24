// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

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
 * {@link DeleteServiceMeshRequest} extends {@link RequestModel}
 *
 * <p>DeleteServiceMeshRequest</p>
 */
public class DeleteServiceMeshRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Force")
    private Boolean force;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RetainResources")
    private String retainResources;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceMeshId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceMeshId;

    private DeleteServiceMeshRequest(Builder builder) {
        super(builder);
        this.force = builder.force;
        this.retainResources = builder.retainResources;
        this.serviceMeshId = builder.serviceMeshId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteServiceMeshRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return force
     */
    public Boolean getForce() {
        return this.force;
    }

    /**
     * @return retainResources
     */
    public String getRetainResources() {
        return this.retainResources;
    }

    /**
     * @return serviceMeshId
     */
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public static final class Builder extends Request.Builder<DeleteServiceMeshRequest, Builder> {
        private Boolean force; 
        private String retainResources; 
        private String serviceMeshId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteServiceMeshRequest request) {
            super(request);
            this.force = request.force;
            this.retainResources = request.retainResources;
            this.serviceMeshId = request.serviceMeshId;
        } 

        /**
         * <p>Specifies whether to forcibly delete the ASM instance. Valid values:</p>
         * <ul>
         * <li><code>true</code>: forcibly deletes the ASM instance.</li>
         * <li><code>false</code>: does not forcibly delete the ASM instance.</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder force(Boolean force) {
            this.putBodyParameter("Force", force);
            this.force = force;
            return this;
        }

        /**
         * <p>A JSON string that can be parsed into a string array. You can use this JSON string to specify the IDs of the resource instances that need to be retained when the ASM instance is deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot; lb-bp1fxvl3q8akbj6m*****&quot;, &quot;lb-bp1hoxkolggdw0y3*****&quot;]</p>
         */
        public Builder retainResources(String retainResources) {
            this.putBodyParameter("RetainResources", retainResources);
            this.retainResources = retainResources;
            return this;
        }

        /**
         * <p>The ASM instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c08ba3fd1e6484b0f8cc1ad8fe10d****</p>
         */
        public Builder serviceMeshId(String serviceMeshId) {
            this.putBodyParameter("ServiceMeshId", serviceMeshId);
            this.serviceMeshId = serviceMeshId;
            return this;
        }

        @Override
        public DeleteServiceMeshRequest build() {
            return new DeleteServiceMeshRequest(this);
        } 

    } 

}
