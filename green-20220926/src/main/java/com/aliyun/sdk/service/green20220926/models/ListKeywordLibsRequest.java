// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link ListKeywordLibsRequest} extends {@link RequestModel}
 *
 * <p>ListKeywordLibsRequest</p>
 */
public class ListKeywordLibsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TenantCode")
    private String tenantCode;

    private ListKeywordLibsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.tenantCode = builder.tenantCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListKeywordLibsRequest create() {
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
     * @return tenantCode
     */
    public String getTenantCode() {
        return this.tenantCode;
    }

    public static final class Builder extends Request.Builder<ListKeywordLibsRequest, Builder> {
        private String regionId; 
        private String tenantCode; 

        private Builder() {
            super();
        } 

        private Builder(ListKeywordLibsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.tenantCode = request.tenantCode;
        } 

        /**
         * <p>Region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * TenantCode.
         */
        public Builder tenantCode(String tenantCode) {
            this.putQueryParameter("TenantCode", tenantCode);
            this.tenantCode = tenantCode;
            return this;
        }

        @Override
        public ListKeywordLibsRequest build() {
            return new ListKeywordLibsRequest(this);
        } 

    } 

}
