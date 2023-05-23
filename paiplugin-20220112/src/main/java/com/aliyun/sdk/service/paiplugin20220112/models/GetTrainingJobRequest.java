// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiplugin20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTrainingJobRequest} extends {@link RequestModel}
 *
 * <p>GetTrainingJobRequest</p>
 */
public class GetTrainingJobRequest extends Request {
    @Path
    @NameInMap("Id")
    private String id;

    private GetTrainingJobRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTrainingJobRequest create() {
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

    public static final class Builder extends Request.Builder<GetTrainingJobRequest, Builder> {
        private String id; 

        private Builder() {
            super();
        } 

        private Builder(GetTrainingJobRequest request) {
            super(request);
            this.id = request.id;
        } 

        /**
         * 训练任务ID，可通过ListTrainingJobs查询账号下的训练任务列表，获取训练任务ID。
         */
        public Builder id(String id) {
            this.putPathParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public GetTrainingJobRequest build() {
            return new GetTrainingJobRequest(this);
        } 

    } 

}
