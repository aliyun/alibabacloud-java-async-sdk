// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link ModelRouterGetMemberBalanceLogsRequest} extends {@link RequestModel}
 *
 * <p>ModelRouterGetMemberBalanceLogsRequest</p>
 */
public class ModelRouterGetMemberBalanceLogsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("clientId")
    private Long clientId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("changeType")
    private String changeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page")
    private Integer page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("size")
    private Integer size;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("skipTotal")
    private Boolean skipTotal;

    private ModelRouterGetMemberBalanceLogsRequest(Builder builder) {
        super(builder);
        this.clientId = builder.clientId;
        this.id = builder.id;
        this.changeType = builder.changeType;
        this.page = builder.page;
        this.size = builder.size;
        this.skipTotal = builder.skipTotal;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelRouterGetMemberBalanceLogsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientId
     */
    public Long getClientId() {
        return this.clientId;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return changeType
     */
    public String getChangeType() {
        return this.changeType;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    /**
     * @return skipTotal
     */
    public Boolean getSkipTotal() {
        return this.skipTotal;
    }

    public static final class Builder extends Request.Builder<ModelRouterGetMemberBalanceLogsRequest, Builder> {
        private Long clientId; 
        private Long id; 
        private String changeType; 
        private Integer page; 
        private Integer size; 
        private Boolean skipTotal; 

        private Builder() {
            super();
        } 

        private Builder(ModelRouterGetMemberBalanceLogsRequest request) {
            super(request);
            this.clientId = request.clientId;
            this.id = request.id;
            this.changeType = request.changeType;
            this.page = request.page;
            this.size = request.size;
            this.skipTotal = request.skipTotal;
        } 

        /**
         * <p>The department ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder clientId(Long clientId) {
            this.putPathParameter("clientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * <p>The member ID within the organization (not the Alibaba Cloud account ID).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder id(Long id) {
            this.putPathParameter("id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The change type filter.</p>
         * 
         * <strong>example:</strong>
         * <p>recharge</p>
         */
        public Builder changeType(String changeType) {
            this.putQueryParameter("changeType", changeType);
            this.changeType = changeType;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Integer page) {
            this.putQueryParameter("page", page);
            this.page = page;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder size(Integer size) {
            this.putQueryParameter("size", size);
            this.size = size;
            return this;
        }

        /**
         * <p>Specifies whether to skip the total count calculation.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder skipTotal(Boolean skipTotal) {
            this.putQueryParameter("skipTotal", skipTotal);
            this.skipTotal = skipTotal;
            return this;
        }

        @Override
        public ModelRouterGetMemberBalanceLogsRequest build() {
            return new ModelRouterGetMemberBalanceLogsRequest(this);
        } 

    } 

}
