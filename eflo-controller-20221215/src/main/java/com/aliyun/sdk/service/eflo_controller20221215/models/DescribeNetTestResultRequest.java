// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

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
 * {@link DescribeNetTestResultRequest} extends {@link RequestModel}
 *
 * <p>DescribeNetTestResultRequest</p>
 */
public class DescribeNetTestResultRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TestId")
    private String testId;

    private DescribeNetTestResultRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.testId = builder.testId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNetTestResultRequest create() {
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
    public String getTestId() {
        return this.testId;
    }

    public static final class Builder extends Request.Builder<DescribeNetTestResultRequest, Builder> {
        private String regionId; 
        private String testId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeNetTestResultRequest request) {
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
         * TestId.
         */
        public Builder testId(String testId) {
            this.putBodyParameter("TestId", testId);
            this.testId = testId;
            return this;
        }

        @Override
        public DescribeNetTestResultRequest build() {
            return new DescribeNetTestResultRequest(this);
        } 

    } 

}
