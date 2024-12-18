// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link CheckBindRamUserResponseBody} extends {@link TeaModel}
 *
 * <p>CheckBindRamUserResponseBody</p>
 */
public class CheckBindRamUserResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Boolean result;

    private CheckBindRamUserResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckBindRamUserResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Boolean getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Boolean result; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2FB9DCA3-DA56-5B43-A9A0-68E3D0E6AA84</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned result of the request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: the database account is associated with a RAM user.</li>
         * <li><strong>false</strong>: the database account is not associated with a RAM user.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder result(Boolean result) {
            this.result = result;
            return this;
        }

        public CheckBindRamUserResponseBody build() {
            return new CheckBindRamUserResponseBody(this);
        } 

    } 

}
