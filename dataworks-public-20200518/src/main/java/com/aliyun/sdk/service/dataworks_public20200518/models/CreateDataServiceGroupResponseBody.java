// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link CreateDataServiceGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDataServiceGroupResponseBody</p>
 */
public class CreateDataServiceGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateDataServiceGroupResponseBody(Builder builder) {
        this.groupId = builder.groupId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDataServiceGroupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String groupId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateDataServiceGroupResponseBody model) {
            this.groupId = model.groupId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The business process ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ds_12345</p>
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0000-ABCD-EF****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateDataServiceGroupResponseBody build() {
            return new CreateDataServiceGroupResponseBody(this);
        } 

    } 

}
