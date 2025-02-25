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
 * {@link MakeCallRequest} extends {@link RequestModel}
 *
 * <p>MakeCallRequest</p>
 */
public class MakeCallRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CalledNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String calledNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallingNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String callingNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommandCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String commandCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtInfo")
    private String extInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OuterAccountId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String outerAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OuterAccountType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String outerAccountType;

    private MakeCallRequest(Builder builder) {
        super(builder);
        this.calledNumber = builder.calledNumber;
        this.callingNumber = builder.callingNumber;
        this.commandCode = builder.commandCode;
        this.extInfo = builder.extInfo;
        this.outerAccountId = builder.outerAccountId;
        this.outerAccountType = builder.outerAccountType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MakeCallRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return calledNumber
     */
    public String getCalledNumber() {
        return this.calledNumber;
    }

    /**
     * @return callingNumber
     */
    public String getCallingNumber() {
        return this.callingNumber;
    }

    /**
     * @return commandCode
     */
    public String getCommandCode() {
        return this.commandCode;
    }

    /**
     * @return extInfo
     */
    public String getExtInfo() {
        return this.extInfo;
    }

    /**
     * @return outerAccountId
     */
    public String getOuterAccountId() {
        return this.outerAccountId;
    }

    /**
     * @return outerAccountType
     */
    public String getOuterAccountType() {
        return this.outerAccountType;
    }

    public static final class Builder extends Request.Builder<MakeCallRequest, Builder> {
        private String calledNumber; 
        private String callingNumber; 
        private String commandCode; 
        private String extInfo; 
        private String outerAccountId; 
        private String outerAccountType; 

        private Builder() {
            super();
        } 

        private Builder(MakeCallRequest request) {
            super(request);
            this.calledNumber = request.calledNumber;
            this.callingNumber = request.callingNumber;
            this.commandCode = request.commandCode;
            this.extInfo = request.extInfo;
            this.outerAccountId = request.outerAccountId;
            this.outerAccountType = request.outerAccountType;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>130****0000</p>
         */
        public Builder calledNumber(String calledNumber) {
            this.putQueryParameter("CalledNumber", calledNumber);
            this.calledNumber = calledNumber;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0571456****</p>
         */
        public Builder callingNumber(String callingNumber) {
            this.putQueryParameter("CallingNumber", callingNumber);
            this.callingNumber = callingNumber;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>outBound_Call</p>
         */
        public Builder commandCode(String commandCode) {
            this.putQueryParameter("CommandCode", commandCode);
            this.commandCode = commandCode;
            return this;
        }

        /**
         * ExtInfo.
         */
        public Builder extInfo(String extInfo) {
            this.putQueryParameter("ExtInfo", extInfo);
            this.extInfo = extInfo;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder outerAccountId(String outerAccountId) {
            this.putQueryParameter("OuterAccountId", outerAccountId);
            this.outerAccountId = outerAccountId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ALIPAY</p>
         */
        public Builder outerAccountType(String outerAccountType) {
            this.putQueryParameter("OuterAccountType", outerAccountType);
            this.outerAccountType = outerAccountType;
            return this;
        }

        @Override
        public MakeCallRequest build() {
            return new MakeCallRequest(this);
        } 

    } 

}
