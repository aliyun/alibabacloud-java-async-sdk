// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateAirflowLoginTokenRequest} extends {@link RequestModel}
 *
 * <p>CreateAirflowLoginTokenRequest</p>
 */
public class CreateAirflowLoginTokenRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AirflowId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String airflowId;

    private CreateAirflowLoginTokenRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.airflowId = builder.airflowId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAirflowLoginTokenRequest create() {
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
     * @return airflowId
     */
    public String getAirflowId() {
        return this.airflowId;
    }

    public static final class Builder extends Request.Builder<CreateAirflowLoginTokenRequest, Builder> {
        private String regionId; 
        private String airflowId; 

        private Builder() {
            super();
        } 

        private Builder(CreateAirflowLoginTokenRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.airflowId = request.airflowId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>af-b3a7f110a6vmvn7xxxxxx</p>
         */
        public Builder airflowId(String airflowId) {
            this.putQueryParameter("AirflowId", airflowId);
            this.airflowId = airflowId;
            return this;
        }

        @Override
        public CreateAirflowLoginTokenRequest build() {
            return new CreateAirflowLoginTokenRequest(this);
        } 

    } 

}
