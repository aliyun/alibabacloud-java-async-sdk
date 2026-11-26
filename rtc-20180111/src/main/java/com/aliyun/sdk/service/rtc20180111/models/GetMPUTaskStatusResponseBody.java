// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

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
 * {@link GetMPUTaskStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetMPUTaskStatusResponseBody</p>
 */
public class GetMPUTaskStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    private GetMPUTaskStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMPUTaskStatusResponseBody create() {
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
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String requestId; 
        private Integer status; 

        private Builder() {
        } 

        private Builder(GetMPUTaskStatusResponseBody model) {
            this.requestId = model.requestId;
            this.status = model.status;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>760bad53276431c499e30dc36f6b26be</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status ID of the bypass transcoding task. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: Waiting for the channel to start.</p>
         * <blockquote>
         * <p>If the task is not started within 30 days, the task is automatically stopped.</p>
         * </blockquote>
         * </li>
         * <li><p><strong>1</strong>: The task is running.</p>
         * </li>
         * <li><p><strong>2</strong>: The task is stopped.</p>
         * </li>
         * <li><p><strong>3</strong>: The task is stopped by the user.</p>
         * </li>
         * <li><p><strong>4</strong>: The channel is stopped.</p>
         * </li>
         * <li><p><strong>5</strong>: Live streaming is stopped due to CDN network issues.</p>
         * </li>
         * <li><p><strong>6</strong>: Live streaming is stopped due to live streaming URL issues.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        public GetMPUTaskStatusResponseBody build() {
            return new GetMPUTaskStatusResponseBody(this);
        } 

    } 

}
