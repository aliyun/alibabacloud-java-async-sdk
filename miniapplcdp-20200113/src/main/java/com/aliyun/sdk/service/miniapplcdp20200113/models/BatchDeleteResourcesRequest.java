// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.miniapplcdp20200113.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchDeleteResourcesRequest} extends {@link RequestModel}
 *
 * <p>BatchDeleteResourcesRequest</p>
 */
public class BatchDeleteResourcesRequest extends Request {
    @Query
    @NameInMap("AppId")
    private String appId;

    @Query
    @NameInMap("ModuleId")
    private String moduleId;

    @Query
    @NameInMap("ResourceIdList")
    @Validation(required = true)
    private String resourceIdList;

    @Query
    @NameInMap("Source")
    private String source;

    private BatchDeleteResourcesRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.moduleId = builder.moduleId;
        this.resourceIdList = builder.resourceIdList;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchDeleteResourcesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return moduleId
     */
    public String getModuleId() {
        return this.moduleId;
    }

    /**
     * @return resourceIdList
     */
    public String getResourceIdList() {
        return this.resourceIdList;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    public static final class Builder extends Request.Builder<BatchDeleteResourcesRequest, Builder> {
        private String appId; 
        private String moduleId; 
        private String resourceIdList; 
        private String source; 

        private Builder() {
            super();
        } 

        private Builder(BatchDeleteResourcesRequest request) {
            super(request);
            this.appId = request.appId;
            this.moduleId = request.moduleId;
            this.resourceIdList = request.resourceIdList;
            this.source = request.source;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * ModuleId.
         */
        public Builder moduleId(String moduleId) {
            this.putQueryParameter("ModuleId", moduleId);
            this.moduleId = moduleId;
            return this;
        }

        /**
         * ResourceIdList.
         */
        public Builder resourceIdList(String resourceIdList) {
            this.putQueryParameter("ResourceIdList", resourceIdList);
            this.resourceIdList = resourceIdList;
            return this;
        }

        /**
         * Source.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        @Override
        public BatchDeleteResourcesRequest build() {
            return new BatchDeleteResourcesRequest(this);
        } 

    } 

}
