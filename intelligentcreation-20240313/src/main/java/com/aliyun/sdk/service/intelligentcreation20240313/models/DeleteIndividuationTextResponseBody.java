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
 * {@link DeleteIndividuationTextResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteIndividuationTextResponseBody</p>
 */
public class DeleteIndividuationTextResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("desc")
    private String desc;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private DeleteIndividuationTextResponseBody(Builder builder) {
        this.desc = builder.desc;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteIndividuationTextResponseBody create() {
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

        private Builder(DeleteIndividuationTextResponseBody model) {
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
         * <p>4830493A-728F-5F19-BBCC-1443292E9C49</p>
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

        public DeleteIndividuationTextResponseBody build() {
            return new DeleteIndividuationTextResponseBody(this);
        } 

    } 

}
