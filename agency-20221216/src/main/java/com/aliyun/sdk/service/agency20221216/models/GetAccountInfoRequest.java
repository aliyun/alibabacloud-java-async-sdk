// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

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
 * {@link GetAccountInfoRequest} extends {@link RequestModel}
 *
 * <p>GetAccountInfoRequest</p>
 */
public class GetAccountInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 20, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uid")
    private Long uid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserType")
    private String userType;

    private GetAccountInfoRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.uid = builder.uid;
        this.userType = builder.userType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAccountInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return uid
     */
    public Long getUid() {
        return this.uid;
    }

    /**
     * @return userType
     */
    public String getUserType() {
        return this.userType;
    }

    public static final class Builder extends Request.Builder<GetAccountInfoRequest, Builder> {
        private Integer currentPage; 
        private Integer pageSize; 
        private Long uid; 
        private String userType; 

        private Builder() {
            super();
        } 

        private Builder(GetAccountInfoRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.pageSize = request.pageSize;
            this.uid = request.uid;
            this.userType = request.userType;
        } 

        /**
         * <p>Pagination, current page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>Pagination, record number on each page, maximum 20.</p>
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
         * <p>Account UID of Distribution Customer. This parameter and the UserType parameter must have one filled. If this parameter is empty, then check all Distribution Customer accounts of the selected UserType.</p>
         * 
         * <strong>example:</strong>
         * <p>1215848086704806</p>
         */
        public Builder uid(Long uid) {
            this.putQueryParameter("Uid", uid);
            this.uid = uid;
            return this;
        }

        /**
         * <p>Distribution Customer&quot;s Account Type:</p>
         * <ul>
         * <li>1 End User</li>
         * <li>2 Enterprise</li>
         * <li>3 T2 Partner</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder userType(String userType) {
            this.putQueryParameter("UserType", userType);
            this.userType = userType;
            return this;
        }

        @Override
        public GetAccountInfoRequest build() {
            return new GetAccountInfoRequest(this);
        } 

    } 

}
