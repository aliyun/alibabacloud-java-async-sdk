// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baasdis20200509.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDIDRequest} extends {@link RequestModel}
 *
 * <p>GetDIDRequest</p>
 */
public class GetDIDRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DID")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DID;

    private GetDIDRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.DID = builder.DID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDIDRequest create() {
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
     * @return DID
     */
    public String getDID() {
        return this.DID;
    }

    public static final class Builder extends Request.Builder<GetDIDRequest, Builder> {
        private String regionId; 
        private String DID; 

        private Builder() {
            super();
        } 

        private Builder(GetDIDRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.DID = request.DID;
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
         * DID.
         */
        public Builder DID(String DID) {
            this.putBodyParameter("DID", DID);
            this.DID = DID;
            return this;
        }

        @Override
        public GetDIDRequest build() {
            return new GetDIDRequest(this);
        } 

    } 

}
