// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReprotectDiskReplicaGroupRequest} extends {@link RequestModel}
 *
 * <p>ReprotectDiskReplicaGroupRequest</p>
 */
public class ReprotectDiskReplicaGroupRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ReplicaGroupId")
    @Validation(required = true)
    private String replicaGroupId;

    @Query
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("SourceZoneId")
    private String sourceZoneId;

    private ReprotectDiskReplicaGroupRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.regionId = builder.regionId;
        this.replicaGroupId = builder.replicaGroupId;
        this.sourceRegionId = builder.sourceRegionId;
        this.sourceZoneId = builder.sourceZoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReprotectDiskReplicaGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return replicaGroupId
     */
    public String getReplicaGroupId() {
        return this.replicaGroupId;
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return sourceZoneId
     */
    public String getSourceZoneId() {
        return this.sourceZoneId;
    }

    public static final class Builder extends Request.Builder<ReprotectDiskReplicaGroupRequest, Builder> {
        private String clientToken; 
        private String regionId; 
        private String replicaGroupId; 
        private String sourceRegionId; 
        private String sourceZoneId; 

        private Builder() {
            super();
        } 

        private Builder(ReprotectDiskReplicaGroupRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.regionId = response.regionId;
            this.replicaGroupId = response.replicaGroupId;
            this.sourceRegionId = response.sourceRegionId;
            this.sourceZoneId = response.sourceZoneId;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ReplicaGroupId.
         */
        public Builder replicaGroupId(String replicaGroupId) {
            this.putQueryParameter("ReplicaGroupId", replicaGroupId);
            this.replicaGroupId = replicaGroupId;
            return this;
        }

        /**
         * 用户选择的新生产Region，必须与SourceZoneId成对出现。不指定则默认是反向。
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putQueryParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * 用户选择的新生产可用区，必须与SourceRegionId成对出现。不指定则默认是反向。
         */
        public Builder sourceZoneId(String sourceZoneId) {
            this.putQueryParameter("SourceZoneId", sourceZoneId);
            this.sourceZoneId = sourceZoneId;
            return this;
        }

        @Override
        public ReprotectDiskReplicaGroupRequest build() {
            return new ReprotectDiskReplicaGroupRequest(this);
        } 

    } 

}
