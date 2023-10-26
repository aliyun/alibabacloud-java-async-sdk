// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEnvCustomJobRequest} extends {@link RequestModel}
 *
 * <p>DescribeEnvCustomJobRequest</p>
 */
public class DescribeEnvCustomJobRequest extends Request {
    @Query
    @NameInMap("CustomJobName")
    @Validation(required = true)
    private String customJobName;

    @Query
    @NameInMap("EncryptYaml")
    private Boolean encryptYaml;

    @Query
    @NameInMap("EnvironmentId")
    @Validation(required = true)
    private String environmentId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private DescribeEnvCustomJobRequest(Builder builder) {
        super(builder);
        this.customJobName = builder.customJobName;
        this.encryptYaml = builder.encryptYaml;
        this.environmentId = builder.environmentId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEnvCustomJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customJobName
     */
    public String getCustomJobName() {
        return this.customJobName;
    }

    /**
     * @return encryptYaml
     */
    public Boolean getEncryptYaml() {
        return this.encryptYaml;
    }

    /**
     * @return environmentId
     */
    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeEnvCustomJobRequest, Builder> {
        private String customJobName; 
        private Boolean encryptYaml; 
        private String environmentId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEnvCustomJobRequest request) {
            super(request);
            this.customJobName = request.customJobName;
            this.encryptYaml = request.encryptYaml;
            this.environmentId = request.environmentId;
            this.regionId = request.regionId;
        } 

        /**
         * Custom job name.
         */
        public Builder customJobName(String customJobName) {
            this.putQueryParameter("CustomJobName", customJobName);
            this.customJobName = customJobName;
            return this;
        }

        /**
         * Whether to return the encrypted yaml string.
         */
        public Builder encryptYaml(Boolean encryptYaml) {
            this.putQueryParameter("EncryptYaml", encryptYaml);
            this.encryptYaml = encryptYaml;
            return this;
        }

        /**
         * Environment instance ID.
         */
        public Builder environmentId(String environmentId) {
            this.putQueryParameter("EnvironmentId", environmentId);
            this.environmentId = environmentId;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeEnvCustomJobRequest build() {
            return new DescribeEnvCustomJobRequest(this);
        } 

    } 

}
