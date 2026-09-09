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
 * {@link GetApplicationProvisioningUserPrimaryOrganizationalUnitResponseBody} extends {@link TeaModel}
 *
 * <p>GetApplicationProvisioningUserPrimaryOrganizationalUnitResponseBody</p>
 */
public class GetApplicationProvisioningUserPrimaryOrganizationalUnitResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UserPrimaryOrganizationalUnitId")
    private String userPrimaryOrganizationalUnitId;

    private GetApplicationProvisioningUserPrimaryOrganizationalUnitResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.userPrimaryOrganizationalUnitId = builder.userPrimaryOrganizationalUnitId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetApplicationProvisioningUserPrimaryOrganizationalUnitResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return userPrimaryOrganizationalUnitId
     */
    public String getUserPrimaryOrganizationalUnitId() {
        return this.userPrimaryOrganizationalUnitId;
    }

    public static final class Builder {
        private String requestId; 
        private String userPrimaryOrganizationalUnitId; 

        private Builder() {
        } 

        private Builder(GetApplicationProvisioningUserPrimaryOrganizationalUnitResponseBody model) {
            this.requestId = model.requestId;
            this.userPrimaryOrganizationalUnitId = model.userPrimaryOrganizationalUnitId;
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

        /**
         * <p>The user\&quot;s primary organizational unit for application synchronization.</p>
         * 
         * <strong>example:</strong>
         * <p>ou_12121xxxxxx</p>
         */
        public Builder userPrimaryOrganizationalUnitId(String userPrimaryOrganizationalUnitId) {
            this.userPrimaryOrganizationalUnitId = userPrimaryOrganizationalUnitId;
            return this;
        }

        public GetApplicationProvisioningUserPrimaryOrganizationalUnitResponseBody build() {
            return new GetApplicationProvisioningUserPrimaryOrganizationalUnitResponseBody(this);
        } 

    } 

}
