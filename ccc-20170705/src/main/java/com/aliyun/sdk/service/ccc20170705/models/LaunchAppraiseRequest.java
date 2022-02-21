// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LaunchAppraiseRequest} extends {@link RequestModel}
 *
 * <p>LaunchAppraiseRequest</p>
 */
public class LaunchAppraiseRequest extends Request {
    @Query
    @NameInMap("Acid")
    @Validation(required = true)
    private String acid;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private LaunchAppraiseRequest(Builder builder) {
        super(builder);
        this.acid = builder.acid;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LaunchAppraiseRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acid
     */
    public String getAcid() {
        return this.acid;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<LaunchAppraiseRequest, Builder> {
        private String acid; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(LaunchAppraiseRequest response) {
            super(response);
            this.acid = response.acid;
            this.instanceId = response.instanceId;
        } 

        /**
         * Acid.
         */
        public Builder acid(String acid) {
            this.putQueryParameter("Acid", acid);
            this.acid = acid;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public LaunchAppraiseRequest build() {
            return new LaunchAppraiseRequest(this);
        } 

    } 

}
