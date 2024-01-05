// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.igraph20210621.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetIgraphTableDetailRequest} extends {@link RequestModel}
 *
 * <p>GetIgraphTableDetailRequest</p>
 */
public class GetIgraphTableDetailRequest extends Request {
    @Path
    @NameInMap("instanceId")
    private String instanceId;

    @Path
    @NameInMap("graphName")
    private String graphName;

    @Path
    @NameInMap("tableName")
    private String tableName;

    private GetIgraphTableDetailRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.graphName = builder.graphName;
        this.tableName = builder.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIgraphTableDetailRequest create() {
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
     * @return graphName
     */
    public String getGraphName() {
        return this.graphName;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    public static final class Builder extends Request.Builder<GetIgraphTableDetailRequest, Builder> {
        private String instanceId; 
        private String graphName; 
        private String tableName; 

        private Builder() {
            super();
        } 

        private Builder(GetIgraphTableDetailRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.graphName = request.graphName;
            this.tableName = request.tableName;
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
         * graphName.
         */
        public Builder graphName(String graphName) {
            this.putPathParameter("graphName", graphName);
            this.graphName = graphName;
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

        @Override
        public GetIgraphTableDetailRequest build() {
            return new GetIgraphTableDetailRequest(this);
        } 

    } 

}
