// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartMicroOutboundNewRequest} extends {@link RequestModel}
 *
 * <p>StartMicroOutboundNewRequest</p>
 */
public class StartMicroOutboundNewRequest extends Request {
    @Query
    @NameInMap("CalledNumber")
    @Validation(required = true)
    private String calledNumber;

    @Query
    @NameInMap("CallingNumber")
    @Validation(required = true)
    private String callingNumber;

    @Query
    @NameInMap("CommandCode")
    @Validation(required = true)
    private String commandCode;

    @Query
    @NameInMap("ExtInfo")
    private String extInfo;

    @Query
    @NameInMap("OuterAccountId")
    @Validation(required = true)
    private String outerAccountId;

    @Query
    @NameInMap("OuterAccountType")
    @Validation(required = true)
    private String outerAccountType;

    private StartMicroOutboundNewRequest(Builder builder) {
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

    public static StartMicroOutboundNewRequest create() {
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

    public static final class Builder extends Request.Builder<StartMicroOutboundNewRequest, Builder> {
        private String calledNumber; 
        private String callingNumber; 
        private String commandCode; 
        private String extInfo; 
        private String outerAccountId; 
        private String outerAccountType; 

        private Builder() {
            super();
        } 

        private Builder(StartMicroOutboundNewRequest response) {
            super(response);
            this.calledNumber = response.calledNumber;
            this.callingNumber = response.callingNumber;
            this.commandCode = response.commandCode;
            this.extInfo = response.extInfo;
            this.outerAccountId = response.outerAccountId;
            this.outerAccountType = response.outerAccountType;
        } 

        /**
         * CalledNumber.
         */
        public Builder calledNumber(String calledNumber) {
            this.putQueryParameter("CalledNumber", calledNumber);
            this.calledNumber = calledNumber;
            return this;
        }

        /**
         * CallingNumber.
         */
        public Builder callingNumber(String callingNumber) {
            this.putQueryParameter("CallingNumber", callingNumber);
            this.callingNumber = callingNumber;
            return this;
        }

        /**
         * CommandCode.
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
         * OuterAccountId.
         */
        public Builder outerAccountId(String outerAccountId) {
            this.putQueryParameter("OuterAccountId", outerAccountId);
            this.outerAccountId = outerAccountId;
            return this;
        }

        /**
         * OuterAccountType.
         */
        public Builder outerAccountType(String outerAccountType) {
            this.putQueryParameter("OuterAccountType", outerAccountType);
            this.outerAccountType = outerAccountType;
            return this;
        }

        @Override
        public StartMicroOutboundNewRequest build() {
            return new StartMicroOutboundNewRequest(this);
        } 

    } 

}
