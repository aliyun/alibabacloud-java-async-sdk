// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribePolicyAdvancedConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePolicyAdvancedConfigResponseBody</p>
 */
public class DescribePolicyAdvancedConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Eips")
    private java.util.List<String> eips;

    @com.aliyun.core.annotation.NameInMap("InternetSwitch")
    private String internetSwitch;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribePolicyAdvancedConfigResponseBody(Builder builder) {
        this.eips = builder.eips;
        this.internetSwitch = builder.internetSwitch;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePolicyAdvancedConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eips
     */
    public java.util.List<String> getEips() {
        return this.eips;
    }

    /**
     * @return internetSwitch
     */
    public String getInternetSwitch() {
        return this.internetSwitch;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> eips; 
        private String internetSwitch; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribePolicyAdvancedConfigResponseBody model) {
            this.eips = model.eips;
            this.internetSwitch = model.internetSwitch;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of elastic IP addresses (EIPs) that take effect when strict mode is enabled. A maximum of 100 IP addresses can be returned.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;47.100.XX.XX&quot;,&quot;47.101.XX.XX&quot;]</p>
         */
        public Builder eips(java.util.List<String> eips) {
            this.eips = eips;
            return this;
        }

        /**
         * <p>The enabling status of the strict mode for access control policies. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: The strict mode is enabled.</li>
         * <li><strong>off</strong>: The strict mode is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder internetSwitch(String internetSwitch) {
            this.internetSwitch = internetSwitch;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>850A84D6-0DE4-4797-A1E8-00090125EEB1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePolicyAdvancedConfigResponseBody build() {
            return new DescribePolicyAdvancedConfigResponseBody(this);
        } 

    } 

}
