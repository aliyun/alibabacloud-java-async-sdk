// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link GetOtaTaskByTaskIdResponseBody} extends {@link TeaModel}
 *
 * <p>GetOtaTaskByTaskIdResponseBody</p>
 */
public class GetOtaTaskByTaskIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("OtaVersion")
    private String otaVersion;

    @com.aliyun.core.annotation.NameInMap("ReleaseNote")
    private String releaseNote;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskStartTime")
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
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * OtaVersion.
         */
        public Builder otaVersion(String otaVersion) {
            this.otaVersion = otaVersion;
            return this;
        }

        /**
         * ReleaseNote.
         */
        public Builder releaseNote(String releaseNote) {
            this.releaseNote = releaseNote;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-04T14:36:00+08:00</p>
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
