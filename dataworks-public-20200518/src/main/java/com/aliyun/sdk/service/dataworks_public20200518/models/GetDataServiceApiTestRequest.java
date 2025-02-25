// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link GetDataServiceApiTestRequest} extends {@link RequestModel}
 *
 * <p>GetDataServiceApiTestRequest</p>
 */
public class GetDataServiceApiTestRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TestId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The Id of the test. TestDataServiceApi is executed asynchronously after the API is called and the test Id is returned. You can also use ListDataServiceApiTest to obtain the latest test Id.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123434</p>
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
