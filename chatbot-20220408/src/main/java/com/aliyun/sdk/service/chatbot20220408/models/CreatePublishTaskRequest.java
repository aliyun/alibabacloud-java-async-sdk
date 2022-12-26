// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePublishTaskRequest} extends {@link RequestModel}
 *
 * <p>CreatePublishTaskRequest</p>
 */
public class CreatePublishTaskRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("AgentKey")
    private String agentKey;

    @Query
    @NameInMap("BizType")
    private String bizType;

    @Query
    @NameInMap("DataIdList")
    private java.util.List < String > dataIdList;

    private CreatePublishTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.agentKey = builder.agentKey;
        this.bizType = builder.bizType;
        this.dataIdList = builder.dataIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePublishTaskRequest create() {
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
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return dataIdList
     */
    public java.util.List < String > getDataIdList() {
        return this.dataIdList;
    }

    public static final class Builder extends Request.Builder<CreatePublishTaskRequest, Builder> {
        private String regionId; 
        private String agentKey; 
        private String bizType; 
        private java.util.List < String > dataIdList; 

        private Builder() {
            super();
        } 

        private Builder(CreatePublishTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.agentKey = request.agentKey;
            this.bizType = request.bizType;
            this.dataIdList = request.dataIdList;
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
         * 业务空间key,不设置则访问默认业务空间，key值在主账号业务管理页面获取
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * 发布单元类型，机器人发布请使用 CreateInstancePublishTask API
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * 附加发布信息，当前支持：如果BizType是faq，此字段填写类目Id，表示只发布这些类目下面的知识
         */
        public Builder dataIdList(java.util.List < String > dataIdList) {
            String dataIdListShrink = shrink(dataIdList, "DataIdList", "json");
            this.putQueryParameter("DataIdList", dataIdListShrink);
            this.dataIdList = dataIdList;
            return this;
        }

        @Override
        public CreatePublishTaskRequest build() {
            return new CreatePublishTaskRequest(this);
        } 

    } 

}
