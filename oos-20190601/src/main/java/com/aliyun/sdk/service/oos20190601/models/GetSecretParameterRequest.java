// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSecretParameterRequest} extends {@link RequestModel}
 *
 * <p>GetSecretParameterRequest</p>
 */
public class GetSecretParameterRequest extends Request {
    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("ParameterVersion")
    @Validation(maximum = 200, minimum = 1)
    private Integer parameterVersion;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("WithDecryption")
    private Boolean withDecryption;

    private GetSecretParameterRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.parameterVersion = builder.parameterVersion;
        this.regionId = builder.regionId;
        this.withDecryption = builder.withDecryption;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSecretParameterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return parameterVersion
     */
    public Integer getParameterVersion() {
        return this.parameterVersion;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return withDecryption
     */
    public Boolean getWithDecryption() {
        return this.withDecryption;
    }

    public static final class Builder extends Request.Builder<GetSecretParameterRequest, Builder> {
        private String name; 
        private Integer parameterVersion; 
        private String regionId; 
        private Boolean withDecryption; 

        private Builder() {
            super();
        } 

        private Builder(GetSecretParameterRequest response) {
            super(response);
            this.name = response.name;
            this.parameterVersion = response.parameterVersion;
            this.regionId = response.regionId;
            this.withDecryption = response.withDecryption;
        } 

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * ParameterVersion.
         */
        public Builder parameterVersion(Integer parameterVersion) {
            this.putQueryParameter("ParameterVersion", parameterVersion);
            this.parameterVersion = parameterVersion;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * WithDecryption.
         */
        public Builder withDecryption(Boolean withDecryption) {
            this.putQueryParameter("WithDecryption", withDecryption);
            this.withDecryption = withDecryption;
            return this;
        }

        @Override
        public GetSecretParameterRequest build() {
            return new GetSecretParameterRequest(this);
        } 

    } 

}
