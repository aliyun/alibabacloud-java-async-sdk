// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

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
 * {@link DeleteOpsItemsRequest} extends {@link RequestModel}
 *
 * <p>DeleteOpsItemsRequest</p>
 */
public class DeleteOpsItemsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpsItemIds")
    private java.util.List<String> opsItemIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DeleteOpsItemsRequest(Builder builder) {
        super(builder);
        this.opsItemIds = builder.opsItemIds;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteOpsItemsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return opsItemIds
     */
    public java.util.List<String> getOpsItemIds() {
        return this.opsItemIds;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteOpsItemsRequest, Builder> {
        private java.util.List<String> opsItemIds; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteOpsItemsRequest request) {
            super(request);
            this.opsItemIds = request.opsItemIds;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The IDs of O&amp;M items.</p>
         */
        public Builder opsItemIds(java.util.List<String> opsItemIds) {
            this.putQueryParameter("OpsItemIds", opsItemIds);
            this.opsItemIds = opsItemIds;
            return this;
        }

        /**
         * <p>The region ID.</p>
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
        public DeleteOpsItemsRequest build() {
            return new DeleteOpsItemsRequest(this);
        } 

    } 

}
