// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachAssetGroupToInstanceRequest} extends {@link RequestModel}
 *
 * <p>AttachAssetGroupToInstanceRequest</p>
 */
public class AttachAssetGroupToInstanceRequest extends Request {
    @Query
    @NameInMap("AssetGroupList")
    @Validation(required = true)
    private java.util.List < AssetGroupList> assetGroupList;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    private AttachAssetGroupToInstanceRequest(Builder builder) {
        super(builder);
        this.assetGroupList = builder.assetGroupList;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachAssetGroupToInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assetGroupList
     */
    public java.util.List < AssetGroupList> getAssetGroupList() {
        return this.assetGroupList;
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
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<AttachAssetGroupToInstanceRequest, Builder> {
        private java.util.List < AssetGroupList> assetGroupList; 
        private String instanceId; 
        private String regionId; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(AttachAssetGroupToInstanceRequest request) {
            super(request);
            this.assetGroupList = request.assetGroupList;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * The information about the asset to be associated.
         */
        public Builder assetGroupList(java.util.List < AssetGroupList> assetGroupList) {
            String assetGroupListShrink = shrink(assetGroupList, "AssetGroupList", "json");
            this.putQueryParameter("AssetGroupList", assetGroupListShrink);
            this.assetGroupList = assetGroupList;
            return this;
        }

        /**
         * The ID of the instance to query.
         * <p>
         * 
         * >  You can call the [DescribeInstanceList](~~118698~~) operation to query the IDs of all Anti-DDoS Origin instances of paid editions.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The ID of the region in which the instance resides.
         * <p>
         * 
         * >  You can call the [DescribeRegions](~~118703~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The source IP address of the request. The system specifies this parameter.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public AttachAssetGroupToInstanceRequest build() {
            return new AttachAssetGroupToInstanceRequest(this);
        } 

    } 

    public static class AssetGroupList extends TeaModel {
        @NameInMap("MemberUid")
        private String memberUid;

        @NameInMap("Name")
        @Validation(required = true)
        private String name;

        @NameInMap("Region")
        @Validation(required = true)
        private String region;

        @NameInMap("Type")
        @Validation(required = true)
        private String type;

        private AssetGroupList(Builder builder) {
            this.memberUid = builder.memberUid;
            this.name = builder.name;
            this.region = builder.region;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssetGroupList create() {
            return builder().build();
        }

        /**
         * @return memberUid
         */
        public String getMemberUid() {
            return this.memberUid;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String memberUid; 
            private String name; 
            private String region; 
            private String type; 

            /**
             * The UID of the member to which the asset belongs.
             */
            public Builder memberUid(String memberUid) {
                this.memberUid = memberUid;
                return this;
            }

            /**
             * The ID of the asset that you want to add. If the asset is a Web Application Firewall (WAF) instance, specify the ID of the WAF instance.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The region ID of the asset.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * The type of the asset.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public AssetGroupList build() {
                return new AssetGroupList(this);
            } 

        } 

    }
}
