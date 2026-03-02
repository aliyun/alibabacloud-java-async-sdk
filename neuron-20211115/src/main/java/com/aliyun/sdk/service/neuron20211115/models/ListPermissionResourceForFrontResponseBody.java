// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link ListPermissionResourceForFrontResponseBody} extends {@link TeaModel}
 *
 * <p>ListPermissionResourceForFrontResponseBody</p>
 */
public class ListPermissionResourceForFrontResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resourceList")
    private java.util.List<String> resourceList;

    private ListPermissionResourceForFrontResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourceList = builder.resourceList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPermissionResourceForFrontResponseBody create() {
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
     * @return resourceList
     */
    public java.util.List<String> getResourceList() {
        return this.resourceList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<String> resourceList; 

        private Builder() {
        } 

        private Builder(ListPermissionResourceForFrontResponseBody model) {
            this.requestId = model.requestId;
            this.resourceList = model.resourceList;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>1D4A64A4-18AB-52CF-AB79-517AEC7DC63B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * resourceList.
         */
        public Builder resourceList(java.util.List<String> resourceList) {
            this.resourceList = resourceList;
            return this;
        }

        public ListPermissionResourceForFrontResponseBody build() {
            return new ListPermissionResourceForFrontResponseBody(this);
        } 

    } 

}
