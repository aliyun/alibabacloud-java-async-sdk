// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PublishAndDeployTaskFlowRequest} extends {@link RequestModel}
 *
 * <p>PublishAndDeployTaskFlowRequest</p>
 */
public class PublishAndDeployTaskFlowRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("DagId")
    @Validation(required = true)
    private Long dagId;

    @Query
    @NameInMap("Tid")
    @Validation(minimum = 1)
    private Long tid;

    @Query
    @NameInMap("VersionComments")
    private String versionComments;

    private PublishAndDeployTaskFlowRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dagId = builder.dagId;
        this.tid = builder.tid;
        this.versionComments = builder.versionComments;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublishAndDeployTaskFlowRequest create() {
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
     * @return dagId
     */
    public Long getDagId() {
        return this.dagId;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    /**
     * @return versionComments
     */
    public String getVersionComments() {
        return this.versionComments;
    }

    public static final class Builder extends Request.Builder<PublishAndDeployTaskFlowRequest, Builder> {
        private String regionId; 
        private Long dagId; 
        private Long tid; 
        private String versionComments; 

        private Builder() {
            super();
        } 

        private Builder(PublishAndDeployTaskFlowRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dagId = request.dagId;
            this.tid = request.tid;
            this.versionComments = request.versionComments;
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
         * The ID of the task flow. You can call the [ListTaskFlow](~~424565~~) or [ListLhTaskFlowAndScenario](~~426672~~) operation to query the task flow ID.
         */
        public Builder dagId(Long dagId) {
            this.putQueryParameter("DagId", dagId);
            this.dagId = dagId;
            return this;
        }

        /**
         * The ID of the tenant.
         * <p>
         * 
         * > To view the ID of the tenant, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see [View information about the current tenant](~~181330~~).
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        /**
         * The description of the version.
         */
        public Builder versionComments(String versionComments) {
            this.putQueryParameter("VersionComments", versionComments);
            this.versionComments = versionComments;
            return this;
        }

        @Override
        public PublishAndDeployTaskFlowRequest build() {
            return new PublishAndDeployTaskFlowRequest(this);
        } 

    } 

}
