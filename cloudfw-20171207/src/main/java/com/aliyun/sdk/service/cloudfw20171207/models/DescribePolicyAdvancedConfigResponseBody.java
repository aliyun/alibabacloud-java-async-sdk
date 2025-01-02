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
    @com.aliyun.core.annotation.NameInMap("InternetSwitch")
    private String internetSwitch;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribePolicyAdvancedConfigResponseBody(Builder builder) {
        this.internetSwitch = builder.internetSwitch;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePolicyAdvancedConfigResponseBody create() {
        return builder().build();
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
        private String internetSwitch; 
        private String requestId; 

        /**
         * <p>Indicates whether the strict mode is enabled for the access control policy. Valid values:</p>
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
         * <p>The ID of the request.</p>
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
