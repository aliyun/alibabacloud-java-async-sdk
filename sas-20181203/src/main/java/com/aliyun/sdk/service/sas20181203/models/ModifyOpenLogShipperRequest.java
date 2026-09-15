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
 * {@link ModifyOpenLogShipperRequest} extends {@link RequestModel}
 *
 * <p>ModifyOpenLogShipperRequest</p>
 */
public class ModifyOpenLogShipperRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("From")
    private String from;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceDirectoryAccountId")
    private Long resourceDirectoryAccountId;

    private ModifyOpenLogShipperRequest(Builder builder) {
        super(builder);
        this.from = builder.from;
        this.resourceDirectoryAccountId = builder.resourceDirectoryAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyOpenLogShipperRequest create() {
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
     * @return resourceDirectoryAccountId
     */
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    public static final class Builder extends Request.Builder<ModifyOpenLogShipperRequest, Builder> {
        private String from; 
        private Long resourceDirectoryAccountId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyOpenLogShipperRequest request) {
            super(request);
            this.from = request.from;
            this.resourceDirectoryAccountId = request.resourceDirectoryAccountId;
        } 

        /**
         * <p>The identifier of the request source. Default value: <strong>aegis</strong>. Valid values:</p>
         * <ul>
         * <li><strong>aegis</strong>: Server Guard edition.</li>
         * <li><strong>sas</strong>: Security Center edition.</li>
         * </ul>
         * <blockquote>
         * <p>Server Guard users must use <strong>aegis</strong>, and Security Center users must use <strong>sas</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>sas</p>
         */
        public Builder from(String from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * <p>The ID of the member accounts in the resource directory (Alibaba Cloud account).</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain this parameter.</p>
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
        public ModifyOpenLogShipperRequest build() {
            return new ModifyOpenLogShipperRequest(this);
        } 

    } 

}
