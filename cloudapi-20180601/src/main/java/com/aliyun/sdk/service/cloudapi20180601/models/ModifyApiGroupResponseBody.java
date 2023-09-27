// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20180601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyApiGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyApiGroupResponseBody</p>
 */
public class ModifyApiGroupResponseBody extends TeaModel {
    @NameInMap("Description")
    private String description;

    @NameInMap("GroupId")
    private String groupId;

    @NameInMap("GroupName")
    private String groupName;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SubDomain")
    private String subDomain;

    private ModifyApiGroupResponseBody(Builder builder) {
        this.description = builder.description;
        this.groupId = builder.groupId;
        this.groupName = builder.groupName;
        this.requestId = builder.requestId;
        this.subDomain = builder.subDomain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyApiGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
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

    /**
     * @return subDomain
     */
    public String getSubDomain() {
        return this.subDomain;
    }

    public static final class Builder {
        private String description; 
        private String groupId; 
        private String groupName; 
        private String requestId; 
        private String subDomain; 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * GroupName.
         */
        public Builder groupName(String groupName) {
            this.groupName = groupName;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SubDomain.
         */
        public Builder subDomain(String subDomain) {
            this.subDomain = subDomain;
            return this;
        }

        public ModifyApiGroupResponseBody build() {
            return new ModifyApiGroupResponseBody(this);
        } 

    } 

}
