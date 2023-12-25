// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InsertColumnsBeforeResponseBody} extends {@link TeaModel}
 *
 * <p>InsertColumnsBeforeResponseBody</p>
 */
public class InsertColumnsBeforeResponseBody extends TeaModel {
    @NameInMap("id")
    private String id;

    @NameInMap("requestId")
    private String requestId;

    private InsertColumnsBeforeResponseBody(Builder builder) {
        this.id = builder.id;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InsertColumnsBeforeResponseBody create() {
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
         * id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * requestId
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public InsertColumnsBeforeResponseBody build() {
            return new InsertColumnsBeforeResponseBody(this);
        } 

    } 

}
