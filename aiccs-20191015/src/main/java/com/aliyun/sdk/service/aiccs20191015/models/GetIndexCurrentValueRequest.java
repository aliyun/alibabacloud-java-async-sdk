// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetIndexCurrentValueRequest} extends {@link RequestModel}
 *
 * <p>GetIndexCurrentValueRequest</p>
 */
public class GetIndexCurrentValueRequest extends Request {
    @Query
    @NameInMap("DepIds")
    private String depIds;

    @Query
    @NameInMap("GroupIds")
    private String groupIds;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    private GetIndexCurrentValueRequest(Builder builder) {
        super(builder);
        this.depIds = builder.depIds;
        this.groupIds = builder.groupIds;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIndexCurrentValueRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return depIds
     */
    public String getDepIds() {
        return this.depIds;
    }

    /**
     * @return groupIds
     */
    public String getGroupIds() {
        return this.groupIds;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<GetIndexCurrentValueRequest, Builder> {
        private String depIds; 
        private String groupIds; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetIndexCurrentValueRequest request) {
            super(request);
            this.depIds = request.depIds;
            this.groupIds = request.groupIds;
            this.instanceId = request.instanceId;
        } 

        /**
         * DepIds.
         */
        public Builder depIds(String depIds) {
            this.putQueryParameter("DepIds", depIds);
            this.depIds = depIds;
            return this;
        }

        /**
         * GroupIds.
         */
        public Builder groupIds(String groupIds) {
            this.putQueryParameter("GroupIds", groupIds);
            this.groupIds = groupIds;
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
        public GetIndexCurrentValueRequest build() {
            return new GetIndexCurrentValueRequest(this);
        } 

    } 

}
