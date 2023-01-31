// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeJobGroupRequest} extends {@link RequestModel}
 *
 * <p>DescribeJobGroupRequest</p>
 */
public class DescribeJobGroupRequest extends Request {
    @Query
    @NameInMap("BriefTypes")
    private java.util.List < String > briefTypes;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("JobGroupId")
    @Validation(required = true)
    private String jobGroupId;

    private DescribeJobGroupRequest(Builder builder) {
        super(builder);
        this.briefTypes = builder.briefTypes;
        this.instanceId = builder.instanceId;
        this.jobGroupId = builder.jobGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeJobGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return briefTypes
     */
    public java.util.List < String > getBriefTypes() {
        return this.briefTypes;
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

    public static final class Builder extends Request.Builder<DescribeJobGroupRequest, Builder> {
        private java.util.List < String > briefTypes; 
        private String instanceId; 
        private String jobGroupId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeJobGroupRequest request) {
            super(request);
            this.briefTypes = request.briefTypes;
            this.instanceId = request.instanceId;
            this.jobGroupId = request.jobGroupId;
        } 

        /**
         * BriefTypes.
         */
        public Builder briefTypes(java.util.List < String > briefTypes) {
            this.putQueryParameter("BriefTypes", briefTypes);
            this.briefTypes = briefTypes;
            return this;
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

        @Override
        public DescribeJobGroupRequest build() {
            return new DescribeJobGroupRequest(this);
        } 

    } 

}
