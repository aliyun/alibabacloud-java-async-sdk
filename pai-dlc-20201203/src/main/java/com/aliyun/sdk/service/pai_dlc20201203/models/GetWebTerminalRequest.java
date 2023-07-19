// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetWebTerminalRequest} extends {@link RequestModel}
 *
 * <p>GetWebTerminalRequest</p>
 */
public class GetWebTerminalRequest extends Request {
    @Path
    @NameInMap("JobId")
    private String jobId;

    @Path
    @NameInMap("PodId")
    private String podId;

    @Query
    @NameInMap("PodUid")
    private String podUid;

    private GetWebTerminalRequest(Builder builder) {
        super(builder);
        this.jobId = builder.jobId;
        this.podId = builder.podId;
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
     * @return podUid
     */
    public String getPodUid() {
        return this.podUid;
    }

    public static final class Builder extends Request.Builder<GetWebTerminalRequest, Builder> {
        private String jobId; 
        private String podId; 
        private String podUid; 

        private Builder() {
            super();
        } 

        private Builder(GetWebTerminalRequest request) {
            super(request);
            this.jobId = request.jobId;
            this.podId = request.podId;
            this.podUid = request.podUid;
        } 

        /**
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.putPathParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * PodId.
         */
        public Builder podId(String podId) {
            this.putPathParameter("PodId", podId);
            this.podId = podId;
            return this;
        }

        /**
         * Pod UID。
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
