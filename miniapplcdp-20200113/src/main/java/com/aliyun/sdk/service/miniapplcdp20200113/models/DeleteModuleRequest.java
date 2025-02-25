// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.miniapplcdp20200113.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteModuleRequest} extends {@link RequestModel}
 *
 * <p>DeleteModuleRequest</p>
 */
public class DeleteModuleRequest extends Request {
    @Query
    @NameInMap("ModuleId")
    @Validation(required = true)
    private String moduleId;

    @Query
    @NameInMap("Source")
    private String source;

    private DeleteModuleRequest(Builder builder) {
        super(builder);
        this.moduleId = builder.moduleId;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteModuleRequest create() {
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
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    public static final class Builder extends Request.Builder<DeleteModuleRequest, Builder> {
        private String moduleId; 
        private String source; 

        private Builder() {
            super();
        } 

        private Builder(DeleteModuleRequest request) {
            super(request);
            this.moduleId = request.moduleId;
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
         * Source.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        @Override
        public DeleteModuleRequest build() {
            return new DeleteModuleRequest(this);
        } 

    } 

}
