// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListImageAnalysisRuleProjectRequest} extends {@link RequestModel}
 *
 * <p>ListImageAnalysisRuleProjectRequest</p>
 */
public class ListImageAnalysisRuleProjectRequest extends Request {
    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Body
    @NameInMap("TaskId")
    private String taskId;

    @Body
    @NameInMap("Token")
    private String token;

    private ListImageAnalysisRuleProjectRequest(Builder builder) {
        super(builder);
        this.sourceIp = builder.sourceIp;
        this.taskId = builder.taskId;
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListImageAnalysisRuleProjectRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    public static final class Builder extends Request.Builder<ListImageAnalysisRuleProjectRequest, Builder> {
        private String sourceIp; 
        private String taskId; 
        private String token; 

        private Builder() {
            super();
        } 

        private Builder(ListImageAnalysisRuleProjectRequest response) {
            super(response);
            this.sourceIp = response.sourceIp;
            this.taskId = response.taskId;
            this.token = response.token;
        } 

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * 任务 id
         */
        public Builder taskId(String taskId) {
            this.putBodyParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * token
         */
        public Builder token(String token) {
            this.putBodyParameter("Token", token);
            this.token = token;
            return this;
        }

        @Override
        public ListImageAnalysisRuleProjectRequest build() {
            return new ListImageAnalysisRuleProjectRequest(this);
        } 

    } 

}
