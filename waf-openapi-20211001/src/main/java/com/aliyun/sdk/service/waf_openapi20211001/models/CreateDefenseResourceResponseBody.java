// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link CreateDefenseResourceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDefenseResourceResponseBody</p>
 */
public class CreateDefenseResourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Resource")
    private String resource;

    private CreateDefenseResourceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resource = builder.resource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDefenseResourceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resource
     */
    public String getResource() {
        return this.resource;
    }

    public static final class Builder {
        private String requestId; 
        private String resource; 

        private Builder() {
        } 

        private Builder(CreateDefenseResourceResponseBody model) {
            this.requestId = model.requestId;
            this.resource = model.resource;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Resource.
         */
        public Builder resource(String resource) {
            this.resource = resource;
            return this;
        }

        public CreateDefenseResourceResponseBody build() {
            return new CreateDefenseResourceResponseBody(this);
        } 

    } 

}
