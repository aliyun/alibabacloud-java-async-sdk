// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateMetaTableIntroWikiRequest} extends {@link RequestModel}
 *
 * <p>UpdateMetaTableIntroWikiRequest</p>
 */
public class UpdateMetaTableIntroWikiRequest extends Request {
    @Body
    @NameInMap("Content")
    @Validation(required = true)
    private String content;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("TableGuid")
    @Validation(required = true)
    private String tableGuid;

    private UpdateMetaTableIntroWikiRequest(Builder builder) {
        super(builder);
        this.content = builder.content;
        this.regionId = builder.regionId;
        this.tableGuid = builder.tableGuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMetaTableIntroWikiRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
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

    public static final class Builder extends Request.Builder<UpdateMetaTableIntroWikiRequest, Builder> {
        private String content; 
        private String regionId; 
        private String tableGuid; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMetaTableIntroWikiRequest request) {
            super(request);
            this.content = request.content;
            this.regionId = request.regionId;
            this.tableGuid = request.tableGuid;
        } 

        /**
         * Content.
         */
        public Builder content(String content) {
            this.putBodyParameter("Content", content);
            this.content = content;
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

        /**
         * TableGuid.
         */
        public Builder tableGuid(String tableGuid) {
            this.putQueryParameter("TableGuid", tableGuid);
            this.tableGuid = tableGuid;
            return this;
        }

        @Override
        public UpdateMetaTableIntroWikiRequest build() {
            return new UpdateMetaTableIntroWikiRequest(this);
        } 

    } 

}
