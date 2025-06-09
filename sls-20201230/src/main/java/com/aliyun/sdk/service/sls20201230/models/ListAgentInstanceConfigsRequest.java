// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link ListAgentInstanceConfigsRequest} extends {@link RequestModel}
 *
 * <p>ListAgentInstanceConfigsRequest</p>
 */
public class ListAgentInstanceConfigsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("attributes")
    private String attributes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("configType")
    private String configType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("offset")
    private Long offset;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("size")
    private Long size;

    private ListAgentInstanceConfigsRequest(Builder builder) {
        super(builder);
        this.attributes = builder.attributes;
        this.configType = builder.configType;
        this.offset = builder.offset;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAgentInstanceConfigsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return attributes
     */
    public String getAttributes() {
        return this.attributes;
    }

    /**
     * @return configType
     */
    public String getConfigType() {
        return this.configType;
    }

    /**
     * @return offset
     */
    public Long getOffset() {
        return this.offset;
    }

    /**
     * @return size
     */
    public Long getSize() {
        return this.size;
    }

    public static final class Builder extends Request.Builder<ListAgentInstanceConfigsRequest, Builder> {
        private String attributes; 
        private String configType; 
        private Long offset; 
        private Long size; 

        private Builder() {
            super();
        } 

        private Builder(ListAgentInstanceConfigsRequest request) {
            super(request);
            this.attributes = request.attributes;
            this.configType = request.configType;
            this.offset = request.offset;
            this.size = request.size;
        } 

        /**
         * attributes.
         */
        public Builder attributes(String attributes) {
            this.putQueryParameter("attributes", attributes);
            this.attributes = attributes;
            return this;
        }

        /**
         * configType.
         */
        public Builder configType(String configType) {
            this.putQueryParameter("configType", configType);
            this.configType = configType;
            return this;
        }

        /**
         * offset.
         */
        public Builder offset(Long offset) {
            this.putQueryParameter("offset", offset);
            this.offset = offset;
            return this;
        }

        /**
         * size.
         */
        public Builder size(Long size) {
            this.putQueryParameter("size", size);
            this.size = size;
            return this;
        }

        @Override
        public ListAgentInstanceConfigsRequest build() {
            return new ListAgentInstanceConfigsRequest(this);
        } 

    } 

}
