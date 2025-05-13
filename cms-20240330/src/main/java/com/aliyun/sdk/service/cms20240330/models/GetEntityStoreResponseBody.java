// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link GetEntityStoreResponseBody} extends {@link TeaModel}
 *
 * <p>GetEntityStoreResponseBody</p>
 */
public class GetEntityStoreResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("workspaceName")
    private String workspaceName;

    private GetEntityStoreResponseBody(Builder builder) {
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.workspaceName = builder.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEntityStoreResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return workspaceName
     */
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public static final class Builder {
        private String regionId; 
        private String requestId; 
        private String workspaceName; 

        private Builder() {
        } 

        private Builder(GetEntityStoreResponseBody model) {
            this.regionId = model.regionId;
            this.requestId = model.requestId;
            this.workspaceName = model.workspaceName;
        } 

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * workspaceName.
         */
        public Builder workspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }

        public GetEntityStoreResponseBody build() {
            return new GetEntityStoreResponseBody(this);
        } 

    } 

}
