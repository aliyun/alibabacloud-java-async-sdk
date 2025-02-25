// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.igraph20210621.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTableDetailRequest} extends {@link RequestModel}
 *
 * <p>GetTableDetailRequest</p>
 */
public class GetTableDetailRequest extends Request {
    @Path
    @NameInMap("instanceId")
    @Validation(required = true)
    private String instanceId;

    @Path
    @NameInMap("tableName")
    @Validation(required = true)
    private String tableName;

    private GetTableDetailRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.tableName = builder.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTableDetailRequest create() {
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

    public static final class Builder extends Request.Builder<GetTableDetailRequest, Builder> {
        private String instanceId; 
        private String tableName; 

        private Builder() {
            super();
        } 

        private Builder(GetTableDetailRequest request) {
            super(request);
            this.instanceId = request.instanceId;
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
         * tableName.
         */
        public Builder tableName(String tableName) {
            this.putPathParameter("tableName", tableName);
            this.tableName = tableName;
            return this;
        }

        @Override
        public GetTableDetailRequest build() {
            return new GetTableDetailRequest(this);
        } 

    } 

}
