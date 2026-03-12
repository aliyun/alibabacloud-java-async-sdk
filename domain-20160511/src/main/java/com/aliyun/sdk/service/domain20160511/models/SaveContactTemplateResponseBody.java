// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20160511.models;

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
 * {@link SaveContactTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>SaveContactTemplateResponseBody</p>
 */
public class SaveContactTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ContactTemplateId")
    private Long contactTemplateId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private SaveContactTemplateResponseBody(Builder builder) {
        this.contactTemplateId = builder.contactTemplateId;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveContactTemplateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contactTemplateId
     */
    public Long getContactTemplateId() {
        return this.contactTemplateId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Long contactTemplateId; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(SaveContactTemplateResponseBody model) {
            this.contactTemplateId = model.contactTemplateId;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * ContactTemplateId.
         */
        public Builder contactTemplateId(Long contactTemplateId) {
            this.contactTemplateId = contactTemplateId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public SaveContactTemplateResponseBody build() {
            return new SaveContactTemplateResponseBody(this);
        } 

    } 

}
