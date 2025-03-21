// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeAccessKeyLeakDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeAccessKeyLeakDetailRequest</p>
 */
public class DescribeAccessKeyLeakDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceDirectoryAccountId")
    private Long resourceDirectoryAccountId;

    private DescribeAccessKeyLeakDetailRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.resourceDirectoryAccountId = builder.resourceDirectoryAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAccessKeyLeakDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return resourceDirectoryAccountId
     */
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    public static final class Builder extends Request.Builder<DescribeAccessKeyLeakDetailRequest, Builder> {
        private Long id; 
        private Long resourceDirectoryAccountId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAccessKeyLeakDetailRequest request) {
            super(request);
            this.id = request.id;
            this.resourceDirectoryAccountId = request.resourceDirectoryAccountId;
        } 

        /**
         * <p>The ID of the AccessKey pair leak event.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeAccesskeyLeakList~~">DescribeAccesskeyLeakList</a> operation to obtain the event ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>389357</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The Alibaba Cloud account ID of the member in the resource directory.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to query the ID.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>127608589417****</p>
         */
        public Builder resourceDirectoryAccountId(Long resourceDirectoryAccountId) {
            this.putQueryParameter("ResourceDirectoryAccountId", resourceDirectoryAccountId);
            this.resourceDirectoryAccountId = resourceDirectoryAccountId;
            return this;
        }

        @Override
        public DescribeAccessKeyLeakDetailRequest build() {
            return new DescribeAccessKeyLeakDetailRequest(this);
        } 

    } 

}
