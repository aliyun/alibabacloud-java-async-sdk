// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAppGroupDeploySettingRequest} extends {@link RequestModel}
 *
 * <p>DescribeAppGroupDeploySettingRequest</p>
 */
public class DescribeAppGroupDeploySettingRequest extends Request {
    @Query
    @NameInMap("AppGroupId")
    @Validation(required = true)
    private Long appGroupId;

    @Query
    @NameInMap("EnvType")
    @Validation(required = true)
    private String envType;

    private DescribeAppGroupDeploySettingRequest(Builder builder) {
        super(builder);
        this.appGroupId = builder.appGroupId;
        this.envType = builder.envType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAppGroupDeploySettingRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appGroupId
     */
    public Long getAppGroupId() {
        return this.appGroupId;
    }

    /**
     * @return envType
     */
    public String getEnvType() {
        return this.envType;
    }

    public static final class Builder extends Request.Builder<DescribeAppGroupDeploySettingRequest, Builder> {
        private Long appGroupId; 
        private String envType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAppGroupDeploySettingRequest request) {
            super(request);
            this.appGroupId = request.appGroupId;
            this.envType = request.envType;
        } 

        /**
         * AppGroupId.
         */
        public Builder appGroupId(Long appGroupId) {
            this.putQueryParameter("AppGroupId", appGroupId);
            this.appGroupId = appGroupId;
            return this;
        }

        /**
         * EnvType.
         */
        public Builder envType(String envType) {
            this.putQueryParameter("EnvType", envType);
            this.envType = envType;
            return this;
        }

        @Override
        public DescribeAppGroupDeploySettingRequest build() {
            return new DescribeAppGroupDeploySettingRequest(this);
        } 

    } 

}
