// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link HangupOperateResponseBody} extends {@link TeaModel}
 *
 * <p>HangupOperateResponseBody</p>
 */
public class HangupOperateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Mesage")
    private String mesage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Boolean result;

    private HangupOperateResponseBody(Builder builder) {
        this.code = builder.code;
        this.mesage = builder.mesage;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HangupOperateResponseBody create() {
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
     * @return mesage
     */
    public String getMesage() {
        return this.mesage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Boolean getResult() {
        return this.result;
    }

    public static final class Builder {
        private String code; 
        private String mesage; 
        private String requestId; 
        private Boolean result; 

        private Builder() {
        } 

        private Builder(HangupOperateResponseBody model) {
            this.code = model.code;
            this.mesage = model.mesage;
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The status code. A value of \&quot;OK\&quot; indicates that the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The status message.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder mesage(String mesage) {
            this.mesage = mesage;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EFD543DD-E087-54A2-AC0B-54E0656511D7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The result of the operation. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: The hang-up was successful.</p>
         * </li>
         * <li><p><strong>false</strong>: The hang-up operation failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder result(Boolean result) {
            this.result = result;
            return this;
        }

        public HangupOperateResponseBody build() {
            return new HangupOperateResponseBody(this);
        } 

    } 

}
