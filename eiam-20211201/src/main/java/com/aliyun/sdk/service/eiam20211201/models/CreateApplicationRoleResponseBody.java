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
 * {@link CreateApplicationRoleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateApplicationRoleResponseBody</p>
 */
public class CreateApplicationRoleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationRoleId")
    private String applicationRoleId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateApplicationRoleResponseBody(Builder builder) {
        this.applicationRoleId = builder.applicationRoleId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateApplicationRoleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationRoleId
     */
    public String getApplicationRoleId() {
        return this.applicationRoleId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String applicationRoleId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateApplicationRoleResponseBody model) {
            this.applicationRoleId = model.applicationRoleId;
            this.requestId = model.requestId;
        } 

        /**
         * ApplicationRoleId.
         */
        public Builder applicationRoleId(String applicationRoleId) {
            this.applicationRoleId = applicationRoleId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateApplicationRoleResponseBody build() {
            return new CreateApplicationRoleResponseBody(this);
        } 

    } 

}
