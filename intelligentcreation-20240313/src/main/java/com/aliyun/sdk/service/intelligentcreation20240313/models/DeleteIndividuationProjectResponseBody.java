// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link DeleteIndividuationProjectResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteIndividuationProjectResponseBody</p>
 */
public class DeleteIndividuationProjectResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("desc")
    private String desc;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private DeleteIndividuationProjectResponseBody(Builder builder) {
        this.desc = builder.desc;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteIndividuationProjectResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return desc
     */
    public String getDesc() {
        return this.desc;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String desc; 
        private String requestId; 
        private String status; 

        private Builder() {
        } 

        private Builder(DeleteIndividuationProjectResponseBody model) {
            this.desc = model.desc;
            this.requestId = model.requestId;
            this.status = model.status;
        } 

        /**
         * desc.
         */
        public Builder desc(String desc) {
            this.desc = desc;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>86A90C40-D1AB-50DA-A4B1-0D545F80F2FE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public DeleteIndividuationProjectResponseBody build() {
            return new DeleteIndividuationProjectResponseBody(this);
        } 

    } 

}
