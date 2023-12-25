// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddWorkspaceMembersResponseBody} extends {@link TeaModel}
 *
 * <p>AddWorkspaceMembersResponseBody</p>
 */
public class AddWorkspaceMembersResponseBody extends TeaModel {
    @NameInMap("NotInOrgList")
    private java.util.List < String > notInOrgList;

    @NameInMap("requestId")
    private String requestId;

    private AddWorkspaceMembersResponseBody(Builder builder) {
        this.notInOrgList = builder.notInOrgList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddWorkspaceMembersResponseBody create() {
        return builder().build();
    }

    /**
     * @return notInOrgList
     */
    public java.util.List < String > getNotInOrgList() {
        return this.notInOrgList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > notInOrgList; 
        private String requestId; 

        /**
         * NotInOrgList.
         */
        public Builder notInOrgList(java.util.List < String > notInOrgList) {
            this.notInOrgList = notInOrgList;
            return this;
        }

        /**
         * requestId
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddWorkspaceMembersResponseBody build() {
            return new AddWorkspaceMembersResponseBody(this);
        } 

    } 

}
