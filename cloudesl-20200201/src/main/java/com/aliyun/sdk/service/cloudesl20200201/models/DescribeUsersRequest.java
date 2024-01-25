// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20200201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUsersRequest} extends {@link RequestModel}
 *
 * <p>DescribeUsersRequest</p>
 */
public class DescribeUsersRequest extends Request {
    @Body
    @NameInMap("ExtraParams")
    private String extraParams;

    @Body
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Body
    @NameInMap("PageSize")
    private Integer pageSize;

    @Body
    @NameInMap("UserId")
    private String userId;

    @Body
    @NameInMap("UserName")
    private String userName;

    @Body
    @NameInMap("UserType")
    private String userType;

    private DescribeUsersRequest(Builder builder) {
        super(builder);
        this.extraParams = builder.extraParams;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.userId = builder.userId;
        this.userName = builder.userName;
        this.userType = builder.userType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUsersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return extraParams
     */
    public String getExtraParams() {
        return this.extraParams;
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
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * @return userType
     */
    public String getUserType() {
        return this.userType;
    }

    public static final class Builder extends Request.Builder<DescribeUsersRequest, Builder> {
        private String extraParams; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String userId; 
        private String userName; 
        private String userType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeUsersRequest request) {
            super(request);
            this.extraParams = request.extraParams;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.userId = request.userId;
            this.userName = request.userName;
            this.userType = request.userType;
        } 

        /**
         * ExtraParams.
         */
        public Builder extraParams(String extraParams) {
            this.putBodyParameter("ExtraParams", extraParams);
            this.extraParams = extraParams;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putBodyParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * UserName.
         */
        public Builder userName(String userName) {
            this.putBodyParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        /**
         * UserType.
         */
        public Builder userType(String userType) {
            this.putBodyParameter("UserType", userType);
            this.userType = userType;
            return this;
        }

        @Override
        public DescribeUsersRequest build() {
            return new DescribeUsersRequest(this);
        } 

    } 

}
