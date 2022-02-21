// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQualityProjectDetailRequest} extends {@link RequestModel}
 *
 * <p>GetQualityProjectDetailRequest</p>
 */
public class GetQualityProjectDetailRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private Long projectId;

    private GetQualityProjectDetailRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQualityProjectDetailRequest create() {
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
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<GetQualityProjectDetailRequest, Builder> {
        private String instanceId; 
        private Long projectId; 

        private Builder() {
            super();
        } 

        private Builder(GetQualityProjectDetailRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.projectId = response.projectId;
        } 

        /**
         * 租户实例ID
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 质检任务ID
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public GetQualityProjectDetailRequest build() {
            return new GetQualityProjectDetailRequest(this);
        } 

    } 

}
