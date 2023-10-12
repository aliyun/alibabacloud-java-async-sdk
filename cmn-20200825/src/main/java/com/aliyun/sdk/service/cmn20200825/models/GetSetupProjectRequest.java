// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSetupProjectRequest} extends {@link RequestModel}
 *
 * <p>GetSetupProjectRequest</p>
 */
public class GetSetupProjectRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("SetupProjectId")
    @Validation(required = true)
    private String setupProjectId;

    private GetSetupProjectRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.setupProjectId = builder.setupProjectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSetupProjectRequest create() {
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

    public static final class Builder extends Request.Builder<GetSetupProjectRequest, Builder> {
        private String instanceId; 
        private String setupProjectId; 

        private Builder() {
            super();
        } 

        private Builder(GetSetupProjectRequest request) {
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
            this.putQueryParameter("SetupProjectId", setupProjectId);
            this.setupProjectId = setupProjectId;
            return this;
        }

        @Override
        public GetSetupProjectRequest build() {
            return new GetSetupProjectRequest(this);
        } 

    } 

}
