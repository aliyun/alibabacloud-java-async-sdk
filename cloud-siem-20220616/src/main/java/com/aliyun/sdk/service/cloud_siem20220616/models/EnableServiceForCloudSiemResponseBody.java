// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableServiceForCloudSiemResponseBody} extends {@link TeaModel}
 *
 * <p>EnableServiceForCloudSiemResponseBody</p>
 */
public class EnableServiceForCloudSiemResponseBody extends TeaModel {
    @NameInMap("Data")
    private Boolean data;

    @NameInMap("RequestId")
    private String requestId;

    private EnableServiceForCloudSiemResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableServiceForCloudSiemResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Boolean getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean data; 
        private String requestId; 

        /**
         * Indicates whether the threat analysis feature is authorized to access the resource directory. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder data(Boolean data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public EnableServiceForCloudSiemResponseBody build() {
            return new EnableServiceForCloudSiemResponseBody(this);
        } 

    } 

}
