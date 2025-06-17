// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

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
 * {@link CdnMigrateRegisterResponseBody} extends {@link TeaModel}
 *
 * <p>CdnMigrateRegisterResponseBody</p>
 */
public class CdnMigrateRegisterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private CdnMigrateRegisterResponseBody(Builder builder) {
        this.domainName = builder.domainName;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CdnMigrateRegisterResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String domainName; 
        private String requestId; 
        private String status; 

        private Builder() {
        } 

        private Builder(CdnMigrateRegisterResponseBody model) {
            this.domainName = model.domainName;
            this.requestId = model.requestId;
            this.status = model.status;
        } 

        /**
         * <p>The accelerated domain name. You can specify only one domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>64D28B53-5902-409B-94F6-FD46680144FE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The registration status. Valid values:</p>
         * <ul>
         * <li><strong>running</strong></li>
         * <li><strong>succeed</strong></li>
         * <li><strong>failed</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>succeed</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public CdnMigrateRegisterResponseBody build() {
            return new CdnMigrateRegisterResponseBody(this);
        } 

    } 

}
