// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReleasePostPaidInstanceRequest} extends {@link RequestModel}
 *
 * <p>ReleasePostPaidInstanceRequest</p>
 */
public class ReleasePostPaidInstanceRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Version")
    @Validation(required = true)
    private String version;

    private ReleasePostPaidInstanceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReleasePostPaidInstanceRequest create() {
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
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<ReleasePostPaidInstanceRequest, Builder> {
        private String instanceId; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(ReleasePostPaidInstanceRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.version = request.version;
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
         * Version.
         */
        public Builder version(String version) {
            this.putQueryParameter("Version", version);
            this.version = version;
            return this;
        }

        @Override
        public ReleasePostPaidInstanceRequest build() {
            return new ReleasePostPaidInstanceRequest(this);
        } 

    } 

}
