// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link RollbackApplicationResponseBody} extends {@link TeaModel}
 *
 * <p>RollbackApplicationResponseBody</p>
 */
public class RollbackApplicationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ChangeOrderId")
    private String changeOrderId;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private RollbackApplicationResponseBody(Builder builder) {
        this.changeOrderId = builder.changeOrderId;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RollbackApplicationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return changeOrderId
     */
    public String getChangeOrderId() {
        return this.changeOrderId;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String changeOrderId; 
        private Integer code; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(RollbackApplicationResponseBody model) {
            this.changeOrderId = model.changeOrderId;
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The change process ID. You can call the GetChangeOrderInfo operation to query the progress of this rollback. For more information, see <a href="https://help.aliyun.com/document_detail/423155.html">GetChangeOrderInfo</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>921026b8-d1be-************</p>
         */
        public Builder changeOrderId(String changeOrderId) {
            this.changeOrderId = changeOrderId;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
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
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D16979DC-4D42-*********</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RollbackApplicationResponseBody build() {
            return new RollbackApplicationResponseBody(this);
        } 

    } 

}
