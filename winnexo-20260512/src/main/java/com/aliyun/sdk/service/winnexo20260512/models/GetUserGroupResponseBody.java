// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link GetUserGroupResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserGroupResponseBody</p>
 */
public class GetUserGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("childGroups")
    private java.util.List<?> childGroups;

    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("members")
    private java.util.List<?> members;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("parentGroup")
    private Object parentGroup;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("userGroup")
    private Object userGroup;

    private GetUserGroupResponseBody(Builder builder) {
        this.childGroups = builder.childGroups;
        this.code = builder.code;
        this.members = builder.members;
        this.message = builder.message;
        this.parentGroup = builder.parentGroup;
        this.requestId = builder.requestId;
        this.userGroup = builder.userGroup;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserGroupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return childGroups
     */
    public java.util.List<?> getChildGroups() {
        return this.childGroups;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return members
     */
    public java.util.List<?> getMembers() {
        return this.members;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return parentGroup
     */
    public Object getParentGroup() {
        return this.parentGroup;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return userGroup
     */
    public Object getUserGroup() {
        return this.userGroup;
    }

    public static final class Builder {
        private java.util.List<?> childGroups; 
        private String code; 
        private java.util.List<?> members; 
        private String message; 
        private Object parentGroup; 
        private String requestId; 
        private Object userGroup; 

        private Builder() {
        } 

        private Builder(GetUserGroupResponseBody model) {
            this.childGroups = model.childGroups;
            this.code = model.code;
            this.members = model.members;
            this.message = model.message;
            this.parentGroup = model.parentGroup;
            this.requestId = model.requestId;
            this.userGroup = model.userGroup;
        } 

        /**
         * <p><strong>The list of direct child user groups.</strong></p>
         */
        public Builder childGroups(java.util.List<?> childGroups) {
            this.childGroups = childGroups;
            return this;
        }

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p><strong>The list of direct members in the current user group.</strong></p>
         */
        public Builder members(java.util.List<?> members) {
            this.members = members;
            return this;
        }

        /**
         * <p>The description of the status code.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p><strong>The parent user group information. This is empty for the root node.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;userGroupId&quot;:&quot;b07fb0a4-0b7d-44a7-a3d5-a43a5964c8f0&quot;,&quot;userGroupName&quot;:&quot;Sales Center&quot;,&quot;parentId&quot;:null,&quot;level&quot;:1,&quot;description&quot;:&quot;Sales organization&quot;,&quot;childGroupCount&quot;:1,&quot;directMemberCount&quot;:0,&quot;sourceType&quot;:&quot;internal&quot;,&quot;externalSyncStatus&quot;:null,&quot;gmtCreate&quot;:&quot;2026-08-27T08:00:00Z&quot;,&quot;gmtModified&quot;:&quot;2026-08-27T08:00:00Z&quot;}</p>
         */
        public Builder parentGroup(Object parentGroup) {
            this.parentGroup = parentGroup;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p><strong>The target user group information.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;userGroupId&quot;:&quot;7ea8973f-7a5c-4e8a-956b-4fe0e7e2eb11&quot;,&quot;userGroupName&quot;:&quot;South China Sales&quot;,&quot;parentId&quot;:&quot;b07fb0a4-0b7d-44a7-a3d5-a43a5964c8f0&quot;,&quot;level&quot;:2,&quot;description&quot;:&quot;South China Sales organization&quot;,&quot;childGroupCount&quot;:0,&quot;directMemberCount&quot;:2,&quot;sourceType&quot;:&quot;internal&quot;,&quot;externalSyncStatus&quot;:null,&quot;gmtCreate&quot;:&quot;2026-08-27T09:00:00Z&quot;,&quot;gmtModified&quot;:&quot;2026-08-27T10:00:00Z&quot;}</p>
         */
        public Builder userGroup(Object userGroup) {
            this.userGroup = userGroup;
            return this;
        }

        public GetUserGroupResponseBody build() {
            return new GetUserGroupResponseBody(this);
        } 

    } 

}
