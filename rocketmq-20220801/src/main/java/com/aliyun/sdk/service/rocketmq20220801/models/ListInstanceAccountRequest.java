// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstanceAccountRequest} extends {@link RequestModel}
 *
 * <p>ListInstanceAccountRequest</p>
 */
public class ListInstanceAccountRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("accountStatus")
    private String accountStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("accountType")
    private String accountType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 100000000, minimum = 1)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 10000, minimum = 10)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("username")
    private String username;

    private ListInstanceAccountRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.accountStatus = builder.accountStatus;
        this.accountType = builder.accountType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.username = builder.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceAccountRequest create() {
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
     * @return accountStatus
     */
    public String getAccountStatus() {
        return this.accountStatus;
    }

    /**
     * @return accountType
     */
    public String getAccountType() {
        return this.accountType;
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
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    public static final class Builder extends Request.Builder<ListInstanceAccountRequest, Builder> {
        private String instanceId; 
        private String accountStatus; 
        private String accountType; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String username; 

        private Builder() {
            super();
        } 

        private Builder(ListInstanceAccountRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.accountStatus = request.accountStatus;
            this.accountType = request.accountType;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.username = request.username;
        } 

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * accountStatus.
         */
        public Builder accountStatus(String accountStatus) {
            this.putQueryParameter("accountStatus", accountStatus);
            this.accountStatus = accountStatus;
            return this;
        }

        /**
         * accountType.
         */
        public Builder accountType(String accountType) {
            this.putQueryParameter("accountType", accountType);
            this.accountType = accountType;
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
         * username.
         */
        public Builder username(String username) {
            this.putQueryParameter("username", username);
            this.username = username;
            return this;
        }

        @Override
        public ListInstanceAccountRequest build() {
            return new ListInstanceAccountRequest(this);
        } 

    } 

}
