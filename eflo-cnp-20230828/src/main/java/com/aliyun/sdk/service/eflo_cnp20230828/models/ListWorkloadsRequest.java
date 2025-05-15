// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_cnp20230828.models;

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
 * {@link ListWorkloadsRequest} extends {@link RequestModel}
 *
 * <p>ListWorkloadsRequest</p>
 */
public class ListWorkloadsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scope")
    private String scope;

    private ListWorkloadsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.scope = builder.scope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWorkloadsRequest create() {
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
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    public static final class Builder extends Request.Builder<ListWorkloadsRequest, Builder> {
        private String regionId; 
        private String scope; 

        private Builder() {
            super();
        } 

        private Builder(ListWorkloadsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.scope = request.scope;
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
         * <p>Scope</p>
         * 
         * <strong>example:</strong>
         * <p>common</p>
         */
        public Builder scope(String scope) {
            this.putQueryParameter("Scope", scope);
            this.scope = scope;
            return this;
        }

        @Override
        public ListWorkloadsRequest build() {
            return new ListWorkloadsRequest(this);
        } 

    } 

}
