// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link ListCodeInterpretersResult} extends {@link TeaModel}
 *
 * <p>ListCodeInterpretersResult</p>
 */
public class ListCodeInterpretersResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private ListCodeInterpretersOutput data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListCodeInterpretersResult(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCodeInterpretersResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public ListCodeInterpretersOutput getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private ListCodeInterpretersOutput data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListCodeInterpretersResult model) {
            this.code = model.code;
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>SUCCESS 为成功，失败情况返回对应错误类型，比如 ERR_BAD_REQUEST ERR_VALIDATION_FAILED ERR_INTERNAL_SERVER_ERROR</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>代码解释器列表的详细信息</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder data(ListCodeInterpretersOutput data) {
            this.data = data;
            return this;
        }

        /**
         * <p>唯一的请求标识符，用于问题追踪</p>
         * 
         * <strong>example:</strong>
         * <p>F8A0F5F3-0C3E-4C82-9D4F-5E4B6A7C8D9E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListCodeInterpretersResult build() {
            return new ListCodeInterpretersResult(this);
        } 

    } 

}
