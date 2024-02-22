// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBindAccountRequest} extends {@link RequestModel}
 *
 * <p>ListBindAccountRequest</p>
 */
public class ListBindAccountRequest extends Request {
    @Body
    @NameInMap("CloudCode")
    @Validation(required = true)
    private String cloudCode;

    @Body
    @NameInMap("RegionId")
    private String regionId;

    private ListBindAccountRequest(Builder builder) {
        super(builder);
        this.cloudCode = builder.cloudCode;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBindAccountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cloudCode
     */
    public String getCloudCode() {
        return this.cloudCode;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListBindAccountRequest, Builder> {
        private String cloudCode; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListBindAccountRequest request) {
            super(request);
            this.cloudCode = request.cloudCode;
            this.regionId = request.regionId;
        } 

        /**
         * The code of the cloud service provider. Valid values:
         * <p>
         * 
         * *   qcloud: Tencent Cloud
         * *   aliyun: Alibaba Cloud
         * *   hcloud: Huawei Cloud
         */
        public Builder cloudCode(String cloudCode) {
            this.putBodyParameter("CloudCode", cloudCode);
            this.cloudCode = cloudCode;
            return this;
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

        @Override
        public ListBindAccountRequest build() {
            return new ListBindAccountRequest(this);
        } 

    } 

}
