// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link CreateEpnInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateEpnInstanceResponseBody</p>
 */
public class CreateEpnInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EPNInstanceId")
    private String EPNInstanceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateEpnInstanceResponseBody(Builder builder) {
        this.EPNInstanceId = builder.EPNInstanceId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEpnInstanceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return EPNInstanceId
     */
    public String getEPNInstanceId() {
        return this.EPNInstanceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String EPNInstanceId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateEpnInstanceResponseBody model) {
            this.EPNInstanceId = model.EPNInstanceId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the EPN instance.</p>
         * 
         * <strong>example:</strong>
         * <p>epn-xxxxx</p>
         */
        public Builder EPNInstanceId(String EPNInstanceId) {
            this.EPNInstanceId = EPNInstanceId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BA984</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateEpnInstanceResponseBody build() {
            return new CreateEpnInstanceResponseBody(this);
        } 

    } 

}
