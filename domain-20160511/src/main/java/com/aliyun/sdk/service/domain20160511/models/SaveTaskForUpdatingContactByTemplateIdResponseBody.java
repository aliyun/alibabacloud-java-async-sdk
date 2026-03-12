// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20160511.models;

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
 * {@link SaveTaskForUpdatingContactByTemplateIdResponseBody} extends {@link TeaModel}
 *
 * <p>SaveTaskForUpdatingContactByTemplateIdResponseBody</p>
 */
public class SaveTaskForUpdatingContactByTemplateIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TaskNo")
    private String taskNo;

    private SaveTaskForUpdatingContactByTemplateIdResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.taskNo = builder.taskNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveTaskForUpdatingContactByTemplateIdResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return taskNo
     */
    public String getTaskNo() {
        return this.taskNo;
    }

    public static final class Builder {
        private String requestId; 
        private Boolean success; 
        private String taskNo; 

        private Builder() {
        } 

        private Builder(SaveTaskForUpdatingContactByTemplateIdResponseBody model) {
            this.requestId = model.requestId;
            this.success = model.success;
            this.taskNo = model.taskNo;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TaskNo.
         */
        public Builder taskNo(String taskNo) {
            this.taskNo = taskNo;
            return this;
        }

        public SaveTaskForUpdatingContactByTemplateIdResponseBody build() {
            return new SaveTaskForUpdatingContactByTemplateIdResponseBody(this);
        } 

    } 

}
