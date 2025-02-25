// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

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
 * {@link AddWorkspaceMembersResponseBody} extends {@link TeaModel}
 *
 * <p>AddWorkspaceMembersResponseBody</p>
 */
public class AddWorkspaceMembersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NotInOrgList")
    private java.util.List<String> notInOrgList;

    @com.aliyun.core.annotation.NameInMap("requestId")
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
    public java.util.List<String> getNotInOrgList() {
        return this.notInOrgList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> notInOrgList; 
        private String requestId; 

        /**
         * NotInOrgList.
         */
        public Builder notInOrgList(java.util.List<String> notInOrgList) {
            this.notInOrgList = notInOrgList;
            return this;
        }

        /**
         * <p>requestId</p>
         * 
         * <strong>example:</strong>
         * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
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
