// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

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
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rmq-cn-7e22ody****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The status of the account.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>DISABLE</li>
         * <li>ENABLE</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ENABLE</p>
         */
        public Builder accountStatus(String accountStatus) {
            this.putQueryParameter("accountStatus", accountStatus);
            this.accountStatus = accountStatus;
            return this;
        }

        /**
         * <p>The account type.</p>
         * <ul>
         * <li>CUSTOMER</li>
         * <li>DEFAULT</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CUSTOMER</p>
         */
        public Builder accountType(String accountType) {
            this.putQueryParameter("accountType", accountType);
            this.accountType = accountType;
            return this;
        }

        /**
         * <p>The page number. Default value: 1.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 10.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The username of the account.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
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
