// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateGroupDNSServiceRuleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateGroupDNSServiceRuleResponseBody</p>
 */
public class CreateGroupDNSServiceRuleResponseBody extends TeaModel {
    @NameInMap("DNSServiceRuleId")
    private String DNSServiceRuleId;

    @NameInMap("IoTCloudConnectorGroupId")
    private String ioTCloudConnectorGroupId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateGroupDNSServiceRuleResponseBody(Builder builder) {
        this.DNSServiceRuleId = builder.DNSServiceRuleId;
        this.ioTCloudConnectorGroupId = builder.ioTCloudConnectorGroupId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGroupDNSServiceRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return DNSServiceRuleId
     */
    public String getDNSServiceRuleId() {
        return this.DNSServiceRuleId;
    }

    /**
     * @return ioTCloudConnectorGroupId
     */
    public String getIoTCloudConnectorGroupId() {
        return this.ioTCloudConnectorGroupId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String DNSServiceRuleId; 
        private String ioTCloudConnectorGroupId; 
        private String requestId; 

        /**
         * DNSServiceRuleId.
         */
        public Builder DNSServiceRuleId(String DNSServiceRuleId) {
            this.DNSServiceRuleId = DNSServiceRuleId;
            return this;
        }

        /**
         * IoTCloudConnectorGroupId.
         */
        public Builder ioTCloudConnectorGroupId(String ioTCloudConnectorGroupId) {
            this.ioTCloudConnectorGroupId = ioTCloudConnectorGroupId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateGroupDNSServiceRuleResponseBody build() {
            return new CreateGroupDNSServiceRuleResponseBody(this);
        } 

    } 

}
