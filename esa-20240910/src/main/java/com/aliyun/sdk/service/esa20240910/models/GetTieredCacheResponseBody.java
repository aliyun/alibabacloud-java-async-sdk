// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link GetTieredCacheResponseBody} extends {@link TeaModel}
 *
 * <p>GetTieredCacheResponseBody</p>
 */
public class GetTieredCacheResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CacheArchitectureMode")
    private String cacheArchitectureMode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetTieredCacheResponseBody(Builder builder) {
        this.cacheArchitectureMode = builder.cacheArchitectureMode;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTieredCacheResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cacheArchitectureMode
     */
    public String getCacheArchitectureMode() {
        return this.cacheArchitectureMode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String cacheArchitectureMode; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetTieredCacheResponseBody model) {
            this.cacheArchitectureMode = model.cacheArchitectureMode;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Multi-level cache architecture mode. Possible values:</p>
         * <ul>
         * <li>edge: Edge cache layer.</li>
         * <li>edge_smart: Edge cache layer + intelligent cache layer.</li>
         * <li>edge_regional: Edge cache layer + regional cache layer.</li>
         * <li>edge_regional_smart: Edge cache layer + regional cache layer + intelligent cache layer.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>edge</p>
         */
        public Builder cacheArchitectureMode(String cacheArchitectureMode) {
            this.cacheArchitectureMode = cacheArchitectureMode;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>15C66C7B-671A-4297-9187-2C4477247A74</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetTieredCacheResponseBody build() {
            return new GetTieredCacheResponseBody(this);
        } 

    } 

}
