// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSuggestShrinkableNodesRequest} extends {@link RequestModel}
 *
 * <p>GetSuggestShrinkableNodesRequest</p>
 */
public class GetSuggestShrinkableNodesRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("count")
    @Validation(required = true)
    private Integer count;

    @Query
    @NameInMap("ignoreStatus")
    private Boolean ignoreStatus;

    @Query
    @NameInMap("nodeType")
    @Validation(required = true)
    private String nodeType;

    private GetSuggestShrinkableNodesRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.count = builder.count;
        this.ignoreStatus = builder.ignoreStatus;
        this.nodeType = builder.nodeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSuggestShrinkableNodesRequest create() {
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
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return ignoreStatus
     */
    public Boolean getIgnoreStatus() {
        return this.ignoreStatus;
    }

    /**
     * @return nodeType
     */
    public String getNodeType() {
        return this.nodeType;
    }

    public static final class Builder extends Request.Builder<GetSuggestShrinkableNodesRequest, Builder> {
        private String instanceId; 
        private Integer count; 
        private Boolean ignoreStatus; 
        private String nodeType; 

        private Builder() {
            super();
        } 

        private Builder(GetSuggestShrinkableNodesRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.count = request.count;
            this.ignoreStatus = request.ignoreStatus;
            this.nodeType = request.nodeType;
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
         * count.
         */
        public Builder count(Integer count) {
            this.putQueryParameter("count", count);
            this.count = count;
            return this;
        }

        /**
         * ignoreStatus.
         */
        public Builder ignoreStatus(Boolean ignoreStatus) {
            this.putQueryParameter("ignoreStatus", ignoreStatus);
            this.ignoreStatus = ignoreStatus;
            return this;
        }

        /**
         * nodeType.
         */
        public Builder nodeType(String nodeType) {
            this.putQueryParameter("nodeType", nodeType);
            this.nodeType = nodeType;
            return this;
        }

        @Override
        public GetSuggestShrinkableNodesRequest build() {
            return new GetSuggestShrinkableNodesRequest(this);
        } 

    } 

}
