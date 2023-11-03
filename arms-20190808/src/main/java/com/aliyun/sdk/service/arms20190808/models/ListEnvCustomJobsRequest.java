// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEnvCustomJobsRequest} extends {@link RequestModel}
 *
 * <p>ListEnvCustomJobsRequest</p>
 */
public class ListEnvCustomJobsRequest extends Request {
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

    private ListEnvCustomJobsRequest(Builder builder) {
        super(builder);
        this.encryptYaml = builder.encryptYaml;
        this.environmentId = builder.environmentId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEnvCustomJobsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<ListEnvCustomJobsRequest, Builder> {
        private Boolean encryptYaml; 
        private String environmentId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListEnvCustomJobsRequest request) {
            super(request);
            this.encryptYaml = request.encryptYaml;
            this.environmentId = request.environmentId;
            this.regionId = request.regionId;
        } 

        /**
         * Specifies whether to return the encrypted YAML string.
         */
        public Builder encryptYaml(Boolean encryptYaml) {
            this.putQueryParameter("EncryptYaml", encryptYaml);
            this.encryptYaml = encryptYaml;
            return this;
        }

        /**
         * The ID of the environment instance.
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
        public ListEnvCustomJobsRequest build() {
            return new ListEnvCustomJobsRequest(this);
        } 

    } 

}
