// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeADInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeADInfoResponseBody</p>
 */
public class DescribeADInfoResponseBody extends TeaModel {
    @NameInMap("ADDNS")
    private String ADDNS;

    @NameInMap("ADServerIpAddress")
    private String ADServerIpAddress;

    @NameInMap("ADStatus")
    private String ADStatus;

    @NameInMap("AbnormalReason")
    private String abnormalReason;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("UserName")
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

        /**
         * The DNS information about the AD domain.
         */
        public Builder ADDNS(String ADDNS) {
            this.ADDNS = ADDNS;
            return this;
        }

        /**
         * The service IP address of the AD domain.
         */
        public Builder ADServerIpAddress(String ADServerIpAddress) {
            this.ADServerIpAddress = ADServerIpAddress;
            return this;
        }

        /**
         * The status of the AD domain. Valid values:
         * <p>
         * 
         * *   **-1**: The instance is being added to the AD domain.
         * *   **0**: The instance fails to be added to the AD domain.
         * *   **1**: The instance is added to the AD domain.
         */
        public Builder ADStatus(String ADStatus) {
            this.ADStatus = ADStatus;
            return this;
        }

        /**
         * The cause of the exception.
         */
        public Builder abnormalReason(String abnormalReason) {
            this.abnormalReason = abnormalReason;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The username of the AD domain.
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
