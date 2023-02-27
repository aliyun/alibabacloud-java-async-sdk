// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPersonalNumbersOfUserRequest} extends {@link RequestModel}
 *
 * <p>ListPersonalNumbersOfUserRequest</p>
 */
public class ListPersonalNumbersOfUserRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("IsMember")
    @Validation(required = true)
    private Boolean isMember;

    @Query
    @NameInMap("PageNumber")
    @Validation(required = true)
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    @Query
    @NameInMap("SearchPattern")
    private String searchPattern;

    @Query
    @NameInMap("UserId")
    @Validation(required = true)
    private String userId;

    private ListPersonalNumbersOfUserRequest(Builder builder) {
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

    public static ListPersonalNumbersOfUserRequest create() {
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

    public static final class Builder extends Request.Builder<ListPersonalNumbersOfUserRequest, Builder> {
        private String instanceId; 
        private Boolean isMember; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String searchPattern; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(ListPersonalNumbersOfUserRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.isMember = request.isMember;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.searchPattern = request.searchPattern;
            this.userId = request.userId;
        } 

        /**
         * InstanceId.
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
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
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
        public ListPersonalNumbersOfUserRequest build() {
            return new ListPersonalNumbersOfUserRequest(this);
        } 

    } 

}
