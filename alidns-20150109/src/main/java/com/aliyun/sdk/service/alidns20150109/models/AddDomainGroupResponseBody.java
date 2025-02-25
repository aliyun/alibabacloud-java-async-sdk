// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link AddDomainGroupResponseBody} extends {@link TeaModel}
 *
 * <p>AddDomainGroupResponseBody</p>
 */
public class AddDomainGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AddDomainGroupResponseBody(Builder builder) {
        this.groupId = builder.groupId;
        this.groupName = builder.groupName;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddDomainGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String groupId; 
        private String groupName; 
        private String requestId; 

        /**
         * <p>The ID of the domain name group.</p>
         * 
         * <strong>example:</strong>
         * <p>2223</p>
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The name of the domain name group.</p>
         * 
         * <strong>example:</strong>
         * <p>NewName</p>
         */
        public Builder groupName(String groupName) {
            this.groupName = groupName;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>536E9CAD-DB30-4647-AC87-AA5CC38C5382</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddDomainGroupResponseBody build() {
            return new AddDomainGroupResponseBody(this);
        } 

    } 

}
