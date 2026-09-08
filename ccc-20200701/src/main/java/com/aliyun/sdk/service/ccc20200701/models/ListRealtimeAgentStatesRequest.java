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
         * <p>List of agent IDs, formatted as a JSON array string. The array can contain up to 20 elements. This parameter is optional and defaults to empty, which matches all agents under the current instance.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;agent1@ccc-test&quot;, &quot;agent2@ccc-test&quot;]</p>
         */
        public Builder agentIdList(String agentIdList) {
            this.putBodyParameter("AgentIdList", agentIdList);
            this.agentIdList = agentIdList;
            return this;
        }

        /**
         * <p>Perform fuzzy matching by agent name.</p>
         * 
         * <strong>example:</strong>
         * <p>agent</p>
         */
        public Builder agentName(String agentName) {
            this.putQueryParameter("AgentName", agentName);
            this.agentName = agentName;
            return this;
        }

        /**
         * <p>Filters by a list of call types. The value is a string in JSON array format, where each array element is a call type. This parameter is optional and defaults to empty, which matches all call types.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;Inbound&quot;, &quot;Outbound&quot;]</p>
         */
        public Builder callTypeList(String callTypeList) {
            this.putQueryParameter("CallTypeList", callTypeList);
            this.callTypeList = callTypeList;
            return this;
        }

        /**
         * <p>Instance ID.</p>
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
         * <p>Media type. The default is Audio. Other options include Chat (text), Video, and ALL.</p>
         * 
         * <strong>example:</strong>
         * <p>AUDIO</p>
         */
        public Builder mediaType(String mediaType) {
            this.putQueryParameter("MediaType", mediaType);
            this.mediaType = mediaType;
            return this;
        }

        /**
         * <p>Filters agents who are in outbound-only mode. This parameter is optional and defaults to empty, which means no filtering by outbound-only mode is applied.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder outboundScenario(Boolean outboundScenario) {
            this.putQueryParameter("OutboundScenario", outboundScenario);
            this.outboundScenario = outboundScenario;
            return this;
        }

        /**
         * <p>Page number, ranging from 1 to 100.</p>
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
         * <p>Page size, ranging from 1 to 100.</p>
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
         * <p>Performs fuzzy filtering based on the full or partial agent display name, agent ID, or agent extension number. This parameter is optional and defaults to empty, which means no filtering is applied.</p>
         * 
         * <strong>example:</strong>
         * <p>agent</p>
         */
        public Builder query(String query) {
            this.putQueryParameter("Query", query);
            this.query = query;
            return this;
        }

        /**
         * <p>Filter by skill group ID. This parameter is optional and defaults to empty, which means no filtering is applied.</p>
         * 
         * <strong>example:</strong>
         * <p>skillgroup@ccc-test</p>
         */
        public Builder skillGroupId(String skillGroupId) {
            this.putQueryParameter("SkillGroupId", skillGroupId);
            this.skillGroupId = skillGroupId;
            return this;
        }

        /**
         * <p>Filters by a list of statuses. This parameter is optional and defaults to empty, which matches all statuses.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;ACW&quot;, &quot;Dialing&quot;]</p>
         */
        public Builder stateList(String stateList) {
            this.putBodyParameter("StateList", stateList);
            this.stateList = stateList;
            return this;
        }

        /**
         * <p>Filter by work mode list. This parameter is optional and defaults to empty, which means all work modes are matched.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;OFFICE_PHONE&quot;,&quot;ON_SITE&quot;]</p>
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
