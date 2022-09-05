// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRetcodeAppRequest} extends {@link RequestModel}
 *
 * <p>CreateRetcodeAppRequest</p>
 */
public class CreateRetcodeAppRequest extends Request {
    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("RetcodeAppName")
    @Validation(required = true)
    private String retcodeAppName;

    @Query
    @NameInMap("RetcodeAppType")
    @Validation(required = true)
    private String retcodeAppType;

    private CreateRetcodeAppRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.retcodeAppName = builder.retcodeAppName;
        this.retcodeAppType = builder.retcodeAppType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRetcodeAppRequest create() {
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
     * @return retcodeAppName
     */
    public String getRetcodeAppName() {
        return this.retcodeAppName;
    }

    /**
     * @return retcodeAppType
     */
    public String getRetcodeAppType() {
        return this.retcodeAppType;
    }

    public static final class Builder extends Request.Builder<CreateRetcodeAppRequest, Builder> {
        private String regionId; 
        private String retcodeAppName; 
        private String retcodeAppType; 

        private Builder() {
            super();
        } 

        private Builder(CreateRetcodeAppRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.retcodeAppName = request.retcodeAppName;
            this.retcodeAppType = request.retcodeAppType;
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
         * RetcodeAppName.
         */
        public Builder retcodeAppName(String retcodeAppName) {
            this.putQueryParameter("RetcodeAppName", retcodeAppName);
            this.retcodeAppName = retcodeAppName;
            return this;
        }

        /**
         * RetcodeAppType.
         */
        public Builder retcodeAppType(String retcodeAppType) {
            this.putQueryParameter("RetcodeAppType", retcodeAppType);
            this.retcodeAppType = retcodeAppType;
            return this;
        }

        @Override
        public CreateRetcodeAppRequest build() {
            return new CreateRetcodeAppRequest(this);
        } 

    } 

}
