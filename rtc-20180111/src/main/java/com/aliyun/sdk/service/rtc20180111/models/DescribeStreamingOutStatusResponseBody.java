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
 * {@link DescribeStreamingOutStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeStreamingOutStatusResponseBody</p>
 */
public class DescribeStreamingOutStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    private DescribeStreamingOutStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeStreamingOutStatusResponseBody create() {
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

        private Builder(DescribeStreamingOutStatusResponseBody model) {
            this.requestId = model.requestId;
            this.status = model.status;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>231470C1-ACFB-4C9F-844F-4CFE1E3804C5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>For abnormal tasks, RTC proactively ends the tasks and notifies the user server through callbacks. For more information, see <a href="https://help.aliyun.com/document_detail/2709168.html?spm=a2c4g.11186623.help-menu-61399.d_2_0_0_0.49be1761tge4EX#6211464494udk">Callbacks</a>.</p>
         * <ul>
         * <li>0: The task is started and waiting for users to join.</li>
         * <li>1: Streaming in progress.</li>
         * <li>2: Streaming exception, live streaming stopped.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        public DescribeStreamingOutStatusResponseBody build() {
            return new DescribeStreamingOutStatusResponseBody(this);
        } 

    } 

}
