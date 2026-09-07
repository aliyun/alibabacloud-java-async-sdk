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
 * {@link CreateCompanyResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCompanyResponseBody</p>
 */
public class CreateCompanyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CompanyId")
    private Long companyId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateCompanyResponseBody(Builder builder) {
        this.companyId = builder.companyId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCompanyResponseBody create() {
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

        private Builder(CreateCompanyResponseBody model) {
            this.companyId = model.companyId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The company ID.</p>
         * 
         * <strong>example:</strong>
         * <p>51001</p>
         */
        public Builder companyId(Long companyId) {
            this.companyId = companyId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>838603C0-72A1-5070-A2E6-16E43861DB71</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateCompanyResponseBody build() {
            return new CreateCompanyResponseBody(this);
        } 

    } 

}
