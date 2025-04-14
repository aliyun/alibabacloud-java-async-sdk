// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link CreateLineageRelationshipRequest} extends {@link RequestModel}
 *
 * <p>CreateLineageRelationshipRequest</p>
 */
public class CreateLineageRelationshipRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DstEntity")
    private LineageEntity dstEntity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcEntity")
    private LineageEntity srcEntity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Task")
    private LineageTask task;

    private CreateLineageRelationshipRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dstEntity = builder.dstEntity;
        this.srcEntity = builder.srcEntity;
        this.task = builder.task;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLineageRelationshipRequest create() {
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
     * @return dstEntity
     */
    public LineageEntity getDstEntity() {
        return this.dstEntity;
    }

    /**
     * @return srcEntity
     */
    public LineageEntity getSrcEntity() {
        return this.srcEntity;
    }

    /**
     * @return task
     */
    public LineageTask getTask() {
        return this.task;
    }

    public static final class Builder extends Request.Builder<CreateLineageRelationshipRequest, Builder> {
        private String regionId; 
        private LineageEntity dstEntity; 
        private LineageEntity srcEntity; 
        private LineageTask task; 

        private Builder() {
            super();
        } 

        private Builder(CreateLineageRelationshipRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dstEntity = request.dstEntity;
            this.srcEntity = request.srcEntity;
            this.task = request.task;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * DstEntity.
         */
        public Builder dstEntity(LineageEntity dstEntity) {
            String dstEntityShrink = shrink(dstEntity, "DstEntity", "json");
            this.putQueryParameter("DstEntity", dstEntityShrink);
            this.dstEntity = dstEntity;
            return this;
        }

        /**
         * SrcEntity.
         */
        public Builder srcEntity(LineageEntity srcEntity) {
            String srcEntityShrink = shrink(srcEntity, "SrcEntity", "json");
            this.putQueryParameter("SrcEntity", srcEntityShrink);
            this.srcEntity = srcEntity;
            return this;
        }

        /**
         * Task.
         */
        public Builder task(LineageTask task) {
            String taskShrink = shrink(task, "Task", "json");
            this.putQueryParameter("Task", taskShrink);
            this.task = task;
            return this;
        }

        @Override
        public CreateLineageRelationshipRequest build() {
            return new CreateLineageRelationshipRequest(this);
        } 

    } 

}
