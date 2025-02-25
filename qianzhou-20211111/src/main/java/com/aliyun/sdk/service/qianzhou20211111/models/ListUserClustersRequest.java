// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qianzhou20211111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListUserClustersRequest} extends {@link RequestModel}
 *
 * <p>ListUserClustersRequest</p>
 */
public class ListUserClustersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("current")
    private String current;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("userID")
    private String userID;

    private ListUserClustersRequest(Builder builder) {
        super(builder);
        this.current = builder.current;
        this.pageSize = builder.pageSize;
        this.userID = builder.userID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserClustersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return current
     */
    public String getCurrent() {
        return this.current;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return userID
     */
    public String getUserID() {
        return this.userID;
    }

    public static final class Builder extends Request.Builder<ListUserClustersRequest, Builder> {
        private String current; 
        private String pageSize; 
        private String userID; 

        private Builder() {
            super();
        } 

        private Builder(ListUserClustersRequest request) {
            super(request);
            this.current = request.current;
            this.pageSize = request.pageSize;
            this.userID = request.userID;
        } 

        /**
         * current.
         */
        public Builder current(String current) {
            this.putQueryParameter("current", current);
            this.current = current;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * userID.
         */
        public Builder userID(String userID) {
            this.putQueryParameter("userID", userID);
            this.userID = userID;
            return this;
        }

        @Override
        public ListUserClustersRequest build() {
            return new ListUserClustersRequest(this);
        } 

    } 

}
