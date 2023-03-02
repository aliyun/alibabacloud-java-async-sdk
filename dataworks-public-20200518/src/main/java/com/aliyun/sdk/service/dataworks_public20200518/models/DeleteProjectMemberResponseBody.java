// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteProjectMemberResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteProjectMemberResponseBody</p>
 */
public class DeleteProjectMemberResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteProjectMemberResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteProjectMemberResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * The ID of the region.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteProjectMemberResponseBody build() {
            return new DeleteProjectMemberResponseBody(this);
        } 

    } 

}
