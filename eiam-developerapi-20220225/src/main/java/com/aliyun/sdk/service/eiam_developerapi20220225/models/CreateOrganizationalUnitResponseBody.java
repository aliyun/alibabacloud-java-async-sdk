// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam_developerapi20220225.models;

import com.aliyun.sdk.gateway.eiam.dev.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eiam.dev.models.*;

/**
 * 
 * {@link CreateOrganizationalUnitResponseBody} extends {@link TeaModel}
 *
 * <p>CreateOrganizationalUnitResponseBody</p>
 */
public class CreateOrganizationalUnitResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("organizationalUnitId")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return organizationalUnitId
     */
    public String getOrganizationalUnitId() {
        return this.organizationalUnitId;
    }

    public static final class Builder {
        private String organizationalUnitId; 

        private Builder() {
        } 

        private Builder(CreateOrganizationalUnitResponseBody model) {
            this.organizationalUnitId = model.organizationalUnitId;
        } 

        /**
         * <p>The ID of the organizational unit.</p>
         * 
         * <strong>example:</strong>
         * <p>ou_wovwffm62xifdziem7an7xxxxx</p>
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
