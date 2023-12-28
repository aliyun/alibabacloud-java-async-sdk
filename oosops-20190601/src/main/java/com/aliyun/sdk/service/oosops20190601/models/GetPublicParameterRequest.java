// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oosops20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPublicParameterRequest} extends {@link RequestModel}
 *
 * <p>GetPublicParameterRequest</p>
 */
public class GetPublicParameterRequest extends Request {
    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("ParameterVersion")
    private Integer parameterVersion;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private GetPublicParameterRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.parameterVersion = builder.parameterVersion;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPublicParameterRequest create() {
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

    public static final class Builder extends Request.Builder<GetPublicParameterRequest, Builder> {
        private String name; 
        private Integer parameterVersion; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetPublicParameterRequest request) {
            super(request);
            this.name = request.name;
            this.parameterVersion = request.parameterVersion;
            this.regionId = request.regionId;
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

        @Override
        public GetPublicParameterRequest build() {
            return new GetPublicParameterRequest(this);
        } 

    } 

}
