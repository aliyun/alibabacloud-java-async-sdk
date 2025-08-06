// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link DescribeFileIdPlayStatisByOriginRequest} extends {@link RequestModel}
 *
 * <p>DescribeFileIdPlayStatisByOriginRequest</p>
 */
public class DescribeFileIdPlayStatisByOriginRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("From")
    @com.aliyun.core.annotation.Validation(required = true)
    private String from;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScrollToken")
    private String scrollToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("To")
    @com.aliyun.core.annotation.Validation(required = true)
    private String to;

    private DescribeFileIdPlayStatisByOriginRequest(Builder builder) {
        super(builder);
        this.from = builder.from;
        this.ownerId = builder.ownerId;
        this.pageSize = builder.pageSize;
        this.scrollToken = builder.scrollToken;
        this.to = builder.to;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFileIdPlayStatisByOriginRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return from
     */
    public String getFrom() {
        return this.from;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return scrollToken
     */
    public String getScrollToken() {
        return this.scrollToken;
    }

    /**
     * @return to
     */
    public String getTo() {
        return this.to;
    }

    public static final class Builder extends Request.Builder<DescribeFileIdPlayStatisByOriginRequest, Builder> {
        private String from; 
        private String ownerId; 
        private Integer pageSize; 
        private String scrollToken; 
        private String to; 

        private Builder() {
            super();
        } 

        private Builder(DescribeFileIdPlayStatisByOriginRequest request) {
            super(request);
            this.from = request.from;
            this.ownerId = request.ownerId;
            this.pageSize = request.pageSize;
            this.scrollToken = request.scrollToken;
            this.to = request.to;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder from(String from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
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
         * ScrollToken.
         */
        public Builder scrollToken(String scrollToken) {
            this.putQueryParameter("ScrollToken", scrollToken);
            this.scrollToken = scrollToken;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder to(String to) {
            this.putQueryParameter("To", to);
            this.to = to;
            return this;
        }

        @Override
        public DescribeFileIdPlayStatisByOriginRequest build() {
            return new DescribeFileIdPlayStatisByOriginRequest(this);
        } 

    } 

}
