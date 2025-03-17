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
 * {@link CreateTaskFlowRequest} extends {@link RequestModel}
 *
 * <p>CreateTaskFlowRequest</p>
 */
public class CreateTaskFlowRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DagName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dagName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScenarioId")
    private Long scenarioId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long tid;

    private CreateTaskFlowRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dagName = builder.dagName;
        this.description = builder.description;
        this.scenarioId = builder.scenarioId;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTaskFlowRequest create() {
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
     * @return dagName
     */
    public String getDagName() {
        return this.dagName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return scenarioId
     */
    public Long getScenarioId() {
        return this.scenarioId;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<CreateTaskFlowRequest, Builder> {
        private String regionId; 
        private String dagName; 
        private String description; 
        private Long scenarioId; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(CreateTaskFlowRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dagName = request.dagName;
            this.description = request.description;
            this.scenarioId = request.scenarioId;
            this.tid = request.tid;
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
         * <p>The name of the task flow.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Dag_Name</p>
         */
        public Builder dagName(String dagName) {
            this.putQueryParameter("DagName", dagName);
            this.dagName = dagName;
            return this;
        }

        /**
         * <p>The description of the task flow.</p>
         * 
         * <strong>example:</strong>
         * <p>zht_test</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>2**</p>
         */
        public Builder scenarioId(Long scenarioId) {
            this.putQueryParameter("ScenarioId", scenarioId);
            this.scenarioId = scenarioId;
            return this;
        }

        /**
         * <p>The ID of the tenant. You can call the <a href="https://help.aliyun.com/document_detail/198073.html">GetUserActiveTenant</a> or <a href="https://help.aliyun.com/document_detail/198074.html">ListUserTenants</a> operation to query the tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3***</p>
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public CreateTaskFlowRequest build() {
            return new CreateTaskFlowRequest(this);
        } 

    } 

}
