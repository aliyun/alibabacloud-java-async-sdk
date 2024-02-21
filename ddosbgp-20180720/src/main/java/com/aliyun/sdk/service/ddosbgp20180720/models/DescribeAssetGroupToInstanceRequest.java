// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAssetGroupToInstanceRequest} extends {@link RequestModel}
 *
 * <p>DescribeAssetGroupToInstanceRequest</p>
 */
public class DescribeAssetGroupToInstanceRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("MemberUid")
    private String memberUid;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("Region")
    private String region;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("Type")
    private String type;

    private DescribeAssetGroupToInstanceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.memberUid = builder.memberUid;
        this.name = builder.name;
        this.region = builder.region;
        this.regionId = builder.regionId;
        this.sourceIp = builder.sourceIp;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAssetGroupToInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<DescribeAssetGroupToInstanceRequest, Builder> {
        private String instanceId; 
        private String memberUid; 
        private String name; 
        private String region; 
        private String regionId; 
        private String sourceIp; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAssetGroupToInstanceRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.memberUid = request.memberUid;
            this.name = request.name;
            this.region = request.region;
            this.regionId = request.regionId;
            this.sourceIp = request.sourceIp;
            this.type = request.type;
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
         * The UID of the member to which the asset belongs.
         */
        public Builder memberUid(String memberUid) {
            this.putQueryParameter("MemberUid", memberUid);
            this.memberUid = memberUid;
            return this;
        }

        /**
         * The ID of the asset. If the asset is a Web Application Firewall (WAF) instance, specify the ID of the WAF instance.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The region ID of the asset.
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
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

        /**
         * The type of the asset. Valid values:
         * <p>
         * 
         * *   **waf**: WAF instance
         * *   **ga**: Global Accelerator (GA) instance
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public DescribeAssetGroupToInstanceRequest build() {
            return new DescribeAssetGroupToInstanceRequest(this);
        } 

    } 

}
