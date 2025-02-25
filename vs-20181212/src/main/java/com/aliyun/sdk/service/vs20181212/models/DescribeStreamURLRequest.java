// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link DescribeStreamURLRequest} extends {@link RequestModel}
 *
 * <p>DescribeStreamURLRequest</p>
 */
public class DescribeStreamURLRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Auth")
    private Boolean auth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthKey")
    private String authKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Expire")
    private Long expire;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutProtocol")
    @com.aliyun.core.annotation.Validation(required = true)
    private String outProtocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Transcode")
    private String transcode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
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

        private Builder(DescribeStreamURLRequest request) {
            super(request);
            this.auth = request.auth;
            this.authKey = request.authKey;
            this.endTime = request.endTime;
            this.expire = request.expire;
            this.id = request.id;
            this.outProtocol = request.outProtocol;
            this.ownerId = request.ownerId;
            this.startTime = request.startTime;
            this.transcode = request.transcode;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>323*****997-cn-qingdao</p>
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rtmp</p>
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
