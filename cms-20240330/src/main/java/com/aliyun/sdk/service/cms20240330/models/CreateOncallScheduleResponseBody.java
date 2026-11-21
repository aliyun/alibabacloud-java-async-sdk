// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link CreateOncallScheduleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateOncallScheduleResponseBody</p>
 */
public class CreateOncallScheduleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("oncallScheduleId")
    private String oncallScheduleId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CreateOncallScheduleResponseBody(Builder builder) {
        this.oncallScheduleId = builder.oncallScheduleId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOncallScheduleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return oncallScheduleId
     */
    public String getOncallScheduleId() {
        return this.oncallScheduleId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String oncallScheduleId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateOncallScheduleResponseBody model) {
            this.oncallScheduleId = model.oncallScheduleId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The unique identifier of the on-call schedule.</p>
         * 
         * <strong>example:</strong>
         * <p>testOncallScheduleId</p>
         */
        public Builder oncallScheduleId(String oncallScheduleId) {
            this.oncallScheduleId = oncallScheduleId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>3B311FD9-A60B-55E0-A896-A0C73*********</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateOncallScheduleResponseBody build() {
            return new CreateOncallScheduleResponseBody(this);
        } 

    } 

}
