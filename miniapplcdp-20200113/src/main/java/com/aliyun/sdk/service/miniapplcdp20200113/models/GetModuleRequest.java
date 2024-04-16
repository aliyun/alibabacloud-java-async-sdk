// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.miniapplcdp20200113.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetModuleRequest} extends {@link RequestModel}
 *
 * <p>GetModuleRequest</p>
 */
public class GetModuleRequest extends Request {
    @Query
    @NameInMap("ModuleId")
    @Validation(required = true)
    private String moduleId;

    @Query
    @NameInMap("ModuleType")
    private String moduleType;

    @Query
    @NameInMap("Source")
    private String source;

    private GetModuleRequest(Builder builder) {
        super(builder);
        this.moduleId = builder.moduleId;
        this.moduleType = builder.moduleType;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetModuleRequest create() {
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
     * @return moduleType
     */
    public String getModuleType() {
        return this.moduleType;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    public static final class Builder extends Request.Builder<GetModuleRequest, Builder> {
        private String moduleId; 
        private String moduleType; 
        private String source; 

        private Builder() {
            super();
        } 

        private Builder(GetModuleRequest request) {
            super(request);
            this.moduleId = request.moduleId;
            this.moduleType = request.moduleType;
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
         * ModuleType.
         */
        public Builder moduleType(String moduleType) {
            this.putQueryParameter("ModuleType", moduleType);
            this.moduleType = moduleType;
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
        public GetModuleRequest build() {
            return new GetModuleRequest(this);
        } 

    } 

}
