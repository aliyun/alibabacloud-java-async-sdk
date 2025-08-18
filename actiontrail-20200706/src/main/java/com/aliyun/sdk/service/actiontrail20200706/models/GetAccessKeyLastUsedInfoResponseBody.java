// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

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
 * {@link GetAccessKeyLastUsedInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetAccessKeyLastUsedInfoResponseBody</p>
 */
public class GetAccessKeyLastUsedInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessKeyId")
    private String accessKeyId;

    @com.aliyun.core.annotation.NameInMap("AccountId")
    private String accountId;

    @com.aliyun.core.annotation.NameInMap("AccountType")
    private String accountType;

    @com.aliyun.core.annotation.NameInMap("Detail")
    private String detail;

    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServiceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceName;

    @com.aliyun.core.annotation.NameInMap("ServiceNameCn")
    private String serviceNameCn;

    @com.aliyun.core.annotation.NameInMap("ServiceNameEn")
    private String serviceNameEn;

    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.NameInMap("UsedTimestamp")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long usedTimestamp;

    @com.aliyun.core.annotation.NameInMap("UserName")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetAccessKeyLastUsedInfoResponseBody model) {
            this.accessKeyId = model.accessKeyId;
            this.accountId = model.accountId;
            this.accountType = model.accountType;
            this.detail = model.detail;
            this.ownerId = model.ownerId;
            this.requestId = model.requestId;
            this.serviceName = model.serviceName;
            this.serviceNameCn = model.serviceNameCn;
            this.serviceNameEn = model.serviceNameEn;
            this.source = model.source;
            this.usedTimestamp = model.usedTimestamp;
            this.userName = model.userName;
        } 

        /**
         * <p>The AccessKey ID.</p>
         * 
         * <strong>example:</strong>
         * <p>LTAI****************</p>
         */
        public Builder accessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>104758519118****</p>
         */
        public Builder accountId(String accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * <p>The type of the account to which the AccessKey pair belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>ram-user</p>
         */
        public Builder accountType(String accountType) {
            this.accountType = accountType;
            return this;
        }

        /**
         * <p>The details about the event.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;eventId&quot;: &quot;239EB588-CD24-522E-B0B5-174A1A58****&quot;,
         *   &quot;eventVersion&quot;: 1,
         *   &quot;eventSource&quot;: &quot;ecs.cn-hangzhou.aliyuncs.com&quot;,
         *   &quot;sourceIpAddress&quot;: &quot;<code>10.10.**.**</code>&quot;,
         *   &quot;eventType&quot;: &quot;ApiCall&quot;,
         *   &quot;userIdentity&quot;: {
         *     &quot;accountId&quot;: &quot;104758519118****&quot;,
         *     &quot;principalId&quot;: &quot;24549429003625****&quot;,
         *     &quot;type&quot;: &quot;ram-user&quot;,
         *     &quot;userName&quot;: &quot;alice&quot;
         *   },
         *   &quot;serviceName&quot;: &quot;Ecs&quot;,
         *   &quot;apiVersion&quot;: &quot;2016-01-20&quot;,
         *   &quot;requestId&quot;: &quot;239EB588-CD24-522E-B0B5-174A1A588BE0&quot;,
         *   &quot;eventTime&quot;: &quot;2021-08-05T09:21:32Z&quot;,
         *   &quot;isGlobal&quot;: false,
         *   &quot;acsRegion&quot;: &quot;cn-hangzhou&quot;,
         *   &quot;eventName&quot;: &quot;DescribeInstances&quot;
         * }</p>
         */
        public Builder detail(String detail) {
            this.detail = detail;
            return this;
        }

        /**
         * <p>The ID of the account to which the AccessKey pair belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>24549429003625****</p>
         */
        public Builder ownerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>239EB588-CD24-522E-B0B5-174A1A588BE0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The Alibaba Cloud service that was last accessed.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Ecs</p>
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        /**
         * <p>The Chinese name of the Alibaba Cloud service that was last accessed.</p>
         * 
         * <strong>example:</strong>
         * <p>Elastic Compute Service (ECS)</p>
         */
        public Builder serviceNameCn(String serviceNameCn) {
            this.serviceNameCn = serviceNameCn;
            return this;
        }

        /**
         * <p>The English name of the Alibaba Cloud service that was last accessed.</p>
         * 
         * <strong>example:</strong>
         * <p>Elastic Compute Service</p>
         */
        public Builder serviceNameEn(String serviceNameEn) {
            this.serviceNameEn = serviceNameEn;
            return this;
        }

        /**
         * <p>The event source.</p>
         * 
         * <strong>example:</strong>
         * <p>ManagementEvent</p>
         */
        public Builder source(String source) {
            this.source = source;
            return this;
        }

        /**
         * <p>The timestamp when the AccessKey pair was last called.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1657247532000</p>
         */
        public Builder usedTimestamp(Long usedTimestamp) {
            this.usedTimestamp = usedTimestamp;
            return this;
        }

        /**
         * <p>The name of the account to which the AccessKey pair belongs.</p>
         * <p>If the value of the AccountType parameter is root-account, the value of the UserName parameter is root. If the value of the AccountType parameter is ram-user, the value of the UserName parameter is the name of a RAM user.</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
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
