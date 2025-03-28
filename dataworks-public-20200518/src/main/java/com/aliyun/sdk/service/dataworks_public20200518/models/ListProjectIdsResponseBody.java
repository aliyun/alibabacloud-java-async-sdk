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
 * {@link ListProjectIdsResponseBody} extends {@link TeaModel}
 *
 * <p>ListProjectIdsResponseBody</p>
 */
public class ListProjectIdsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ProjectIds")
    private java.util.List<Long> projectIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListProjectIdsResponseBody(Builder builder) {
        this.projectIds = builder.projectIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProjectIdsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return projectIds
     */
    public java.util.List<Long> getProjectIds() {
        return this.projectIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Long> projectIds; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListProjectIdsResponseBody model) {
            this.projectIds = model.projectIds;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The IDs of the DataWorks workspaces. The IDs of the workspaces on which the desired Alibaba Cloud account has permissions were returned.</p>
         */
        public Builder projectIds(java.util.List<Long> projectIds) {
            this.projectIds = projectIds;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0b57ff7216278945532771749d****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListProjectIdsResponseBody build() {
            return new ListProjectIdsResponseBody(this);
        } 

    } 

}
