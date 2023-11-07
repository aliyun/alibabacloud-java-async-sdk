// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAccessKeyLastUsedInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetAccessKeyLastUsedInfoResponseBody</p>
 */
public class GetAccessKeyLastUsedInfoResponseBody extends TeaModel {
    @NameInMap("AccessKeyId")
    private String accessKeyId;

    @NameInMap("AccountId")
    private String accountId;

    @NameInMap("AccountType")
    private String accountType;

    @NameInMap("Detail")
    private String detail;

    @NameInMap("OwnerId")
    private String ownerId;

    @NameInMap("RequestId")
    @Validation(required = true)
    private String requestId;

    @NameInMap("ServiceName")
    @Validation(required = true)
    private String serviceName;

    @NameInMap("ServiceNameCn")
    private String serviceNameCn;

    @NameInMap("ServiceNameEn")
    private String serviceNameEn;

    @NameInMap("Source")
    private String source;

    @NameInMap("UsedTimestamp")
    @Validation(required = true)
    private Long usedTimestamp;

    @NameInMap("UserName")
    private String userName;

    private GetAccessKeyLastUsedInfoResponseBody(Builder builder) {
        this.accessKeyId = builder.accessKeyId;
        this.accountId = builder.accountId;
        this.accountType = builder.accountType;
        this.detail = builder.detail;
        this.ownerId = builder.ownerId;
        this.requestId = builder.requestId;
        this.serviceName = builder.serviceName;
        this.serviceNameCn = builder.serviceNameCn;
        this.serviceNameEn = builder.serviceNameEn;
        this.source = builder.source;
        this.usedTimestamp = builder.usedTimestamp;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAccessKeyLastUsedInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessKeyId
     */
    public String getAccessKeyId() {
        return this.accessKeyId;
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
     * @return detail
     */
    public String getDetail() {
        return this.detail;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return serviceNameCn
     */
    public String getServiceNameCn() {
        return this.serviceNameCn;
    }

    /**
     * @return serviceNameEn
     */
    public String getServiceNameEn() {
        return this.serviceNameEn;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return usedTimestamp
     */
    public Long getUsedTimestamp() {
        return this.usedTimestamp;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder {
        private String accessKeyId; 
        private String accountId; 
        private String accountType; 
        private String detail; 
        private String ownerId; 
        private String requestId; 
        private String serviceName; 
        private String serviceNameCn; 
        private String serviceNameEn; 
        private String source; 
        private Long usedTimestamp; 
        private String userName; 

        /**
         * The AccessKey ID.
         */
        public Builder accessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud account.
         */
        public Builder accountId(String accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * The type of the account to which the AccessKey pair belongs.
         */
        public Builder accountType(String accountType) {
            this.accountType = accountType;
            return this;
        }

        /**
         * The details about the event.
         */
        public Builder detail(String detail) {
            this.detail = detail;
            return this;
        }

        /**
         * The ID of the account to which the AccessKey pair belongs.
         */
        public Builder ownerId(String ownerId) {
            this.ownerId = ownerId;
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
         * The Alibaba Cloud service that was last accessed.
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        /**
         * The Chinese name of the Alibaba Cloud service that was last accessed.
         */
        public Builder serviceNameCn(String serviceNameCn) {
            this.serviceNameCn = serviceNameCn;
            return this;
        }

        /**
         * The English name of the Alibaba Cloud service that was last accessed.
         */
        public Builder serviceNameEn(String serviceNameEn) {
            this.serviceNameEn = serviceNameEn;
            return this;
        }

        /**
         * The event source.
         */
        public Builder source(String source) {
            this.source = source;
            return this;
        }

        /**
         * The timestamp when the AccessKey pair was last called.
         */
        public Builder usedTimestamp(Long usedTimestamp) {
            this.usedTimestamp = usedTimestamp;
            return this;
        }

        /**
         * The name of the account to which the AccessKey pair belongs.
         * <p>
         * 
         * If the value of the AccountType parameter is root-account, the value of the UserName parameter is root. If the value of the AccountType parameter is ram-user, the value of the UserName parameter is the name of a RAM user.
         */
        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public GetAccessKeyLastUsedInfoResponseBody build() {
            return new GetAccessKeyLastUsedInfoResponseBody(this);
        } 

    } 

}
