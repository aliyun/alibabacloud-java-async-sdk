// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListResourceInstancesRequest} extends {@link RequestModel}
 *
 * <p>ListResourceInstancesRequest</p>
 */
public class ListResourceInstancesRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("SetupProjectId")
    private String setupProjectId;

    private ListResourceInstancesRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.setupProjectId = builder.setupProjectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourceInstancesRequest create() {
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

    public static final class Builder extends Request.Builder<ListResourceInstancesRequest, Builder> {
        private String instanceId; 
        private String setupProjectId; 

        private Builder() {
            super();
        } 

        private Builder(ListResourceInstancesRequest request) {
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
        public ListResourceInstancesRequest build() {
            return new ListResourceInstancesRequest(this);
        } 

    } 

}
