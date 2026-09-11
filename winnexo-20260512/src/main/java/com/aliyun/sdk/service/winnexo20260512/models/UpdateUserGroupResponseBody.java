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
 * {@link UpdateUserGroupResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateUserGroupResponseBody</p>
 */
public class UpdateUserGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("userGroup")
    private Object userGroup;

    private UpdateUserGroupResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.userGroup = builder.userGroup;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateUserGroupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private String code; 
        private String message; 
        private String requestId; 
        private Object userGroup; 

        private Builder() {
        } 

        private Builder(UpdateUserGroupResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.userGroup = model.userGroup;
        } 

        /**
         * <p>The business status code. A value of 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The error description. This value is empty when the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>The current zone list is illegal.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request trace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The updated user group information.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;userGroupId&quot;:&quot;7ea8973f-7a5c-4e8a-956b-4fe0e7e2eb11&quot;,&quot;userGroupName&quot;:&quot;华南销售&quot;,&quot;parentId&quot;:null,&quot;level&quot;:1,&quot;description&quot;:&quot;华南销售组织&quot;,&quot;childGroupCount&quot;:0,&quot;directMemberCount&quot;:2,&quot;sourceType&quot;:&quot;internal&quot;,&quot;externalSyncStatus&quot;:null,&quot;gmtCreate&quot;:&quot;2026-08-27T09:00:00Z&quot;,&quot;gmtModified&quot;:&quot;2026-08-27T10:00:00Z&quot;}</p>
         */
        public Builder userGroup(Object userGroup) {
            this.userGroup = userGroup;
            return this;
        }

        public UpdateUserGroupResponseBody build() {
            return new UpdateUserGroupResponseBody(this);
        } 

    } 

}
