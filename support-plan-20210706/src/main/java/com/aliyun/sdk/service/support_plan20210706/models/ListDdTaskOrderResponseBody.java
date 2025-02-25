// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.support_plan20210706.models;

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
 * {@link ListDdTaskOrderResponseBody} extends {@link TeaModel}
 *
 * <p>ListDdTaskOrderResponseBody</p>
 */
public class ListDdTaskOrderResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private String data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListDdTaskOrderResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDdTaskOrderResponseBody create() {
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

    public static final class Builder {
        private String code; 
        private String data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>code</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>data</p>
         * 
         * <strong>example:</strong>
         * <p>{   &quot;msg&quot;: &quot;请求成功&quot;,   &quot;code&quot;: &quot;200&quot;,   &quot;data&quot;: [     {       &quot;wfNodeId&quot;: &quot;dealingNode&quot;,//任务单状态       &quot;createEmpId&quot;: null,//创建人工号，可以忽略       &quot;createTime&quot;: 1637571435000,//任务单创建时间       &quot;orderId&quot;: &quot;E2111221H1UKCZ&quot;,//任务单号       &quot;isImportant&quot;: &quot;normal&quot;,//是否紧急       &quot;closeTime&quot;: null,//任务单关单时间       &quot;taskTitle&quot;: &quot;测试单16点44&quot;,//标题       &quot;productType&quot;: &quot;3270&quot;//问题分类     },     {       &quot;wfNodeId&quot;: &quot;dealingNode&quot;,       &quot;createEmpId&quot;: null,       &quot;createTime&quot;: 1637820497000,       &quot;orderId&quot;: &quot;E211125CG111EM&quot;,       &quot;isImportant&quot;: &quot;normal&quot;,       &quot;closeTime&quot;: null,       &quot;taskTitle&quot;: &quot;测试单14&quot;,       &quot;class&quot;: &quot;com.aliyun.dingtalklanding.dto.OpenTaskOrderDTO&quot;,       &quot;productType&quot;: &quot;3270&quot;     }   ],   &quot;success&quot;: true,   &quot;requestId&quot;: &quot;123&quot;,   &quot;class&quot;: &quot;com.aliyun.dingtalklanding.pop.dto.PopResultDTO&quot; }</p>
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * <p>msg</p>
         * 
         * <strong>example:</strong>
         * <p>请求成功</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>requestId</p>
         * 
         * <strong>example:</strong>
         * <p>2F8557E4-742B-1CF7-8E83-28CD0C1F7B48</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>success</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListDdTaskOrderResponseBody build() {
            return new ListDdTaskOrderResponseBody(this);
        } 

    } 

}
