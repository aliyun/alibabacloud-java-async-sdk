// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiplugin20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAlgorithmRequest} extends {@link RequestModel}
 *
 * <p>GetAlgorithmRequest</p>
 */
public class GetAlgorithmRequest extends Request {
    @Path
    @NameInMap("Id")
    private String id;

    private GetAlgorithmRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAlgorithmRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<GetAlgorithmRequest, Builder> {
        private String id; 

        private Builder() {
            super();
        } 

        private Builder(GetAlgorithmRequest request) {
            super(request);
            this.id = request.id;
        } 

        /**
         * 模板Id，可通过ListAlgorithms查询当前可用算法，使用获取的算法Id。
         */
        public Builder id(String id) {
            this.putPathParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public GetAlgorithmRequest build() {
            return new GetAlgorithmRequest(this);
        } 

    } 

}
