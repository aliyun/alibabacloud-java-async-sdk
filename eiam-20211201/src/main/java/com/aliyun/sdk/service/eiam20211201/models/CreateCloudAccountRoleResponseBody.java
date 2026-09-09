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
 * {@link CreateCloudAccountRoleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCloudAccountRoleResponseBody</p>
 */
public class CreateCloudAccountRoleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CloudAccountRoleId")
    private String cloudAccountRoleId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateCloudAccountRoleResponseBody(Builder builder) {
        this.cloudAccountRoleId = builder.cloudAccountRoleId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCloudAccountRoleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cloudAccountRoleId
     */
    public String getCloudAccountRoleId() {
        return this.cloudAccountRoleId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String cloudAccountRoleId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateCloudAccountRoleResponseBody model) {
            this.cloudAccountRoleId = model.cloudAccountRoleId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the cloud role.</p>
         * 
         * <strong>example:</strong>
         * <p>carole_01kmek49aqxxxx</p>
         */
        public Builder cloudAccountRoleId(String cloudAccountRoleId) {
            this.cloudAccountRoleId = cloudAccountRoleId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateCloudAccountRoleResponseBody build() {
            return new CreateCloudAccountRoleResponseBody(this);
        } 

    } 

}
