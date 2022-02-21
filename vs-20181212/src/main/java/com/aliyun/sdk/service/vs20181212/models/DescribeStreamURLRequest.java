// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeStreamURLRequest} extends {@link RequestModel}
 *
 * <p>DescribeStreamURLRequest</p>
 */
public class DescribeStreamURLRequest extends Request {
    @Query
    @NameInMap("Auth")
    private Boolean auth;

    @Query
    @NameInMap("AuthKey")
    private String authKey;

    @Query
    @NameInMap("EndTime")
    private Long endTime;

    @Query
    @NameInMap("Expire")
    private Long expire;

    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private String id;

    @Query
    @NameInMap("OutProtocol")
    @Validation(required = true)
    private String outProtocol;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("StartTime")
    private Long startTime;

    @Query
    @NameInMap("Transcode")
    private String transcode;

    @Query
    @NameInMap("Type")
    private String type;

    private DescribeStreamURLRequest(Builder builder) {
        super(builder);
        this.auth = builder.auth;
        this.authKey = builder.authKey;
        this.endTime = builder.endTime;
        this.expire = builder.expire;
        this.id = builder.id;
        this.outProtocol = builder.outProtocol;
        this.ownerId = builder.ownerId;
        this.startTime = builder.startTime;
        this.transcode = builder.transcode;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeStreamURLRequest create() {
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
     * @return authKey
     */
    public String getAuthKey() {
        return this.authKey;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
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
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return transcode
     */
    public String getTranscode() {
        return this.transcode;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<DescribeStreamURLRequest, Builder> {
        private Boolean auth; 
        private String authKey; 
        private Long endTime; 
        private Long expire; 
        private String id; 
        private String outProtocol; 
        private Long ownerId; 
        private Long startTime; 
        private String transcode; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DescribeStreamURLRequest response) {
            super(response);
            this.auth = response.auth;
            this.authKey = response.authKey;
            this.endTime = response.endTime;
            this.expire = response.expire;
            this.id = response.id;
            this.outProtocol = response.outProtocol;
            this.ownerId = response.ownerId;
            this.startTime = response.startTime;
            this.transcode = response.transcode;
            this.type = response.type;
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
         * AuthKey.
         */
        public Builder authKey(String authKey) {
            this.putQueryParameter("AuthKey", authKey);
            this.authKey = authKey;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
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
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * Transcode.
         */
        public Builder transcode(String transcode) {
            this.putQueryParameter("Transcode", transcode);
            this.transcode = transcode;
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
        public DescribeStreamURLRequest build() {
            return new DescribeStreamURLRequest(this);
        } 

    } 

}
