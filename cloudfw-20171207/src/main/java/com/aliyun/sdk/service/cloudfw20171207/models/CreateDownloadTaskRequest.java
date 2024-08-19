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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeZone")
    private String timeZone;

    private CreateDownloadTaskRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.taskData = builder.taskData;
        this.timeZone = builder.timeZone;
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

    /**
     * @return timeZone
     */
    public String getTimeZone() {
        return this.timeZone;
    }

    public static final class Builder extends Request.Builder<CreateDownloadTaskRequest, Builder> {
        private String lang; 
        private String taskData; 
        private String timeZone; 

        private Builder() {
            super();
        } 

        private Builder(CreateDownloadTaskRequest request) {
            super(request);
            this.lang = request.lang;
            this.taskData = request.taskData;
            this.timeZone = request.timeZone;
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

        /**
         * The time zone of the time information in the downloaded file. The value must be an identifier of a time zone in the Internet Assigned Numbers Authority (IANA) database. The default value is Asia/Shanghai, which indicates UTC+8.
         */
        public Builder timeZone(String timeZone) {
            this.putQueryParameter("TimeZone", timeZone);
            this.timeZone = timeZone;
            return this;
        }

        @Override
        public CreateDownloadTaskRequest build() {
            return new CreateDownloadTaskRequest(this);
        } 

    } 

}
