// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSetupProjectRequest} extends {@link RequestModel}
 *
 * <p>DeleteSetupProjectRequest</p>
 */
public class DeleteSetupProjectRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Body
    @NameInMap("SetupProjectId")
    @Validation(required = true)
    private String setupProjectId;

    private DeleteSetupProjectRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.setupProjectId = builder.setupProjectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSetupProjectRequest create() {
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
     * @return setupProjectId
     */
    public String getSetupProjectId() {
        return this.setupProjectId;
    }

    public static final class Builder extends Request.Builder<DeleteSetupProjectRequest, Builder> {
        private String instanceId; 
        private String setupProjectId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSetupProjectRequest request) {
            super(request);
            this.instanceId = request.instanceId;
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
         * SetupProjectId.
         */
        public Builder setupProjectId(String setupProjectId) {
            this.putBodyParameter("SetupProjectId", setupProjectId);
            this.setupProjectId = setupProjectId;
            return this;
        }

        @Override
        public DeleteSetupProjectRequest build() {
            return new DeleteSetupProjectRequest(this);
        } 

    } 

}
