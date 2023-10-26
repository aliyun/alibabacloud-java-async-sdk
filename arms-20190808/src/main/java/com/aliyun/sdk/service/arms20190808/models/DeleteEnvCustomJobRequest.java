// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteEnvCustomJobRequest} extends {@link RequestModel}
 *
 * <p>DeleteEnvCustomJobRequest</p>
 */
public class DeleteEnvCustomJobRequest extends Request {
    @Query
    @NameInMap("CustomJobName")
    @Validation(required = true)
    private String customJobName;

    @Query
    @NameInMap("EnvironmentId")
    @Validation(required = true)
    private String environmentId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private DeleteEnvCustomJobRequest(Builder builder) {
        super(builder);
        this.customJobName = builder.customJobName;
        this.environmentId = builder.environmentId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteEnvCustomJobRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteEnvCustomJobRequest, Builder> {
        private String customJobName; 
        private String environmentId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteEnvCustomJobRequest request) {
            super(request);
            this.customJobName = request.customJobName;
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
         * Environment ID.
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
        public DeleteEnvCustomJobRequest build() {
            return new DeleteEnvCustomJobRequest(this);
        } 

    } 

}
