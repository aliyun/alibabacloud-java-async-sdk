// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartTerminalSessionRequest} extends {@link RequestModel}
 *
 * <p>StartTerminalSessionRequest</p>
 */
public class StartTerminalSessionRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private java.util.List < String > instanceId;

    @Query
    @NameInMap("PortNumber")
    private Integer portNumber;

    private StartTerminalSessionRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.portNumber = builder.portNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartTerminalSessionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return instanceId
     */
    public java.util.List < String > getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return portNumber
     */
    public Integer getPortNumber() {
        return this.portNumber;
    }

    public static final class Builder extends Request.Builder<StartTerminalSessionRequest, Builder> {
        private String sourceRegionId; 
        private String regionId; 
        private java.util.List < String > instanceId; 
        private Integer portNumber; 

        private Builder() {
            super();
        } 

        private Builder(StartTerminalSessionRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.portNumber = request.portNumber;
        } 

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * The region ID of the instance. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Instance IDs
         */
        public Builder instanceId(java.util.List < String > instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Specifies the port number of the ECS instance for data forwarding. Once this parameter is set, the cloud assistant client forwards data to the specified port number for port forwarding. For example, SSH uses port 22.
         * <p>
         * 
         * The default value is null, indicating that the port number for data forwarding is not set.
         */
        public Builder portNumber(Integer portNumber) {
            this.putQueryParameter("PortNumber", portNumber);
            this.portNumber = portNumber;
            return this;
        }

        @Override
        public StartTerminalSessionRequest build() {
            return new StartTerminalSessionRequest(this);
        } 

    } 

}
