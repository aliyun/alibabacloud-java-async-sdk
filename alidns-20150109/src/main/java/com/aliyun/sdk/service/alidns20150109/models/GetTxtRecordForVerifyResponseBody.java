// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link GetTxtRecordForVerifyResponseBody} extends {@link TeaModel}
 *
 * <p>GetTxtRecordForVerifyResponseBody</p>
 */
public class GetTxtRecordForVerifyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("ParentDomainName")
    private String parentDomainName;

    @com.aliyun.core.annotation.NameInMap("RR")
    private String rr;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Value")
    private String value;

    private GetTxtRecordForVerifyResponseBody(Builder builder) {
        this.domainName = builder.domainName;
        this.parentDomainName = builder.parentDomainName;
        this.rr = builder.rr;
        this.requestId = builder.requestId;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTxtRecordForVerifyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return parentDomainName
     */
    public String getParentDomainName() {
        return this.parentDomainName;
    }

    /**
     * @return rr
     */
    public String getRr() {
        return this.rr;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder {
        private String domainName; 
        private String parentDomainName; 
        private String rr; 
        private String requestId; 
        private String value; 

        private Builder() {
        } 

        private Builder(GetTxtRecordForVerifyResponseBody model) {
            this.domainName = model.domainName;
            this.parentDomainName = model.parentDomainName;
            this.rr = model.rr;
            this.requestId = model.requestId;
            this.value = model.value;
        } 

        /**
         * <p>The domain name.</p>
         * <blockquote>
         * <p> If you do not specify this parameter, it is not returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The top-level domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>com</p>
         */
        public Builder parentDomainName(String parentDomainName) {
            this.parentDomainName = parentDomainName;
            return this;
        }

        /**
         * <p>The hostname.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyunRetrieval</p>
         */
        public Builder rr(String rr) {
            this.rr = rr;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9CC0D642-49D4-48DE-A1A5-9F218652E4A7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The record value.</p>
         * <blockquote>
         * <p> The validity period is three days.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>c99419e6997f41daaa3e*****</p>
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public GetTxtRecordForVerifyResponseBody build() {
            return new GetTxtRecordForVerifyResponseBody(this);
        } 

    } 

}
