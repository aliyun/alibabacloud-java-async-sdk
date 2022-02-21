// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gws20190618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateServiceLinkedRoleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateServiceLinkedRoleResponseBody</p>
 */
public class CreateServiceLinkedRoleResponseBody extends TeaModel {
    @NameInMap("AlreadyExists")
    private Boolean alreadyExists;

    @NameInMap("RequestId")
    private String requestId;

    private CreateServiceLinkedRoleResponseBody(Builder builder) {
        this.alreadyExists = builder.alreadyExists;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateServiceLinkedRoleResponseBody create() {
        return builder().build();
    }

    /**
     * @return alreadyExists
     */
    public Boolean getAlreadyExists() {
        return this.alreadyExists;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean alreadyExists; 
        private String requestId; 

        /**
         * AlreadyExists.
         */
        public Builder alreadyExists(Boolean alreadyExists) {
            this.alreadyExists = alreadyExists;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateServiceLinkedRoleResponseBody build() {
            return new CreateServiceLinkedRoleResponseBody(this);
        } 

    } 

}
