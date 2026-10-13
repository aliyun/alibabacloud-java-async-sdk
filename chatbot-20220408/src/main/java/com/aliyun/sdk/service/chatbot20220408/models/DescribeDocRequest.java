// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

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
 * {@link DescribeDocRequest} extends {@link RequestModel}
 *
 * <p>DescribeDocRequest</p>
 */
public class DescribeDocRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentKey")
    private String agentKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KnowledgeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long knowledgeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShowDetail")
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
         * <p>The business space key. If this parameter is not specified, the default business space is accessed. You can obtain the key value on the business management page of the primary account.</p>
         * 
         * <strong>example:</strong>
         * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * <p>The knowledge ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30001979424</p>
         */
        public Builder knowledgeId(Long knowledgeId) {
            this.putQueryParameter("KnowledgeId", knowledgeId);
            this.knowledgeId = knowledgeId;
            return this;
        }

        /**
         * <p>Specifies whether to display detailed paragraph information of the document. Valid values:</p>
         * <ul>
         * <li>true: Display.</li>
         * <li>false: Ignore (default).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
