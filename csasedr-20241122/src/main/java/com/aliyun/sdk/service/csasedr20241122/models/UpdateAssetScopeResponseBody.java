// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csasedr20241122.models;

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
 * {@link UpdateAssetScopeResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateAssetScopeResponseBody</p>
 */
public class UpdateAssetScopeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateAssetScopeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAssetScopeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        private Builder() {
        } 

        private Builder(UpdateAssetScopeResponseBody model) {
            this.requestId = model.requestId;
        } 

        /**
         * <p>The unique identifier of the request, used to troubleshoot and locate issues.</p>
         * 
         * <strong>example:</strong>
         * <p>01A157FA-F957-3A5A-A6B8-5BBB8ADB****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateAssetScopeResponseBody build() {
            return new UpdateAssetScopeResponseBody(this);
        } 

    } 

}
