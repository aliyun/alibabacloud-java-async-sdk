// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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
 * {@link SetDomainResponseBody} extends {@link TeaModel}
 *
 * <p>SetDomainResponseBody</p>
 */
public class SetDomainResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainBindingStatus")
    private String domainBindingStatus;

    @com.aliyun.core.annotation.NameInMap("DomainLegalStatus")
    private String domainLegalStatus;

    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("DomainRemark")
    private String domainRemark;

    @com.aliyun.core.annotation.NameInMap("DomainWebSocketStatus")
    private String domainWebSocketStatus;

    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SubDomain")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(SetDomainResponseBody model) {
            this.domainBindingStatus = model.domainBindingStatus;
            this.domainLegalStatus = model.domainLegalStatus;
            this.domainName = model.domainName;
            this.domainRemark = model.domainRemark;
            this.domainWebSocketStatus = model.domainWebSocketStatus;
            this.groupId = model.groupId;
            this.requestId = model.requestId;
            this.subDomain = model.subDomain;
        } 

        /**
         * <p>The binding status of the custom domain name. Valid values:</p>
         * <ul>
         * <li><strong>BINDING</strong>: The domain name has been bound.</li>
         * <li><strong>BOUND</strong>: The domain name has not been bound.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BINDING</p>
         */
        public Builder domainBindingStatus(String domainBindingStatus) {
            this.domainBindingStatus = domainBindingStatus;
            return this;
        }

        /**
         * <p>The validity status of the domain name. Valid values:</p>
         * <ul>
         * <li><strong>NORMAL</strong>: The domain name is valid.</li>
         * <li><strong>ABNORMAL</strong>: The domain name is invalid. This status affects API calls and must be resolved as soon as possible.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        public Builder domainLegalStatus(String domainLegalStatus) {
            this.domainLegalStatus = domainLegalStatus;
            return this;
        }

        /**
         * <p>The custom domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>api.demo.com</p>
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The remarks on the domain name, such as the cause of an exception.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder domainRemark(String domainRemark) {
            this.domainRemark = domainRemark;
            return this;
        }

        /**
         * <p>The status of the domain name that uses the WebSocket feature.</p>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        public Builder domainWebSocketStatus(String domainWebSocketStatus) {
            this.domainWebSocketStatus = domainWebSocketStatus;
            return this;
        }

        /**
         * <p>The ID of the API group. This ID is generated by the system and globally unique.</p>
         * 
         * <strong>example:</strong>
         * <p>927d50c0f2e54b359919923d908bb015</p>
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0AA90E87-3506-5AA6-AFFB-A4D53B4F6231</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The second-level domain name assigned to the API group. This domain name is used to test API calls.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx-cn-hangzhou.alicloudapi.com</p>
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
