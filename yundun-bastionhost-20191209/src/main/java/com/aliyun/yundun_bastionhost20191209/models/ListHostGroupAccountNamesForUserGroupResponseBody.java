// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListHostGroupAccountNamesForUserGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ListHostGroupAccountNamesForUserGroupResponseBody</p>
 */
public class ListHostGroupAccountNamesForUserGroupResponseBody extends TeaModel {
    @NameInMap("HostAccountNames")
    private java.util.List < String > hostAccountNames;

    @NameInMap("RequestId")
    private String requestId;


    private ListHostGroupAccountNamesForUserGroupResponseBody(Builder builder) {
        this.hostAccountNames = builder.hostAccountNames;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHostGroupAccountNamesForUserGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return hostAccountNames
     */
    public java.util.List < String > getHostAccountNames() {
        return this.hostAccountNames;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > hostAccountNames; 
        private String requestId; 

        /**
         * <p>HostAccountNames.</p>
         */
        public Builder hostAccountNames(java.util.List < String > hostAccountNames) {
            this.hostAccountNames = hostAccountNames;
            return this;
        }

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListHostGroupAccountNamesForUserGroupResponseBody build() {
            return new ListHostGroupAccountNamesForUserGroupResponseBody(this);
        } 

    } 

}
