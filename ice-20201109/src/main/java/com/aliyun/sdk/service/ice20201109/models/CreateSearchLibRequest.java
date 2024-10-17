// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateSearchLibRequest} extends {@link RequestModel}
 *
 * <p>CreateSearchLibRequest</p>
 */
public class CreateSearchLibRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchLibName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String searchLibName;

    private CreateSearchLibRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.searchLibName = builder.searchLibName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSearchLibRequest create() {
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
     * @return searchLibName
     */
    public String getSearchLibName() {
        return this.searchLibName;
    }

    public static final class Builder extends Request.Builder<CreateSearchLibRequest, Builder> {
        private String regionId; 
        private String searchLibName; 

        private Builder() {
            super();
        } 

        private Builder(CreateSearchLibRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.searchLibName = request.searchLibName;
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
         * <p>The name of the search library. The name can contain letters and digits and must start with a letter.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test1</p>
         */
        public Builder searchLibName(String searchLibName) {
            this.putQueryParameter("SearchLibName", searchLibName);
            this.searchLibName = searchLibName;
            return this;
        }

        @Override
        public CreateSearchLibRequest build() {
            return new CreateSearchLibRequest(this);
        } 

    } 

}
