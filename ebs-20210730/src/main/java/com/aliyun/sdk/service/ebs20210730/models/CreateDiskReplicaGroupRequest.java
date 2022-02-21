// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDiskReplicaGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateDiskReplicaGroupRequest</p>
 */
public class CreateDiskReplicaGroupRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("DestinationRegionId")
    @Validation(required = true)
    private String destinationRegionId;

    @Query
    @NameInMap("DestinationZoneId")
    @Validation(required = true)
    private String destinationZoneId;

    @Query
    @NameInMap("GroupName")
    private String groupName;

    @Query
    @NameInMap("RPO")
    private Long RPO;

    @Query
    @NameInMap("SourceRegionId")
    @Validation(required = true)
    private String sourceRegionId;

    @Query
    @NameInMap("SourceZoneId")
    @Validation(required = true)
    private String sourceZoneId;

    private CreateDiskReplicaGroupRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.destinationRegionId = builder.destinationRegionId;
        this.destinationZoneId = builder.destinationZoneId;
        this.groupName = builder.groupName;
        this.RPO = builder.RPO;
        this.sourceRegionId = builder.sourceRegionId;
        this.sourceZoneId = builder.sourceZoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDiskReplicaGroupRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return destinationRegionId
     */
    public String getDestinationRegionId() {
        return this.destinationRegionId;
    }

    /**
     * @return destinationZoneId
     */
    public String getDestinationZoneId() {
        return this.destinationZoneId;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return RPO
     */
    public Long getRPO() {
        return this.RPO;
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

    public static final class Builder extends Request.Builder<CreateDiskReplicaGroupRequest, Builder> {
        private String clientToken; 
        private String description; 
        private String destinationRegionId; 
        private String destinationZoneId; 
        private String groupName; 
        private Long RPO; 
        private String sourceRegionId; 
        private String sourceZoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDiskReplicaGroupRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.description = response.description;
            this.destinationRegionId = response.destinationRegionId;
            this.destinationZoneId = response.destinationZoneId;
            this.groupName = response.groupName;
            this.RPO = response.RPO;
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
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * DestinationRegionId.
         */
        public Builder destinationRegionId(String destinationRegionId) {
            this.putQueryParameter("DestinationRegionId", destinationRegionId);
            this.destinationRegionId = destinationRegionId;
            return this;
        }

        /**
         * DestinationZoneId.
         */
        public Builder destinationZoneId(String destinationZoneId) {
            this.putQueryParameter("DestinationZoneId", destinationZoneId);
            this.destinationZoneId = destinationZoneId;
            return this;
        }

        /**
         * GroupName.
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * RPO.
         */
        public Builder RPO(Long RPO) {
            this.putQueryParameter("RPO", RPO);
            this.RPO = RPO;
            return this;
        }

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putQueryParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * SourceZoneId.
         */
        public Builder sourceZoneId(String sourceZoneId) {
            this.putQueryParameter("SourceZoneId", sourceZoneId);
            this.sourceZoneId = sourceZoneId;
            return this;
        }

        @Override
        public CreateDiskReplicaGroupRequest build() {
            return new CreateDiskReplicaGroupRequest(this);
        } 

    } 

}
