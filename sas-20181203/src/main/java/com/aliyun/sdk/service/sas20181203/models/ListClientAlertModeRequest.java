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
 * {@link ListClientAlertModeRequest} extends {@link RequestModel}
 *
 * <p>ListClientAlertModeRequest</p>
 */
public class ListClientAlertModeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mode")
    private String mode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceDirectoryAccountId")
    private Long resourceDirectoryAccountId;

    private ListClientAlertModeRequest(Builder builder) {
        super(builder);
        this.mode = builder.mode;
        this.resourceDirectoryAccountId = builder.resourceDirectoryAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClientAlertModeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * @return resourceDirectoryAccountId
     */
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    public static final class Builder extends Request.Builder<ListClientAlertModeRequest, Builder> {
        private String mode; 
        private Long resourceDirectoryAccountId; 

        private Builder() {
            super();
        } 

        private Builder(ListClientAlertModeRequest request) {
            super(request);
            this.mode = request.mode;
            this.resourceDirectoryAccountId = request.resourceDirectoryAccountId;
        } 

        /**
         * <p>Specifies the protection mode. Valid values:</p>
         * <ul>
         * <li><strong>strict</strong>: Strict mode. Defense mode has a certain risk of false positives and is recommended for use during critical event protection.</li>
         * <li><strong>balance</strong>: Balance mode. Defense mode detects more suspicious risks while reducing false positives.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>strict</p>
         */
        public Builder mode(String mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * <p>The ID of the member accounts in the resource folder (Alibaba Cloud account).</p>
         * <blockquote>
         * <p>You can invoke the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to retrieve this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1766185894104675</p>
         */
        public Builder resourceDirectoryAccountId(Long resourceDirectoryAccountId) {
            this.putQueryParameter("ResourceDirectoryAccountId", resourceDirectoryAccountId);
            this.resourceDirectoryAccountId = resourceDirectoryAccountId;
            return this;
        }

        @Override
        public ListClientAlertModeRequest build() {
            return new ListClientAlertModeRequest(this);
        } 

    } 

}
