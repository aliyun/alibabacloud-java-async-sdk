// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyMetricRuleBlackListResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyMetricRuleBlackListResponseBody</p>
 */
public class ModifyMetricRuleBlackListResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Count")
    private String count;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ModifyMetricRuleBlackListResponseBody(Builder builder) {
        this.code = builder.code;
        this.count = builder.count;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyMetricRuleBlackListResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return count
     */
    public String getCount() {
        return this.count;
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
        private String count; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The ID of the request.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Count.
         */
        public Builder count(String count) {
            this.count = count;
            return this;
        }

        /**
         * The number of blacklist policies that are modified.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * For more information about common request parameters, see [Common parameters](~~199331~~).
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ModifyMetricRuleBlackListResponseBody build() {
            return new ModifyMetricRuleBlackListResponseBody(this);
        } 

    } 

}
