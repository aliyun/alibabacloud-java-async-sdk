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
 * {@link AddDomainBackupResponseBody} extends {@link TeaModel}
 *
 * <p>AddDomainBackupResponseBody</p>
 */
public class AddDomainBackupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("PeriodType")
    private String periodType;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AddDomainBackupResponseBody(Builder builder) {
        this.domainName = builder.domainName;
        this.periodType = builder.periodType;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddDomainBackupResponseBody create() {
        return builder().build();
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return periodType
     */
    public String getPeriodType() {
        return this.periodType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String domainName; 
        private String periodType; 
        private String requestId; 

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>test.aliyun.com</p>
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The backup cycle.</p>
         * 
         * <strong>example:</strong>
         * <p>DAY</p>
         */
        public Builder periodType(String periodType) {
            this.periodType = periodType;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>FD552816-FCC8-4832-B4A2-2DA0C2BA1688</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddDomainBackupResponseBody build() {
            return new AddDomainBackupResponseBody(this);
        } 

    } 

}
