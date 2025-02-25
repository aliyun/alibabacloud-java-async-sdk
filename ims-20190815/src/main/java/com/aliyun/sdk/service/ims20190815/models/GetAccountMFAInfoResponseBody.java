// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

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
 * {@link GetAccountMFAInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetAccountMFAInfoResponseBody</p>
 */
public class GetAccountMFAInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IsMFAEnable")
    private Boolean isMFAEnable;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAccountMFAInfoResponseBody(Builder builder) {
        this.isMFAEnable = builder.isMFAEnable;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAccountMFAInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return isMFAEnable
     */
    public Boolean getIsMFAEnable() {
        return this.isMFAEnable;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean isMFAEnable; 
        private String requestId; 

        /**
         * <p>Indicates whether MFA devices are enabled. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isMFAEnable(Boolean isMFAEnable) {
            this.isMFAEnable = isMFAEnable;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4BE83135-0B08-467C-B3A2-27B312FD0F57</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAccountMFAInfoResponseBody build() {
            return new GetAccountMFAInfoResponseBody(this);
        } 

    } 

}
