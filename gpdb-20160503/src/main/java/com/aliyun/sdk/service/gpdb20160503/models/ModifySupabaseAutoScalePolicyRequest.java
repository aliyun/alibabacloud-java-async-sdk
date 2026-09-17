// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifySupabaseAutoScalePolicyRequest} extends {@link RequestModel}
 *
 * <p>ModifySupabaseAutoScalePolicyRequest</p>
 */
public class ModifySupabaseAutoScalePolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoScale")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean autoScale;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdleTimeHours")
    private String idleTimeHours;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private ModifySupabaseAutoScalePolicyRequest(Builder builder) {
        super(builder);
        this.autoScale = builder.autoScale;
        this.idleTimeHours = builder.idleTimeHours;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySupabaseAutoScalePolicyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoScale
     */
    public Boolean getAutoScale() {
        return this.autoScale;
    }

    /**
     * @return idleTimeHours
     */
    public String getIdleTimeHours() {
        return this.idleTimeHours;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifySupabaseAutoScalePolicyRequest, Builder> {
        private Boolean autoScale; 
        private String idleTimeHours; 
        private String projectId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifySupabaseAutoScalePolicyRequest request) {
            super(request);
            this.autoScale = request.autoScale;
            this.idleTimeHours = request.idleTimeHours;
            this.projectId = request.projectId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>Specifies whether to enable <strong>auto start/stop</strong>.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true: Enabled. After this feature is enabled, Supabase automatically pauses and resumes based on traffic conditions.</li>
         * <li>false: Disabled. After this feature is disabled, the auto start/stop feature of Supabase is turned off.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoScale(Boolean autoScale) {
            this.putQueryParameter("AutoScale", autoScale);
            this.autoScale = autoScale;
            return this;
        }

        /**
         * <p>The idle time before auto stop, in hours.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        public Builder idleTimeHours(String idleTimeHours) {
            this.putQueryParameter("IdleTimeHours", idleTimeHours);
            this.idleTimeHours = idleTimeHours;
            return this;
        }

        /**
         * <p>The ID of the Supabase project. You can obtain the workspace ID from the Supabase page in the console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sbp-tyarplz****</p>
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The region ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ModifySupabaseAutoScalePolicyRequest build() {
            return new ModifySupabaseAutoScalePolicyRequest(this);
        } 

    } 

}
