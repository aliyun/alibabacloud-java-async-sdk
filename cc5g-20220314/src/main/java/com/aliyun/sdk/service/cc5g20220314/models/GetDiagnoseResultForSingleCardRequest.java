// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

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
    @NameInMap("RegionNo")
    private String regionNo;

    private GetDiagnoseResultForSingleCardRequest(Builder builder) {
        super(builder);
        this.diagnoseTaskId = builder.diagnoseTaskId;
        this.regionNo = builder.regionNo;
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
     * @return regionNo
     */
    public String getRegionNo() {
        return this.regionNo;
    }

    public static final class Builder extends Request.Builder<GetDiagnoseResultForSingleCardRequest, Builder> {
        private String diagnoseTaskId; 
        private String regionNo; 

        private Builder() {
            super();
        } 

        private Builder(GetDiagnoseResultForSingleCardRequest request) {
            super(request);
            this.diagnoseTaskId = request.diagnoseTaskId;
            this.regionNo = request.regionNo;
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
         * RegionNo.
         */
        public Builder regionNo(String regionNo) {
            this.putQueryParameter("RegionNo", regionNo);
            this.regionNo = regionNo;
            return this;
        }

        @Override
        public GetDiagnoseResultForSingleCardRequest build() {
            return new GetDiagnoseResultForSingleCardRequest(this);
        } 

    } 

}
