// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDomainResponseBody} extends {@link TeaModel}
 *
 * <p>SetDomainResponseBody</p>
 */
public class SetDomainResponseBody extends TeaModel {
    @NameInMap("DomainBindingStatus")
    private String domainBindingStatus;

    @NameInMap("DomainLegalStatus")
    private String domainLegalStatus;

    @NameInMap("DomainName")
    private String domainName;

    @NameInMap("DomainRemark")
    private String domainRemark;

    @NameInMap("DomainWebSocketStatus")
    private String domainWebSocketStatus;

    @NameInMap("GroupId")
    private String groupId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SubDomain")
    private String subDomain;

    private SetDomainResponseBody(Builder builder) {
        this.domainBindingStatus = builder.domainBindingStatus;
        this.domainLegalStatus = builder.domainLegalStatus;
        this.domainName = builder.domainName;
        this.domainRemark = builder.domainRemark;
        this.domainWebSocketStatus = builder.domainWebSocketStatus;
        this.groupId = builder.groupId;
        this.requestId = builder.requestId;
        this.subDomain = builder.subDomain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDomainResponseBody create() {
        return builder().build();
    }

    /**
     * @return domainBindingStatus
     */
    public String getDomainBindingStatus() {
        return this.domainBindingStatus;
    }

    /**
     * @return domainLegalStatus
     */
    public String getDomainLegalStatus() {
        return this.domainLegalStatus;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return domainRemark
     */
    public String getDomainRemark() {
        return this.domainRemark;
    }

    /**
     * @return domainWebSocketStatus
     */
    public String getDomainWebSocketStatus() {
        return this.domainWebSocketStatus;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return subDomain
     */
    public String getSubDomain() {
        return this.subDomain;
    }

    public static final class Builder {
        private String domainBindingStatus; 
        private String domainLegalStatus; 
        private String domainName; 
        private String domainRemark; 
        private String domainWebSocketStatus; 
        private String groupId; 
        private String requestId; 
        private String subDomain; 

        /**
         * DomainBindingStatus.
         */
        public Builder domainBindingStatus(String domainBindingStatus) {
            this.domainBindingStatus = domainBindingStatus;
            return this;
        }

        /**
         * DomainLegalStatus.
         */
        public Builder domainLegalStatus(String domainLegalStatus) {
            this.domainLegalStatus = domainLegalStatus;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * DomainRemark.
         */
        public Builder domainRemark(String domainRemark) {
            this.domainRemark = domainRemark;
            return this;
        }

        /**
         * DomainWebSocketStatus.
         */
        public Builder domainWebSocketStatus(String domainWebSocketStatus) {
            this.domainWebSocketStatus = domainWebSocketStatus;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
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
         * SubDomain.
         */
        public Builder subDomain(String subDomain) {
            this.subDomain = subDomain;
            return this;
        }

        public SetDomainResponseBody build() {
            return new SetDomainResponseBody(this);
        } 

    } 

}
