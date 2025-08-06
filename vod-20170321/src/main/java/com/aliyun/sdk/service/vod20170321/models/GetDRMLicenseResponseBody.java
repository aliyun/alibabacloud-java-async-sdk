// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link GetDRMLicenseResponseBody} extends {@link TeaModel}
 *
 * <p>GetDRMLicenseResponseBody</p>
 */
public class GetDRMLicenseResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("License")
    private String license;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetDRMLicenseResponseBody(Builder builder) {
        this.license = builder.license;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDRMLicenseResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return license
     */
    public String getLicense() {
        return this.license;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String license; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetDRMLicenseResponseBody model) {
            this.license = model.license;
            this.requestId = model.requestId;
        } 

        /**
         * License.
         */
        public Builder license(String license) {
            this.license = license;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDRMLicenseResponseBody build() {
            return new GetDRMLicenseResponseBody(this);
        } 

    } 

}
