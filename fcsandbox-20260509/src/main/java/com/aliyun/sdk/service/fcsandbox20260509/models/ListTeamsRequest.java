// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fcsandbox20260509.models;

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
 * {@link ListTeamsRequest} extends {@link RequestModel}
 *
 * <p>ListTeamsRequest</p>
 */
public class ListTeamsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("plan")
    private String plan;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("resourceGroupID")
    private String resourceGroupID;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("teamName")
    private String teamName;

    private ListTeamsRequest(Builder builder) {
        super(builder);
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.plan = builder.plan;
        this.resourceGroupID = builder.resourceGroupID;
        this.teamName = builder.teamName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTeamsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return plan
     */
    public String getPlan() {
        return this.plan;
    }

    /**
     * @return resourceGroupID
     */
    public String getResourceGroupID() {
        return this.resourceGroupID;
    }

    /**
     * @return teamName
     */
    public String getTeamName() {
        return this.teamName;
    }

    public static final class Builder extends Request.Builder<ListTeamsRequest, Builder> {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String plan; 
        private String resourceGroupID; 
        private String teamName; 

        private Builder() {
            super();
        } 

        private Builder(ListTeamsRequest request) {
            super(request);
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.plan = request.plan;
            this.resourceGroupID = request.resourceGroupID;
            this.teamName = request.teamName;
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
         * plan.
         */
        public Builder plan(String plan) {
            this.putQueryParameter("plan", plan);
            this.plan = plan;
            return this;
        }

        /**
         * resourceGroupID.
         */
        public Builder resourceGroupID(String resourceGroupID) {
            this.putQueryParameter("resourceGroupID", resourceGroupID);
            this.resourceGroupID = resourceGroupID;
            return this;
        }

        /**
         * teamName.
         */
        public Builder teamName(String teamName) {
            this.putQueryParameter("teamName", teamName);
            this.teamName = teamName;
            return this;
        }

        @Override
        public ListTeamsRequest build() {
            return new ListTeamsRequest(this);
        } 

    } 

}
