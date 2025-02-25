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
 * {@link ModifyVulWhitelistTargetRequest} extends {@link RequestModel}
 *
 * <p>ModifyVulWhitelistTargetRequest</p>
 */
public class ModifyVulWhitelistTargetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Reason")
    private String reason;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetInfo")
    private String targetInfo;

    private ModifyVulWhitelistTargetRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.reason = builder.reason;
        this.sourceIp = builder.sourceIp;
        this.targetInfo = builder.targetInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyVulWhitelistTargetRequest create() {
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
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return targetInfo
     */
    public String getTargetInfo() {
        return this.targetInfo;
    }

    public static final class Builder extends Request.Builder<ModifyVulWhitelistTargetRequest, Builder> {
        private Long id; 
        private String reason; 
        private String sourceIp; 
        private String targetInfo; 

        private Builder() {
            super();
        } 

        private Builder(ModifyVulWhitelistTargetRequest request) {
            super(request);
            this.id = request.id;
            this.reason = request.reason;
            this.sourceIp = request.sourceIp;
            this.targetInfo = request.targetInfo;
        } 

        /**
         * <p>The ID of the whitelist.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeVulWhitelist~~">DescribeVulWhitelist</a> operation to query the IDs of whitelists.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2533681</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The reason why you add the server to the whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>1221</p>
         */
        public Builder reason(String reason) {
            this.putQueryParameter("Reason", reason);
            this.reason = reason;
            return this;
        }

        /**
         * <p>The source IP address of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>42.120.75.150</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>The applicable scope of the whitelist. The value of this parameter is in the JSON format and contains the following fields:</p>
         * <ul>
         * <li><p><strong>type</strong>: the type of the applicable scope. Valid values:</p>
         * <ul>
         * <li><strong>GroupId</strong>: the ID of a server group</li>
         * <li><strong>Uuid</strong>: the UUID of a server</li>
         * </ul>
         * </li>
         * <li><p><strong>uuids</strong>: the UUIDs of servers</p>
         * </li>
         * <li><p><strong>groupIds</strong>: the IDs of server groups</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p> If you leave this parameter empty, all servers are added to the whitelist. If you set the <strong>type</strong> field to <strong>GroupId</strong>, you must also specify the <strong>groupIds</strong> field. If you set the <strong>type</strong> field to <strong>Uuid</strong>, you must also specify the <strong>uuids</strong> field.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;type&quot;: &quot;GroupId&quot;,
         *       &quot;uuids&quot;: [],
         *       &quot;groupIds&quot;: [
         *             10782678
         *       ]
         * }</p>
         */
        public Builder targetInfo(String targetInfo) {
            this.putQueryParameter("TargetInfo", targetInfo);
            this.targetInfo = targetInfo;
            return this;
        }

        @Override
        public ModifyVulWhitelistTargetRequest build() {
            return new ModifyVulWhitelistTargetRequest(this);
        } 

    } 

}
