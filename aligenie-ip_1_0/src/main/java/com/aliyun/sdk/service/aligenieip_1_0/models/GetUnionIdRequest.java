// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUnionIdRequest} extends {@link RequestModel}
 *
 * <p>GetUnionIdRequest</p>
 */
public class GetUnionIdRequest extends Request {
    @Body
    @NameInMap("EncodeKey")
    @Validation(required = true)
    private String encodeKey;

    @Body
    @NameInMap("EncodeType")
    @Validation(required = true)
    private String encodeType;

    @Body
    @NameInMap("Id")
    @Validation(required = true)
    private String id;

    @Body
    @NameInMap("IdType")
    @Validation(required = true)
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
         * EncodeKey.
         */
        public Builder encodeKey(String encodeKey) {
            this.putBodyParameter("EncodeKey", encodeKey);
            this.encodeKey = encodeKey;
            return this;
        }

        /**
         * EncodeType.
         */
        public Builder encodeType(String encodeType) {
            this.putBodyParameter("EncodeType", encodeType);
            this.encodeType = encodeType;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * IdType.
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
