// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link ListRealtimeAgentStatesRequest} extends {@link RequestModel}
 *
 * <p>ListRealtimeAgentStatesRequest</p>
 */
public class ListRealtimeAgentStatesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AgentIdList")
    private String agentIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentName")
    private String agentName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallTypeList")
    private String callTypeList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaType")
    private String mediaType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutboundScenario")
    private Boolean outboundScenario;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Query")
    private String query;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillGroupId")
    private String skillGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StateList")
    private String stateList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkModeList")
    private String workModeList;

    private ListRealtimeAgentStatesRequest(Builder builder) {
        super(builder);
        this.agentIdList = builder.agentIdList;
        this.agentName = builder.agentName;
        this.callTypeList = builder.callTypeList;
        this.instanceId = builder.instanceId;
        this.mediaType = builder.mediaType;
        this.outboundScenario = builder.outboundScenario;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.query = builder.query;
        this.skillGroupId = builder.skillGroupId;
        this.stateList = builder.stateList;
        this.workModeList = builder.workModeList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRealtimeAgentStatesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentIdList
     */
    public String getAgentIdList() {
        return this.agentIdList;
    }

    /**
     * @return agentName
     */
    public String getAgentName() {
        return this.agentName;
    }

    /**
     * @return callTypeList
     */
    public String getCallTypeList() {
        return this.callTypeList;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return mediaType
     */
    public String getMediaType() {
        return this.mediaType;
    }

    /**
     * @return outboundScenario
     */
    public Boolean getOutboundScenario() {
        return this.outboundScenario;
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

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return skillGroupId
     */
    public String getSkillGroupId() {
        return this.skillGroupId;
    }

    /**
     * @return stateList
     */
    public String getStateList() {
        return this.stateList;
    }

    /**
     * @return workModeList
     */
    public String getWorkModeList() {
        return this.workModeList;
    }

    public static final class Builder extends Request.Builder<ListRealtimeAgentStatesRequest, Builder> {
        private String agentIdList; 
        private String agentName; 
        private String callTypeList; 
        private String instanceId; 
        private String mediaType; 
        private Boolean outboundScenario; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String query; 
        private String skillGroupId; 
        private String stateList; 
        private String workModeList; 

        private Builder() {
            super();
        } 

        private Builder(ListRealtimeAgentStatesRequest request) {
            super(request);
            this.agentIdList = request.agentIdList;
            this.agentName = request.agentName;
            this.callTypeList = request.callTypeList;
            this.instanceId = request.instanceId;
            this.mediaType = request.mediaType;
            this.outboundScenario = request.outboundScenario;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.query = request.query;
            this.skillGroupId = request.skillGroupId;
            this.stateList = request.stateList;
            this.workModeList = request.workModeList;
        } 

        /**
         * AgentIdList.
         */
        public Builder agentIdList(String agentIdList) {
            this.putBodyParameter("AgentIdList", agentIdList);
            this.agentIdList = agentIdList;
            return this;
        }

        /**
         * AgentName.
         */
        public Builder agentName(String agentName) {
            this.putQueryParameter("AgentName", agentName);
            this.agentName = agentName;
            return this;
        }

        /**
         * CallTypeList.
         */
        public Builder callTypeList(String callTypeList) {
            this.putQueryParameter("CallTypeList", callTypeList);
            this.callTypeList = callTypeList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * MediaType.
         */
        public Builder mediaType(String mediaType) {
            this.putQueryParameter("MediaType", mediaType);
            this.mediaType = mediaType;
            return this;
        }

        /**
         * OutboundScenario.
         */
        public Builder outboundScenario(Boolean outboundScenario) {
            this.putQueryParameter("OutboundScenario", outboundScenario);
            this.outboundScenario = outboundScenario;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Query.
         */
        public Builder query(String query) {
            this.putQueryParameter("Query", query);
            this.query = query;
            return this;
        }

        /**
         * SkillGroupId.
         */
        public Builder skillGroupId(String skillGroupId) {
            this.putQueryParameter("SkillGroupId", skillGroupId);
            this.skillGroupId = skillGroupId;
            return this;
        }

        /**
         * StateList.
         */
        public Builder stateList(String stateList) {
            this.putBodyParameter("StateList", stateList);
            this.stateList = stateList;
            return this;
        }

        /**
         * WorkModeList.
         */
        public Builder workModeList(String workModeList) {
            this.putQueryParameter("WorkModeList", workModeList);
            this.workModeList = workModeList;
            return this;
        }

        @Override
        public ListRealtimeAgentStatesRequest build() {
            return new ListRealtimeAgentStatesRequest(this);
        } 

    } 

}
