// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.miniapplcdp20200113.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListModuleDependenciesRequest} extends {@link RequestModel}
 *
 * <p>ListModuleDependenciesRequest</p>
 */
public class ListModuleDependenciesRequest extends Request {
    @Query
    @NameInMap("ModuleId")
    @Validation(required = true)
    private String moduleId;

    @Query
    @NameInMap("Recursive")
    private Boolean recursive;

    @Query
    @NameInMap("Source")
    private String source;

    private ListModuleDependenciesRequest(Builder builder) {
        super(builder);
        this.moduleId = builder.moduleId;
        this.recursive = builder.recursive;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListModuleDependenciesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return moduleId
     */
    public String getModuleId() {
        return this.moduleId;
    }

    /**
     * @return recursive
     */
    public Boolean getRecursive() {
        return this.recursive;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    public static final class Builder extends Request.Builder<ListModuleDependenciesRequest, Builder> {
        private String moduleId; 
        private Boolean recursive; 
        private String source; 

        private Builder() {
            super();
        } 

        private Builder(ListModuleDependenciesRequest request) {
            super(request);
            this.moduleId = request.moduleId;
            this.recursive = request.recursive;
            this.source = request.source;
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
         * Recursive.
         */
        public Builder recursive(Boolean recursive) {
            this.putQueryParameter("Recursive", recursive);
            this.recursive = recursive;
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
        public ListModuleDependenciesRequest build() {
            return new ListModuleDependenciesRequest(this);
        } 

    } 

}
