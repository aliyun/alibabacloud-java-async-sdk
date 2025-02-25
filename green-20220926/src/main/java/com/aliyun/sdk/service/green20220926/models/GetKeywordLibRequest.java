// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetKeywordLibRequest} extends {@link RequestModel}
 *
 * <p>GetKeywordLibRequest</p>
 */
public class GetKeywordLibRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LibId")
    private String libId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private GetKeywordLibRequest(Builder builder) {
        super(builder);
        this.libId = builder.libId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetKeywordLibRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return libId
     */
    public String getLibId() {
        return this.libId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetKeywordLibRequest, Builder> {
        private String libId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetKeywordLibRequest request) {
            super(request);
            this.libId = request.libId;
            this.regionId = request.regionId;
        } 

        /**
         * LibId.
         */
        public Builder libId(String libId) {
            this.putBodyParameter("LibId", libId);
            this.libId = libId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetKeywordLibRequest build() {
            return new GetKeywordLibRequest(this);
        } 

    } 

}
