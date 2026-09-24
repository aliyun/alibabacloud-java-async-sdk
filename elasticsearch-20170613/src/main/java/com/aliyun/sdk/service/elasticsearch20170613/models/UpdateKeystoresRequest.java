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
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-3h4k3axh33th9****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Removes keystore configurations.</p>
         */
        public Builder remove(java.util.List<String> remove) {
            this.putBodyParameter("remove", remove);
            this.remove = remove;
            return this;
        }

        /**
         * <p>Adds or updates the keystore.</p>
         */
        public Builder update(java.util.Map<String, String> update) {
            this.putBodyParameter("update", update);
            this.update = update;
            return this;
        }

        /**
         * <p>Specifies whether to forcibly apply the change. Valid values:</p>
         * <ul>
         * <li>false: The change is not forcibly applied.</li>
         * <li>true: The change is forcibly applied.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
