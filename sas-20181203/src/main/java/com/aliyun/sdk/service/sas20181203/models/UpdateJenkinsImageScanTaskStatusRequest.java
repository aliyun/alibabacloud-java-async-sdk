// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateJenkinsImageScanTaskStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateJenkinsImageScanTaskStatusRequest</p>
 */
public class UpdateJenkinsImageScanTaskStatusRequest extends Request {
    @Body
    @NameInMap("Result")
    private String result;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Body
    @NameInMap("Status")
    private String status;

    @Body
    @NameInMap("TaskId")
    private String taskId;

    @Body
    @NameInMap("Token")
    private String token;

    private UpdateJenkinsImageScanTaskStatusRequest(Builder builder) {
        super(builder);
        this.result = builder.result;
        this.sourceIp = builder.sourceIp;
        this.status = builder.status;
        this.taskId = builder.taskId;
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateJenkinsImageScanTaskStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return result
     */
    public String getResult() {
        return this.result;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
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

    public static final class Builder extends Request.Builder<UpdateJenkinsImageScanTaskStatusRequest, Builder> {
        private String result; 
        private String sourceIp; 
        private String status; 
        private String taskId; 
        private String token; 

        private Builder() {
            super();
        } 

        private Builder(UpdateJenkinsImageScanTaskStatusRequest response) {
            super(response);
            this.result = response.result;
            this.sourceIp = response.sourceIp;
            this.status = response.status;
            this.taskId = response.taskId;
            this.token = response.token;
        } 

        /**
         * 任务执行结果，一般用于存储扫描失败的报错信息
         */
        public Builder result(String result) {
            this.putBodyParameter("Result", result);
            this.result = result;
            return this;
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
         * 处理阶段
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
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
         * jenkins 镜像仓库 token，必填
         */
        public Builder token(String token) {
            this.putBodyParameter("Token", token);
            this.token = token;
            return this;
        }

        @Override
        public UpdateJenkinsImageScanTaskStatusRequest build() {
            return new UpdateJenkinsImageScanTaskStatusRequest(this);
        } 

    } 

}
