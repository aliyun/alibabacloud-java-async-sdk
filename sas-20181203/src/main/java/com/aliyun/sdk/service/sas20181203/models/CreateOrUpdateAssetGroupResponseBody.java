// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link CreateOrUpdateAssetGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateOrUpdateAssetGroupResponseBody</p>
 */
public class CreateOrUpdateAssetGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private Long groupId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateOrUpdateAssetGroupResponseBody model) {
            this.groupId = model.groupId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the server group.</p>
         * 
         * <strong>example:</strong>
         * <p>9935302</p>
         */
        public Builder groupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>E70074C8-DFB4-44C5-96C7-909DD231D68A</p>
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
