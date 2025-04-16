// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link CreatePortRangeListResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePortRangeListResponseBody</p>
 */
public class CreatePortRangeListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PortRangeListId")
    private String portRangeListId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreatePortRangeListResponseBody(Builder builder) {
        this.portRangeListId = builder.portRangeListId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePortRangeListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return portRangeListId
     */
    public String getPortRangeListId() {
        return this.portRangeListId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String portRangeListId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreatePortRangeListResponseBody model) {
            this.portRangeListId = model.portRangeListId;
            this.requestId = model.requestId;
        } 

        /**
         * PortRangeListId.
         */
        public Builder portRangeListId(String portRangeListId) {
            this.portRangeListId = portRangeListId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreatePortRangeListResponseBody build() {
            return new CreatePortRangeListResponseBody(this);
        } 

    } 

}
