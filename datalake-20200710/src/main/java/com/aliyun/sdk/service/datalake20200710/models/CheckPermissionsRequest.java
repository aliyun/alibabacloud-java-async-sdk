// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckPermissionsRequest} extends {@link RequestModel}
 *
 * <p>CheckPermissionsRequest</p>
 */
public class CheckPermissionsRequest extends Request {
    @Body
    @NameInMap("Body")
    private AccessRequest body;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private CheckPermissionsRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckPermissionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public AccessRequest getBody() {
        return this.body;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CheckPermissionsRequest, Builder> {
        private AccessRequest body; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CheckPermissionsRequest response) {
            super(response);
            this.body = response.body;
            this.regionId = response.regionId;
        } 

        /**
         * Body.
         */
        public Builder body(AccessRequest body) {
            this.putBodyParameter("Body", body);
            this.body = body;
            return this;
        }

        /**
         * RegionId
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CheckPermissionsRequest build() {
            return new CheckPermissionsRequest(this);
        } 

    } 

}
