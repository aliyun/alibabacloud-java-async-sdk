// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyInstanceAttachmentAttributesRequest} extends {@link RequestModel}
 *
 * <p>ModifyInstanceAttachmentAttributesRequest</p>
 */
public class ModifyInstanceAttachmentAttributesRequest extends Request {
    @Query
    @NameInMap("PrivatePoolOptions")
    private PrivatePoolOptions privatePoolOptions;

    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private ModifyInstanceAttachmentAttributesRequest(Builder builder) {
        super(builder);
        this.privatePoolOptions = builder.privatePoolOptions;
        this.sourceRegionId = builder.sourceRegionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceAttachmentAttributesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return privatePoolOptions
     */
    public PrivatePoolOptions getPrivatePoolOptions() {
        return this.privatePoolOptions;
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
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

    public static final class Builder extends Request.Builder<ModifyInstanceAttachmentAttributesRequest, Builder> {
        private PrivatePoolOptions privatePoolOptions; 
        private String sourceRegionId; 
        private Long resourceOwnerId; 
        private String instanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceAttachmentAttributesRequest request) {
            super(request);
            this.privatePoolOptions = request.privatePoolOptions;
            this.sourceRegionId = request.sourceRegionId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
        } 

        /**
         * PrivatePoolOptions.
         */
        public Builder privatePoolOptions(PrivatePoolOptions privatePoolOptions) {
            this.putQueryParameter("PrivatePoolOptions", privatePoolOptions);
            this.privatePoolOptions = privatePoolOptions;
            return this;
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
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The ID of the instance that you want to modify the matching properties of the private pool.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The ID of the region to which the private pool belongs. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ModifyInstanceAttachmentAttributesRequest build() {
            return new ModifyInstanceAttachmentAttributesRequest(this);
        } 

    } 

    public static class PrivatePoolOptions extends TeaModel {
        @NameInMap("MatchCriteria")
        @Validation(required = true)
        private String matchCriteria;

        @NameInMap("Id")
        private String id;

        private PrivatePoolOptions(Builder builder) {
            this.matchCriteria = builder.matchCriteria;
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrivatePoolOptions create() {
            return builder().build();
        }

        /**
         * @return matchCriteria
         */
        public String getMatchCriteria() {
            return this.matchCriteria;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        public static final class Builder {
            private String matchCriteria; 
            private String id; 

            /**
             * Modifies the private pool matching mode of an instance. Valid values:
             * <p>
             * 
             * -Open: Open mode. In this mode, the system automatically matches the open private pool for the instance.
             * -Target: specifies the mode. In this mode, you must also specify the "PrivatePoolOptions.Id" parameter to set the ID of the specified private pool.
             * -None: not used. In this mode, the instance starts normally without using a private pool.
             */
            public Builder matchCriteria(String matchCriteria) {
                this.matchCriteria = matchCriteria;
                return this;
            }

            /**
             * The ID of the private pool.
             * <p>
             * 
             * -This parameter is required when "PrivatePoolOptions. Matchbeautia" is set to "Target.
             * -If "PrivatePoolOptions. Matchefulia" is set to "Open" or "None", this parameter is not set.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            public PrivatePoolOptions build() {
                return new PrivatePoolOptions(this);
            } 

        } 

    }
}
