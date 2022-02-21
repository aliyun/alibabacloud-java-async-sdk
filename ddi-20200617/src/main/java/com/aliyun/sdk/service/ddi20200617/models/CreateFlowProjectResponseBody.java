// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddi20200617.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFlowProjectResponseBody} extends {@link TeaModel}
 *
 * <p>CreateFlowProjectResponseBody</p>
 */
public class CreateFlowProjectResponseBody extends TeaModel {
    @NameInMap("Id")
    private String id;

    @NameInMap("RequestId")
    private String requestId;

    private CreateFlowProjectResponseBody(Builder builder) {
        this.id = builder.id;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFlowProjectResponseBody create() {
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
         * 项目ID
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * 请求ID
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateFlowProjectResponseBody build() {
            return new CreateFlowProjectResponseBody(this);
        } 

    } 

}
