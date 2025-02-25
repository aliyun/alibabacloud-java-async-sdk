// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link CreateOrganizationalUnitResponseBody} extends {@link TeaModel}
 *
 * <p>CreateOrganizationalUnitResponseBody</p>
 */
public class CreateOrganizationalUnitResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OrganizationalUnitId")
    private String organizationalUnitId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The organization ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ou_wovwffm62xifdziem7an7xxxxx</p>
         */
        public Builder organizationalUnitId(String organizationalUnitId) {
            this.organizationalUnitId = organizationalUnitId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
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
