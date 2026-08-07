// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20251111.models;

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
 * {@link ListSystemConfigsRequest} extends {@link RequestModel}
 *
 * <p>ListSystemConfigsRequest</p>
 */
public class ListSystemConfigsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ObjectId")
    private String objectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ObjectType")
    private String objectType;

    private ListSystemConfigsRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.objectId = builder.objectId;
        this.objectType = builder.objectType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSystemConfigsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return objectId
     */
    public String getObjectId() {
        return this.objectId;
    }

    /**
     * @return objectType
     */
    public String getObjectType() {
        return this.objectType;
    }

    public static final class Builder extends Request.Builder<ListSystemConfigsRequest, Builder> {
        private String name; 
        private String objectId; 
        private String objectType; 

        private Builder() {
            super();
        } 

        private Builder(ListSystemConfigsRequest request) {
            super(request);
            this.name = request.name;
            this.objectId = request.objectId;
            this.objectType = request.objectType;
        } 

        /**
         * <p>名称</p>
         * 
         * <strong>example:</strong>
         * <p>callableTime</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>对象ID</p>
         * 
         * <strong>example:</strong>
         * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b04</p>
         */
        public Builder objectId(String objectId) {
            this.putBodyParameter("ObjectId", objectId);
            this.objectId = objectId;
            return this;
        }

        /**
         * <p>外呼开发时补充参数限制</p>
         * 
         * <strong>example:</strong>
         * <p>INSTANCE</p>
         */
        public Builder objectType(String objectType) {
            this.putBodyParameter("ObjectType", objectType);
            this.objectType = objectType;
            return this;
        }

        @Override
        public ListSystemConfigsRequest build() {
            return new ListSystemConfigsRequest(this);
        } 

    } 

}
