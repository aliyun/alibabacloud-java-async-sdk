// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDeviceURLRequest} extends {@link RequestModel}
 *
 * <p>DescribeDeviceURLRequest</p>
 */
public class DescribeDeviceURLRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Auth")
    private Boolean auth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Expire")
    private Long expire;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mode")
    private String mode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutProtocol")
    @com.aliyun.core.annotation.Validation(required = true)
    private String outProtocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Stream")
    @com.aliyun.core.annotation.Validation(required = true)
    private String stream;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private DescribeDeviceURLRequest(Builder builder) {
        super(builder);
        this.auth = builder.auth;
        this.expire = builder.expire;
        this.id = builder.id;
        this.mode = builder.mode;
        this.outProtocol = builder.outProtocol;
        this.ownerId = builder.ownerId;
        this.stream = builder.stream;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDeviceURLRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return auth
     */
    public Boolean getAuth() {
        return this.auth;
    }

    /**
     * @return expire
     */
    public Long getExpire() {
        return this.expire;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * @return outProtocol
     */
    public String getOutProtocol() {
        return this.outProtocol;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return stream
     */
    public String getStream() {
        return this.stream;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<DescribeDeviceURLRequest, Builder> {
        private Boolean auth; 
        private Long expire; 
        private String id; 
        private String mode; 
        private String outProtocol; 
        private Long ownerId; 
        private String stream; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDeviceURLRequest request) {
            super(request);
            this.auth = request.auth;
            this.expire = request.expire;
            this.id = request.id;
            this.mode = request.mode;
            this.outProtocol = request.outProtocol;
            this.ownerId = request.ownerId;
            this.stream = request.stream;
            this.type = request.type;
        } 

        /**
         * Auth.
         */
        public Builder auth(Boolean auth) {
            this.putQueryParameter("Auth", auth);
            this.auth = auth;
            return this;
        }

        /**
         * Expire.
         */
        public Builder expire(Long expire) {
            this.putQueryParameter("Expire", expire);
            this.expire = expire;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * Mode.
         */
        public Builder mode(String mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * OutProtocol.
         */
        public Builder outProtocol(String outProtocol) {
            this.putQueryParameter("OutProtocol", outProtocol);
            this.outProtocol = outProtocol;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * Stream.
         */
        public Builder stream(String stream) {
            this.putQueryParameter("Stream", stream);
            this.stream = stream;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public DescribeDeviceURLRequest build() {
            return new DescribeDeviceURLRequest(this);
        } 

    } 

}
