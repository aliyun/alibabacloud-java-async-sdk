// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link ListResourceGroupAssociateProjectsResponseBody} extends {@link TeaModel}
 *
 * <p>ListResourceGroupAssociateProjectsResponseBody</p>
 */
public class ListResourceGroupAssociateProjectsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ProjectIdList")
    private java.util.List<Long> projectIdList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListResourceGroupAssociateProjectsResponseBody(Builder builder) {
        this.projectIdList = builder.projectIdList;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourceGroupAssociateProjectsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return projectIdList
     */
    public java.util.List<Long> getProjectIdList() {
        return this.projectIdList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private java.util.List<Long> projectIdList; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListResourceGroupAssociateProjectsResponseBody model) {
            this.projectIdList = model.projectIdList;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The list of workspace IDs.</p>
         */
        public Builder projectIdList(java.util.List<Long> projectIdList) {
            this.projectIdList = projectIdList;
            return this;
        }

        /**
         * <p>The request ID. You can use this ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>6A6CBE87-9F91-1323-B680-E7A7065XXXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListResourceGroupAssociateProjectsResponseBody build() {
            return new ListResourceGroupAssociateProjectsResponseBody(this);
        } 

    } 

}
