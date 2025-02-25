// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DettachAssetGroupToInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>DettachAssetGroupToInstanceResponseBody</p>
 */
public class DettachAssetGroupToInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DettachAssetGroupToInstanceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DettachAssetGroupToInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E54BA258-9DE8-59BE-B7A8-DAD28E6E8DAF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DettachAssetGroupToInstanceResponseBody build() {
            return new DettachAssetGroupToInstanceResponseBody(this);
        } 

    } 

}
