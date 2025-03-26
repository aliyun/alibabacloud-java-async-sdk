// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DescribeADInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeADInfoResponseBody</p>
 */
public class DescribeADInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ADDNS")
    private String ADDNS;

    @com.aliyun.core.annotation.NameInMap("ADServerIpAddress")
    private String ADServerIpAddress;

    @com.aliyun.core.annotation.NameInMap("ADStatus")
    private String ADStatus;

    @com.aliyun.core.annotation.NameInMap("AbnormalReason")
    private String abnormalReason;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UserName")
    private String userName;

    private DescribeADInfoResponseBody(Builder builder) {
        this.ADDNS = builder.ADDNS;
        this.ADServerIpAddress = builder.ADServerIpAddress;
        this.ADStatus = builder.ADStatus;
        this.abnormalReason = builder.abnormalReason;
        this.requestId = builder.requestId;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeADInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ADDNS
     */
    public String getADDNS() {
        return this.ADDNS;
    }

    /**
     * @return ADServerIpAddress
     */
    public String getADServerIpAddress() {
        return this.ADServerIpAddress;
    }

    /**
     * @return ADStatus
     */
    public String getADStatus() {
        return this.ADStatus;
    }

    /**
     * @return abnormalReason
     */
    public String getAbnormalReason() {
        return this.abnormalReason;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder {
        private String ADDNS; 
        private String ADServerIpAddress; 
        private String ADStatus; 
        private String abnormalReason; 
        private String requestId; 
        private String userName; 

        private Builder() {
        } 

        private Builder(DescribeADInfoResponseBody model) {
            this.ADDNS = model.ADDNS;
            this.ADServerIpAddress = model.ADServerIpAddress;
            this.ADStatus = model.ADStatus;
            this.abnormalReason = model.abnormalReason;
            this.requestId = model.requestId;
            this.userName = model.userName;
        } 

        /**
         * <p>The DNS information about the AD domain.</p>
         * 
         * <strong>example:</strong>
         * <p>100.100.XX.XX</p>
         */
        public Builder ADDNS(String ADDNS) {
            this.ADDNS = ADDNS;
            return this;
        }

        /**
         * <p>The service IP address of the AD domain.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        public Builder ADServerIpAddress(String ADServerIpAddress) {
            this.ADServerIpAddress = ADServerIpAddress;
            return this;
        }

        /**
         * <p>The status of the AD domain. Valid values:</p>
         * <ul>
         * <li><strong>-1</strong>: The instance is being added to the AD domain.</li>
         * <li><strong>0</strong>: The instance fails to be added to the AD domain.</li>
         * <li><strong>1</strong>: The instance is added to the AD domain.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder ADStatus(String ADStatus) {
            this.ADStatus = ADStatus;
            return this;
        }

        /**
         * <p>The cause of the error.</p>
         * 
         * <strong>example:</strong>
         * <p>XXXX</p>
         */
        public Builder abnormalReason(String abnormalReason) {
            this.abnormalReason = abnormalReason;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The username of the AD domain.</p>
         * 
         * <strong>example:</strong>
         * <p>test_01</p>
         */
        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public DescribeADInfoResponseBody build() {
            return new DescribeADInfoResponseBody(this);
        } 

    } 

}
