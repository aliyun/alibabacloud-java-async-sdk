// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * AgentType.
         */
        public Builder agentType(String agentType) {
            this.putQueryParameter("AgentType", agentType);
            this.agentType = agentType;
            return this;
        }

        /**
         * ArchType.
         */
        public Builder archType(String archType) {
            this.putQueryParameter("ArchType", archType);
            this.archType = archType;
            return this;
        }

        /**
         * OsType.
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
