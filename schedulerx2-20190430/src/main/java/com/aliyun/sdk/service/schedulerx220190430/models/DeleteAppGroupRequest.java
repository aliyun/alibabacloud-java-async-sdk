// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteAppGroupRequest} extends {@link RequestModel}
 *
 * <p>DeleteAppGroupRequest</p>
 */
public class DeleteAppGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeleteJobs")
    private Boolean deleteJobs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private DeleteAppGroupRequest(Builder builder) {
        super(builder);
        this.deleteJobs = builder.deleteJobs;
        this.groupId = builder.groupId;
        this.namespace = builder.namespace;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAppGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deleteJobs
     */
    public Boolean getDeleteJobs() {
        return this.deleteJobs;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteAppGroupRequest, Builder> {
        private Boolean deleteJobs; 
        private String groupId; 
        private String namespace; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAppGroupRequest request) {
            super(request);
            this.deleteJobs = request.deleteJobs;
            this.groupId = request.groupId;
            this.namespace = request.namespace;
            this.regionId = request.regionId;
        } 

        /**
         * DeleteJobs.
         */
        public Builder deleteJobs(Boolean deleteJobs) {
            this.putQueryParameter("DeleteJobs", deleteJobs);
            this.deleteJobs = deleteJobs;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testSchedulerx.defaultGroup</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>adcfc35d-e2fe-4fe9-bbaa-20e90ffc****</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
        public DeleteAppGroupRequest build() {
            return new DeleteAppGroupRequest(this);
        } 

    } 

}
