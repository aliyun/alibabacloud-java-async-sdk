// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiplugin20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteInferenceJobRequest} extends {@link RequestModel}
 *
 * <p>DeleteInferenceJobRequest</p>
 */
public class DeleteInferenceJobRequest extends Request {
    @Path
    @NameInMap("Id")
    private String id;

    private DeleteInferenceJobRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteInferenceJobRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteInferenceJobRequest, Builder> {
        private String id; 

        private Builder() {
            super();
        } 

        private Builder(DeleteInferenceJobRequest request) {
            super(request);
            this.id = request.id;
        } 

        /**
         * 预测任务Id，可通过ListInferenceJobs查询账号下的预测任务列表，获取预测任务Id。
         */
        public Builder id(String id) {
            this.putPathParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public DeleteInferenceJobRequest build() {
            return new DeleteInferenceJobRequest(this);
        } 

    } 

}
