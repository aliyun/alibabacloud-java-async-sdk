// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link PageListAppInstanceGroupUserResponseBody} extends {@link TeaModel}
 *
 * <p>PageListAppInstanceGroupUserResponseBody</p>
 */
public class PageListAppInstanceGroupUserResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Users")
    private java.util.List<String> users;

    private PageListAppInstanceGroupUserResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.users = builder.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PageListAppInstanceGroupUserResponseBody create() {
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
     * @return users
     */
    public java.util.List<String> getUsers() {
        return this.users;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<String> users; 

        private Builder() {
        } 

        private Builder(PageListAppInstanceGroupUserResponseBody model) {
            this.requestId = model.requestId;
            this.users = model.users;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The users.</p>
         */
        public Builder users(java.util.List<String> users) {
            this.users = users;
            return this;
        }

        public PageListAppInstanceGroupUserResponseBody build() {
            return new PageListAppInstanceGroupUserResponseBody(this);
        } 

    } 

}
