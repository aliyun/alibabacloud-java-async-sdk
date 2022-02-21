// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SchedulePodRequest} extends {@link RequestModel}
 *
 * <p>SchedulePodRequest</p>
 */
public class SchedulePodRequest extends Request {
    @Query
    @NameInMap("AliUid")
    @Validation(required = true, minimum = 1972653484384661D)
    private Long aliUid;

    @Query
    @NameInMap("AreaCodes")
    private String areaCodes;

    @Query
    @NameInMap("GroupUuid")
    @Validation(required = true)
    private String groupUuid;

    @Query
    @NameInMap("Isps")
    private String isps;

    @Query
    @NameInMap("Labels")
    private String labels;

    @Query
    @NameInMap("Regions")
    private String regions;

    @Body
    @NameInMap("Requirements")
    @Validation(required = true)
    private String requirements;

    @Body
    @NameInMap("ResourceAttribute")
    private String resourceAttribute;

    @Query
    @NameInMap("Tenant")
    @Validation(required = true)
    private String tenant;

    @Query
    @NameInMap("WorkloadUuid")
    @Validation(required = true)
    private String workloadUuid;

    private SchedulePodRequest(Builder builder) {
        super(builder);
        this.aliUid = builder.aliUid;
        this.areaCodes = builder.areaCodes;
        this.groupUuid = builder.groupUuid;
        this.isps = builder.isps;
        this.labels = builder.labels;
        this.regions = builder.regions;
        this.requirements = builder.requirements;
        this.resourceAttribute = builder.resourceAttribute;
        this.tenant = builder.tenant;
        this.workloadUuid = builder.workloadUuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SchedulePodRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliUid
     */
    public Long getAliUid() {
        return this.aliUid;
    }

    /**
     * @return areaCodes
     */
    public String getAreaCodes() {
        return this.areaCodes;
    }

    /**
     * @return groupUuid
     */
    public String getGroupUuid() {
        return this.groupUuid;
    }

    /**
     * @return isps
     */
    public String getIsps() {
        return this.isps;
    }

    /**
     * @return labels
     */
    public String getLabels() {
        return this.labels;
    }

    /**
     * @return regions
     */
    public String getRegions() {
        return this.regions;
    }

    /**
     * @return requirements
     */
    public String getRequirements() {
        return this.requirements;
    }

    /**
     * @return resourceAttribute
     */
    public String getResourceAttribute() {
        return this.resourceAttribute;
    }

    /**
     * @return tenant
     */
    public String getTenant() {
        return this.tenant;
    }

    /**
     * @return workloadUuid
     */
    public String getWorkloadUuid() {
        return this.workloadUuid;
    }

    public static final class Builder extends Request.Builder<SchedulePodRequest, Builder> {
        private Long aliUid; 
        private String areaCodes; 
        private String groupUuid; 
        private String isps; 
        private String labels; 
        private String regions; 
        private String requirements; 
        private String resourceAttribute; 
        private String tenant; 
        private String workloadUuid; 

        private Builder() {
            super();
        } 

        private Builder(SchedulePodRequest response) {
            super(response);
            this.aliUid = response.aliUid;
            this.areaCodes = response.areaCodes;
            this.groupUuid = response.groupUuid;
            this.isps = response.isps;
            this.labels = response.labels;
            this.regions = response.regions;
            this.requirements = response.requirements;
            this.resourceAttribute = response.resourceAttribute;
            this.tenant = response.tenant;
            this.workloadUuid = response.workloadUuid;
        } 

        /**
         * AliUid.
         */
        public Builder aliUid(Long aliUid) {
            this.putQueryParameter("AliUid", aliUid);
            this.aliUid = aliUid;
            return this;
        }

        /**
         * AreaCodes.
         */
        public Builder areaCodes(String areaCodes) {
            this.putQueryParameter("AreaCodes", areaCodes);
            this.areaCodes = areaCodes;
            return this;
        }

        /**
         * GroupUuid.
         */
        public Builder groupUuid(String groupUuid) {
            this.putQueryParameter("GroupUuid", groupUuid);
            this.groupUuid = groupUuid;
            return this;
        }

        /**
         * Isps.
         */
        public Builder isps(String isps) {
            this.putQueryParameter("Isps", isps);
            this.isps = isps;
            return this;
        }

        /**
         * Labels.
         */
        public Builder labels(String labels) {
            this.putQueryParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        /**
         * Regions.
         */
        public Builder regions(String regions) {
            this.putQueryParameter("Regions", regions);
            this.regions = regions;
            return this;
        }

        /**
         * Requirements.
         */
        public Builder requirements(String requirements) {
            this.putBodyParameter("Requirements", requirements);
            this.requirements = requirements;
            return this;
        }

        /**
         * ResourceAttribute.
         */
        public Builder resourceAttribute(String resourceAttribute) {
            this.putBodyParameter("ResourceAttribute", resourceAttribute);
            this.resourceAttribute = resourceAttribute;
            return this;
        }

        /**
         * Tenant.
         */
        public Builder tenant(String tenant) {
            this.putQueryParameter("Tenant", tenant);
            this.tenant = tenant;
            return this;
        }

        /**
         * WorkloadUuid.
         */
        public Builder workloadUuid(String workloadUuid) {
            this.putQueryParameter("WorkloadUuid", workloadUuid);
            this.workloadUuid = workloadUuid;
            return this;
        }

        @Override
        public SchedulePodRequest build() {
            return new SchedulePodRequest(this);
        } 

    } 

}
