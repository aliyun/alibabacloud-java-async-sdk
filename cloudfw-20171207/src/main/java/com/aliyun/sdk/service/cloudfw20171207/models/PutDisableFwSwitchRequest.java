// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link PutDisableFwSwitchRequest} extends {@link RequestModel}
 *
 * <p>PutDisableFwSwitchRequest</p>
 */
public class PutDisableFwSwitchRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpVersion")
    private String ipVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpaddrList")
    private java.util.List<String> ipaddrList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemberUid")
    private String memberUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionList")
    private java.util.List<String> regionList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceTypeList")
    private java.util.List<String> resourceTypeList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    @Deprecated
    private String sourceIp;

    private PutDisableFwSwitchRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.ipVersion = builder.ipVersion;
        this.ipaddrList = builder.ipaddrList;
        this.lang = builder.lang;
        this.memberUid = builder.memberUid;
        this.regionList = builder.regionList;
        this.resourceTypeList = builder.resourceTypeList;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutDisableFwSwitchRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return ipVersion
     */
    public String getIpVersion() {
        return this.ipVersion;
    }

    /**
     * @return ipaddrList
     */
    public java.util.List<String> getIpaddrList() {
        return this.ipaddrList;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return memberUid
     */
    public String getMemberUid() {
        return this.memberUid;
    }

    /**
     * @return regionList
     */
    public java.util.List<String> getRegionList() {
        return this.regionList;
    }

    /**
     * @return resourceTypeList
     */
    public java.util.List<String> getResourceTypeList() {
        return this.resourceTypeList;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<PutDisableFwSwitchRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String ipVersion; 
        private java.util.List<String> ipaddrList; 
        private String lang; 
        private String memberUid; 
        private java.util.List<String> regionList; 
        private java.util.List<String> resourceTypeList; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(PutDisableFwSwitchRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.ipVersion = request.ipVersion;
            this.ipaddrList = request.ipaddrList;
            this.lang = request.lang;
            this.memberUid = request.memberUid;
            this.regionList = request.regionList;
            this.resourceTypeList = request.resourceTypeList;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * <p>保证请求幂等性的客户端令牌。由客户端生成，需保证在不同请求间唯一；数据类型 String，大小写敏感，格式为 [0-9a-zA-Z-_]{1,64}，建议使用 UUID。服务端在有效期内（600 秒）保证幂等：相同 ClientToken 且相同业务参数的重复请求返回与首次一致的结果；相同 ClientToken 但业务参数不同时返回 HTTP 400 及 IdempotentParameterMismatch 错误码。</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>是否只预检此次请求。取值 true 时仅执行参数合法性、身份权限、资源存在性、配额限制与依赖关系等执行前校验，不创建/更新/删除真实资源、不触发真实异步引流任务、不产生计费/通知/回调等下游副作用；预检成功时响应中 DryRun=true，与真实调用响应可区分；预检失败返回可机器识别的错误码（如 ErrorParamsInvalid 参数错误、ErrorAuthentication 权限不足、ErrorInstanceOpenIpNumExceed 配额不足）。取值 false（默认）表示正常发起请求并执行关闭操作。</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * IpVersion.
         */
        public Builder ipVersion(String ipVersion) {
            this.putQueryParameter("IpVersion", ipVersion);
            this.ipVersion = ipVersion;
            return this;
        }

        /**
         * <p>The IP addresses.</p>
         * <blockquote>
         * <p> You must specify at least one of the IpaddrList, RegionList, and ResourceTypeList parameters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[&quot;192.0.XX.XX&quot;,&quot;192.0.XX.XX&quot;]</p>
         */
        public Builder ipaddrList(java.util.List<String> ipaddrList) {
            this.putQueryParameter("IpaddrList", ipaddrList);
            this.ipaddrList = ipaddrList;
            return this;
        }

        /**
         * <p>The language of the content within the response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese (default)</li>
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
         * MemberUid.
         */
        public Builder memberUid(String memberUid) {
            this.putQueryParameter("MemberUid", memberUid);
            this.memberUid = memberUid;
            return this;
        }

        /**
         * <p>The regions.</p>
         * <blockquote>
         * <p> You must specify at least one of the IpaddrList, RegionList, and ResourceTypeList parameters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[&quot;cn-hangzhou&quot;,&quot;cn-shanghai&quot;]</p>
         */
        public Builder regionList(java.util.List<String> regionList) {
            this.putQueryParameter("RegionList", regionList);
            this.regionList = regionList;
            return this;
        }

        /**
         * <p>The types of the assets.</p>
         * <blockquote>
         * <p>You must specify at least one of the IpaddrList, RegionList, and ResourceTypeList parameters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[&quot;EcsPublicIp&quot;,&quot;NatEip&quot;]</p>
         */
        public Builder resourceTypeList(java.util.List<String> resourceTypeList) {
            this.putQueryParameter("ResourceTypeList", resourceTypeList);
            this.resourceTypeList = resourceTypeList;
            return this;
        }

        /**
         * <p>The source IP address of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>192.0.XX.XX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public PutDisableFwSwitchRequest build() {
            return new PutDisableFwSwitchRequest(this);
        } 

    } 

}
