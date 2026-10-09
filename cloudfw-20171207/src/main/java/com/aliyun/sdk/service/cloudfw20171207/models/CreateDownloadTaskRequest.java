// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
    @com.aliyun.core.annotation.NameInMap("TaskType")
    private String taskType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeZone")
    private String timeZone;

    private CreateDownloadTaskRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.taskData = builder.taskData;
        this.taskType = builder.taskType;
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
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
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
        private String taskType; 
        private String timeZone; 

        private Builder() {
            super();
        } 

        private Builder(CreateDownloadTaskRequest request) {
            super(request);
            this.lang = request.lang;
            this.taskData = request.taskData;
            this.taskType = request.taskType;
            this.timeZone = request.timeZone;
        } 

        /**
         * <p>The language of the received messages.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: (default) Chinese.</li>
         * <li><strong>en</strong>: English.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The request query conditions for the download task. This parameter is required. If this parameter is not specified, the API returns error code -340408 (download task TaskData invalid).</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;SearchItem\&quot;:\&quot;\&quot;,\&quot;UserType\&quot;:\&quot;buy\&quot;,\&quot;IpVersion\&quot;:\&quot;4\&quot;}</p>
         */
        public Builder taskData(String taskData) {
            this.putQueryParameter("TaskData", taskData);
            this.taskData = taskData;
            return this;
        }

        /**
         * <p>The task type. For valid values, call the operation that queries file download task types.</p>
         * 
         * <strong>example:</strong>
         * <p>InternetFirewallAsset</p>
         */
        public Builder taskType(String taskType) {
            this.putQueryParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        /**
         * <p>The time zone for time information in the downloaded file. Specify the value in IANA time zone identity format. Default value: Asia/Shanghai (UTC+8).</p>
         * 
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
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
