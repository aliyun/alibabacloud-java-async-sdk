// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOrUpdateAssetGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateOrUpdateAssetGroupResponseBody</p>
 */
public class CreateOrUpdateAssetGroupResponseBody extends TeaModel {
    @NameInMap("GroupId")
    private Long groupId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateOrUpdateAssetGroupResponseBody(Builder builder) {
        this.groupId = builder.groupId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOrUpdateAssetGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return groupId
     */
    public Long getGroupId() {
        return this.groupId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long groupId; 
        private String requestId; 

        /**
         * GroupId.
         */
        public Builder groupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateOrUpdateAssetGroupResponseBody build() {
            return new CreateOrUpdateAssetGroupResponseBody(this);
        } 

    } 

}
