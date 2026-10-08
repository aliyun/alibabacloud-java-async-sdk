// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

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
 * {@link CheckProcessingServerLockApplyResponseBody} extends {@link TeaModel}
 *
 * <p>CheckProcessingServerLockApplyResponseBody</p>
 */
public class CheckProcessingServerLockApplyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Exists")
    private Boolean exists;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CheckProcessingServerLockApplyResponseBody(Builder builder) {
        this.exists = builder.exists;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckProcessingServerLockApplyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return exists
     */
    public Boolean getExists() {
        return this.exists;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean exists; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CheckProcessingServerLockApplyResponseBody model) {
            this.exists = model.exists;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Indicates whether the domain name has a registry lock service request with the <strong>Processing</strong> status at the domain name registry. Valid values:</p>
         * <ul>
         * <li>true: exists</li>
         * <li>false: does not exist</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder exists(Boolean exists) {
            this.exists = exists;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9DFCF6F8-243C-****-8035-4B12FEFD7D48</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CheckProcessingServerLockApplyResponseBody build() {
            return new CheckProcessingServerLockApplyResponseBody(this);
        } 

    } 

}
