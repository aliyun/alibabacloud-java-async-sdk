// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunBlueprintInstanceWorkflowRequest} extends {@link RequestModel}
 *
 * <p>RunBlueprintInstanceWorkflowRequest</p>
 */
public class RunBlueprintInstanceWorkflowRequest extends Request {
    @Query
    @NameInMap("BlueprintInstanceId")
    @Validation(required = true)
    private String blueprintInstanceId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private RunBlueprintInstanceWorkflowRequest(Builder builder) {
        super(builder);
        this.blueprintInstanceId = builder.blueprintInstanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunBlueprintInstanceWorkflowRequest create() {
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

    public static final class Builder extends Request.Builder<RunBlueprintInstanceWorkflowRequest, Builder> {
        private String blueprintInstanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(RunBlueprintInstanceWorkflowRequest response) {
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
        public RunBlueprintInstanceWorkflowRequest build() {
            return new RunBlueprintInstanceWorkflowRequest(this);
        } 

    } 

}
