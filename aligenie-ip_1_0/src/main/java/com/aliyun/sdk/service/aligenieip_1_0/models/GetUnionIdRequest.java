// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

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
 * {@link GetUnionIdRequest} extends {@link RequestModel}
 *
 * <p>GetUnionIdRequest</p>
 */
public class GetUnionIdRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EncodeKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String encodeKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EncodeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String encodeType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IdType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String idType;

    private GetUnionIdRequest(Builder builder) {
        super(builder);
        this.encodeKey = builder.encodeKey;
        this.encodeType = builder.encodeType;
        this.id = builder.id;
        this.idType = builder.idType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUnionIdRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return encodeKey
     */
    public String getEncodeKey() {
        return this.encodeKey;
    }

    /**
     * @return encodeType
     */
    public String getEncodeType() {
        return this.encodeType;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return idType
     */
    public String getIdType() {
        return this.idType;
    }

    public static final class Builder extends Request.Builder<GetUnionIdRequest, Builder> {
        private String encodeKey; 
        private String encodeType; 
        private String id; 
        private String idType; 

        private Builder() {
            super();
        } 

        private Builder(GetUnionIdRequest request) {
            super(request);
            this.encodeKey = request.encodeKey;
            this.encodeType = request.encodeType;
            this.id = request.id;
            this.idType = request.idType;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>125****0946</p>
         */
        public Builder encodeKey(String encodeKey) {
            this.putBodyParameter("EncodeKey", encodeKey);
            this.encodeKey = encodeKey;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HOTEL</p>
         */
        public Builder encodeType(String encodeType) {
            this.putBodyParameter("EncodeType", encodeType);
            this.encodeType = encodeType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>62a319****abdc</p>
         */
        public Builder id(String id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DEVICE_ID</p>
         */
        public Builder idType(String idType) {
            this.putBodyParameter("IdType", idType);
            this.idType = idType;
            return this;
        }

        @Override
        public GetUnionIdRequest build() {
            return new GetUnionIdRequest(this);
        } 

    } 

}
