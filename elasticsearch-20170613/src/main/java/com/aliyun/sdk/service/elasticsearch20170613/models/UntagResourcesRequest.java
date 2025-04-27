// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link UntagResourcesRequest} extends {@link RequestModel}
 *
 * <p>UntagResourcesRequest</p>
 */
public class UntagResourcesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("All")
    private Boolean all;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceIds")
    private String resourceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagKeys")
    private String tagKeys;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private String body;

    private UntagResourcesRequest(Builder builder) {
        super(builder);
        this.all = builder.all;
        this.resourceIds = builder.resourceIds;
        this.resourceType = builder.resourceType;
        this.tagKeys = builder.tagKeys;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UntagResourcesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return all
     */
    public Boolean getAll() {
        return this.all;
    }

    /**
     * @return resourceIds
     */
    public String getResourceIds() {
        return this.resourceIds;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return tagKeys
     */
    public String getTagKeys() {
        return this.tagKeys;
    }

    /**
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UntagResourcesRequest, Builder> {
        private Boolean all; 
        private String resourceIds; 
        private String resourceType; 
        private String tagKeys; 
        private String body; 

        private Builder() {
            super();
        } 

        private Builder(UntagResourcesRequest request) {
            super(request);
            this.all = request.all;
            this.resourceIds = request.resourceIds;
            this.resourceType = request.resourceType;
            this.tagKeys = request.tagKeys;
            this.body = request.body;
        } 

        /**
         * <p>Specifies whether to delete all parts. Default value: <strong>false</strong> . This parameter is valid only when <strong>TagKeys</strong> is not specified.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder all(Boolean all) {
            this.putQueryParameter("All", all);
            this.all = all;
            return this;
        }

        /**
         * <p>The resource list that you want to delete.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;es-cn-09k1rocex0006****&quot;,&quot;es-cn-oew1rgiev0009****&quot;]</p>
         */
        public Builder resourceIds(String resourceIds) {
            this.putQueryParameter("ResourceIds", resourceIds);
            this.resourceIds = resourceIds;
            return this;
        }

        /**
         * <p>The type of the resource. Fixed to <strong>INSTANCE</strong> .</p>
         * 
         * <strong>example:</strong>
         * <p>INSTANCE</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The list of tags that you want to delete. The list can contain up to 20 subitems.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;tagKey1&quot;,&quot;tagKey2&quot;]</p>
         */
        public Builder tagKeys(String tagKeys) {
            this.putQueryParameter("TagKeys", tagKeys);
            this.tagKeys = tagKeys;
            return this;
        }

        /**
         * body.
         */
        public Builder body(String body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public UntagResourcesRequest build() {
            return new UntagResourcesRequest(this);
        } 

    } 

}
