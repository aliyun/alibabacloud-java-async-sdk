// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link GetFileProtectEventCountResponseBody} extends {@link TeaModel}
 *
 * <p>GetFileProtectEventCountResponseBody</p>
 */
public class GetFileProtectEventCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Integer data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetFileProtectEventCountResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFileProtectEventCountResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Integer getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetFileProtectEventCountResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The data returned if the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        public Builder data(Integer data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9B28EC81-2FA7-5097-80D9-0DBE1A3DBD59</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetFileProtectEventCountResponseBody build() {
            return new GetFileProtectEventCountResponseBody(this);
        } 

    } 

}
