// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteTemplateQuotaItemResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteTemplateQuotaItemResponseBody</p>
 */
public class DeleteTemplateQuotaItemResponseBody extends TeaModel {
    @NameInMap("Id")
    private String id;

    @NameInMap("RequestId")
    private String requestId;

    private DeleteTemplateQuotaItemResponseBody(Builder builder) {
        this.id = builder.id;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTemplateQuotaItemResponseBody create() {
        return builder().build();
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String id; 
        private String requestId; 

        /**
         * The ID of the quota template.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteTemplateQuotaItemResponseBody build() {
            return new DeleteTemplateQuotaItemResponseBody(this);
        } 

    } 

}
