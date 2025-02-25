// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

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
 * {@link CreateSlrRoleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSlrRoleResponseBody</p>
 */
public class CreateSlrRoleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("HasPermission")
    private Boolean hasPermission;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>Indicates whether the service-linked role was created. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder hasPermission(Boolean hasPermission) {
            this.hasPermission = hasPermission;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>208B016D-4CB9-4A85-96A5-0B8ED1EBF271</p>
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
