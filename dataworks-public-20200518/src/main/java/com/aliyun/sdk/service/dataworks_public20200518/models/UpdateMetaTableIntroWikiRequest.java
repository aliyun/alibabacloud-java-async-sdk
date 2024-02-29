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
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Content")
    @Validation(required = true)
    private String content;

    @Query
    @NameInMap("TableGuid")
    @Validation(required = true)
    private String tableGuid;

    private UpdateMetaTableIntroWikiRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.content = builder.content;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return tableGuid
     */
    public String getTableGuid() {
        return this.tableGuid;
    }

    public static final class Builder extends Request.Builder<UpdateMetaTableIntroWikiRequest, Builder> {
        private String regionId; 
        private String content; 
        private String tableGuid; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMetaTableIntroWikiRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.content = request.content;
            this.tableGuid = request.tableGuid;
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
         * The details of the instructions on how to use the metatable.
         */
        public Builder content(String content) {
            this.putBodyParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * The GUID of the metatable. Specify the GUID in the format of odps.{projectName}.{tableName}.
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
