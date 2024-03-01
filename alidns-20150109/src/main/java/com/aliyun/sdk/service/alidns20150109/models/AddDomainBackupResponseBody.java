// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddDomainBackupResponseBody} extends {@link TeaModel}
 *
 * <p>AddDomainBackupResponseBody</p>
 */
public class AddDomainBackupResponseBody extends TeaModel {
    @NameInMap("DomainName")
    private String domainName;

    @NameInMap("PeriodType")
    private String periodType;

    @NameInMap("RequestId")
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
         * The domain name.
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * The backup cycle.
         */
        public Builder periodType(String periodType) {
            this.periodType = periodType;
            return this;
        }

        /**
         * The request ID.
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
