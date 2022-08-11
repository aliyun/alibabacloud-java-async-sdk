// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSuccessInstanceAmountRequest} extends {@link RequestModel}
 *
 * <p>ListSuccessInstanceAmountRequest</p>
 */
public class ListSuccessInstanceAmountRequest extends Request {
    @Body
    @NameInMap("ProjectId")
    @Validation(required = true, maximum = 99999999999D, minimum = 2)
    private Long projectId;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private ListSuccessInstanceAmountRequest(Builder builder) {
        super(builder);
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSuccessInstanceAmountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListSuccessInstanceAmountRequest, Builder> {
        private Long projectId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListSuccessInstanceAmountRequest request) {
            super(request);
            this.projectId = request.projectId;
            this.regionId = request.regionId;
        } 

        /**
         * ProjectId.
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListSuccessInstanceAmountRequest build() {
            return new ListSuccessInstanceAmountRequest(this);
        } 

    } 

}
