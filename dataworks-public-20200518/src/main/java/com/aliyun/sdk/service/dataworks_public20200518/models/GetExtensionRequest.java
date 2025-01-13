// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link GetExtensionRequest} extends {@link RequestModel}
 *
 * <p>GetExtensionRequest</p>
 */
public class GetExtensionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtensionCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String extensionCode;

    private GetExtensionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.extensionCode = builder.extensionCode;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return extensionCode
     */
    public String getExtensionCode() {
        return this.extensionCode;
    }

    public static final class Builder extends Request.Builder<GetExtensionRequest, Builder> {
        private String regionId; 
        private String extensionCode; 

        private Builder() {
            super();
        } 

        private Builder(GetExtensionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.extensionCode = request.extensionCode;
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
         * <p>The unique code of the extension.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ce4*********086da5</p>
         */
        public Builder extensionCode(String extensionCode) {
            this.putQueryParameter("ExtensionCode", extensionCode);
            this.extensionCode = extensionCode;
            return this;
        }

        @Override
        public GetExtensionRequest build() {
            return new GetExtensionRequest(this);
        } 

    } 

}
