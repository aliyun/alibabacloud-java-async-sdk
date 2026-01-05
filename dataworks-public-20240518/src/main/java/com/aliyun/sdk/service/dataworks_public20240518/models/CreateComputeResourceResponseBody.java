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
 * {@link CreateComputeResourceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateComputeResourceResponseBody</p>
 */
public class CreateComputeResourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateComputeResourceResponseBody(Builder builder) {
        this.id = builder.id;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateComputeResourceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long id; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateComputeResourceResponseBody model) {
            this.id = model.id;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Returns the ID of the created computing resource.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The request ID. You can use the request ID to locate logs and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>22C97E95-F023-56B5-8852-B1A77A17XXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateComputeResourceResponseBody build() {
            return new CreateComputeResourceResponseBody(this);
        } 

    } 

}
