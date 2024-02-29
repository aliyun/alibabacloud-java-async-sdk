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
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("ProjectId")
    @Validation(required = true, maximum = 99999999999D, minimum = 2)
    private Long projectId;

    private ListSuccessInstanceAmountRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.projectId = builder.projectId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<ListSuccessInstanceAmountRequest, Builder> {
        private String regionId; 
        private Long projectId; 

        private Builder() {
            super();
        } 

        private Builder(ListSuccessInstanceAmountRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.projectId = request.projectId;
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
         * The ID of the DataWorks workspace. You can log on to the DataWorks console and go to the Workspace Management page to obtain the ID.
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public ListSuccessInstanceAmountRequest build() {
            return new ListSuccessInstanceAmountRequest(this);
        } 

    } 

}
