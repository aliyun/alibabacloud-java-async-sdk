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
 * {@link QueryEdsAgentReportConfigRequest} extends {@link RequestModel}
 *
 * <p>QueryEdsAgentReportConfigRequest</p>
 */
public class QueryEdsAgentReportConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AliUid")
    private Long aliUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopId")
    private String desktopId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EcsInstanceId")
    private String ecsInstanceId;

    private QueryEdsAgentReportConfigRequest(Builder builder) {
        super(builder);
        this.aliUid = builder.aliUid;
        this.desktopId = builder.desktopId;
        this.ecsInstanceId = builder.ecsInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryEdsAgentReportConfigRequest create() {
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

    public static final class Builder extends Request.Builder<QueryEdsAgentReportConfigRequest, Builder> {
        private Long aliUid; 
        private String desktopId; 
        private String ecsInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(QueryEdsAgentReportConfigRequest request) {
            super(request);
            this.aliUid = request.aliUid;
            this.desktopId = request.desktopId;
            this.ecsInstanceId = request.ecsInstanceId;
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

        @Override
        public QueryEdsAgentReportConfigRequest build() {
            return new QueryEdsAgentReportConfigRequest(this);
        } 

    } 

}
