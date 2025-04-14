// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link GetTableRequest} extends {@link RequestModel}
 *
 * <p>GetTableRequest</p>
 */
public class GetTableRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncludeBusinessMetadata")
    private Boolean includeBusinessMetadata;

    private GetTableRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.id = builder.id;
        this.includeBusinessMetadata = builder.includeBusinessMetadata;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTableRequest create() {
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
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return includeBusinessMetadata
     */
    public Boolean getIncludeBusinessMetadata() {
        return this.includeBusinessMetadata;
    }

    public static final class Builder extends Request.Builder<GetTableRequest, Builder> {
        private String regionId; 
        private String id; 
        private Boolean includeBusinessMetadata; 

        private Builder() {
            super();
        } 

        private Builder(GetTableRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.id = request.id;
            this.includeBusinessMetadata = request.includeBusinessMetadata;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>maxcompute-table:123456XXX::test_project::test_tbl
         * dlf-table:123456XXX:test_catalog:test_db::test_tbl
         * hms-table:c-abc123xxx::test_db::test_tbl
         * holo-table:h-abc123xxx::test_db:test_schema:test_tbl</p>
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * IncludeBusinessMetadata.
         */
        public Builder includeBusinessMetadata(Boolean includeBusinessMetadata) {
            this.putQueryParameter("IncludeBusinessMetadata", includeBusinessMetadata);
            this.includeBusinessMetadata = includeBusinessMetadata;
            return this;
        }

        @Override
        public GetTableRequest build() {
            return new GetTableRequest(this);
        } 

    } 

}
