// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

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
 * {@link ChangeResourceGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ChangeResourceGroupResponseBody</p>
 */
public class ChangeResourceGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("NewResourceGroupId")
    private String newResourceGroupId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Long success;

    private ChangeResourceGroupResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.newResourceGroupId = builder.newResourceGroupId;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChangeResourceGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return newResourceGroupId
     */
    public String getNewResourceGroupId() {
        return this.newResourceGroupId;
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
    public Long getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private String newResourceGroupId; 
        private String requestId; 
        private Long success; 

        /**
         * <p>The HTTP status code returned. The HTTP status code 200 indicates that the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>operation success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the new resource group. You can view the available resource groups in the Resource Management console.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-ac***********7q</p>
         */
        public Builder newResourceGroupId(String newResourceGroupId) {
            this.newResourceGroupId = newResourceGroupId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>C5CA600C-7D5A-45B5-B6DB-44FAC2C****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Long success) {
            this.success = success;
            return this;
        }

        public ChangeResourceGroupResponseBody build() {
            return new ChangeResourceGroupResponseBody(this);
        } 

    } 

}
