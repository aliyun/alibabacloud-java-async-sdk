// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVideoSummaryTaskResultRequest} extends {@link RequestModel}
 *
 * <p>GetVideoSummaryTaskResultRequest</p>
 */
public class GetVideoSummaryTaskResultRequest extends Request {
    @Body
    @NameInMap("CorpId")
    @Validation(required = true)
    private String corpId;

    @Body
    @NameInMap("TaskId")
    @Validation(required = true)
    private String taskId;

    private GetVideoSummaryTaskResultRequest(Builder builder) {
        super(builder);
        this.corpId = builder.corpId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVideoSummaryTaskResultRequest create() {
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
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<GetVideoSummaryTaskResultRequest, Builder> {
        private String corpId; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(GetVideoSummaryTaskResultRequest response) {
            super(response);
            this.corpId = response.corpId;
            this.taskId = response.taskId;
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
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.putBodyParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public GetVideoSummaryTaskResultRequest build() {
            return new GetVideoSummaryTaskResultRequest(this);
        } 

    } 

}
