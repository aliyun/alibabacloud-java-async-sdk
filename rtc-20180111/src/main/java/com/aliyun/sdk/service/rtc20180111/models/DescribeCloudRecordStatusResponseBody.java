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
 * {@link DescribeCloudRecordStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCloudRecordStatusResponseBody</p>
 */
public class DescribeCloudRecordStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    private DescribeCloudRecordStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudRecordStatusResponseBody create() {
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

        private Builder(DescribeCloudRecordStatusResponseBody model) {
            this.requestId = model.requestId;
            this.status = model.status;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CF8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <ul>
         * <li>0: The task has started and is waiting for users to join.</li>
         * <li>100: The task has not started.</li>
         * <li>101: Recording is in progress.</li>
         * <li>102: The recording file is being uploaded.</li>
         * <li>200: Recording is completed (channel ended).</li>
         * <li>201: Recording is completed (stopped by user).</li>
         * <li>400: Recording failed (internal server error).</li>
         * <li>401: Recording failed (failed to write to user storage).</li>
         * <li>402: Recording failed (failed to start user storage).</li>
         * <li>403: Recording failed (recording duration too short).</li>
         * <li>404: Recording failed (incorrect user storage key).</li>
         * <li>405: Recording failed (bucket does not exist).</li>
         * <li>406: Recording failed (access to user storage denied).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        public DescribeCloudRecordStatusResponseBody build() {
            return new DescribeCloudRecordStatusResponseBody(this);
        } 

    } 

}
