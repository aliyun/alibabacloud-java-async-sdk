// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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

        /**
         * <p>The ID of the workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>463497880880954XXXX</p>
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0EF298E5-0940-5AC7-9CB0-65025070XXXX</p>
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
