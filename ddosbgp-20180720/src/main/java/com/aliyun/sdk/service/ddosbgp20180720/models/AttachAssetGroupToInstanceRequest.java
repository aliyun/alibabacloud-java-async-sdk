// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AttachAssetGroupToInstanceRequest} extends {@link RequestModel}
 *
 * <p>AttachAssetGroupToInstanceRequest</p>
 */
public class AttachAssetGroupToInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssetGroupList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < AssetGroupList> assetGroupList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private AttachAssetGroupToInstanceRequest(Builder builder) {
        super(builder);
        this.assetGroupList = builder.assetGroupList;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
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

    public static final class Builder extends Request.Builder<AttachAssetGroupToInstanceRequest, Builder> {
        private java.util.List < AssetGroupList> assetGroupList; 
        private String instanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(AttachAssetGroupToInstanceRequest request) {
            super(request);
            this.assetGroupList = request.assetGroupList;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The information about the asset to be associated.</p>
         * <p>This parameter is required.</p>
         */
        public Builder assetGroupList(java.util.List < AssetGroupList> assetGroupList) {
            String assetGroupListShrink = shrink(assetGroupList, "AssetGroupList", "json");
            this.putQueryParameter("AssetGroupList", assetGroupListShrink);
            this.assetGroupList = assetGroupList;
            return this;
        }

        /**
         * <p>The ID of the instance to query.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/118698.html">DescribeInstanceList</a> operation to query the IDs of all Anti-DDoS Origin instances of paid editions.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ddosbgp-cn-n6w1r7nz****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the region in which the instance resides.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/118703.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public AttachAssetGroupToInstanceRequest build() {
            return new AttachAssetGroupToInstanceRequest(this);
        } 

    } 

    /**
     * 
     * {@link AttachAssetGroupToInstanceRequest} extends {@link TeaModel}
     *
     * <p>AttachAssetGroupToInstanceRequest</p>
     */
    public static class AssetGroupList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MemberUid")
        private String memberUid;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("Region")
        @com.aliyun.core.annotation.Validation(required = true)
        private String region;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>The UID of the member to which the asset belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1743970208320***</p>
             */
            public Builder memberUid(String memberUid) {
                this.memberUid = memberUid;
                return this;
            }

            /**
             * <p>The ID of the asset that you want to add. If the asset is a Web Application Firewall (WAF) instance, specify the ID of the WAF instance.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>waf-test-001</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The region ID of the asset.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The type of the asset.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>waf</p>
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
