// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dlfnext20250310.models;

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
 * {@link GetRegionStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetRegionStatusResponseBody</p>
 */
public class GetRegionStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("serviceRoleExists")
    private Boolean serviceRoleExists;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private GetRegionStatusResponseBody(Builder builder) {
        this.serviceRoleExists = builder.serviceRoleExists;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRegionStatusResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return serviceRoleExists
     */
    public Boolean getServiceRoleExists() {
        return this.serviceRoleExists;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private Boolean serviceRoleExists; 
        private String status; 

        private Builder() {
        } 

        private Builder(GetRegionStatusResponseBody model) {
            this.serviceRoleExists = model.serviceRoleExists;
            this.status = model.status;
        } 

        /**
         * serviceRoleExists.
         */
        public Builder serviceRoleExists(Boolean serviceRoleExists) {
            this.serviceRoleExists = serviceRoleExists;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public GetRegionStatusResponseBody build() {
            return new GetRegionStatusResponseBody(this);
        } 

    } 

}
