// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTableMetaRequest} extends {@link RequestModel}
 *
 * <p>GetTableMetaRequest</p>
 */
public class GetTableMetaRequest extends Request {
    @Path
    @NameInMap("TableMetaId")
    @Validation(required = true)
    private String tableMetaId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private GetTableMetaRequest(Builder builder) {
        super(builder);
        this.tableMetaId = builder.tableMetaId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTableMetaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return tableMetaId
     */
    public String getTableMetaId() {
        return this.tableMetaId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<GetTableMetaRequest, Builder> {
        private String tableMetaId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetTableMetaRequest request) {
            super(request);
            this.tableMetaId = request.tableMetaId;
            this.instanceId = request.instanceId;
        } 

        /**
         * TableMetaId.
         */
        public Builder tableMetaId(String tableMetaId) {
            this.putPathParameter("TableMetaId", tableMetaId);
            this.tableMetaId = tableMetaId;
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

        @Override
        public GetTableMetaRequest build() {
            return new GetTableMetaRequest(this);
        } 

    } 

}
