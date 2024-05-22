// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDomainGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteDomainGroupResponseBody</p>
 */
public class DeleteDomainGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteDomainGroupResponseBody(Builder builder) {
        this.groupName = builder.groupName;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDomainGroupResponseBody create() {
        return builder().build();
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
        private String groupName; 
        private String requestId; 

        /**
         * The name of the domain name group.
         */
        public Builder groupName(String groupName) {
            this.groupName = groupName;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteDomainGroupResponseBody build() {
            return new DeleteDomainGroupResponseBody(this);
        } 

    } 

}
