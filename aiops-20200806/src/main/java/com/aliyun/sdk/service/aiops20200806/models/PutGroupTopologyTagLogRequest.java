// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutGroupTopologyTagLogRequest} extends {@link RequestModel}
 *
 * <p>PutGroupTopologyTagLogRequest</p>
 */
public class PutGroupTopologyTagLogRequest extends Request {
    @Query
    @NameInMap("BusinessGroupId")
    private String businessGroupId;

    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    @Query
    @NameInMap("TopologyTag")
    private String topologyTag;

    @Query
    @NameInMap("TopologyTagShow")
    private String topologyTagShow;

    private PutGroupTopologyTagLogRequest(Builder builder) {
        super(builder);
        this.businessGroupId = builder.businessGroupId;
        this.operaUid = builder.operaUid;
        this.topologyTag = builder.topologyTag;
        this.topologyTagShow = builder.topologyTagShow;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutGroupTopologyTagLogRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessGroupId
     */
    public String getBusinessGroupId() {
        return this.businessGroupId;
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    /**
     * @return topologyTag
     */
    public String getTopologyTag() {
        return this.topologyTag;
    }

    /**
     * @return topologyTagShow
     */
    public String getTopologyTagShow() {
        return this.topologyTagShow;
    }

    public static final class Builder extends Request.Builder<PutGroupTopologyTagLogRequest, Builder> {
        private String businessGroupId; 
        private String operaUid; 
        private String topologyTag; 
        private String topologyTagShow; 

        private Builder() {
            super();
        } 

        private Builder(PutGroupTopologyTagLogRequest request) {
            super(request);
            this.businessGroupId = request.businessGroupId;
            this.operaUid = request.operaUid;
            this.topologyTag = request.topologyTag;
            this.topologyTagShow = request.topologyTagShow;
        } 

        /**
         * BusinessGroupId.
         */
        public Builder businessGroupId(String businessGroupId) {
            this.putQueryParameter("BusinessGroupId", businessGroupId);
            this.businessGroupId = businessGroupId;
            return this;
        }

        /**
         * OperaUid.
         */
        public Builder operaUid(String operaUid) {
            this.putQueryParameter("OperaUid", operaUid);
            this.operaUid = operaUid;
            return this;
        }

        /**
         * TopologyTag.
         */
        public Builder topologyTag(String topologyTag) {
            this.putQueryParameter("TopologyTag", topologyTag);
            this.topologyTag = topologyTag;
            return this;
        }

        /**
         * TopologyTagShow.
         */
        public Builder topologyTagShow(String topologyTagShow) {
            this.putQueryParameter("TopologyTagShow", topologyTagShow);
            this.topologyTagShow = topologyTagShow;
            return this;
        }

        @Override
        public PutGroupTopologyTagLogRequest build() {
            return new PutGroupTopologyTagLogRequest(this);
        } 

    } 

}
