// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

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
 * {@link ListHostGroupAccountNamesForUserResponseBody} extends {@link TeaModel}
 *
 * <p>ListHostGroupAccountNamesForUserResponseBody</p>
 */
public class ListHostGroupAccountNamesForUserResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("HostAccountNames")
    private java.util.List<String> hostAccountNames;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListHostGroupAccountNamesForUserResponseBody(Builder builder) {
        this.hostAccountNames = builder.hostAccountNames;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHostGroupAccountNamesForUserResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hostAccountNames
     */
    public java.util.List<String> getHostAccountNames() {
        return this.hostAccountNames;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> hostAccountNames; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListHostGroupAccountNamesForUserResponseBody model) {
            this.hostAccountNames = model.hostAccountNames;
            this.requestId = model.requestId;
        } 

        /**
         * <p>An array that consists of the names of host accounts.</p>
         */
        public Builder hostAccountNames(java.util.List<String> hostAccountNames) {
            this.hostAccountNames = hostAccountNames;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>EC9BF0F4-8983-491A-BC8C-1B4DD94976DE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListHostGroupAccountNamesForUserResponseBody build() {
            return new ListHostGroupAccountNamesForUserResponseBody(this);
        } 

    } 

}
