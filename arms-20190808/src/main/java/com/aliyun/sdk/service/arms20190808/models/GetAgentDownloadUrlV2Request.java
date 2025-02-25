// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link GetAgentDownloadUrlV2Request} extends {@link RequestModel}
 *
 * <p>GetAgentDownloadUrlV2Request</p>
 */
public class GetAgentDownloadUrlV2Request extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ArchType")
    private String archType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OsType")
    private String osType;

    private GetAgentDownloadUrlV2Request(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.agentType = builder.agentType;
        this.archType = builder.archType;
        this.osType = builder.osType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgentDownloadUrlV2Request create() {
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
     * @return agentType
     */
    public String getAgentType() {
        return this.agentType;
    }

    /**
     * @return archType
     */
    public String getArchType() {
        return this.archType;
    }

    /**
     * @return osType
     */
    public String getOsType() {
        return this.osType;
    }

    public static final class Builder extends Request.Builder<GetAgentDownloadUrlV2Request, Builder> {
        private String regionId; 
        private String agentType; 
        private String archType; 
        private String osType; 

        private Builder() {
            super();
        } 

        private Builder(GetAgentDownloadUrlV2Request request) {
            super(request);
            this.regionId = request.regionId;
            this.agentType = request.agentType;
            this.archType = request.archType;
            this.osType = request.osType;
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
         * <p>The agent type.<br><strong>Valid values:</strong></p>
         * <ul>
         * <li><strong>JavaAgent</strong></li>
         * <li><strong>Instgo</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>JavaAgent</p>
         */
        public Builder agentType(String agentType) {
            this.putQueryParameter("AgentType", agentType);
            this.agentType = agentType;
            return this;
        }

        /**
         * <p>The architecture type of the environment where the agent is installed.<br>This parameter is required and valid only when <strong>AgentType</strong> is set to <strong>Instgo</strong>.<br><strong>Valid values:</strong></p>
         * <ul>
         * <li><strong>amd64</strong></li>
         * <li><strong>arm64</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>amd64</p>
         */
        public Builder archType(String archType) {
            this.putQueryParameter("ArchType", archType);
            this.archType = archType;
            return this;
        }

        /**
         * <p>The operating system of the environment where the agent is installed.<br>This parameter is required and valid only when <strong>AgentType</strong> is set to <strong>Instgo</strong>.<br><strong>Valid values:</strong></p>
         * <ul>
         * <li><strong>linux</strong></li>
         * <li><strong>darwin</strong></li>
         * <li><strong>windows</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>linux</p>
         */
        public Builder osType(String osType) {
            this.putQueryParameter("OsType", osType);
            this.osType = osType;
            return this;
        }

        @Override
        public GetAgentDownloadUrlV2Request build() {
            return new GetAgentDownloadUrlV2Request(this);
        } 

    } 

}
