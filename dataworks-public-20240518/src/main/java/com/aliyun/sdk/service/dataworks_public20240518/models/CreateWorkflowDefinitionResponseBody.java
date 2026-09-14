// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link CreateWorkflowDefinitionResponseBody} extends {@link TeaModel}
 *
 * <p>CreateWorkflowDefinitionResponseBody</p>
 */
public class CreateWorkflowDefinitionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateWorkflowDefinitionResponseBody(Builder builder) {
        this.id = builder.id;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWorkflowDefinitionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String id; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateWorkflowDefinitionResponseBody model) {
            this.id = model.id;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The unique identifier of the DataStudio workflow.</p>
         * <blockquote>
         * <p>Notice: This field was of the Long type in SDK versions earlier than 8.0.0 and is of the String type in SDK 8.0.0 and later. <strong>This change does not affect normal SDK usage, and the parameter is still returned in the type defined in the SDK</strong>. Only when you upgrade across SDK version 8.0.0, the type change may cause project compilation failures, and you need to manually correct the data type.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>463497880880954XXXX</p>
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The request ID. Used for locating logs and troubleshooting issues.</p>
         * 
         * <strong>example:</strong>
         * <p>0EF298E5-0940-5AC7-9CB0-6502507****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateWorkflowDefinitionResponseBody build() {
            return new CreateWorkflowDefinitionResponseBody(this);
        } 

    } 

}
