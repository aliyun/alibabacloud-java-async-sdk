// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckPermissionsRequest} extends {@link RequestModel}
 *
 * <p>CheckPermissionsRequest</p>
 */
public class CheckPermissionsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Body")
    private AccessRequest body;

    private CheckPermissionsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.body = builder.body;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return body
     */
    public AccessRequest getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CheckPermissionsRequest, Builder> {
        private String regionId; 
        private AccessRequest body; 

        private Builder() {
            super();
        } 

        private Builder(CheckPermissionsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.body = request.body;
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
         * Body.
         */
        public Builder body(AccessRequest body) {
            this.putBodyParameter("Body", body);
            this.body = body;
            return this;
        }

        @Override
        public CheckPermissionsRequest build() {
            return new CheckPermissionsRequest(this);
        } 

    } 

}
