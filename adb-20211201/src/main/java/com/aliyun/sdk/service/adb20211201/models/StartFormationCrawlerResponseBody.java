// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link StartFormationCrawlerResponseBody} extends {@link TeaModel}
 *
 * <p>StartFormationCrawlerResponseBody</p>
 */
public class StartFormationCrawlerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private String data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private Long taskId;

    private StartFormationCrawlerResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartFormationCrawlerResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
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
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    public static final class Builder {
        private String data; 
        private String requestId; 
        private Boolean success; 
        private Long taskId; 

        private Builder() {
        } 

        private Builder(StartFormationCrawlerResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
            this.success = model.success;
            this.taskId = model.taskId;
        } 

        /**
         * <p>The returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>69</p>
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2FED790E-FB61-4721-8C1C-07C627FA5A19</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Successful.</li>
         * <li><strong>false</strong>: Failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1564657730</p>
         */
        public Builder taskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }

        public StartFormationCrawlerResponseBody build() {
            return new StartFormationCrawlerResponseBody(this);
        } 

    } 

}
