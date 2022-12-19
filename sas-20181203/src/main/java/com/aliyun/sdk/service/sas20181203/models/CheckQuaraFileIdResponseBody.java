// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckQuaraFileIdResponseBody} extends {@link TeaModel}
 *
 * <p>CheckQuaraFileIdResponseBody</p>
 */
public class CheckQuaraFileIdResponseBody extends TeaModel {
    @NameInMap("Data")
    private Boolean data;

    @NameInMap("RequestId")
    private String requestId;

    private CheckQuaraFileIdResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckQuaraFileIdResponseBody create() {
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
         * Indicates whether the ID of the quarantined file is valid. Valid values:
         * <p>
         * 
         * *   **true**: The ID of the quarantined file is valid.
         * *   **false**: The ID of the quarantined file is invalid.
         */
        public Builder data(Boolean data) {
            this.data = data;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CheckQuaraFileIdResponseBody build() {
            return new CheckQuaraFileIdResponseBody(this);
        } 

    } 

}
