// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resellertrade20191227.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OfflineActivityRequest} extends {@link RequestModel}
 *
 * <p>OfflineActivityRequest</p>
 */
public class OfflineActivityRequest extends Request {
    @Body
    @NameInMap("ActivityList")
    private java.util.List < Long > activityList;

    @Body
    @NameInMap("BizId")
    private String bizId;

    @Body
    @NameInMap("Token")
    private String token;

    private OfflineActivityRequest(Builder builder) {
        super(builder);
        this.activityList = builder.activityList;
        this.bizId = builder.bizId;
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OfflineActivityRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return activityList
     */
    public java.util.List < Long > getActivityList() {
        return this.activityList;
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    public static final class Builder extends Request.Builder<OfflineActivityRequest, Builder> {
        private java.util.List < Long > activityList; 
        private String bizId; 
        private String token; 

        private Builder() {
            super();
        } 

        private Builder(OfflineActivityRequest request) {
            super(request);
            this.activityList = request.activityList;
            this.bizId = request.bizId;
            this.token = request.token;
        } 

        /**
         * ActivityList.
         */
        public Builder activityList(java.util.List < Long > activityList) {
            this.putBodyParameter("ActivityList", activityList);
            this.activityList = activityList;
            return this;
        }

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putBodyParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * Token.
         */
        public Builder token(String token) {
            this.putBodyParameter("Token", token);
            this.token = token;
            return this;
        }

        @Override
        public OfflineActivityRequest build() {
            return new OfflineActivityRequest(this);
        } 

    } 

}
