// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVideoComposeResultRequest} extends {@link RequestModel}
 *
 * <p>GetVideoComposeResultRequest</p>
 */
public class GetVideoComposeResultRequest extends Request {
    @Body
    @NameInMap("CorpId")
    @Validation(required = true)
    private String corpId;

    @Body
    @NameInMap("TaskRequestId")
    @Validation(required = true)
    private String taskRequestId;

    private GetVideoComposeResultRequest(Builder builder) {
        super(builder);
        this.corpId = builder.corpId;
        this.taskRequestId = builder.taskRequestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVideoComposeResultRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return corpId
     */
    public String getCorpId() {
        return this.corpId;
    }

    /**
     * @return taskRequestId
     */
    public String getTaskRequestId() {
        return this.taskRequestId;
    }

    public static final class Builder extends Request.Builder<GetVideoComposeResultRequest, Builder> {
        private String corpId; 
        private String taskRequestId; 

        private Builder() {
            super();
        } 

        private Builder(GetVideoComposeResultRequest response) {
            super(response);
            this.corpId = response.corpId;
            this.taskRequestId = response.taskRequestId;
        } 

        /**
         * CorpId.
         */
        public Builder corpId(String corpId) {
            this.putBodyParameter("CorpId", corpId);
            this.corpId = corpId;
            return this;
        }

        /**
         * TaskRequestId.
         */
        public Builder taskRequestId(String taskRequestId) {
            this.putBodyParameter("TaskRequestId", taskRequestId);
            this.taskRequestId = taskRequestId;
            return this;
        }

        @Override
        public GetVideoComposeResultRequest build() {
            return new GetVideoComposeResultRequest(this);
        } 

    } 

}
