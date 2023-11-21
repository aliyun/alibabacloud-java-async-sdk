// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecoverPhysicalConnectionRequest} extends {@link RequestModel}
 *
 * <p>RecoverPhysicalConnectionRequest</p>
 */
public class RecoverPhysicalConnectionRequest extends Request {
    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Token")
    private String token;

    private RecoverPhysicalConnectionRequest(Builder builder) {
        super(builder);
        this.dryRun = builder.dryRun;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecoverPhysicalConnectionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    public static final class Builder extends Request.Builder<RecoverPhysicalConnectionRequest, Builder> {
        private Boolean dryRun; 
        private String instanceId; 
        private String regionId; 
        private String token; 

        private Builder() {
            super();
        } 

        private Builder(RecoverPhysicalConnectionRequest request) {
            super(request);
            this.dryRun = request.dryRun;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.token = request.token;
        } 

        /**
         * Specifies whether to perform only a dry run, without performing the actual request. Valid values:
         * <p>
         * 
         * *   **true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and instance status. If the request fails the dry run, an error message is returned. If the request passes the dry run, the request ID is returned.
         * *   **false** (default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * The ID of the Express Connect circuit.
         * <p>
         * 
         * >  You can resume only shared Express Connect circuits by calling this API operation.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The region ID of the Express Connect circuit.
         * <p>
         * 
         * You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.
         */
        public Builder token(String token) {
            this.putQueryParameter("Token", token);
            this.token = token;
            return this;
        }

        @Override
        public RecoverPhysicalConnectionRequest build() {
            return new RecoverPhysicalConnectionRequest(this);
        } 

    } 

}
