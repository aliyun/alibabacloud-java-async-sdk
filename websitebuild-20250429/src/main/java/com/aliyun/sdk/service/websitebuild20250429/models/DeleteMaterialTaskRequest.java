// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link DeleteMaterialTaskRequest} extends {@link RequestModel}
 *
 * <p>DeleteMaterialTaskRequest</p>
 */
public class DeleteMaterialTaskRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> taskIds;

    private DeleteMaterialTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.taskIds = builder.taskIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMaterialTaskRequest create() {
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
     * @return taskIds
     */
    public java.util.List<String> getTaskIds() {
        return this.taskIds;
    }

    public static final class Builder extends Request.Builder<DeleteMaterialTaskRequest, Builder> {
        private String regionId; 
        private java.util.List<String> taskIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMaterialTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.taskIds = request.taskIds;
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
         * <p>This parameter is required.</p>
         */
        public Builder taskIds(java.util.List<String> taskIds) {
            String taskIdsShrink = shrink(taskIds, "TaskIds", "json");
            this.putQueryParameter("TaskIds", taskIdsShrink);
            this.taskIds = taskIds;
            return this;
        }

        @Override
        public DeleteMaterialTaskRequest build() {
            return new DeleteMaterialTaskRequest(this);
        } 

    } 

}
