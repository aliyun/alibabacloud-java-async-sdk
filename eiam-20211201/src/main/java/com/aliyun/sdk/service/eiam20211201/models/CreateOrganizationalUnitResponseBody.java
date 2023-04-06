// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOrganizationalUnitResponseBody} extends {@link TeaModel}
 *
 * <p>CreateOrganizationalUnitResponseBody</p>
 */
public class CreateOrganizationalUnitResponseBody extends TeaModel {
    @NameInMap("OrganizationalUnitId")
    private String organizationalUnitId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateOrganizationalUnitResponseBody(Builder builder) {
        this.organizationalUnitId = builder.organizationalUnitId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOrganizationalUnitResponseBody create() {
        return builder().build();
    }

    /**
     * @return organizationalUnitId
     */
    public String getOrganizationalUnitId() {
        return this.organizationalUnitId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String organizationalUnitId; 
        private String requestId; 

        /**
         * 组织ID
         */
        public Builder organizationalUnitId(String organizationalUnitId) {
            this.organizationalUnitId = organizationalUnitId;
            return this;
        }

        /**
         * 请求ID。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateOrganizationalUnitResponseBody build() {
            return new CreateOrganizationalUnitResponseBody(this);
        } 

    } 

}
