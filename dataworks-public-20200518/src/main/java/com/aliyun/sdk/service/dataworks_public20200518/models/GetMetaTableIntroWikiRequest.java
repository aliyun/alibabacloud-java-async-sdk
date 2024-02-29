// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMetaTableIntroWikiRequest} extends {@link RequestModel}
 *
 * <p>GetMetaTableIntroWikiRequest</p>
 */
public class GetMetaTableIntroWikiRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("TableGuid")
    @Validation(required = true)
    private String tableGuid;

    @Query
    @NameInMap("WikiVersion")
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The GUID of the metatable.
         */
        public Builder tableGuid(String tableGuid) {
            this.putQueryParameter("TableGuid", tableGuid);
            this.tableGuid = tableGuid;
            return this;
        }

        /**
         * The version of the instructions.
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
