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
 * {@link DeleteVulWhitelistRequest} extends {@link RequestModel}
 *
 * <p>DeleteVulWhitelistRequest</p>
 */
public class DeleteVulWhitelistRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Whitelist")
    private String whitelist;

    private DeleteVulWhitelistRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.whitelist = builder.whitelist;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteVulWhitelistRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return whitelist
     */
    public String getWhitelist() {
        return this.whitelist;
    }

    public static final class Builder extends Request.Builder<DeleteVulWhitelistRequest, Builder> {
        private String id; 
        private String whitelist; 

        private Builder() {
            super();
        } 

        private Builder(DeleteVulWhitelistRequest request) {
            super(request);
            this.id = request.id;
            this.whitelist = request.whitelist;
        } 

        /**
         * <p>The ID of the whitelist.</p>
         * <blockquote>
         * <p> To delete a vulnerability whitelist, you must provide the ID of the whitelist. You can call the <a href="~~DescribeVulWhitelist~~">DescribeVulWhitelist</a> operation to query the IDs of whitelists.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>131231</p>
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The information about the whitelist. The value is a JSON string that contains the following fields:</p>
         * <ul>
         * <li><p><strong>Name</strong>: the name of the vulnerability.</p>
         * </li>
         * <li><p><strong>Type</strong>: the type of the vulnerability. Valid values:</p>
         * <ul>
         * <li><strong>cve</strong>: Linux software vulnerability</li>
         * <li><strong>sys</strong>: Windows system vulnerability</li>
         * <li><strong>cms</strong>: Web-CMS vulnerability</li>
         * <li><strong>app</strong>: application vulnerability</li>
         * <li><strong>emg</strong>: urgent vulnerability</li>
         * </ul>
         * </li>
         * <li><p><strong>AliasName</strong>: the alias of the vulnerability.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[
         *       {
         *             &quot;Name&quot;: &quot;oval:com.redhat.rhsa:def:20173263&quot;,
         *             &quot;Type&quot;: &quot;cve&quot;,
         *             &quot;AliasName&quot;: &quot;RHSA-2017:3263: curl security update&quot;
         *       }
         * ]</p>
         */
        public Builder whitelist(String whitelist) {
            this.putQueryParameter("Whitelist", whitelist);
            this.whitelist = whitelist;
            return this;
        }

        @Override
        public DeleteVulWhitelistRequest build() {
            return new DeleteVulWhitelistRequest(this);
        } 

    } 

}
