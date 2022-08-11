// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProjectIdsResponseBody} extends {@link TeaModel}
 *
 * <p>ListProjectIdsResponseBody</p>
 */
public class ListProjectIdsResponseBody extends TeaModel {
    @NameInMap("ProjectIds")
    private java.util.List < Long > projectIds;

    @NameInMap("RequestId")
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
         * ProjectIds.
         */
        public Builder projectIds(java.util.List < Long > projectIds) {
            this.projectIds = projectIds;
            return this;
        }

        /**
         * RequestId.
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
