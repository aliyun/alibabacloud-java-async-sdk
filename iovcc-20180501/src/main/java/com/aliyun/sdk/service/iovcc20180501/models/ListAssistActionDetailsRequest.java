// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAssistActionDetailsRequest} extends {@link RequestModel}
 *
 * <p>ListAssistActionDetailsRequest</p>
 */
public class ListAssistActionDetailsRequest extends Request {
    @Query
    @NameInMap("ActionTimestamp")
    @Validation(required = true)
    private String actionTimestamp;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private ListAssistActionDetailsRequest(Builder builder) {
        super(builder);
        this.actionTimestamp = builder.actionTimestamp;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAssistActionDetailsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actionTimestamp
     */
    public String getActionTimestamp() {
        return this.actionTimestamp;
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

    public static final class Builder extends Request.Builder<ListAssistActionDetailsRequest, Builder> {
        private String actionTimestamp; 
        private String projectId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListAssistActionDetailsRequest response) {
            super(response);
            this.actionTimestamp = response.actionTimestamp;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
        } 

        /**
         * ActionTimestamp.
         */
        public Builder actionTimestamp(String actionTimestamp) {
            this.putQueryParameter("ActionTimestamp", actionTimestamp);
            this.actionTimestamp = actionTimestamp;
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
        public ListAssistActionDetailsRequest build() {
            return new ListAssistActionDetailsRequest(this);
        } 

    } 

}
