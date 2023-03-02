// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProjectIdsRequest} extends {@link RequestModel}
 *
 * <p>ListProjectIdsRequest</p>
 */
public class ListProjectIdsRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("UserId")
    @Validation(required = true, maxLength = 10000000)
    private String userId;

    private ListProjectIdsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProjectIdsRequest create() {
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
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<ListProjectIdsRequest, Builder> {
        private String regionId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(ListProjectIdsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.userId = request.userId;
        } 

        /**
         * The ID of the region in which DataWorks is activated. For example, the ID of the China (Shanghai) region is cn-shanghai, and that of the China (Zhangjiakou) region is cn-zhangjiakou. The system automatically determines the value of this parameter based on the endpoint used to call the operation.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the specific Alibaba Cloud account. You can log on to the [DataWorks](https://workbench.data.aliyun.com/console) console and move the pointer over the profile picture in the upper-right corner to view the ID.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public ListProjectIdsRequest build() {
            return new ListProjectIdsRequest(this);
        } 

    } 

}
