// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAssistHistoryDetailsRequest} extends {@link RequestModel}
 *
 * <p>ListAssistHistoryDetailsRequest</p>
 */
public class ListAssistHistoryDetailsRequest extends Request {
    @Query
    @NameInMap("AssistId")
    @Validation(required = true)
    private String assistId;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private ListAssistHistoryDetailsRequest(Builder builder) {
        super(builder);
        this.assistId = builder.assistId;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAssistHistoryDetailsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assistId
     */
    public String getAssistId() {
        return this.assistId;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListAssistHistoryDetailsRequest, Builder> {
        private String assistId; 
        private String projectId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListAssistHistoryDetailsRequest response) {
            super(response);
            this.assistId = response.assistId;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
        } 

        /**
         * AssistId.
         */
        public Builder assistId(String assistId) {
            this.putQueryParameter("AssistId", assistId);
            this.assistId = assistId;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListAssistHistoryDetailsRequest build() {
            return new ListAssistHistoryDetailsRequest(this);
        } 

    } 

}
