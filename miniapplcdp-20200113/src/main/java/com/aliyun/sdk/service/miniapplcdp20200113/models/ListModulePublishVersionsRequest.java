// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.miniapplcdp20200113.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListModulePublishVersionsRequest} extends {@link RequestModel}
 *
 * <p>ListModulePublishVersionsRequest</p>
 */
public class ListModulePublishVersionsRequest extends Request {
    @Query
    @NameInMap("CustomParentId")
    private String customParentId;

    @Query
    @NameInMap("ModuleId")
    @Validation(required = true)
    private String moduleId;

    @Query
    @NameInMap("ModuleVersion")
    private String moduleVersion;

    @Query
    @NameInMap("PageNumber")
    @Validation(maximum = 1000, minimum = 1)
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 1000, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("Source")
    private String source;

    private ListModulePublishVersionsRequest(Builder builder) {
        super(builder);
        this.customParentId = builder.customParentId;
        this.moduleId = builder.moduleId;
        this.moduleVersion = builder.moduleVersion;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListModulePublishVersionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customParentId
     */
    public String getCustomParentId() {
        return this.customParentId;
    }

    /**
     * @return moduleId
     */
    public String getModuleId() {
        return this.moduleId;
    }

    /**
     * @return moduleVersion
     */
    public String getModuleVersion() {
        return this.moduleVersion;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    public static final class Builder extends Request.Builder<ListModulePublishVersionsRequest, Builder> {
        private String customParentId; 
        private String moduleId; 
        private String moduleVersion; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String source; 

        private Builder() {
            super();
        } 

        private Builder(ListModulePublishVersionsRequest request) {
            super(request);
            this.customParentId = request.customParentId;
            this.moduleId = request.moduleId;
            this.moduleVersion = request.moduleVersion;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.source = request.source;
        } 

        /**
         * CustomParentId.
         */
        public Builder customParentId(String customParentId) {
            this.putQueryParameter("CustomParentId", customParentId);
            this.customParentId = customParentId;
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
         * ModuleVersion.
         */
        public Builder moduleVersion(String moduleVersion) {
            this.putQueryParameter("ModuleVersion", moduleVersion);
            this.moduleVersion = moduleVersion;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
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
        public ListModulePublishVersionsRequest build() {
            return new ListModulePublishVersionsRequest(this);
        } 

    } 

}
