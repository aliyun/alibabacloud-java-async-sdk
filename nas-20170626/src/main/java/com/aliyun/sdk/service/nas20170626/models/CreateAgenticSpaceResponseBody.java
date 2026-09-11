// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

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
 * {@link CreateAgenticSpaceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAgenticSpaceResponseBody</p>
 */
public class CreateAgenticSpaceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AgenticSpaceId")
    private String agenticSpaceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateAgenticSpaceResponseBody(Builder builder) {
        this.agenticSpaceId = builder.agenticSpaceId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAgenticSpaceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agenticSpaceId
     */
    public String getAgenticSpaceId() {
        return this.agenticSpaceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String agenticSpaceId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateAgenticSpaceResponseBody model) {
            this.agenticSpaceId = model.agenticSpaceId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The Agentic space ID. This is a globally unique identifier assigned by the system after the Agentic space (an independent workspace allocated to a single agent end user in AgenticFS) is created.</p>
         * 
         * <strong>example:</strong>
         * <p>agentic-229oypxjgpau2****</p>
         */
        public Builder agenticSpaceId(String agenticSpaceId) {
            this.agenticSpaceId = agenticSpaceId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>98696EF0-1607-4E9D-B01D-F20930B6****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateAgenticSpaceResponseBody build() {
            return new CreateAgenticSpaceResponseBody(this);
        } 

    } 

}
