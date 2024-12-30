// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link GetUsersRequest} extends {@link RequestModel}
 *
 * <p>GetUsersRequest</p>
 */
public class GetUsersRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserIdList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> userIdList;

    private GetUsersRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.opTenantId = builder.opTenantId;
        this.userIdList = builder.userIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUsersRequest create() {
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
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return userIdList
     */
    public java.util.List<String> getUserIdList() {
        return this.userIdList;
    }

    public static final class Builder extends Request.Builder<GetUsersRequest, Builder> {
        private String regionId; 
        private Long opTenantId; 
        private java.util.List<String> userIdList; 

        private Builder() {
            super();
        } 

        private Builder(GetUsersRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.opTenantId = request.opTenantId;
            this.userIdList = request.userIdList;
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
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder userIdList(java.util.List<String> userIdList) {
            String userIdListShrink = shrink(userIdList, "UserIdList", "json");
            this.putBodyParameter("UserIdList", userIdListShrink);
            this.userIdList = userIdList;
            return this;
        }

        @Override
        public GetUsersRequest build() {
            return new GetUsersRequest(this);
        } 

    } 

}
