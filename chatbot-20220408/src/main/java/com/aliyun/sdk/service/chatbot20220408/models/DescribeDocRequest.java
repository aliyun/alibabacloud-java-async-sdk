// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDocRequest} extends {@link RequestModel}
 *
 * <p>DescribeDocRequest</p>
 */
public class DescribeDocRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("AgentKey")
    private String agentKey;

    @Query
    @NameInMap("KnowledgeId")
    @Validation(required = true)
    private Long knowledgeId;

    @Query
    @NameInMap("ShowDetail")
    private Boolean showDetail;

    private DescribeDocRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.agentKey = builder.agentKey;
        this.knowledgeId = builder.knowledgeId;
        this.showDetail = builder.showDetail;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDocRequest create() {
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
     * @return agentKey
     */
    public String getAgentKey() {
        return this.agentKey;
    }

    /**
     * @return knowledgeId
     */
    public Long getKnowledgeId() {
        return this.knowledgeId;
    }

    /**
     * @return showDetail
     */
    public Boolean getShowDetail() {
        return this.showDetail;
    }

    public static final class Builder extends Request.Builder<DescribeDocRequest, Builder> {
        private String regionId; 
        private String agentKey; 
        private Long knowledgeId; 
        private Boolean showDetail; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDocRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.agentKey = request.agentKey;
            this.knowledgeId = request.knowledgeId;
            this.showDetail = request.showDetail;
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
         * AgentKey.
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * KnowledgeId.
         */
        public Builder knowledgeId(Long knowledgeId) {
            this.putQueryParameter("KnowledgeId", knowledgeId);
            this.knowledgeId = knowledgeId;
            return this;
        }

        /**
         * ShowDetail.
         */
        public Builder showDetail(Boolean showDetail) {
            this.putQueryParameter("ShowDetail", showDetail);
            this.showDetail = showDetail;
            return this;
        }

        @Override
        public DescribeDocRequest build() {
            return new DescribeDocRequest(this);
        } 

    } 

}
