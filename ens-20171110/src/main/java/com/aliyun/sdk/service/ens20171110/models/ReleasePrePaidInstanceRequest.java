// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReleasePrePaidInstanceRequest} extends {@link RequestModel}
 *
 * <p>ReleasePrePaidInstanceRequest</p>
 */
public class ReleasePrePaidInstanceRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Version")
    @Validation(required = true)
    private String version;

    private ReleasePrePaidInstanceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReleasePrePaidInstanceRequest create() {
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

    public static final class Builder extends Request.Builder<ReleasePrePaidInstanceRequest, Builder> {
        private String instanceId; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(ReleasePrePaidInstanceRequest response) {
            super(response);
            this.instanceId = response.instanceId;
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
         * Version.
         */
        public Builder version(String version) {
            this.putQueryParameter("Version", version);
            this.version = version;
            return this;
        }

        @Override
        public ReleasePrePaidInstanceRequest build() {
            return new ReleasePrePaidInstanceRequest(this);
        } 

    } 

}
