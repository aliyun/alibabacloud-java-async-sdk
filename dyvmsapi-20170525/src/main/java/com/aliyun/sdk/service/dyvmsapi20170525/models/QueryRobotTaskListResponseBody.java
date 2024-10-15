// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryRobotTaskListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryRobotTaskListResponseBody</p>
 */
public class QueryRobotTaskListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private String data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNo")
    private String pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private QueryRobotTaskListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryRobotTaskListResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageNo
     */
    public String getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private String data; 
        private String message; 
        private String pageNo; 
        private String pageSize; 
        private String requestId; 
        private String totalCount; 

        /**
         * <p>The response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The robocall tasks, in the JSON format.</p>
         * <ul>
         * <li><strong>id</strong>: the unique ID of the robocall task.</li>
         * <li><strong>taskName</strong>: the task name.</li>
         * <li><strong>robotId</strong>: the robot ID.</li>
         * <li><strong>robotName</strong>: the robot name.</li>
         * <li><strong>status</strong>: the task state.</li>
         * <li><strong>scheduleType</strong>: the scheduling type. Valid values: <strong>SINGLE</strong> and <strong>ORDER</strong>. The value SINGLE indicates that the task was started immediately after it was created. The value ORDER indicates that the task was started at a scheduled time.</li>
         * <li><strong>createTime</strong>: the time when the task was created, in the yyyy.MM.dd HH:mm:ss format.</li>
         * <li><strong>completeTime</strong>: the time when the task was completed, in the yyyy.MM.dd HH:mm:ss format.</li>
         * <li><strong>fireTime</strong>: the time when the task was started, in the yyyy.MM.dd HH:mm:ss format.</li>
         * <li><strong>totalCount</strong>: the total number of calls processed.</li>
         * <li><strong>finishCount</strong>: the number of calls completed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[ {&quot;id&quot;: 1045001, &quot;taskName&quot;: &quot;Test Template&quot;, &quot;robotId&quot;: 1000000075003, &quot;robotName&quot;: &quot;robot&quot;, &quot;status&quot;: &quot;INIT&quot;,&quot;scheduleType&quot;: &quot;SINGLE&quot;, &quot;createTime&quot;: &quot;2019.06.14 14:55:23&quot;, &quot;completeTime&quot;: &quot;2019.06.14 14:55:23&quot;, &quot;fireTime&quot;: &quot;2019.06.14 14:55:23&quot;, &quot;totalCount&quot;: 1000, &quot;finishCount&quot;: 998} ]</p>
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(String pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D9CB3933-9FE3-4870-BA8E-2BEE91B69D23</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public QueryRobotTaskListResponseBody build() {
            return new QueryRobotTaskListResponseBody(this);
        } 

    } 

}
