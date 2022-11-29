// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.serverless20210924.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTaskTemplateRequest} extends {@link RequestModel}
 *
 * <p>GetTaskTemplateRequest</p>
 */
public class GetTaskTemplateRequest extends Request {
    @Path
    @NameInMap("name")
    private String name;

    private GetTaskTemplateRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTaskTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<GetTaskTemplateRequest, Builder> {
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(GetTaskTemplateRequest request) {
            super(request);
            this.name = request.name;
        } 

        /**
         * 查询对象名称
         */
        public Builder name(String name) {
            this.putPathParameter("name", name);
            this.name = name;
            return this;
        }

        @Override
        public GetTaskTemplateRequest build() {
            return new GetTaskTemplateRequest(this);
        } 

    } 

}
