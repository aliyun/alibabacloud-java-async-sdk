// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDataServiceApiTestRequest} extends {@link RequestModel}
 *
 * <p>GetDataServiceApiTestRequest</p>
 */
public class GetDataServiceApiTestRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("TestId")
    @Validation(required = true)
    private Long testId;

    private GetDataServiceApiTestRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.testId = builder.testId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataServiceApiTestRequest create() {
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
     * @return testId
     */
    public Long getTestId() {
        return this.testId;
    }

    public static final class Builder extends Request.Builder<GetDataServiceApiTestRequest, Builder> {
        private String regionId; 
        private Long testId; 

        private Builder() {
            super();
        } 

        private Builder(GetDataServiceApiTestRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.testId = request.testId;
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
         * The ID of the test. You can obtain the test ID from the response of the asynchronous operation TestDataServiceApi. You can also call the ListDataServiceApiTest operation to obtain the ID of the latest test.
         */
        public Builder testId(Long testId) {
            this.putQueryParameter("TestId", testId);
            this.testId = testId;
            return this;
        }

        @Override
        public GetDataServiceApiTestRequest build() {
            return new GetDataServiceApiTestRequest(this);
        } 

    } 

}
