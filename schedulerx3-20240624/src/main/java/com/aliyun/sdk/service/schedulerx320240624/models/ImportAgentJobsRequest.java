// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx320240624.models;

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
 * {@link ImportAgentJobsRequest} extends {@link RequestModel}
 *
 * <p>ImportAgentJobsRequest</p>
 */
public class ImportAgentJobsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AgentName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MigrateStrategy")
    private Integer migrateStrategy;

    private ImportAgentJobsRequest(Builder builder) {
        super(builder);
        this.agentName = builder.agentName;
        this.clusterId = builder.clusterId;
        this.migrateStrategy = builder.migrateStrategy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportAgentJobsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentName
     */
    public String getAgentName() {
        return this.agentName;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return migrateStrategy
     */
    public Integer getMigrateStrategy() {
        return this.migrateStrategy;
    }

    public static final class Builder extends Request.Builder<ImportAgentJobsRequest, Builder> {
        private String agentName; 
        private String clusterId; 
        private Integer migrateStrategy; 

        private Builder() {
            super();
        } 

        private Builder(ImportAgentJobsRequest request) {
            super(request);
            this.agentName = request.agentName;
            this.clusterId = request.clusterId;
            this.migrateStrategy = request.migrateStrategy;
        } 

        /**
         * <p>agentname</p>
         * <p>This parameter is required.</p>
         */
        public Builder agentName(String agentName) {
            this.putBodyParameter("AgentName", agentName);
            this.agentName = agentName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2027179f-20b1-4e0b-841b-d86f2bc7ebf7</p>
         */
        public Builder clusterId(String clusterId) {
            this.putBodyParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * MigrateStrategy.
         */
        public Builder migrateStrategy(Integer migrateStrategy) {
            this.putBodyParameter("MigrateStrategy", migrateStrategy);
            this.migrateStrategy = migrateStrategy;
            return this;
        }

        @Override
        public ImportAgentJobsRequest build() {
            return new ImportAgentJobsRequest(this);
        } 

    } 

}
