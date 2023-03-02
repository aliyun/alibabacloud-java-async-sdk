// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryPublicModelEngineRequest} extends {@link RequestModel}
 *
 * <p>QueryPublicModelEngineRequest</p>
 */
public class QueryPublicModelEngineRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Body
    @NameInMap("Text")
    @Validation(required = true)
    private String text;

    private QueryPublicModelEngineRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.projectId = builder.projectId;
        this.text = builder.text;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryPublicModelEngineRequest create() {
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
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return text
     */
    public String getText() {
        return this.text;
    }

    public static final class Builder extends Request.Builder<QueryPublicModelEngineRequest, Builder> {
        private String regionId; 
        private String projectId; 
        private String text; 

        private Builder() {
            super();
        } 

        private Builder(QueryPublicModelEngineRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.projectId = request.projectId;
            this.text = request.text;
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
         * The ID of the DataWorks workspace. You can log on to the [DataWorks console](https://account.alibabacloud.com/login/login.htm) and go to the Workspace Management page to view the workspace ID.
         */
        public Builder projectId(String projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * The FML statement that is used to query information about the data modeling engine. For more information, see [Use FML statements to configure and manage data tables](~~298128#task-2091320~~ "After a data table is created, you can execute fast modeling language (FML) statements in the code editor of the table to configure fields and partitions for the table. This topic describes how to use FML statements to configure a data table.").
         * <p>
         * 
         * Only SHOW statements are supported.
         */
        public Builder text(String text) {
            this.putBodyParameter("Text", text);
            this.text = text;
            return this;
        }

        @Override
        public QueryPublicModelEngineRequest build() {
            return new QueryPublicModelEngineRequest(this);
        } 

    } 

}
