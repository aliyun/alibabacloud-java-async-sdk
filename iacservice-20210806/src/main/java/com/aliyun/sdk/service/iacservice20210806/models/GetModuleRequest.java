// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetModuleRequest} extends {@link RequestModel}
 *
 * <p>GetModuleRequest</p>
 */
public class GetModuleRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("moduleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String moduleId;

    private GetModuleRequest(Builder builder) {
        super(builder);
        this.moduleId = builder.moduleId;
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

    public static final class Builder extends Request.Builder<GetModuleRequest, Builder> {
        private String moduleId; 

        private Builder() {
            super();
        } 

        private Builder(GetModuleRequest request) {
            super(request);
            this.moduleId = request.moduleId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mod-148e7853433574fffe9ca86154d77a</p>
         */
        public Builder moduleId(String moduleId) {
            this.putPathParameter("moduleId", moduleId);
            this.moduleId = moduleId;
            return this;
        }

        @Override
        public GetModuleRequest build() {
            return new GetModuleRequest(this);
        } 

    } 

}
