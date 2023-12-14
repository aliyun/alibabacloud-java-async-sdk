// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUsersByProdRequest} extends {@link RequestModel}
 *
 * <p>ListUsersByProdRequest</p>
 */
public class ListUsersByProdRequest extends Request {
    @Body
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("SourceProdCode")
    @Validation(required = true)
    private String sourceProdCode;

    private ListUsersByProdRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.sourceProdCode = builder.sourceProdCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUsersByProdRequest create() {
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
     * @return sourceProdCode
     */
    public String getSourceProdCode() {
        return this.sourceProdCode;
    }

    public static final class Builder extends Request.Builder<ListUsersByProdRequest, Builder> {
        private String regionId; 
        private String sourceProdCode; 

        private Builder() {
            super();
        } 

        private Builder(ListUsersByProdRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.sourceProdCode = request.sourceProdCode;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SourceProdCode.
         */
        public Builder sourceProdCode(String sourceProdCode) {
            this.putBodyParameter("SourceProdCode", sourceProdCode);
            this.sourceProdCode = sourceProdCode;
            return this;
        }

        @Override
        public ListUsersByProdRequest build() {
            return new ListUsersByProdRequest(this);
        } 

    } 

}
