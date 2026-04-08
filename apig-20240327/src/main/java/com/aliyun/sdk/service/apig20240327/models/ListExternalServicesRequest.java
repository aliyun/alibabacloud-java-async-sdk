// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link ListExternalServicesRequest} extends {@link RequestModel}
 *
 * <p>ListExternalServicesRequest</p>
 */
public class ListExternalServicesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("importableOnly")
    private Boolean importableOnly;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("limit")
    private Integer limit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nameLike")
    private String nameLike;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("paiWorkspaceId")
    private String paiWorkspaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sourceType")
    private String sourceType;

    private ListExternalServicesRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.importableOnly = builder.importableOnly;
        this.limit = builder.limit;
        this.nameLike = builder.nameLike;
        this.paiWorkspaceId = builder.paiWorkspaceId;
        this.sourceType = builder.sourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListExternalServicesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return importableOnly
     */
    public Boolean getImportableOnly() {
        return this.importableOnly;
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return nameLike
     */
    public String getNameLike() {
        return this.nameLike;
    }

    /**
     * @return paiWorkspaceId
     */
    public String getPaiWorkspaceId() {
        return this.paiWorkspaceId;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    public static final class Builder extends Request.Builder<ListExternalServicesRequest, Builder> {
        private String gatewayId; 
        private Boolean importableOnly; 
        private Integer limit; 
        private String nameLike; 
        private String paiWorkspaceId; 
        private String sourceType; 

        private Builder() {
            super();
        } 

        private Builder(ListExternalServicesRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
            this.importableOnly = request.importableOnly;
            this.limit = request.limit;
            this.nameLike = request.nameLike;
            this.paiWorkspaceId = request.paiWorkspaceId;
            this.sourceType = request.sourceType;
        } 

        /**
         * gatewayId.
         */
        public Builder gatewayId(String gatewayId) {
            this.putPathParameter("gatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * importableOnly.
         */
        public Builder importableOnly(Boolean importableOnly) {
            this.putQueryParameter("importableOnly", importableOnly);
            this.importableOnly = importableOnly;
            return this;
        }

        /**
         * limit.
         */
        public Builder limit(Integer limit) {
            this.putQueryParameter("limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * nameLike.
         */
        public Builder nameLike(String nameLike) {
            this.putQueryParameter("nameLike", nameLike);
            this.nameLike = nameLike;
            return this;
        }

        /**
         * paiWorkspaceId.
         */
        public Builder paiWorkspaceId(String paiWorkspaceId) {
            this.putQueryParameter("paiWorkspaceId", paiWorkspaceId);
            this.paiWorkspaceId = paiWorkspaceId;
            return this;
        }

        /**
         * sourceType.
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("sourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        @Override
        public ListExternalServicesRequest build() {
            return new ListExternalServicesRequest(this);
        } 

    } 

}
