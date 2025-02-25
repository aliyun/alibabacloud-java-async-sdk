// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListDSEntityValueRequest} extends {@link RequestModel}
 *
 * <p>ListDSEntityValueRequest</p>
 */
public class ListDSEntityValueRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentKey")
    private String agentKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EntityId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long entityId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EntityValueId")
    @com.aliyun.core.annotation.Validation()
    private Long entityValueId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    private ListDSEntityValueRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.agentKey = builder.agentKey;
        this.entityId = builder.entityId;
        this.entityValueId = builder.entityValueId;
        this.instanceId = builder.instanceId;
        this.keyword = builder.keyword;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDSEntityValueRequest create() {
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
     * @return entityId
     */
    public Long getEntityId() {
        return this.entityId;
    }

    /**
     * @return entityValueId
     */
    public Long getEntityValueId() {
        return this.entityValueId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<ListDSEntityValueRequest, Builder> {
        private String regionId; 
        private String agentKey; 
        private Long entityId; 
        private Long entityValueId; 
        private String instanceId; 
        private String keyword; 
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListDSEntityValueRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.agentKey = request.agentKey;
            this.entityId = request.entityId;
            this.entityValueId = request.entityValueId;
            this.instanceId = request.instanceId;
            this.keyword = request.keyword;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder entityId(Long entityId) {
            this.putBodyParameter("EntityId", entityId);
            this.entityId = entityId;
            return this;
        }

        /**
         * EntityValueId.
         */
        public Builder entityValueId(Long entityValueId) {
            this.putBodyParameter("EntityValueId", entityValueId);
            this.entityValueId = entityValueId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>chatbot-cn-yjzbyrEvqd</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Keyword.
         */
        public Builder keyword(String keyword) {
            this.putBodyParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListDSEntityValueRequest build() {
            return new ListDSEntityValueRequest(this);
        } 

    } 

}
