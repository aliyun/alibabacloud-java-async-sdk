// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.serverless20210924.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPipelineRequest} extends {@link RequestModel}
 *
 * <p>GetPipelineRequest</p>
 */
public class GetPipelineRequest extends Request {
    @Path
    @NameInMap("name")
    private String name;

    private GetPipelineRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPipelineRequest create() {
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

    public static final class Builder extends Request.Builder<GetPipelineRequest, Builder> {
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(GetPipelineRequest request) {
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
        public GetPipelineRequest build() {
            return new GetPipelineRequest(this);
        } 

    } 

}
