// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDownloadTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateDownloadTaskRequest</p>
 */
public class CreateDownloadTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskData")
    private String taskData;

    private CreateDownloadTaskRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.taskData = builder.taskData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDownloadTaskRequest create() {
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
     * @return taskData
     */
    public String getTaskData() {
        return this.taskData;
    }

    public static final class Builder extends Request.Builder<CreateDownloadTaskRequest, Builder> {
        private String lang; 
        private String taskData; 

        private Builder() {
            super();
        } 

        private Builder(CreateDownloadTaskRequest request) {
            super(request);
            this.lang = request.lang;
            this.taskData = request.taskData;
        } 

        /**
         * The language of the content within the response.
         * <p>
         * 
         * Valid values:
         * 
         * *   **zh**: Chinese (default)
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The query condition of the download task.
         */
        public Builder taskData(String taskData) {
            this.putQueryParameter("TaskData", taskData);
            this.taskData = taskData;
            return this;
        }

        @Override
        public CreateDownloadTaskRequest build() {
            return new CreateDownloadTaskRequest(this);
        } 

    } 

}
