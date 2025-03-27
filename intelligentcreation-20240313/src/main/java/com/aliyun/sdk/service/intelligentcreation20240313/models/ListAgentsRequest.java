// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link ListAgentsRequest} extends {@link RequestModel}
 *
 * <p>ListAgentsRequest</p>
 */
public class ListAgentsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("agentId")
    private String agentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("agentScene")
    private String agentScene;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("owner")
    private String owner;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("status")
    private Integer status;

    private ListAgentsRequest(Builder builder) {
        super(builder);
        this.agentId = builder.agentId;
        this.agentScene = builder.agentScene;
        this.owner = builder.owner;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAgentsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentId
     */
    public String getAgentId() {
        return this.agentId;
    }

    /**
     * @return agentScene
     */
    public String getAgentScene() {
        return this.agentScene;
    }

    /**
     * @return owner
     */
    public String getOwner() {
        return this.owner;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListAgentsRequest, Builder> {
        private String agentId; 
        private String agentScene; 
        private String owner; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Integer status; 

        private Builder() {
            super();
        } 

        private Builder(ListAgentsRequest request) {
            super(request);
            this.agentId = request.agentId;
            this.agentScene = request.agentScene;
            this.owner = request.owner;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.status = request.status;
        } 

        /**
         * agentId.
         */
        public Builder agentId(String agentId) {
            this.putQueryParameter("agentId", agentId);
            this.agentId = agentId;
            return this;
        }

        /**
         * agentScene.
         */
        public Builder agentScene(String agentScene) {
            this.putQueryParameter("agentScene", agentScene);
            this.agentScene = agentScene;
            return this;
        }

        /**
         * owner.
         */
        public Builder owner(String owner) {
            this.putQueryParameter("owner", owner);
            this.owner = owner;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * status.
         */
        public Builder status(Integer status) {
            this.putQueryParameter("status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListAgentsRequest build() {
            return new ListAgentsRequest(this);
        } 

    } 

}
