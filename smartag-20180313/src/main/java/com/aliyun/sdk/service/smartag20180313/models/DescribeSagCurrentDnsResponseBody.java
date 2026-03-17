// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link DescribeSagCurrentDnsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSagCurrentDnsResponseBody</p>
 */
public class DescribeSagCurrentDnsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MasterDns")
    private String masterDns;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SlaveDns")
    private String slaveDns;

    private DescribeSagCurrentDnsResponseBody(Builder builder) {
        this.masterDns = builder.masterDns;
        this.requestId = builder.requestId;
        this.slaveDns = builder.slaveDns;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSagCurrentDnsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return masterDns
     */
    public String getMasterDns() {
        return this.masterDns;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return slaveDns
     */
    public String getSlaveDns() {
        return this.slaveDns;
    }

    public static final class Builder {
        private String masterDns; 
        private String requestId; 
        private String slaveDns; 

        private Builder() {
        } 

        private Builder(DescribeSagCurrentDnsResponseBody model) {
            this.masterDns = model.masterDns;
            this.requestId = model.requestId;
            this.slaveDns = model.slaveDns;
        } 

        /**
         * <p>The IP address of the primary DNS server.</p>
         * 
         * <strong>example:</strong>
         * <p>223.XX.XX.5</p>
         */
        public Builder masterDns(String masterDns) {
            this.masterDns = masterDns;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0937DEA0-AB4B-42F4-9314-07B97D30282B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The IP address of the secondary DNS server.</p>
         * 
         * <strong>example:</strong>
         * <p>114.XX.XX.114</p>
         */
        public Builder slaveDns(String slaveDns) {
            this.slaveDns = slaveDns;
            return this;
        }

        public DescribeSagCurrentDnsResponseBody build() {
            return new DescribeSagCurrentDnsResponseBody(this);
        } 

    } 

}
