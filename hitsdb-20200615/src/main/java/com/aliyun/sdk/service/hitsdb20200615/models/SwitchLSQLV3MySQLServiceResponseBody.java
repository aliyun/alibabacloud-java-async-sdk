// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20200615.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SwitchLSQLV3MySQLServiceResponseBody} extends {@link TeaModel}
 *
 * <p>SwitchLSQLV3MySQLServiceResponseBody</p>
 */
public class SwitchLSQLV3MySQLServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private SwitchLSQLV3MySQLServiceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SwitchLSQLV3MySQLServiceResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SwitchLSQLV3MySQLServiceResponseBody build() {
            return new SwitchLSQLV3MySQLServiceResponseBody(this);
        } 

    } 

}
