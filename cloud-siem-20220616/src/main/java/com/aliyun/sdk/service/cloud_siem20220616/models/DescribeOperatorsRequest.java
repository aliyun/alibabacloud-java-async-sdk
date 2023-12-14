// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOperatorsRequest} extends {@link RequestModel}
 *
 * <p>DescribeOperatorsRequest</p>
 */
public class DescribeOperatorsRequest extends Request {
    @Body
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("SceneType")
    private String sceneType;

    private DescribeOperatorsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.sceneType = builder.sceneType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOperatorsRequest create() {
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
     * @return sceneType
     */
    public String getSceneType() {
        return this.sceneType;
    }

    public static final class Builder extends Request.Builder<DescribeOperatorsRequest, Builder> {
        private String regionId; 
        private String sceneType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeOperatorsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.sceneType = request.sceneType;
        } 

        /**
         * The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the regions in which your assets reside. Valid values:
         * <p>
         * 
         * *   cn-hangzhou: Your assets reside in regions in China.
         * *   ap-southeast-1: Your assets reside in regions outside China.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The type of the scenario in which the operator is used. Valid values:
         * <p>
         * 
         * *   If you do not specify this parameter, the default scenario is used.
         * *   AGGREGATE: AGGREGATE scenario.
         */
        public Builder sceneType(String sceneType) {
            this.putBodyParameter("SceneType", sceneType);
            this.sceneType = sceneType;
            return this;
        }

        @Override
        public DescribeOperatorsRequest build() {
            return new DescribeOperatorsRequest(this);
        } 

    } 

}
