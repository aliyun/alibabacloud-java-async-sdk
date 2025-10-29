// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link CreateHaVipResponseBody} extends {@link TeaModel}
 *
 * <p>CreateHaVipResponseBody</p>
 */
public class CreateHaVipResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("HaVipIds")
    private java.util.List<String> haVipIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateHaVipResponseBody(Builder builder) {
        this.haVipIds = builder.haVipIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateHaVipResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return haVipIds
     */
    public java.util.List<String> getHaVipIds() {
        return this.haVipIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> haVipIds; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateHaVipResponseBody model) {
            this.haVipIds = model.haVipIds;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The IDs of the HAVIPs.</p>
         */
        public Builder haVipIds(java.util.List<String> haVipIds) {
            this.haVipIds = haVipIds;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>AAE90880-4970-4D81-A534-A6C0F3631F74</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateHaVipResponseBody build() {
            return new CreateHaVipResponseBody(this);
        } 

    } 

}
