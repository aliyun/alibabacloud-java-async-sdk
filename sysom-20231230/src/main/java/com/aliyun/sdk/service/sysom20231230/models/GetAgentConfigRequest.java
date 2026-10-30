// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link GetAgentConfigRequest} extends {@link RequestModel}
 *
 * <p>GetAgentConfigRequest</p>
 */
public class GetAgentConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("agentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("configId")
    private String configId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("configName")
    private String configName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("current")
    private String current;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("region")
    private String region;

    private GetAgentConfigRequest(Builder builder) {
        super(builder);
        this.agentId = builder.agentId;
        this.configId = builder.configId;
        this.configName = builder.configName;
        this.current = builder.current;
        this.pageSize = builder.pageSize;
        this.region = builder.region;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgentConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentId
     */
    public String getAgentId() {
        return this.agentId;
    }

    /**
     * @return configId
     */
    public String getConfigId() {
        return this.configId;
    }

    /**
     * @return configName
     */
    public String getConfigName() {
        return this.configName;
    }

    /**
     * @return current
     */
    public String getCurrent() {
        return this.current;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    public static final class Builder extends Request.Builder<GetAgentConfigRequest, Builder> {
        private String agentId; 
        private String configId; 
        private String configName; 
        private String current; 
        private String pageSize; 
        private String region; 

        private Builder() {
            super();
        } 

        private Builder(GetAgentConfigRequest request) {
            super(request);
            this.agentId = request.agentId;
            this.configId = request.configId;
            this.configName = request.configName;
            this.current = request.current;
            this.pageSize = request.pageSize;
            this.region = request.region;
        } 

        /**
         * <p>The ID of the component.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>74a86327-3170-412c-8e67-da3389ec56a9</p>
         */
        public Builder agentId(String agentId) {
            this.putQueryParameter("agentId", agentId);
            this.agentId = agentId;
            return this;
        }

        /**
         * <p>The ID of the component configuration to retrieve.</p>
         * 
         * <strong>example:</strong>
         * <p>4d5ecf02-3d01-11f0-8c90-00163e1029af</p>
         */
        public Builder configId(String configId) {
            this.putQueryParameter("configId", configId);
            this.configId = configId;
            return this;
        }

        /**
         * <p>The name of the configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>Configuration-x</p>
         */
        public Builder configName(String configName) {
            this.putQueryParameter("configName", configName);
            this.configName = configName;
            return this;
        }

        /**
         * <p>The current page number. This parameter is available only when pagination by page number is used.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder current(String current) {
            this.putQueryParameter("current", current);
            this.current = current;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder region(String region) {
            this.putQueryParameter("region", region);
            this.region = region;
            return this;
        }

        @Override
        public GetAgentConfigRequest build() {
            return new GetAgentConfigRequest(this);
        } 

    } 

}
