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
 * {@link AddPolarFsQuotaResponseBody} extends {@link TeaModel}
 *
 * <p>AddPolarFsQuotaResponseBody</p>
 */
public class AddPolarFsQuotaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PolarFsInstanceId")
    private String polarFsInstanceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AddPolarFsQuotaResponseBody(Builder builder) {
        this.polarFsInstanceId = builder.polarFsInstanceId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddPolarFsQuotaResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return polarFsInstanceId
     */
    public String getPolarFsInstanceId() {
        return this.polarFsInstanceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String polarFsInstanceId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(AddPolarFsQuotaResponseBody model) {
            this.polarFsInstanceId = model.polarFsInstanceId;
            this.requestId = model.requestId;
        } 

        /**
         * PolarFsInstanceId.
         */
        public Builder polarFsInstanceId(String polarFsInstanceId) {
            this.polarFsInstanceId = polarFsInstanceId;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>7F2007D3-7E74-4ECB-89A8-BF130D******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddPolarFsQuotaResponseBody build() {
            return new AddPolarFsQuotaResponseBody(this);
        } 

    } 

}
