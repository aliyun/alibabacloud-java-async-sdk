// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link ListSkillLevelsOfUserRequest} extends {@link RequestModel}
 *
 * <p>ListSkillLevelsOfUserRequest</p>
 */
public class ListSkillLevelsOfUserRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsMember")
    private Boolean isMember;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchPattern")
    private String searchPattern;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private ListSkillLevelsOfUserRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.isMember = builder.isMember;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.searchPattern = builder.searchPattern;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSkillLevelsOfUserRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return isMember
     */
    public Boolean getIsMember() {
        return this.isMember;
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
     * @return searchPattern
     */
    public String getSearchPattern() {
        return this.searchPattern;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<ListSkillLevelsOfUserRequest, Builder> {
        private String instanceId; 
        private Boolean isMember; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String searchPattern; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(ListSkillLevelsOfUserRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.isMember = request.isMember;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.searchPattern = request.searchPattern;
            this.userId = request.userId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * IsMember.
         */
        public Builder isMember(Boolean isMember) {
            this.putQueryParameter("IsMember", isMember);
            this.isMember = isMember;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * SearchPattern.
         */
        public Builder searchPattern(String searchPattern) {
            this.putQueryParameter("SearchPattern", searchPattern);
            this.searchPattern = searchPattern;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public ListSkillLevelsOfUserRequest build() {
            return new ListSkillLevelsOfUserRequest(this);
        } 

    } 

}
