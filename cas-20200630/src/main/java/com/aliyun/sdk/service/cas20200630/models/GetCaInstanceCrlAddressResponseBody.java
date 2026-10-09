// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200630.models;

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
 * {@link GetCaInstanceCrlAddressResponseBody} extends {@link TeaModel}
 *
 * <p>GetCaInstanceCrlAddressResponseBody</p>
 */
public class GetCaInstanceCrlAddressResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CaInstanceStatus")
    private String caInstanceStatus;

    @com.aliyun.core.annotation.NameInMap("CaType")
    private String caType;

    @com.aliyun.core.annotation.NameInMap("CrlUrl")
    private String crlUrl;

    @com.aliyun.core.annotation.NameInMap("HashCode")
    private String hashCode;

    @com.aliyun.core.annotation.NameInMap("NextUpdateTime")
    private String nextUpdateTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetCaInstanceCrlAddressResponseBody(Builder builder) {
        this.caInstanceStatus = builder.caInstanceStatus;
        this.caType = builder.caType;
        this.crlUrl = builder.crlUrl;
        this.hashCode = builder.hashCode;
        this.nextUpdateTime = builder.nextUpdateTime;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCaInstanceCrlAddressResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return caInstanceStatus
     */
    public String getCaInstanceStatus() {
        return this.caInstanceStatus;
    }

    /**
     * @return caType
     */
    public String getCaType() {
        return this.caType;
    }

    /**
     * @return crlUrl
     */
    public String getCrlUrl() {
        return this.crlUrl;
    }

    /**
     * @return hashCode
     */
    public String getHashCode() {
        return this.hashCode;
    }

    /**
     * @return nextUpdateTime
     */
    public String getNextUpdateTime() {
        return this.nextUpdateTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String caInstanceStatus; 
        private String caType; 
        private String crlUrl; 
        private String hashCode; 
        private String nextUpdateTime; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetCaInstanceCrlAddressResponseBody model) {
            this.caInstanceStatus = model.caInstanceStatus;
            this.caType = model.caType;
            this.crlUrl = model.crlUrl;
            this.hashCode = model.hashCode;
            this.nextUpdateTime = model.nextUpdateTime;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The status of the CA instance.</p>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        public Builder caInstanceStatus(String caInstanceStatus) {
            this.caInstanceStatus = caInstanceStatus;
            return this;
        }

        /**
         * <p>The CA type.</p>
         * 
         * <strong>example:</strong>
         * <p>uploadCA</p>
         */
        public Builder caType(String caType) {
            this.caType = caType;
            return this;
        }

        /**
         * <p>The CRL URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://crl-cn-publish.oss-cn-hangzhou.aliyuncs.com/pca/crl/35118048/1f0be094-14bd-6caa-bd7f-db45730d510a.crl">https://crl-cn-publish.oss-cn-hangzhou.aliyuncs.com/pca/crl/35118048/1f0be094-14bd-6caa-bd7f-db45730d510a.crl</a></p>
         */
        public Builder crlUrl(String crlUrl) {
            this.crlUrl = crlUrl;
            return this;
        }

        /**
         * <p>The hash code used to identify whether new revoked certificates exist in the CRL.</p>
         * 
         * <strong>example:</strong>
         * <p>5481d1b1228fXXX40ee70dc8cd</p>
         */
        public Builder hashCode(String hashCode) {
            this.hashCode = hashCode;
            return this;
        }

        /**
         * <p>The next update time of the CRL. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1778688000000</p>
         */
        public Builder nextUpdateTime(String nextUpdateTime) {
            this.nextUpdateTime = nextUpdateTime;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>C53C2341-F321-55A5-895C-D0746E6DA58E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetCaInstanceCrlAddressResponseBody build() {
            return new GetCaInstanceCrlAddressResponseBody(this);
        } 

    } 

}
