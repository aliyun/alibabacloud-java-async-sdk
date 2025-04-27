// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetSuggestShrinkableNodesRequest} extends {@link RequestModel}
 *
 * <p>GetSuggestShrinkableNodesRequest</p>
 */
public class GetSuggestShrinkableNodesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("count")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer count;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ignoreStatus")
    private Boolean ignoreStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nodeType")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-nif1q9o8r0008****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The number of nodes that you want to remove.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder count(Integer count) {
            this.putQueryParameter("count", count);
            this.count = count;
            return this;
        }

        /**
         * <p>Specifies whether to ignore the instance status. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder ignoreStatus(Boolean ignoreStatus) {
            this.putQueryParameter("ignoreStatus", ignoreStatus);
            this.ignoreStatus = ignoreStatus;
            return this;
        }

        /**
         * <p>The type of removing nodes. WORKER indicates hot node and WORKER_WARM indicates warm node.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>WORKER</p>
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
