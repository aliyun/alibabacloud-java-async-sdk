// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChangeResourceGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ChangeResourceGroupResponseBody</p>
 */
public class ChangeResourceGroupResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    @NameInMap("NewResourceGroupId")
    private String newResourceGroupId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * The HTTP status code returned. The HTTP status code 200 indicates that the request is successful.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the new resource group. You can view the available resource groups in the Resource Management console.
         */
        public Builder newResourceGroupId(String newResourceGroupId) {
            this.newResourceGroupId = newResourceGroupId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request is successful.
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
