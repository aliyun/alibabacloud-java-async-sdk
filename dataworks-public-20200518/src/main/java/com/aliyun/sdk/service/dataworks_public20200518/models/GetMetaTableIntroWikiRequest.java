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
 * {@link GetMetaTableIntroWikiRequest} extends {@link RequestModel}
 *
 * <p>GetMetaTableIntroWikiRequest</p>
 */
public class GetMetaTableIntroWikiRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableGuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tableGuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WikiVersion")
    private Long wikiVersion;

    private GetMetaTableIntroWikiRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.tableGuid = builder.tableGuid;
        this.wikiVersion = builder.wikiVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMetaTableIntroWikiRequest create() {
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
     * @return tableGuid
     */
    public String getTableGuid() {
        return this.tableGuid;
    }

    /**
     * @return wikiVersion
     */
    public Long getWikiVersion() {
        return this.wikiVersion;
    }

    public static final class Builder extends Request.Builder<GetMetaTableIntroWikiRequest, Builder> {
        private String regionId; 
        private String tableGuid; 
        private Long wikiVersion; 

        private Builder() {
            super();
        } 

        private Builder(GetMetaTableIntroWikiRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.tableGuid = request.tableGuid;
            this.wikiVersion = request.wikiVersion;
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
         * <p>The GUID of the metatable.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>odps.engine_name.table_name</p>
         */
        public Builder tableGuid(String tableGuid) {
            this.putQueryParameter("TableGuid", tableGuid);
            this.tableGuid = tableGuid;
            return this;
        }

        /**
         * <p>The version of the instructions.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder wikiVersion(Long wikiVersion) {
            this.putQueryParameter("WikiVersion", wikiVersion);
            this.wikiVersion = wikiVersion;
            return this;
        }

        @Override
        public GetMetaTableIntroWikiRequest build() {
            return new GetMetaTableIntroWikiRequest(this);
        } 

    } 

}
