// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam_developerapi20220225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eiam.dev.models.*;

/**
 * {@link CreateOrganizationalUnitResponseBody} extends {@link TeaModel}
 *
 * <p>CreateOrganizationalUnitResponseBody</p>
 */
public class CreateOrganizationalUnitResponseBody extends TeaModel {
    @NameInMap("organizationalUnitId")
    private String organizationalUnitId;

    private CreateOrganizationalUnitResponseBody(Builder builder) {
        this.organizationalUnitId = builder.organizationalUnitId;
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

    public static final class Builder {
        private String organizationalUnitId; 

        /**
         * organizationalUnitId.
         */
        public Builder organizationalUnitId(String organizationalUnitId) {
            this.organizationalUnitId = organizationalUnitId;
            return this;
        }

        public CreateOrganizationalUnitResponseBody build() {
            return new CreateOrganizationalUnitResponseBody(this);
        } 

    } 

}
