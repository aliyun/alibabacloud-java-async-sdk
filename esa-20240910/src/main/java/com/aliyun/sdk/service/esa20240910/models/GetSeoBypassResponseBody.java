// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link GetSeoBypassResponseBody} extends {@link TeaModel}
 *
 * <p>GetSeoBypassResponseBody</p>
 */
public class GetSeoBypassResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Enable")
    private String enable;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetSeoBypassResponseBody(Builder builder) {
        this.enable = builder.enable;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSeoBypassResponseBody create() {
        return builder().build();
    }

    /**
     * @return enable
     */
    public String getEnable() {
        return this.enable;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String enable; 
        private String requestId; 

        /**
         * <p>The status of the feature. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder enable(String enable) {
            this.enable = enable;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>15C66C7B-671A-4297-9187-2C4477247B78</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetSeoBypassResponseBody build() {
            return new GetSeoBypassResponseBody(this);
        } 

    } 

}
