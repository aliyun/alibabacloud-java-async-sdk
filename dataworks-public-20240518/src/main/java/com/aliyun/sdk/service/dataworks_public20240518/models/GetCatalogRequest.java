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
 * {@link GetCatalogRequest} extends {@link RequestModel}
 *
 * <p>GetCatalogRequest</p>
 */
public class GetCatalogRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String id;

    private GetCatalogRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCatalogRequest create() {
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

    public static final class Builder extends Request.Builder<GetCatalogRequest, Builder> {
        private String regionId; 
        private String id; 

        private Builder() {
            super();
        } 

        private Builder(GetCatalogRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.id = request.id;
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
         * <p>The ID of the data catalog entity. Currently, DLF and StarRocks types are supported. You can obtain the ID from the response of the ListCatalogs operation. For more information, see <a href="https://help.aliyun.com/document_detail/2880092.html">Metadata entity concepts</a>.</p>
         * <ul>
         * <li><p>For the DLF type, the format is <code>dlf-catalog::catalog_id</code>.</p>
         * </li>
         * <li><p>For the StarRocks type, the format is <code>starrocks-catalog:(instance_id|encoded_jdbc_url):catalog_name</code>.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Where<br><code>catalog_id</code>: the ID of the DLF catalog.<br><code>instance_id</code>: the instance ID, which is required when the data source is registered in instance mode.<br><code>encoded_jdbc_url</code>: the URL-encoded JDBC connection string, which is required when the data source is registered in connection string mode.<br><code>catalog_name</code>: the name of the StarRocks catalog.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dlf-catalog::catalog_id</p>
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public GetCatalogRequest build() {
            return new GetCatalogRequest(this);
        } 

    } 

}
