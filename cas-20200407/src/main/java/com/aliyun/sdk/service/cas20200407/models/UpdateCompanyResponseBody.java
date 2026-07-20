// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

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
 * {@link UpdateCompanyResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateCompanyResponseBody</p>
 */
public class UpdateCompanyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CompanyId")
    private Long companyId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateCompanyResponseBody(Builder builder) {
        this.companyId = builder.companyId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCompanyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return companyId
     */
    public Long getCompanyId() {
        return this.companyId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long companyId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(UpdateCompanyResponseBody model) {
            this.companyId = model.companyId;
            this.requestId = model.requestId;
        } 

        /**
         * CompanyId.
         */
        public Builder companyId(Long companyId) {
            this.companyId = companyId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateCompanyResponseBody build() {
            return new UpdateCompanyResponseBody(this);
        } 

    } 

}
