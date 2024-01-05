// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.igraph20210621.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTableLastBackflowRequest} extends {@link RequestModel}
 *
 * <p>GetTableLastBackflowRequest</p>
 */
public class GetTableLastBackflowRequest extends Request {
    @Path
    @NameInMap("instanceId")
    @Validation(required = true)
    private String instanceId;

    @Path
    @NameInMap("tableName")
    @Validation(required = true)
    private String tableName;

    @Query
    @NameInMap("partition")
    private String partition;

    private GetTableLastBackflowRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.tableName = builder.tableName;
        this.partition = builder.partition;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTableLastBackflowRequest create() {
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
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * @return partition
     */
    public String getPartition() {
        return this.partition;
    }

    public static final class Builder extends Request.Builder<GetTableLastBackflowRequest, Builder> {
        private String instanceId; 
        private String tableName; 
        private String partition; 

        private Builder() {
            super();
        } 

        private Builder(GetTableLastBackflowRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.tableName = request.tableName;
            this.partition = request.partition;
        } 

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * tableName.
         */
        public Builder tableName(String tableName) {
            this.putPathParameter("tableName", tableName);
            this.tableName = tableName;
            return this;
        }

        /**
         * partition.
         */
        public Builder partition(String partition) {
            this.putQueryParameter("partition", partition);
            this.partition = partition;
            return this;
        }

        @Override
        public GetTableLastBackflowRequest build() {
            return new GetTableLastBackflowRequest(this);
        } 

    } 

}
