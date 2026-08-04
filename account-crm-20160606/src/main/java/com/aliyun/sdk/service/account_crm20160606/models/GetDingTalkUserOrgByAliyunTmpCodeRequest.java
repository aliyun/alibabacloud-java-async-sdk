// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.account_crm20160606.models;

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
 * {@link GetDingTalkUserOrgByAliyunTmpCodeRequest} extends {@link RequestModel}
 *
 * <p>GetDingTalkUserOrgByAliyunTmpCodeRequest</p>
 */
public class GetDingTalkUserOrgByAliyunTmpCodeRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DingTalkChannel")
    private String dingTalkChannel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TmpCode")
    private String tmpCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Version")
    private String version;

    private GetDingTalkUserOrgByAliyunTmpCodeRequest(Builder builder) {
        super(builder);
        this.sourceIp = builder.sourceIp;
        this.appName = builder.appName;
        this.dingTalkChannel = builder.dingTalkChannel;
        this.tmpCode = builder.tmpCode;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDingTalkUserOrgByAliyunTmpCodeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return dingTalkChannel
     */
    public String getDingTalkChannel() {
        return this.dingTalkChannel;
    }

    /**
     * @return tmpCode
     */
    public String getTmpCode() {
        return this.tmpCode;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<GetDingTalkUserOrgByAliyunTmpCodeRequest, Builder> {
        private String sourceIp; 
        private String appName; 
        private String dingTalkChannel; 
        private String tmpCode; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(GetDingTalkUserOrgByAliyunTmpCodeRequest request) {
            super(request);
            this.sourceIp = request.sourceIp;
            this.appName = request.appName;
            this.dingTalkChannel = request.dingTalkChannel;
            this.tmpCode = request.tmpCode;
            this.version = request.version;
        } 

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putHostParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * DingTalkChannel.
         */
        public Builder dingTalkChannel(String dingTalkChannel) {
            this.putQueryParameter("DingTalkChannel", dingTalkChannel);
            this.dingTalkChannel = dingTalkChannel;
            return this;
        }

        /**
         * TmpCode.
         */
        public Builder tmpCode(String tmpCode) {
            this.putQueryParameter("TmpCode", tmpCode);
            this.tmpCode = tmpCode;
            return this;
        }

        /**
         * Version.
         */
        public Builder version(String version) {
            this.putQueryParameter("Version", version);
            this.version = version;
            return this;
        }

        @Override
        public GetDingTalkUserOrgByAliyunTmpCodeRequest build() {
            return new GetDingTalkUserOrgByAliyunTmpCodeRequest(this);
        } 

    } 

}
