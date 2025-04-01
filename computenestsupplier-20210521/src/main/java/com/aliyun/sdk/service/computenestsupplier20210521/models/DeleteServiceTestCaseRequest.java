// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

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
 * {@link DeleteServiceTestCaseRequest} extends {@link RequestModel}
 *
 * <p>DeleteServiceTestCaseRequest</p>
 */
public class DeleteServiceTestCaseRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TestCaseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String testCaseId;

    private DeleteServiceTestCaseRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.testCaseId = builder.testCaseId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteServiceTestCaseRequest create() {
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
     * @return testCaseId
     */
    public String getTestCaseId() {
        return this.testCaseId;
    }

    public static final class Builder extends Request.Builder<DeleteServiceTestCaseRequest, Builder> {
        private String regionId; 
        private String testCaseId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteServiceTestCaseRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.testCaseId = request.testCaseId;
        } 

        /**
         * <p>Region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The service test case id.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>stc-0b2a3ad7e1de4c299eec</p>
         */
        public Builder testCaseId(String testCaseId) {
            this.putQueryParameter("TestCaseId", testCaseId);
            this.testCaseId = testCaseId;
            return this;
        }

        @Override
        public DeleteServiceTestCaseRequest build() {
            return new DeleteServiceTestCaseRequest(this);
        } 

    } 

}
