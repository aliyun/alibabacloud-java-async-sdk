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
         * <p>The ID of the custom rule.</p>
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
         * <p>The region where the Data Management center of threat analysis is located. Select the region based on the region where your assets are located. Valid values:</p>
         * <ul>
         * <li><p>cn-hangzhou: Your assets are in the Chinese mainland or China (Hong Kong).</p>
         * </li>
         * <li><p>ap-southeast-1: Your assets are in regions outside China.</p>
         * </li>
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
         * <p>The user ID of the member that the administrator wants to impersonate to view data.</p>
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
         * <p>The view type.</p>
         * <ul>
         * <li><p>0: the view of the current Alibaba Cloud account.</p>
         * </li>
         * <li><p>1: the view of all accounts in the enterprise.</p>
         * </li>
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
         * <p>The simulated data for the test. This parameter is required only when TestType is set to simulate.</p>
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
         * <li><p>simulate: tests the rule with simulated data</p>
         * </li>
         * <li><p>business: tests the rule with business data</p>
         * </li>
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
