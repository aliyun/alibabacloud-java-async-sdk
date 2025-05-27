// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

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
 * {@link PostCustomizeRuleTestRequest} extends {@link RequestModel}
 *
 * <p>PostCustomizeRuleTestRequest</p>
 */
public class PostCustomizeRuleTestRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleType")
    private Integer roleType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SimulatedData")
    private String simulatedData;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TestType")
    private String testType;

    private PostCustomizeRuleTestRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
        this.roleType = builder.roleType;
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
     * @return roleFor
     */
    public Long getRoleFor() {
        return this.roleFor;
    }

    /**
     * @return roleType
     */
    public Integer getRoleType() {
        return this.roleType;
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
        private Long roleFor; 
        private Integer roleType; 
        private String simulatedData; 
        private String testType; 

        private Builder() {
            super();
        } 

        private Builder(PostCustomizeRuleTestRequest request) {
            super(request);
            this.id = request.id;
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
            this.roleType = request.roleType;
            this.simulatedData = request.simulatedData;
            this.testType = request.testType;
        } 

        /**
         * <p>The ID of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        public Builder id(Long id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The data management center of the threat analysis feature. Specify this parameter based on the region in which your assets reside. Valid values:</p>
         * <ul>
         * <li>cn-hangzhou: Your assets reside in regions inside China.</li>
         * <li>ap-southeast-1: Your assets reside in regions outside China.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the account that you switch from the management account.</p>
         * 
         * <strong>example:</strong>
         * <p>113091674488****</p>
         */
        public Builder roleFor(Long roleFor) {
            this.putBodyParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        /**
         * <p>The type of the view. Valid values:</p>
         * <ul>
         * <li>0: the current Alibaba Cloud account</li>
         * <li>1: the global account</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder roleType(Integer roleType) {
            this.putBodyParameter("RoleType", roleType);
            this.roleType = roleType;
            return this;
        }

        /**
         * <p>The simulation data for the test. This parameter is available only when TestType is set to simulate.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;key1&quot;:&quot;value1&quot;,&quot;key2&quot;:&quot;value2&quot;,&quot;key3&quot;:&quot;value3&quot;,&quot;key4&quot;:&quot;value4&quot;,&quot;key5&quot;:&quot;value5&quot;}]</p>
         */
        public Builder simulatedData(String simulatedData) {
            this.putBodyParameter("SimulatedData", simulatedData);
            this.simulatedData = simulatedData;
            return this;
        }

        /**
         * <p>The test type. Valid values:</p>
         * <ul>
         * <li>simulate: simulation data test</li>
         * <li>business: business data test</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>simulate</p>
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
