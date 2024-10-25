// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RejectServiceUsageRequest} extends {@link RequestModel}
 *
 * <p>RejectServiceUsageRequest</p>
 */
public class RejectServiceUsageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Comments")
    private String comments;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private Integer type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserAliUid")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long userAliUid;

    private RejectServiceUsageRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.comments = builder.comments;
        this.serviceId = builder.serviceId;
        this.type = builder.type;
        this.userAliUid = builder.userAliUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RejectServiceUsageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return comments
     */
    public String getComments() {
        return this.comments;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    /**
     * @return userAliUid
     */
    public Long getUserAliUid() {
        return this.userAliUid;
    }

    public static final class Builder extends Request.Builder<RejectServiceUsageRequest, Builder> {
        private String clientToken; 
        private String comments; 
        private String serviceId; 
        private Integer type; 
        private Long userAliUid; 

        private Builder() {
            super();
        } 

        private Builder(RejectServiceUsageRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.comments = request.comments;
            this.serviceId = request.serviceId;
            this.type = request.type;
            this.userAliUid = request.userAliUid;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Comments.
         */
        public Builder comments(String comments) {
            this.putQueryParameter("Comments", comments);
            this.comments = comments;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>service-2117508c874c41xxxxxx</p>
         */
        public Builder serviceId(String serviceId) {
            this.putQueryParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(Integer type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1563457855xxxxxx</p>
         */
        public Builder userAliUid(Long userAliUid) {
            this.putQueryParameter("UserAliUid", userAliUid);
            this.userAliUid = userAliUid;
            return this;
        }

        @Override
        public RejectServiceUsageRequest build() {
            return new RejectServiceUsageRequest(this);
        } 

    } 

}
