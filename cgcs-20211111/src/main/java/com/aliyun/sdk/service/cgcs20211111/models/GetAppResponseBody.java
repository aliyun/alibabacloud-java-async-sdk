// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cgcs20211111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAppResponseBody} extends {@link TeaModel}
 *
 * <p>GetAppResponseBody</p>
 */
public class GetAppResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.NameInMap("AppType")
    private String appType;

    @com.aliyun.core.annotation.NameInMap("GmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("GmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StreamingAppId")
    private String streamingAppId;

    @com.aliyun.core.annotation.NameInMap("StreamingSolution")
    private String streamingSolution;

    @com.aliyun.core.annotation.NameInMap("VersionAdaptNum")
    private Long versionAdaptNum;

    @com.aliyun.core.annotation.NameInMap("VersionTotalNum")
    private Long versionTotalNum;

    private GetAppResponseBody(Builder builder) {
        this.appId = builder.appId;
        this.appName = builder.appName;
        this.appType = builder.appType;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.requestId = builder.requestId;
        this.streamingAppId = builder.streamingAppId;
        this.streamingSolution = builder.streamingSolution;
        this.versionAdaptNum = builder.versionAdaptNum;
        this.versionTotalNum = builder.versionTotalNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAppResponseBody create() {
        return builder().build();
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return appType
     */
    public String getAppType() {
        return this.appType;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return streamingAppId
     */
    public String getStreamingAppId() {
        return this.streamingAppId;
    }

    /**
     * @return streamingSolution
     */
    public String getStreamingSolution() {
        return this.streamingSolution;
    }

    /**
     * @return versionAdaptNum
     */
    public Long getVersionAdaptNum() {
        return this.versionAdaptNum;
    }

    /**
     * @return versionTotalNum
     */
    public Long getVersionTotalNum() {
        return this.versionTotalNum;
    }

    public static final class Builder {
        private String appId; 
        private String appName; 
        private String appType; 
        private String gmtCreate; 
        private String gmtModified; 
        private String requestId; 
        private String streamingAppId; 
        private String streamingSolution; 
        private Long versionAdaptNum; 
        private Long versionTotalNum; 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.appId = appId;
            return this;
        }

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.appName = appName;
            return this;
        }

        /**
         * AppType.
         */
        public Builder appType(String appType) {
            this.appType = appType;
            return this;
        }

        /**
         * GmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * GmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StreamingAppId.
         */
        public Builder streamingAppId(String streamingAppId) {
            this.streamingAppId = streamingAppId;
            return this;
        }

        /**
         * StreamingSolution.
         */
        public Builder streamingSolution(String streamingSolution) {
            this.streamingSolution = streamingSolution;
            return this;
        }

        /**
         * VersionAdaptNum.
         */
        public Builder versionAdaptNum(Long versionAdaptNum) {
            this.versionAdaptNum = versionAdaptNum;
            return this;
        }

        /**
         * VersionTotalNum.
         */
        public Builder versionTotalNum(Long versionTotalNum) {
            this.versionTotalNum = versionTotalNum;
            return this;
        }

        public GetAppResponseBody build() {
            return new GetAppResponseBody(this);
        } 

    } 

}
