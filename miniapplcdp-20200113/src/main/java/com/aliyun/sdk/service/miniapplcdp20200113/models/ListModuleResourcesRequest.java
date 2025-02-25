// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.miniapplcdp20200113.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListModuleResourcesRequest} extends {@link RequestModel}
 *
 * <p>ListModuleResourcesRequest</p>
 */
public class ListModuleResourcesRequest extends Request {
    @Query
    @NameInMap("ModuleList")
    @Validation(required = true)
    private String moduleList;

    @Query
    @NameInMap("Source")
    private String source;

    @Query
    @NameInMap("Types")
    @Validation(required = true)
    private String types;

    @Query
    @NameInMap("WithContent")
    private Boolean withContent;

    private ListModuleResourcesRequest(Builder builder) {
        super(builder);
        this.moduleList = builder.moduleList;
        this.source = builder.source;
        this.types = builder.types;
        this.withContent = builder.withContent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListModuleResourcesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return moduleList
     */
    public String getModuleList() {
        return this.moduleList;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return types
     */
    public String getTypes() {
        return this.types;
    }

    /**
     * @return withContent
     */
    public Boolean getWithContent() {
        return this.withContent;
    }

    public static final class Builder extends Request.Builder<ListModuleResourcesRequest, Builder> {
        private String moduleList; 
        private String source; 
        private String types; 
        private Boolean withContent; 

        private Builder() {
            super();
        } 

        private Builder(ListModuleResourcesRequest request) {
            super(request);
            this.moduleList = request.moduleList;
            this.source = request.source;
            this.types = request.types;
            this.withContent = request.withContent;
        } 

        /**
         * ModuleList.
         */
        public Builder moduleList(String moduleList) {
            this.putQueryParameter("ModuleList", moduleList);
            this.moduleList = moduleList;
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

        /**
         * Types.
         */
        public Builder types(String types) {
            this.putQueryParameter("Types", types);
            this.types = types;
            return this;
        }

        /**
         * WithContent.
         */
        public Builder withContent(Boolean withContent) {
            this.putQueryParameter("WithContent", withContent);
            this.withContent = withContent;
            return this;
        }

        @Override
        public ListModuleResourcesRequest build() {
            return new ListModuleResourcesRequest(this);
        } 

    } 

}
