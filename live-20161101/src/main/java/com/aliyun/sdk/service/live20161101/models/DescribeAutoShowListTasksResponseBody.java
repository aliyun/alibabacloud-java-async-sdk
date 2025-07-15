// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link DescribeAutoShowListTasksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAutoShowListTasksResponseBody</p>
 */
public class DescribeAutoShowListTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AutoShowListTasks")
    private String autoShowListTasks;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeAutoShowListTasksResponseBody(Builder builder) {
        this.autoShowListTasks = builder.autoShowListTasks;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAutoShowListTasksResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoShowListTasks
     */
    public String getAutoShowListTasks() {
        return this.autoShowListTasks;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String autoShowListTasks; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeAutoShowListTasksResponseBody model) {
            this.autoShowListTasks = model.autoShowListTasks;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the scheduled tasks. The following fields are included:</p>
         * <ul>
         * <li>Status: the status of the scheduled task. Valid values: 0 and 1. A value of 0 indicates that the scheduled task is paused. A value of 1 indicates that the scheduled task is started.</li>
         * <li>LiveTemplate: the transcoding templates.</li>
         * <li>TranscodeConfig: the transcoding configuration for the source URL.</li>
         * <li>CasterId: the ID of the production studio.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Status&quot;:0,&quot;TranscodeConfig&quot;:{&quot;CasterTemplate&quot;:&quot;lp_hd&quot;, &quot;LiveTemplate&quot;:[&quot;lhd&quot;,&quot;lsd&quot;]}, &quot;CasterId&quot;:&quot;cce04ef3-2226-4865-8704-f84b8375****&quot;}</p>
         */
        public Builder autoShowListTasks(String autoShowListTasks) {
            this.autoShowListTasks = autoShowListTasks;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CD8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAutoShowListTasksResponseBody build() {
            return new DescribeAutoShowListTasksResponseBody(this);
        } 

    } 

}
