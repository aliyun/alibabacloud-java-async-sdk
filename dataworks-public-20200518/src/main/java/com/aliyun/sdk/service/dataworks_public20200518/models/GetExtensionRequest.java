// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetExtensionRequest} extends {@link RequestModel}
 *
 * <p>GetExtensionRequest</p>
 */
public class GetExtensionRequest extends Request {
    @Query
    @NameInMap("ExtensionCode")
    private String extensionCode;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private GetExtensionRequest(Builder builder) {
        super(builder);
        this.extensionCode = builder.extensionCode;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetExtensionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return extensionCode
     */
    public String getExtensionCode() {
        return this.extensionCode;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetExtensionRequest, Builder> {
        private String extensionCode; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetExtensionRequest request) {
            super(request);
            this.extensionCode = request.extensionCode;
            this.regionId = request.regionId;
        } 

        /**
         * ExtensionCode.
         */
        public Builder extensionCode(String extensionCode) {
            this.putQueryParameter("ExtensionCode", extensionCode);
            this.extensionCode = extensionCode;
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

        @Override
        public GetExtensionRequest build() {
            return new GetExtensionRequest(this);
        } 

    } 

}
