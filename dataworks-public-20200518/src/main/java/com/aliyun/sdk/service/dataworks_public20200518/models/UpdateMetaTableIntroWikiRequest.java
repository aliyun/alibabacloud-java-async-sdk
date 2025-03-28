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
 * {@link UpdateMetaTableIntroWikiRequest} extends {@link RequestModel}
 *
 * <p>UpdateMetaTableIntroWikiRequest</p>
 */
public class UpdateMetaTableIntroWikiRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Content")
    @com.aliyun.core.annotation.Validation(required = true)
    private String content;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableGuid")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The details of the instructions on how to use the metatable.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        public Builder content(String content) {
            this.putBodyParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * <p>The GUID of the table. Specify the GUID in the odps.{projectName}.{tableName} format.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>odps.test.table1</p>
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
