// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSecretParametersRequest} extends {@link RequestModel}
 *
 * <p>GetSecretParametersRequest</p>
 */
public class GetSecretParametersRequest extends Request {
    @Query
    @NameInMap("Names")
    @Validation(required = true)
    private String names;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("WithDecryption")
    private Boolean withDecryption;

    private GetSecretParametersRequest(Builder builder) {
        super(builder);
        this.names = builder.names;
        this.regionId = builder.regionId;
        this.withDecryption = builder.withDecryption;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSecretParametersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return names
     */
    public String getNames() {
        return this.names;
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

    public static final class Builder extends Request.Builder<GetSecretParametersRequest, Builder> {
        private String names; 
        private String regionId; 
        private Boolean withDecryption; 

        private Builder() {
            super();
        } 

        private Builder(GetSecretParametersRequest request) {
            super(request);
            this.names = request.names;
            this.regionId = request.regionId;
            this.withDecryption = request.withDecryption;
        } 

        /**
         * The name of the encryption parameter. Multiple encryption parameters can form a JSON array in the format of \["xxxxxxxxx", "yyyyyyyyy", … "zzzzzzzzz"]. Each JSON array can contain a maximum of 10 encryption parameters. Multiple encryption parameters in the array are separated by commas (,).
         */
        public Builder names(String names) {
            this.putQueryParameter("Names", names);
            this.names = names;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Specifies whether to decrypt the parameter value. Default value: false. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder withDecryption(Boolean withDecryption) {
            this.putQueryParameter("WithDecryption", withDecryption);
            this.withDecryption = withDecryption;
            return this;
        }

        @Override
        public GetSecretParametersRequest build() {
            return new GetSecretParametersRequest(this);
        } 

    } 

}
