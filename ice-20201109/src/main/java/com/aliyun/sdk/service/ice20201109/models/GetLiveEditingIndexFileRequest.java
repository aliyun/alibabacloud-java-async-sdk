// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLiveEditingIndexFileRequest} extends {@link RequestModel}
 *
 * <p>GetLiveEditingIndexFileRequest</p>
 */
public class GetLiveEditingIndexFileRequest extends Request {
    @Query
    @NameInMap("AppName")
    private String appName;

    @Query
    @NameInMap("DomainName")
    private String domainName;

    @Query
    @NameInMap("ProjectId")
    private String projectId;

    @Query
    @NameInMap("StreamName")
    private String streamName;

    private GetLiveEditingIndexFileRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.domainName = builder.domainName;
        this.projectId = builder.projectId;
        this.streamName = builder.streamName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLiveEditingIndexFileRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return streamName
     */
    public String getStreamName() {
        return this.streamName;
    }

    public static final class Builder extends Request.Builder<GetLiveEditingIndexFileRequest, Builder> {
        private String appName; 
        private String domainName; 
        private String projectId; 
        private String streamName; 

        private Builder() {
            super();
        } 

        private Builder(GetLiveEditingIndexFileRequest request) {
            super(request);
            this.appName = request.appName;
            this.domainName = request.domainName;
            this.projectId = request.projectId;
            this.streamName = request.streamName;
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
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * StreamName.
         */
        public Builder streamName(String streamName) {
            this.putQueryParameter("StreamName", streamName);
            this.streamName = streamName;
            return this;
        }

        @Override
        public GetLiveEditingIndexFileRequest build() {
            return new GetLiveEditingIndexFileRequest(this);
        } 

    } 

}
