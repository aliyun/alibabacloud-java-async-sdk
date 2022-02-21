// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendMicroCommandRequest} extends {@link RequestModel}
 *
 * <p>SendMicroCommandRequest</p>
 */
public class SendMicroCommandRequest extends Request {
    @Query
    @NameInMap("AccountId")
    @Validation(required = true)
    private String accountId;

    @Query
    @NameInMap("AccountType")
    @Validation(required = true)
    private String accountType;

    @Query
    @NameInMap("AppName")
    @Validation(required = true)
    private String appName;

    @Query
    @NameInMap("BuId")
    @Validation(required = true)
    private Long buId;

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
    @NameInMap("DepartmentId")
    private Long departmentId;

    @Body
    @NameInMap("ExtInfo")
    private java.util.Map < String, ? > extInfo;

    private SendMicroCommandRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.accountType = builder.accountType;
        this.appName = builder.appName;
        this.buId = builder.buId;
        this.calledNumber = builder.calledNumber;
        this.callingNumber = builder.callingNumber;
        this.commandCode = builder.commandCode;
        this.departmentId = builder.departmentId;
        this.extInfo = builder.extInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendMicroCommandRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return accountType
     */
    public String getAccountType() {
        return this.accountType;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return buId
     */
    public Long getBuId() {
        return this.buId;
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
     * @return departmentId
     */
    public Long getDepartmentId() {
        return this.departmentId;
    }

    /**
     * @return extInfo
     */
    public java.util.Map < String, ? > getExtInfo() {
        return this.extInfo;
    }

    public static final class Builder extends Request.Builder<SendMicroCommandRequest, Builder> {
        private String accountId; 
        private String accountType; 
        private String appName; 
        private Long buId; 
        private String calledNumber; 
        private String callingNumber; 
        private String commandCode; 
        private Long departmentId; 
        private java.util.Map < String, ? > extInfo; 

        private Builder() {
            super();
        } 

        private Builder(SendMicroCommandRequest response) {
            super(response);
            this.accountId = response.accountId;
            this.accountType = response.accountType;
            this.appName = response.appName;
            this.buId = response.buId;
            this.calledNumber = response.calledNumber;
            this.callingNumber = response.callingNumber;
            this.commandCode = response.commandCode;
            this.departmentId = response.departmentId;
            this.extInfo = response.extInfo;
        } 

        /**
         * AccountId.
         */
        public Builder accountId(String accountId) {
            this.putQueryParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * AccountType.
         */
        public Builder accountType(String accountType) {
            this.putQueryParameter("AccountType", accountType);
            this.accountType = accountType;
            return this;
        }

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * BuId.
         */
        public Builder buId(Long buId) {
            this.putQueryParameter("BuId", buId);
            this.buId = buId;
            return this;
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
         * DepartmentId.
         */
        public Builder departmentId(Long departmentId) {
            this.putQueryParameter("DepartmentId", departmentId);
            this.departmentId = departmentId;
            return this;
        }

        /**
         * ExtInfo.
         */
        public Builder extInfo(java.util.Map < String, ? > extInfo) {
            this.putBodyParameter("ExtInfo", extInfo);
            this.extInfo = extInfo;
            return this;
        }

        @Override
        public SendMicroCommandRequest build() {
            return new SendMicroCommandRequest(this);
        } 

    } 

}
