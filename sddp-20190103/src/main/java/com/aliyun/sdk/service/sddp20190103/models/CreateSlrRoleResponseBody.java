// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSlrRoleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSlrRoleResponseBody</p>
 */
public class CreateSlrRoleResponseBody extends TeaModel {
    @NameInMap("HasPermission")
    private Boolean hasPermission;

    @NameInMap("RequestId")
    private String requestId;

    private CreateSlrRoleResponseBody(Builder builder) {
        this.hasPermission = builder.hasPermission;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSlrRoleResponseBody create() {
        return builder().build();
    }

    /**
     * @return hasPermission
     */
    public Boolean getHasPermission() {
        return this.hasPermission;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean hasPermission; 
        private String requestId; 

        /**
         * HasPermission.
         */
        public Builder hasPermission(Boolean hasPermission) {
            this.hasPermission = hasPermission;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateSlrRoleResponseBody build() {
            return new CreateSlrRoleResponseBody(this);
        } 

    } 

}
