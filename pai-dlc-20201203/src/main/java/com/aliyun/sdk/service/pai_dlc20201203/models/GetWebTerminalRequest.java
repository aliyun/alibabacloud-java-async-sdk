// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link GetWebTerminalRequest} extends {@link RequestModel}
 *
 * <p>GetWebTerminalRequest</p>
 */
public class GetWebTerminalRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("PodId")
    private String podId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsShared")
    private Boolean isShared;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PodUid")
    private String podUid;

    private GetWebTerminalRequest(Builder builder) {
        super(builder);
        this.jobId = builder.jobId;
        this.podId = builder.podId;
        this.isShared = builder.isShared;
        this.podUid = builder.podUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWebTerminalRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return podId
     */
    public String getPodId() {
        return this.podId;
    }

    /**
     * @return isShared
     */
    public Boolean getIsShared() {
        return this.isShared;
    }

    /**
     * @return podUid
     */
    public String getPodUid() {
        return this.podUid;
    }

    public static final class Builder extends Request.Builder<GetWebTerminalRequest, Builder> {
        private String jobId; 
        private String podId; 
        private Boolean isShared; 
        private String podUid; 

        private Builder() {
            super();
        } 

        private Builder(GetWebTerminalRequest request) {
            super(request);
            this.jobId = request.jobId;
            this.podId = request.podId;
            this.isShared = request.isShared;
            this.podUid = request.podUid;
        } 

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dlc-20210126170216-******</p>
         */
        public Builder jobId(String jobId) {
            this.putPathParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The pod ID of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>dlc-20210126170216-****-chief-0</p>
         */
        public Builder podId(String podId) {
            this.putPathParameter("PodId", podId);
            this.podId = podId;
            return this;
        }

        /**
         * <p>Specifies whether to create a shared link for accessing the container. Valid values:</p>
         * <ul>
         * <li>true: Returns a shared link for accessing the container. The link expires after 30 seconds and can be used only once. After someone accesses the container through this link, subsequent requests using the same link are invalid.</li>
         * <li>false: Returns a regular link for accessing the container. Alibaba Cloud identity authentication is required when using this link. The link expires after 30 seconds.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isShared(Boolean isShared) {
            this.putQueryParameter("IsShared", isShared);
            this.isShared = isShared;
            return this;
        }

        /**
         * <p>Pod UID。</p>
         * 
         * <strong>example:</strong>
         * <p>94a7cc7c-0033-48b5-85bd-71c63592****</p>
         */
        public Builder podUid(String podUid) {
            this.putQueryParameter("PodUid", podUid);
            this.podUid = podUid;
            return this;
        }

        @Override
        public GetWebTerminalRequest build() {
            return new GetWebTerminalRequest(this);
        } 

    } 

}
