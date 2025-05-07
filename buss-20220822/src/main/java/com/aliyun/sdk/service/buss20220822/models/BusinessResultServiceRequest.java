// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.buss20220822.models;

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
 * {@link BusinessResultServiceRequest} extends {@link RequestModel}
 *
 * <p>BusinessResultServiceRequest</p>
 */
public class BusinessResultServiceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActionCode")
    private String actionCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BussinessCode")
    private String bussinessCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ErrCode")
    private String errCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.Map<String, ?> result;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private BusinessResultServiceRequest(Builder builder) {
        super(builder);
        this.actionCode = builder.actionCode;
        this.bussinessCode = builder.bussinessCode;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BusinessResultServiceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actionCode
     */
    public String getActionCode() {
        return this.actionCode;
    }

    /**
     * @return bussinessCode
     */
    public String getBussinessCode() {
        return this.bussinessCode;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
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
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder extends Request.Builder<BusinessResultServiceRequest, Builder> {
        private String actionCode; 
        private String bussinessCode; 
        private String errCode; 
        private String errMessage; 
        private String requestId; 
        private java.util.Map<String, ?> result; 
        private Boolean success; 

        private Builder() {
            super();
        } 

        private Builder(BusinessResultServiceRequest request) {
            super(request);
            this.actionCode = request.actionCode;
            this.bussinessCode = request.bussinessCode;
            this.errCode = request.errCode;
            this.errMessage = request.errMessage;
            this.requestId = request.requestId;
            this.result = request.result;
            this.success = request.success;
        } 

        /**
         * ActionCode.
         */
        public Builder actionCode(String actionCode) {
            this.putQueryParameter("ActionCode", actionCode);
            this.actionCode = actionCode;
            return this;
        }

        /**
         * BussinessCode.
         */
        public Builder bussinessCode(String bussinessCode) {
            this.putQueryParameter("BussinessCode", bussinessCode);
            this.bussinessCode = bussinessCode;
            return this;
        }

        /**
         * ErrCode.
         */
        public Builder errCode(String errCode) {
            this.putQueryParameter("ErrCode", errCode);
            this.errCode = errCode;
            return this;
        }

        /**
         * ErrMessage.
         */
        public Builder errMessage(String errMessage) {
            this.putQueryParameter("ErrMessage", errMessage);
            this.errMessage = errMessage;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.putQueryParameter("RequestId", requestId);
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(java.util.Map<String, ?> result) {
            String resultShrink = shrink(result, "Result", "json");
            this.putQueryParameter("Result", resultShrink);
            this.result = result;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.putQueryParameter("Success", success);
            this.success = success;
            return this;
        }

        @Override
        public BusinessResultServiceRequest build() {
            return new BusinessResultServiceRequest(this);
        } 

    } 

}
