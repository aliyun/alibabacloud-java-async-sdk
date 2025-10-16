// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link CreateAclCheckResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAclCheckResponseBody</p>
 */
public class CreateAclCheckResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskIds")
    private java.util.List<String> taskIds;

    private CreateAclCheckResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.taskIds = builder.taskIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAclCheckResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskIds
     */
    public java.util.List<String> getTaskIds() {
        return this.taskIds;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<String> taskIds; 

        private Builder() {
        } 

        private Builder(CreateAclCheckResponseBody model) {
            this.requestId = model.requestId;
            this.taskIds = model.taskIds;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TaskIds.
         */
        public Builder taskIds(java.util.List<String> taskIds) {
            this.taskIds = taskIds;
            return this;
        }

        public CreateAclCheckResponseBody build() {
            return new CreateAclCheckResponseBody(this);
        } 

    } 

}
