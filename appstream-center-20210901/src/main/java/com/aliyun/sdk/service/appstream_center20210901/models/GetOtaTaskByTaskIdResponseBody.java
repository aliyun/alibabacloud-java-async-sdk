// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOtaTaskByTaskIdResponseBody} extends {@link TeaModel}
 *
 * <p>GetOtaTaskByTaskIdResponseBody</p>
 */
public class GetOtaTaskByTaskIdResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("OtaVersion")
    private String otaVersion;

    @NameInMap("ReleaseNote")
    private String releaseNote;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TaskStartTime")
    private String taskStartTime;

    private GetOtaTaskByTaskIdResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.otaVersion = builder.otaVersion;
        this.releaseNote = builder.releaseNote;
        this.requestId = builder.requestId;
        this.taskStartTime = builder.taskStartTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOtaTaskByTaskIdResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return otaVersion
     */
    public String getOtaVersion() {
        return this.otaVersion;
    }

    /**
     * @return releaseNote
     */
    public String getReleaseNote() {
        return this.releaseNote;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskStartTime
     */
    public String getTaskStartTime() {
        return this.taskStartTime;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String otaVersion; 
        private String releaseNote; 
        private String requestId; 
        private String taskStartTime; 

        /**
         * 错误码
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * 提示
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * 版本号
         */
        public Builder otaVersion(String otaVersion) {
            this.otaVersion = otaVersion;
            return this;
        }

        /**
         * 版本说明
         */
        public Builder releaseNote(String releaseNote) {
            this.releaseNote = releaseNote;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 任务执行时间，ISO-8601格式
         */
        public Builder taskStartTime(String taskStartTime) {
            this.taskStartTime = taskStartTime;
            return this;
        }

        public GetOtaTaskByTaskIdResponseBody build() {
            return new GetOtaTaskByTaskIdResponseBody(this);
        } 

    } 

}
