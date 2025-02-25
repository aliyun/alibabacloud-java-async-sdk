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
 * {@link DescribeAssetDetailByUuidsRequest} extends {@link RequestModel}
 *
 * <p>DescribeAssetDetailByUuidsRequest</p>
 */
public class DescribeAssetDetailByUuidsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceDirectoryAccountId")
    private Long resourceDirectoryAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuids")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uuids;

    private DescribeAssetDetailByUuidsRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.resourceDirectoryAccountId = builder.resourceDirectoryAccountId;
        this.uuids = builder.uuids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAssetDetailByUuidsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return resourceDirectoryAccountId
     */
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    /**
     * @return uuids
     */
    public String getUuids() {
        return this.uuids;
    }

    public static final class Builder extends Request.Builder<DescribeAssetDetailByUuidsRequest, Builder> {
        private String lang; 
        private Long resourceDirectoryAccountId; 
        private String uuids; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAssetDetailByUuidsRequest request) {
            super(request);
            this.lang = request.lang;
            this.resourceDirectoryAccountId = request.resourceDirectoryAccountId;
            this.uuids = request.uuids;
        } 

        /**
         * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The Alibaba Cloud account ID of the member in the resource directory.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to query the IDs of Alibaba Cloud accounts.</p>
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

        /**
         * <p>The UUIDs of the instances. Separate multiple UUIDs with commas (,).</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to query the UUIDs of instances.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0687b17f-2a36-4e5****,0687b17f-2a36-4e****</p>
         */
        public Builder uuids(String uuids) {
            this.putQueryParameter("Uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        @Override
        public DescribeAssetDetailByUuidsRequest build() {
            return new DescribeAssetDetailByUuidsRequest(this);
        } 

    } 

}
