// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateProjectProgressRequest} extends {@link RequestModel}
 *
 * <p>UpdateProjectProgressRequest</p>
 */
public class UpdateProjectProgressRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Body
    @NameInMap("Progress")
    @Validation(required = true)
    private String progress;

    @Body
    @NameInMap("SetupProjectId")
    @Validation(required = true)
    private String setupProjectId;

    private UpdateProjectProgressRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.progress = builder.progress;
        this.setupProjectId = builder.setupProjectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateProjectProgressRequest create() {
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
     * @return progress
     */
    public String getProgress() {
        return this.progress;
    }

    /**
     * @return setupProjectId
     */
    public String getSetupProjectId() {
        return this.setupProjectId;
    }

    public static final class Builder extends Request.Builder<UpdateProjectProgressRequest, Builder> {
        private String instanceId; 
        private String progress; 
        private String setupProjectId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateProjectProgressRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.progress = request.progress;
            this.setupProjectId = request.setupProjectId;
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
         * Progress.
         */
        public Builder progress(String progress) {
            this.putBodyParameter("Progress", progress);
            this.progress = progress;
            return this;
        }

        /**
         * SetupProjectId.
         */
        public Builder setupProjectId(String setupProjectId) {
            this.putBodyParameter("SetupProjectId", setupProjectId);
            this.setupProjectId = setupProjectId;
            return this;
        }

        @Override
        public UpdateProjectProgressRequest build() {
            return new UpdateProjectProgressRequest(this);
        } 

    } 

}
