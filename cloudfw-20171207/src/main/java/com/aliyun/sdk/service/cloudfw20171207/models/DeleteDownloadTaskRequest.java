// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDownloadTaskRequest} extends {@link RequestModel}
 *
 * <p>DeleteDownloadTaskRequest</p>
 */
public class DeleteDownloadTaskRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("TaskId")
    private String taskId;

    private DeleteDownloadTaskRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDownloadTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<DeleteDownloadTaskRequest, Builder> {
        private String lang; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDownloadTaskRequest request) {
            super(request);
            this.lang = request.lang;
            this.taskId = request.taskId;
        } 

        /**
         * The language of the content within the request and response. Valid values:
         * <p>
         * 
         * *   **zh** (default): Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The ID of the file download task.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public DeleteDownloadTaskRequest build() {
            return new DeleteDownloadTaskRequest(this);
        } 

    } 

}
