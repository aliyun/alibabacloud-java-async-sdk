// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20201002.models;

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
 * {@link ReportEdsAgentInfoRequest} extends {@link RequestModel}
 *
 * <p>ReportEdsAgentInfoRequest</p>
 */
public class ReportEdsAgentInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AliUid")
    private Long aliUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopId")
    private String desktopId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EcsInstanceId")
    private String ecsInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EdsAgentInfo")
    private String edsAgentInfo;

    private ReportEdsAgentInfoRequest(Builder builder) {
        super(builder);
        this.aliUid = builder.aliUid;
        this.desktopId = builder.desktopId;
        this.ecsInstanceId = builder.ecsInstanceId;
        this.edsAgentInfo = builder.edsAgentInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReportEdsAgentInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliUid
     */
    public Long getAliUid() {
        return this.aliUid;
    }

    /**
     * @return desktopId
     */
    public String getDesktopId() {
        return this.desktopId;
    }

    /**
     * @return ecsInstanceId
     */
    public String getEcsInstanceId() {
        return this.ecsInstanceId;
    }

    /**
     * @return edsAgentInfo
     */
    public String getEdsAgentInfo() {
        return this.edsAgentInfo;
    }

    public static final class Builder extends Request.Builder<ReportEdsAgentInfoRequest, Builder> {
        private Long aliUid; 
        private String desktopId; 
        private String ecsInstanceId; 
        private String edsAgentInfo; 

        private Builder() {
            super();
        } 

        private Builder(ReportEdsAgentInfoRequest request) {
            super(request);
            this.aliUid = request.aliUid;
            this.desktopId = request.desktopId;
            this.ecsInstanceId = request.ecsInstanceId;
            this.edsAgentInfo = request.edsAgentInfo;
        } 

        /**
         * AliUid.
         */
        public Builder aliUid(Long aliUid) {
            this.putQueryParameter("AliUid", aliUid);
            this.aliUid = aliUid;
            return this;
        }

        /**
         * DesktopId.
         */
        public Builder desktopId(String desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
            return this;
        }

        /**
         * EcsInstanceId.
         */
        public Builder ecsInstanceId(String ecsInstanceId) {
            this.putQueryParameter("EcsInstanceId", ecsInstanceId);
            this.ecsInstanceId = ecsInstanceId;
            return this;
        }

        /**
         * EdsAgentInfo.
         */
        public Builder edsAgentInfo(String edsAgentInfo) {
            this.putQueryParameter("EdsAgentInfo", edsAgentInfo);
            this.edsAgentInfo = edsAgentInfo;
            return this;
        }

        @Override
        public ReportEdsAgentInfoRequest build() {
            return new ReportEdsAgentInfoRequest(this);
        } 

    } 

}
