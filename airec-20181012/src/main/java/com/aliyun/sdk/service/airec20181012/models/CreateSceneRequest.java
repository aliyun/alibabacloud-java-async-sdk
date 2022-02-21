// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSceneRequest} extends {@link RequestModel}
 *
 * <p>CreateSceneRequest</p>
 */
public class CreateSceneRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    private CreateSceneRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.dryRun = builder.dryRun;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSceneRequest create() {
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
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public static final class Builder extends Request.Builder<CreateSceneRequest, Builder> {
        private String instanceId; 
        private Boolean dryRun; 

        private Builder() {
            super();
        } 

        private Builder(CreateSceneRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.dryRun = response.dryRun;
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
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        @Override
        public CreateSceneRequest build() {
            return new CreateSceneRequest(this);
        } 

    } 

}
