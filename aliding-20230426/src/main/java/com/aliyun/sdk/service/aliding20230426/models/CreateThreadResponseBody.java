// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

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
 * {@link CreateThreadResponseBody} extends {@link TeaModel}
 *
 * <p>CreateThreadResponseBody</p>
 */
public class CreateThreadResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("createAt")
    private Long createAt;

    @com.aliyun.core.annotation.NameInMap("id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("metadata")
    private java.util.Map<String, ?> metadata;

    @com.aliyun.core.annotation.NameInMap("object")
    private String object;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CreateThreadResponseBody(Builder builder) {
        this.createAt = builder.createAt;
        this.id = builder.id;
        this.metadata = builder.metadata;
        this.object = builder.object;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateThreadResponseBody create() {
        return builder().build();
    }

    /**
     * @return createAt
     */
    public Long getCreateAt() {
        return this.createAt;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return metadata
     */
    public java.util.Map<String, ?> getMetadata() {
        return this.metadata;
    }

    /**
     * @return object
     */
    public String getObject() {
        return this.object;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long createAt; 
        private String id; 
        private java.util.Map<String, ?> metadata; 
        private String object; 
        private String requestId; 

        /**
         * createAt.
         */
        public Builder createAt(Long createAt) {
            this.createAt = createAt;
            return this;
        }

        /**
         * id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * metadata.
         */
        public Builder metadata(java.util.Map<String, ?> metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * object.
         */
        public Builder object(String object) {
            this.object = object;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateThreadResponseBody build() {
            return new CreateThreadResponseBody(this);
        } 

    } 

}
