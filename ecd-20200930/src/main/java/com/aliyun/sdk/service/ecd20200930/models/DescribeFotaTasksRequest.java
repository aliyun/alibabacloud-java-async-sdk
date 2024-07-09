// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFotaTasksRequest} extends {@link RequestModel}
 *
 * <p>DescribeFotaTasksRequest</p>
 */
public class DescribeFotaTasksRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FotaStatus")
    private String fotaStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 500)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskUid")
    private java.util.List < String > taskUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserStatus")
    private String userStatus;

    private DescribeFotaTasksRequest(Builder builder) {
        super(builder);
        this.fotaStatus = builder.fotaStatus;
        this.lang = builder.lang;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.taskUid = builder.taskUid;
        this.userStatus = builder.userStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFotaTasksRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fotaStatus
     */
    public String getFotaStatus() {
        return this.fotaStatus;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return taskUid
     */
    public java.util.List < String > getTaskUid() {
        return this.taskUid;
    }

    /**
     * @return userStatus
     */
    public String getUserStatus() {
        return this.userStatus;
    }

    public static final class Builder extends Request.Builder<DescribeFotaTasksRequest, Builder> {
        private String fotaStatus; 
        private String lang; 
        private Integer maxResults; 
        private String nextToken; 
        private String regionId; 
        private java.util.List < String > taskUid; 
        private String userStatus; 

        private Builder() {
            super();
        } 

        private Builder(DescribeFotaTasksRequest request) {
            super(request);
            this.fotaStatus = request.fotaStatus;
            this.lang = request.lang;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
            this.taskUid = request.taskUid;
            this.userStatus = request.userStatus;
        } 

        /**
         * >  This parameter is not publicly available.
         */
        public Builder fotaStatus(String fotaStatus) {
            this.putQueryParameter("FotaStatus", fotaStatus);
            this.fotaStatus = fotaStatus;
            return this;
        }

        /**
         * The language of the image version to update.
         * <p>
         * 
         * Valid values:
         * 
         * *   en: English.
         * *   zh: Simplified Chinese.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The number of entries per page.
         * <p>
         * 
         * *   Valid values: 1 to 100
         * *   Default value: 20
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The pagination token that is used in the next request to retrieve a new page of results. If the NextToken parameter is empty, no next page exists.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the regions supported by Elastic Desktop Service.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The IDs of the image update tasks.
         */
        public Builder taskUid(java.util.List < String > taskUid) {
            this.putQueryParameter("TaskUid", taskUid);
            this.taskUid = taskUid;
            return this;
        }

        /**
         * Specifies whether to automatically push the image update task.
         * <p>
         * 
         * Valid values:
         * 
         * *   Running: automatically pushes the image update task.
         * *   Pending: does not automatically push the image update task.
         */
        public Builder userStatus(String userStatus) {
            this.putQueryParameter("UserStatus", userStatus);
            this.userStatus = userStatus;
            return this;
        }

        @Override
        public DescribeFotaTasksRequest build() {
            return new DescribeFotaTasksRequest(this);
        } 

    } 

}
