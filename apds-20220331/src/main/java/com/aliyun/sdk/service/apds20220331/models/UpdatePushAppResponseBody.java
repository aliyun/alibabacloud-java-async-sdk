// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apds20220331.models;

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
 * {@link UpdatePushAppResponseBody} extends {@link TeaModel}
 *
 * <p>UpdatePushAppResponseBody</p>
 */
public class UpdatePushAppResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IsDebugEnable")
    private Boolean isDebugEnable;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultObj")
    private Object resultObj;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TipMsg")
    private String tipMsg;

    private UpdatePushAppResponseBody(Builder builder) {
        this.isDebugEnable = builder.isDebugEnable;
        this.requestId = builder.requestId;
        this.resultObj = builder.resultObj;
        this.success = builder.success;
        this.tipMsg = builder.tipMsg;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePushAppResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return isDebugEnable
     */
    public Boolean getIsDebugEnable() {
        return this.isDebugEnable;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultObj
     */
    public Object getResultObj() {
        return this.resultObj;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return tipMsg
     */
    public String getTipMsg() {
        return this.tipMsg;
    }

    public static final class Builder {
        private Boolean isDebugEnable; 
        private String requestId; 
        private Object resultObj; 
        private Boolean success; 
        private String tipMsg; 

        private Builder() {
        } 

        private Builder(UpdatePushAppResponseBody model) {
            this.isDebugEnable = model.isDebugEnable;
            this.requestId = model.requestId;
            this.resultObj = model.resultObj;
            this.success = model.success;
            this.tipMsg = model.tipMsg;
        } 

        /**
         * IsDebugEnable.
         */
        public Builder isDebugEnable(Boolean isDebugEnable) {
            this.isDebugEnable = isDebugEnable;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResultObj.
         */
        public Builder resultObj(Object resultObj) {
            this.resultObj = resultObj;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TipMsg.
         */
        public Builder tipMsg(String tipMsg) {
            this.tipMsg = tipMsg;
            return this;
        }

        public UpdatePushAppResponseBody build() {
            return new UpdatePushAppResponseBody(this);
        } 

    } 

}
