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
         * <p>The ID of the vulnerability whitelist.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeVulWhitelist~~">DescribeVulWhitelist</a> operation to obtain the ID of the vulnerability whitelist.</p>
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
         * <p>The reason for adding the whitelist.</p>
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
         * <p>The source IP address.</p>
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
         * <p>Specifies the scope where the whitelist takes effect. This field is in JSON format and contains the following fields:</p>
         * <ul>
         * <li><strong>type</strong>: the scope type. Valid values:<ul>
         * <li><strong>GroupId</strong>: group</li>
         * <li><strong>Uuid</strong>: server asset</li>
         * </ul>
         * </li>
         * <li><strong>uuids</strong>: the collection of server asset UUIDs.</li>
         * <li><strong>groupIds</strong>: the collection of group IDs.<blockquote>
         * <p>If this value is empty, the whitelist applies to all servers. If <strong>type</strong> is set to <strong>GroupId</strong>, <strong>groupIds</strong> cannot be empty. If <strong>type</strong> is set to <strong>Uuid</strong>, <strong>uuids</strong> cannot be empty.</p>
         * </blockquote>
         * </li>
         * </ul>
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
