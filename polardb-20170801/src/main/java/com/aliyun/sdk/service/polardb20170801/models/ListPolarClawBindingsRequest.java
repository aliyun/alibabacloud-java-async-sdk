// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link ListPolarClawBindingsRequest} extends {@link RequestModel}
 *
 * <p>ListPolarClawBindingsRequest</p>
 */
public class ListPolarClawBindingsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentList")
    private java.util.List<String> agentList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    private ListPolarClawBindingsRequest(Builder builder) {
        super(builder);
        this.agentList = builder.agentList;
        this.applicationId = builder.applicationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPolarClawBindingsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentList
     */
    public java.util.List<String> getAgentList() {
        return this.agentList;
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    public static final class Builder extends Request.Builder<ListPolarClawBindingsRequest, Builder> {
        private java.util.List<String> agentList; 
        private String applicationId; 

        private Builder() {
            super();
        } 

        private Builder(ListPolarClawBindingsRequest request) {
            super(request);
            this.agentList = request.agentList;
            this.applicationId = request.applicationId;
        } 

        /**
         * AgentList.
         */
        public Builder agentList(java.util.List<String> agentList) {
            String agentListShrink = shrink(agentList, "AgentList", "json");
            this.putQueryParameter("AgentList", agentListShrink);
            this.agentList = agentList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-**************</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        @Override
        public ListPolarClawBindingsRequest build() {
            return new ListPolarClawBindingsRequest(this);
        } 

    } 

}
