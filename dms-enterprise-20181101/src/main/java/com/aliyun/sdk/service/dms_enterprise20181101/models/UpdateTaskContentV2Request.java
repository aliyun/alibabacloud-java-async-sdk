// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link UpdateTaskContentV2Request} extends {@link RequestModel}
 *
 * <p>UpdateTaskContentV2Request</p>
 */
public class UpdateTaskContentV2Request extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeContent")
    private String nodeContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeId")
    private String nodeId;

    private UpdateTaskContentV2Request(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.nodeContent = builder.nodeContent;
        this.nodeId = builder.nodeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTaskContentV2Request create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return nodeContent
     */
    public String getNodeContent() {
        return this.nodeContent;
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    public static final class Builder extends Request.Builder<UpdateTaskContentV2Request, Builder> {
        private String regionId; 
        private String nodeContent; 
        private String nodeId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTaskContentV2Request request) {
            super(request);
            this.regionId = request.regionId;
            this.nodeContent = request.nodeContent;
            this.nodeId = request.nodeId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * NodeContent.
         */
        public Builder nodeContent(String nodeContent) {
            this.putBodyParameter("NodeContent", nodeContent);
            this.nodeContent = nodeContent;
            return this;
        }

        /**
         * NodeId.
         */
        public Builder nodeId(String nodeId) {
            this.putQueryParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        @Override
        public UpdateTaskContentV2Request build() {
            return new UpdateTaskContentV2Request(this);
        } 

    } 

}
