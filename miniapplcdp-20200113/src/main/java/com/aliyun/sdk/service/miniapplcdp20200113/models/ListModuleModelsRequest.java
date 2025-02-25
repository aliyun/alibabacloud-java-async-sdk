// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.miniapplcdp20200113.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListModuleModelsRequest} extends {@link RequestModel}
 *
 * <p>ListModuleModelsRequest</p>
 */
public class ListModuleModelsRequest extends Request {
    @Query
    @NameInMap("ModuleList")
    @Validation(required = true)
    private String moduleList;

    @Query
    @NameInMap("Source")
    private String source;

    @Query
    @NameInMap("SubTypes")
    @Validation(required = true)
    private String subTypes;

    @Query
    @NameInMap("WithContent")
    private Boolean withContent;

    private ListModuleModelsRequest(Builder builder) {
        super(builder);
        this.moduleList = builder.moduleList;
        this.source = builder.source;
        this.subTypes = builder.subTypes;
        this.withContent = builder.withContent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListModuleModelsRequest create() {
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
     * @return subTypes
     */
    public String getSubTypes() {
        return this.subTypes;
    }

    /**
     * @return withContent
     */
    public Boolean getWithContent() {
        return this.withContent;
    }

    public static final class Builder extends Request.Builder<ListModuleModelsRequest, Builder> {
        private String moduleList; 
        private String source; 
        private String subTypes; 
        private Boolean withContent; 

        private Builder() {
            super();
        } 

        private Builder(ListModuleModelsRequest request) {
            super(request);
            this.moduleList = request.moduleList;
            this.source = request.source;
            this.subTypes = request.subTypes;
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
         * SubTypes.
         */
        public Builder subTypes(String subTypes) {
            this.putQueryParameter("SubTypes", subTypes);
            this.subTypes = subTypes;
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
        public ListModuleModelsRequest build() {
            return new ListModuleModelsRequest(this);
        } 

    } 

}
