// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelActiveOperationTasksRequest} extends {@link RequestModel}
 *
 * <p>CancelActiveOperationTasksRequest</p>
 */
public class CancelActiveOperationTasksRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ids")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ids;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private CancelActiveOperationTasksRequest(Builder builder) {
        super(builder);
        this.ids = builder.ids;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelActiveOperationTasksRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ids
     */
    public String getIds() {
        return this.ids;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CancelActiveOperationTasksRequest, Builder> {
        private String ids; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CancelActiveOperationTasksRequest request) {
            super(request);
            this.ids = request.ids;
            this.regionId = request.regionId;
        } 

        /**
         * Ids.
         */
        public Builder ids(String ids) {
            this.putQueryParameter("Ids", ids);
            this.ids = ids;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CancelActiveOperationTasksRequest build() {
            return new CancelActiveOperationTasksRequest(this);
        } 

    } 

}
