// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateResource02ResponseBody} extends {@link TeaModel}
 *
 * <p>CreateResource02ResponseBody</p>
 */
public class CreateResource02ResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    @NameInMap("ids")
    private String ids;

    private CreateResource02ResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.ids = builder.ids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateResource02ResponseBody create() {
        return builder().build();
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

    /**
     * @return ids
     */
    public String getIds() {
        return this.ids;
    }

    public static final class Builder {
        private String requestId; 
        private String status; 
        private String ids; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * ids.
         */
        public Builder ids(String ids) {
            this.ids = ids;
            return this;
        }

        public CreateResource02ResponseBody build() {
            return new CreateResource02ResponseBody(this);
        } 

    } 

}
