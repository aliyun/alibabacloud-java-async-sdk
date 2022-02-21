// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopBlueprintInstanceWorkflowRequest} extends {@link RequestModel}
 *
 * <p>StopBlueprintInstanceWorkflowRequest</p>
 */
public class StopBlueprintInstanceWorkflowRequest extends Request {
    @Query
    @NameInMap("BlueprintInstanceId")
    @Validation(required = true)
    private String blueprintInstanceId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private StopBlueprintInstanceWorkflowRequest(Builder builder) {
        super(builder);
        this.blueprintInstanceId = builder.blueprintInstanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopBlueprintInstanceWorkflowRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return blueprintInstanceId
     */
    public String getBlueprintInstanceId() {
        return this.blueprintInstanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<StopBlueprintInstanceWorkflowRequest, Builder> {
        private String blueprintInstanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(StopBlueprintInstanceWorkflowRequest response) {
            super(response);
            this.blueprintInstanceId = response.blueprintInstanceId;
            this.regionId = response.regionId;
        } 

        /**
         * BlueprintInstanceId.
         */
        public Builder blueprintInstanceId(String blueprintInstanceId) {
            this.putQueryParameter("BlueprintInstanceId", blueprintInstanceId);
            this.blueprintInstanceId = blueprintInstanceId;
            return this;
        }

        /**
         * RegionId
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public StopBlueprintInstanceWorkflowRequest build() {
            return new StopBlueprintInstanceWorkflowRequest(this);
        } 

    } 

}
