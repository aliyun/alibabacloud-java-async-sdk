// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTpcdsDatabaseRequest} extends {@link RequestModel}
 *
 * <p>CreateTpcdsDatabaseRequest</p>
 */
public class CreateTpcdsDatabaseRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("body")
    private String body;

    private CreateTpcdsDatabaseRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTpcdsDatabaseRequest create() {
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
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreateTpcdsDatabaseRequest, Builder> {
        private String regionId; 
        private String body; 

        private Builder() {
            super();
        } 

        private Builder(CreateTpcdsDatabaseRequest response) {
            super(response);
            this.regionId = response.regionId;
            this.body = response.body;
        } 

        /**
         * RegionId
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * body.
         */
        public Builder body(String body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CreateTpcdsDatabaseRequest build() {
            return new CreateTpcdsDatabaseRequest(this);
        } 

    } 

}
