// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachEnsInstancesRequest} extends {@link RequestModel}
 *
 * <p>AttachEnsInstancesRequest</p>
 */
public class AttachEnsInstancesRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Scripts")
    @Validation(required = true)
    private String scripts;

    @Query
    @NameInMap("Version")
    @Validation(required = true)
    private String version;

    private AttachEnsInstancesRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.scripts = builder.scripts;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachEnsInstancesRequest create() {
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
     * @return scripts
     */
    public String getScripts() {
        return this.scripts;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<AttachEnsInstancesRequest, Builder> {
        private String instanceId; 
        private String scripts; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(AttachEnsInstancesRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.scripts = response.scripts;
            this.version = response.version;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Scripts.
         */
        public Builder scripts(String scripts) {
            this.putQueryParameter("Scripts", scripts);
            this.scripts = scripts;
            return this;
        }

        /**
         * Version.
         */
        public Builder version(String version) {
            this.putQueryParameter("Version", version);
            this.version = version;
            return this;
        }

        @Override
        public AttachEnsInstancesRequest build() {
            return new AttachEnsInstancesRequest(this);
        } 

    } 

}
