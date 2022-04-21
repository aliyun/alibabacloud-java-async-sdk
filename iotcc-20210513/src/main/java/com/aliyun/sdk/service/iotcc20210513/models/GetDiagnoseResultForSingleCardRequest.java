// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDiagnoseResultForSingleCardRequest} extends {@link RequestModel}
 *
 * <p>GetDiagnoseResultForSingleCardRequest</p>
 */
public class GetDiagnoseResultForSingleCardRequest extends Request {
    @Query
    @NameInMap("DiagnoseTaskId")
    @Validation(required = true)
    private String diagnoseTaskId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private GetDiagnoseResultForSingleCardRequest(Builder builder) {
        super(builder);
        this.diagnoseTaskId = builder.diagnoseTaskId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDiagnoseResultForSingleCardRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return diagnoseTaskId
     */
    public String getDiagnoseTaskId() {
        return this.diagnoseTaskId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetDiagnoseResultForSingleCardRequest, Builder> {
        private String diagnoseTaskId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetDiagnoseResultForSingleCardRequest request) {
            super(request);
            this.diagnoseTaskId = request.diagnoseTaskId;
            this.regionId = request.regionId;
        } 

        /**
         * DiagnoseTaskId.
         */
        public Builder diagnoseTaskId(String diagnoseTaskId) {
            this.putQueryParameter("DiagnoseTaskId", diagnoseTaskId);
            this.diagnoseTaskId = diagnoseTaskId;
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
        public GetDiagnoseResultForSingleCardRequest build() {
            return new GetDiagnoseResultForSingleCardRequest(this);
        } 

    } 

}
