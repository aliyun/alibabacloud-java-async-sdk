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
 * {@link DeleteLineageRelationshipRequest} extends {@link RequestModel}
 *
 * <p>DeleteLineageRelationshipRequest</p>
 */
public class DeleteLineageRelationshipRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String id;

    private DeleteLineageRelationshipRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteLineageRelationshipRequest create() {
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
     * @return id
     */
    public String getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<DeleteLineageRelationshipRequest, Builder> {
        private String regionId; 
        private String id; 

        private Builder() {
            super();
        } 

        private Builder(DeleteLineageRelationshipRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.id = request.id;
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
         * <p>The ID of the lineage relationship. You can obtain this ID from the response of the ListLineageRelationships operation. The ID is in the format of <code>${accountId}:${srcEntityType}.${srcEntityId}:${dstEntityType}.${dstEntityId}:${taskType}.${taskId}</code>, where accountId is the Alibaba Cloud account ID, srcEntityType and srcEntityId are the source entity type and source entity ID, dstEntityType and dstEntityId are the destination entity type and destination entity ID, and taskType and taskId are the lineage task type and task ID. Example: <code>1245491995595649:custom-report.report_test_001:custom-table.table_test_001:custom-lineage-task.test_task_001</code>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4as3dasf654a</p>
         */
        public Builder id(String id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public DeleteLineageRelationshipRequest build() {
            return new DeleteLineageRelationshipRequest(this);
        } 

    } 

}
