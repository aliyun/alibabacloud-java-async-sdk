// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link AttachApplicationPolarFSResponseBody} extends {@link TeaModel}
 *
 * <p>AttachApplicationPolarFSResponseBody</p>
 */
public class AttachApplicationPolarFSResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    private String applicationId;

    @com.aliyun.core.annotation.NameInMap("PolarFSInstanceId")
    private String polarFSInstanceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AttachApplicationPolarFSResponseBody(Builder builder) {
        this.applicationId = builder.applicationId;
        this.polarFSInstanceId = builder.polarFSInstanceId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachApplicationPolarFSResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return polarFSInstanceId
     */
    public String getPolarFSInstanceId() {
        return this.polarFSInstanceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String applicationId; 
        private String polarFSInstanceId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(AttachApplicationPolarFSResponseBody model) {
            this.applicationId = model.applicationId;
            this.polarFSInstanceId = model.polarFSInstanceId;
            this.requestId = model.requestId;
        } 

        /**
         * ApplicationId.
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>PolarFS ID</p>
         * 
         * <strong>example:</strong>
         * <p>pcs-**************</p>
         */
        public Builder polarFSInstanceId(String polarFSInstanceId) {
            this.polarFSInstanceId = polarFSInstanceId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AttachApplicationPolarFSResponseBody build() {
            return new AttachApplicationPolarFSResponseBody(this);
        } 

    } 

}
