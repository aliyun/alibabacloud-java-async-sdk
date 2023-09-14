// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCrowdUsersRequest} extends {@link RequestModel}
 *
 * <p>ListCrowdUsersRequest</p>
 */
public class ListCrowdUsersRequest extends Request {
    @Path
    @NameInMap("CrowdId")
    @Validation(required = true)
    private String crowdId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private ListCrowdUsersRequest(Builder builder) {
        super(builder);
        this.crowdId = builder.crowdId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCrowdUsersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return crowdId
     */
    public String getCrowdId() {
        return this.crowdId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<ListCrowdUsersRequest, Builder> {
        private String crowdId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(ListCrowdUsersRequest request) {
            super(request);
            this.crowdId = request.crowdId;
            this.instanceId = request.instanceId;
        } 

        /**
         * CrowdId.
         */
        public Builder crowdId(String crowdId) {
            this.putPathParameter("CrowdId", crowdId);
            this.crowdId = crowdId;
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
        public ListCrowdUsersRequest build() {
            return new ListCrowdUsersRequest(this);
        } 

    } 

}
