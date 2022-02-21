// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyCallRatioOfJobGroupRequest} extends {@link RequestModel}
 *
 * <p>ModifyCallRatioOfJobGroupRequest</p>
 */
public class ModifyCallRatioOfJobGroupRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("JobGroupId")
    @Validation(required = true)
    private String jobGroupId;

    @Query
    @NameInMap("Ratio")
    @Validation(required = true)
    private Integer ratio;

    @Query
    @NameInMap("SkillGroupId")
    @Validation(required = true)
    private String skillGroupId;

    private ModifyCallRatioOfJobGroupRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.jobGroupId = builder.jobGroupId;
        this.ratio = builder.ratio;
        this.skillGroupId = builder.skillGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCallRatioOfJobGroupRequest create() {
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
     * @return jobGroupId
     */
    public String getJobGroupId() {
        return this.jobGroupId;
    }

    /**
     * @return ratio
     */
    public Integer getRatio() {
        return this.ratio;
    }

    /**
     * @return skillGroupId
     */
    public String getSkillGroupId() {
        return this.skillGroupId;
    }

    public static final class Builder extends Request.Builder<ModifyCallRatioOfJobGroupRequest, Builder> {
        private String instanceId; 
        private String jobGroupId; 
        private Integer ratio; 
        private String skillGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyCallRatioOfJobGroupRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.jobGroupId = response.jobGroupId;
            this.ratio = response.ratio;
            this.skillGroupId = response.skillGroupId;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * JobGroupId.
         */
        public Builder jobGroupId(String jobGroupId) {
            this.putQueryParameter("JobGroupId", jobGroupId);
            this.jobGroupId = jobGroupId;
            return this;
        }

        /**
         * Ratio.
         */
        public Builder ratio(Integer ratio) {
            this.putQueryParameter("Ratio", ratio);
            this.ratio = ratio;
            return this;
        }

        /**
         * SkillGroupId.
         */
        public Builder skillGroupId(String skillGroupId) {
            this.putQueryParameter("SkillGroupId", skillGroupId);
            this.skillGroupId = skillGroupId;
            return this;
        }

        @Override
        public ModifyCallRatioOfJobGroupRequest build() {
            return new ModifyCallRatioOfJobGroupRequest(this);
        } 

    } 

}
