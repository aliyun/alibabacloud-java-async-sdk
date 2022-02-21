// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20160607.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetNamespaceListRequest} extends {@link RequestModel}
 *
 * <p>GetNamespaceListRequest</p>
 */
public class GetNamespaceListRequest extends Request {
    @Query
    @NameInMap("Authorize")
    private String authorize;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Status")
    private String status;

    private GetNamespaceListRequest(Builder builder) {
        super(builder);
        this.authorize = builder.authorize;
        this.regionId = builder.regionId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNamespaceListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authorize
     */
    public String getAuthorize() {
        return this.authorize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<GetNamespaceListRequest, Builder> {
        private String authorize; 
        private String regionId; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(GetNamespaceListRequest response) {
            super(response);
            this.authorize = response.authorize;
            this.regionId = response.regionId;
            this.status = response.status;
        } 

        /**
         * Authorize.
         */
        public Builder authorize(String authorize) {
            this.putQueryParameter("Authorize", authorize);
            this.authorize = authorize;
            return this;
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
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public GetNamespaceListRequest build() {
            return new GetNamespaceListRequest(this);
        } 

    } 

}
