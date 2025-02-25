// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteModuleRequest} extends {@link RequestModel}
 *
 * <p>DeleteModuleRequest</p>
 */
public class DeleteModuleRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("moduleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String moduleId;

    private DeleteModuleRequest(Builder builder) {
        super(builder);
        this.moduleId = builder.moduleId;
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

    public static final class Builder extends Request.Builder<DeleteModuleRequest, Builder> {
        private String moduleId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteModuleRequest request) {
            super(request);
            this.moduleId = request.moduleId;
        } 

        /**
         * moduleId.
         */
        public Builder moduleId(String moduleId) {
            this.putPathParameter("moduleId", moduleId);
            this.moduleId = moduleId;
            return this;
        }

        @Override
        public DeleteModuleRequest build() {
            return new DeleteModuleRequest(this);
        } 

    } 

}
