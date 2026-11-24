// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link AddKnowledgeFileResponseBody} extends {@link TeaModel}
 *
 * <p>AddKnowledgeFileResponseBody</p>
 */
public class AddKnowledgeFileResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("Location")
    private String location;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AddKnowledgeFileResponseBody(Builder builder) {
        this.id = builder.id;
        this.location = builder.location;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddKnowledgeFileResponseBody create() {
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
     * @return location
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long id; 
        private String location; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(AddKnowledgeFileResponseBody model) {
            this.id = model.id;
            this.location = model.location;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the imported file.</p>
         * 
         * <strong>example:</strong>
         * <p>2059412857631539200</p>
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The location of the imported file.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket_name/path/to/file</p>
         */
        public Builder location(String location) {
            this.location = location;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddKnowledgeFileResponseBody build() {
            return new AddKnowledgeFileResponseBody(this);
        } 

    } 

}
