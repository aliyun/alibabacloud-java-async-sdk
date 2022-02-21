// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAsyncTaskStatusRequest} extends {@link RequestModel}
 *
 * <p>GetAsyncTaskStatusRequest</p>
 */
public class GetAsyncTaskStatusRequest extends Request {
    @Query
    @NameInMap("CatalogId")
    private String catalogId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("TaskId")
    private String taskId;

    private GetAsyncTaskStatusRequest(Builder builder) {
        super(builder);
        this.catalogId = builder.catalogId;
        this.regionId = builder.regionId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAsyncTaskStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return catalogId
     */
    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<GetAsyncTaskStatusRequest, Builder> {
        private String catalogId; 
        private String regionId; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(GetAsyncTaskStatusRequest response) {
            super(response);
            this.catalogId = response.catalogId;
            this.regionId = response.regionId;
            this.taskId = response.taskId;
        } 

        /**
         * CatalogId
         */
        public Builder catalogId(String catalogId) {
            this.putQueryParameter("CatalogId", catalogId);
            this.catalogId = catalogId;
            return this;
        }

        /**
         * RegionId
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * TaskId
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public GetAsyncTaskStatusRequest build() {
            return new GetAsyncTaskStatusRequest(this);
        } 

    } 

}
