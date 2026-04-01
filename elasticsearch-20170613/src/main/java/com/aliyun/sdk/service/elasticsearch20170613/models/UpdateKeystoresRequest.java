// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link UpdateKeystoresRequest} extends {@link RequestModel}
 *
 * <p>UpdateKeystoresRequest</p>
 */
public class UpdateKeystoresRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("remove")
    private java.util.List<String> remove;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("update")
    private java.util.Map<String, String> update;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("force")
    private String force;

    private UpdateKeystoresRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.remove = builder.remove;
        this.update = builder.update;
        this.force = builder.force;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateKeystoresRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return remove
     */
    public java.util.List<String> getRemove() {
        return this.remove;
    }

    /**
     * @return update
     */
    public java.util.Map<String, String> getUpdate() {
        return this.update;
    }

    /**
     * @return force
     */
    public String getForce() {
        return this.force;
    }

    public static final class Builder extends Request.Builder<UpdateKeystoresRequest, Builder> {
        private String instanceId; 
        private java.util.List<String> remove; 
        private java.util.Map<String, String> update; 
        private String force; 

        private Builder() {
            super();
        } 

        private Builder(UpdateKeystoresRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.remove = request.remove;
            this.update = request.update;
            this.force = request.force;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * remove.
         */
        public Builder remove(java.util.List<String> remove) {
            this.putBodyParameter("remove", remove);
            this.remove = remove;
            return this;
        }

        /**
         * update.
         */
        public Builder update(java.util.Map<String, String> update) {
            this.putBodyParameter("update", update);
            this.update = update;
            return this;
        }

        /**
         * force.
         */
        public Builder force(String force) {
            this.putQueryParameter("force", force);
            this.force = force;
            return this;
        }

        @Override
        public UpdateKeystoresRequest build() {
            return new UpdateKeystoresRequest(this);
        } 

    } 

}
