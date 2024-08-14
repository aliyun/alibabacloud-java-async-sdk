// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProjectIdsResponseBody} extends {@link TeaModel}
 *
 * <p>ListProjectIdsResponseBody</p>
 */
public class ListProjectIdsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ProjectIds")
    private java.util.List < Long > projectIds;

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

    /**
     * @return projectIds
     */
    public java.util.List < Long > getProjectIds() {
        return this.projectIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Long > projectIds; 
        private String requestId; 

        /**
         * The IDs of the DataWorks workspaces. The IDs of the workspaces on which the desired Alibaba Cloud account has permissions were returned.
         */
        public Builder projectIds(java.util.List < Long > projectIds) {
            this.projectIds = projectIds;
            return this;
        }

        /**
         * The request ID.
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
