// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link CreatePrivilegeResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePrivilegeResponseBody</p>
 */
public class CreatePrivilegeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("list")
    private java.util.List<Privilege> list;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CreatePrivilegeResponseBody(Builder builder) {
        this.list = builder.list;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePrivilegeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return list
     */
    public java.util.List<Privilege> getList() {
        return this.list;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Privilege> list; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreatePrivilegeResponseBody model) {
            this.list = model.list;
            this.requestId = model.requestId;
        } 

        /**
         * list.
         */
        public Builder list(java.util.List<Privilege> list) {
            this.list = list;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreatePrivilegeResponseBody build() {
            return new CreatePrivilegeResponseBody(this);
        } 

    } 

}
