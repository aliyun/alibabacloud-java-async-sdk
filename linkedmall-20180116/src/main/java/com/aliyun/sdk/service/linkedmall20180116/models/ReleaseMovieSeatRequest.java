// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

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
 * {@link ReleaseMovieSeatRequest} extends {@link RequestModel}
 *
 * <p>ReleaseMovieSeatRequest</p>
 */
public class ReleaseMovieSeatRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizUid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtJson")
    private String extJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LockSeatApplyKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String lockSeatApplyKey;

    private ReleaseMovieSeatRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.bizUid = builder.bizUid;
        this.extJson = builder.extJson;
        this.lockSeatApplyKey = builder.lockSeatApplyKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReleaseMovieSeatRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return bizUid
     */
    public String getBizUid() {
        return this.bizUid;
    }

    /**
     * @return extJson
     */
    public String getExtJson() {
        return this.extJson;
    }

    /**
     * @return lockSeatApplyKey
     */
    public String getLockSeatApplyKey() {
        return this.lockSeatApplyKey;
    }

    public static final class Builder extends Request.Builder<ReleaseMovieSeatRequest, Builder> {
        private String bizId; 
        private String bizUid; 
        private String extJson; 
        private String lockSeatApplyKey; 

        private Builder() {
            super();
        } 

        private Builder(ReleaseMovieSeatRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.bizUid = request.bizUid;
            this.extJson = request.extJson;
            this.lockSeatApplyKey = request.lockSeatApplyKey;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>LMALL20******005</p>
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>221249435****</p>
         */
        public Builder bizUid(String bizUid) {
            this.putQueryParameter("BizUid", bizUid);
            this.bizUid = bizUid;
            return this;
        }

        /**
         * ExtJson.
         */
        public Builder extJson(String extJson) {
            this.putQueryParameter("ExtJson", extJson);
            this.extJson = extJson;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        public Builder lockSeatApplyKey(String lockSeatApplyKey) {
            this.putQueryParameter("LockSeatApplyKey", lockSeatApplyKey);
            this.lockSeatApplyKey = lockSeatApplyKey;
            return this;
        }

        @Override
        public ReleaseMovieSeatRequest build() {
            return new ReleaseMovieSeatRequest(this);
        } 

    } 

}
