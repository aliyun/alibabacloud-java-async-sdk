// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link DescribeScaleOutMigrateTaskListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScaleOutMigrateTaskListResponseBody</p>
 */
public class DescribeScaleOutMigrateTaskListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Progress")
    private Integer progress;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeScaleOutMigrateTaskListResponseBody(Builder builder) {
        this.progress = builder.progress;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScaleOutMigrateTaskListResponseBody create() {
        return builder().build();
    }

    /**
     * @return progress
     */
    public Integer getProgress() {
        return this.progress;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer progress; 
        private String requestId; 

        /**
         * Progress.
         */
        public Builder progress(Integer progress) {
            this.progress = progress;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeScaleOutMigrateTaskListResponseBody build() {
            return new DescribeScaleOutMigrateTaskListResponseBody(this);
        } 

    } 

}
