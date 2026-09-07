// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link UnbindSaseUserTagResponseBody} extends {@link TeaModel}
 *
 * <p>UnbindSaseUserTagResponseBody</p>
 */
public class UnbindSaseUserTagResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private UnbindSaseUserTagResponseBody(Builder builder) {
        this.code = builder.code;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnbindSaseUserTagResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
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
        private Integer code; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(UnbindSaseUserTagResponseBody model) {
            this.code = model.code;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The API status code or POP error code. Valid values:</p>
         * <ul>
         * <li><strong>2xx</strong>: Success.</li>
         * <li><strong>3xx</strong>: Redirection.</li>
         * <li><strong>4xx</strong>: Request error.</li>
         * <li><strong>5xx</strong>: Server error.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F4A9C844-1B0A-59E8-966F-4945DFF3C88D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the operation was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public UnbindSaseUserTagResponseBody build() {
            return new UnbindSaseUserTagResponseBody(this);
        } 

    } 

}
