// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link GetVodPackagingGroupResponseBody} extends {@link TeaModel}
 *
 * <p>GetVodPackagingGroupResponseBody</p>
 */
public class GetVodPackagingGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PackagingGroup")
    private VodPackagingGroup packagingGroup;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetVodPackagingGroupResponseBody(Builder builder) {
        this.packagingGroup = builder.packagingGroup;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVodPackagingGroupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return packagingGroup
     */
    public VodPackagingGroup getPackagingGroup() {
        return this.packagingGroup;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private VodPackagingGroup packagingGroup; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetVodPackagingGroupResponseBody model) {
            this.packagingGroup = model.packagingGroup;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the packaging group.</p>
         */
        public Builder packagingGroup(VodPackagingGroup packagingGroup) {
            this.packagingGroup = packagingGroup;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>36-3C1E-4417-BDB2-1E034F</strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetVodPackagingGroupResponseBody build() {
            return new GetVodPackagingGroupResponseBody(this);
        } 

    } 

}
