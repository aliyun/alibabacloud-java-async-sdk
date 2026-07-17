// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260319.models;

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
 * {@link CreateYikeEditingProjectResponseBody} extends {@link TeaModel}
 *
 * <p>CreateYikeEditingProjectResponseBody</p>
 */
public class CreateYikeEditingProjectResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EditingProjectId")
    private String editingProjectId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateYikeEditingProjectResponseBody(Builder builder) {
        this.editingProjectId = builder.editingProjectId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateYikeEditingProjectResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return editingProjectId
     */
    public String getEditingProjectId() {
        return this.editingProjectId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String editingProjectId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateYikeEditingProjectResponseBody model) {
            this.editingProjectId = model.editingProjectId;
            this.requestId = model.requestId;
        } 

        /**
         * EditingProjectId.
         */
        public Builder editingProjectId(String editingProjectId) {
            this.editingProjectId = editingProjectId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateYikeEditingProjectResponseBody build() {
            return new CreateYikeEditingProjectResponseBody(this);
        } 

    } 

}
