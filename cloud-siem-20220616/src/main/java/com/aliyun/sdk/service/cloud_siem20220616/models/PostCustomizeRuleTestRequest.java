// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PostCustomizeRuleTestRequest} extends {@link RequestModel}
 *
 * <p>PostCustomizeRuleTestRequest</p>
 */
public class PostCustomizeRuleTestRequest extends Request {
    @Body
    @NameInMap("Id")
    private Long id;

    @Body
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("SimulatedData")
    private String simulatedData;

    @Body
    @NameInMap("TestType")
    private String testType;

    private PostCustomizeRuleTestRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.regionId = builder.regionId;
        this.simulatedData = builder.simulatedData;
        this.testType = builder.testType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PostCustomizeRuleTestRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return simulatedData
     */
    public String getSimulatedData() {
        return this.simulatedData;
    }

    /**
     * @return testType
     */
    public String getTestType() {
        return this.testType;
    }

    public static final class Builder extends Request.Builder<PostCustomizeRuleTestRequest, Builder> {
        private Long id; 
        private String regionId; 
        private String simulatedData; 
        private String testType; 

        private Builder() {
            super();
        } 

        private Builder(PostCustomizeRuleTestRequest request) {
            super(request);
            this.id = request.id;
            this.regionId = request.regionId;
            this.simulatedData = request.simulatedData;
            this.testType = request.testType;
        } 

        /**
         * The ID of the rule.
         */
        public Builder id(Long id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * The data management center of the threat analysis feature. Specify this parameter based on the region in which your assets reside. Valid values:
         * <p>
         * 
         * *   cn-hangzhou: Your assets reside in regions inside China.
         * *   ap-southeast-1: Your assets reside in regions outside China.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The simulation data for the test. This parameter is available only when TestType is set to simulate.
         */
        public Builder simulatedData(String simulatedData) {
            this.putBodyParameter("SimulatedData", simulatedData);
            this.simulatedData = simulatedData;
            return this;
        }

        /**
         * The test type. Valid values:
         * <p>
         * 
         * *   simulate: simulation data test
         * *   business: business data test
         */
        public Builder testType(String testType) {
            this.putBodyParameter("TestType", testType);
            this.testType = testType;
            return this;
        }

        @Override
        public PostCustomizeRuleTestRequest build() {
            return new PostCustomizeRuleTestRequest(this);
        } 

    } 

}
