// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link CreateProjectRoleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateProjectRoleResponseBody</p>
 */
public class CreateProjectRoleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateProjectRoleResponseBody(Builder builder) {
        this.code = builder.code;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProjectRoleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateProjectRoleResponseBody model) {
            this.code = model.code;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The unique identifier of the role.</p>
         * 
         * <strong>example:</strong>
         * <p>base_role_dte</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The request ID, which is used to locate logs and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>B313938A-4475-599B-98EB-A0875019FD5B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateProjectRoleResponseBody build() {
            return new CreateProjectRoleResponseBody(this);
        } 

    } 

}
