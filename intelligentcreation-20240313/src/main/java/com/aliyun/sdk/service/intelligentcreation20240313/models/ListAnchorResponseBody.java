// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link ListAnchorResponseBody} extends {@link TeaModel}
 *
 * <p>ListAnchorResponseBody</p>
 */
public class ListAnchorResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("list")
    private java.util.List<AnchorResponse> list;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("total")
    private Integer total;

    private ListAnchorResponseBody(Builder builder) {
        this.code = builder.code;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.list = builder.list;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAnchorResponseBody create() {
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
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return list
     */
    public java.util.List<AnchorResponse> getList() {
        return this.list;
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

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private String errorCode; 
        private String errorMessage; 
        private java.util.List<AnchorResponse> list; 
        private String requestId; 
        private Boolean success; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(ListAnchorResponseBody model) {
            this.code = model.code;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.list = model.list;
            this.requestId = model.requestId;
            this.success = model.success;
            this.total = model.total;
        } 

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
         * errorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * errorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * list.
         */
        public Builder list(java.util.List<AnchorResponse> list) {
            this.list = list;
            return this;
        }

        /**
         * <p>requestId</p>
         * 
         * <strong>example:</strong>
         * <p>5389BE87-571B-573C-90ED-F07C5E68760B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListAnchorResponseBody build() {
            return new ListAnchorResponseBody(this);
        } 

    } 

}
