// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySpeechPushJobRequest} extends {@link RequestModel}
 *
 * <p>QuerySpeechPushJobRequest</p>
 */
public class QuerySpeechPushJobRequest extends Request {
    @Body
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("JobCode")
    private String jobCode;

    @Body
    @NameInMap("PageId")
    private Integer pageId;

    @Body
    @NameInMap("PageSize")
    private Integer pageSize;

    @Body
    @NameInMap("ProjectCode")
    @Validation(required = true)
    private String projectCode;

    @Body
    @NameInMap("PushMode")
    private String pushMode;

    @Body
    @NameInMap("StatusList")
    private java.util.List < String > statusList;

    private QuerySpeechPushJobRequest(Builder builder) {
        super(builder);
        this.iotInstanceId = builder.iotInstanceId;
        this.jobCode = builder.jobCode;
        this.pageId = builder.pageId;
        this.pageSize = builder.pageSize;
        this.projectCode = builder.projectCode;
        this.pushMode = builder.pushMode;
        this.statusList = builder.statusList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySpeechPushJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return jobCode
     */
    public String getJobCode() {
        return this.jobCode;
    }

    /**
     * @return pageId
     */
    public Integer getPageId() {
        return this.pageId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return projectCode
     */
    public String getProjectCode() {
        return this.projectCode;
    }

    /**
     * @return pushMode
     */
    public String getPushMode() {
        return this.pushMode;
    }

    /**
     * @return statusList
     */
    public java.util.List < String > getStatusList() {
        return this.statusList;
    }

    public static final class Builder extends Request.Builder<QuerySpeechPushJobRequest, Builder> {
        private String iotInstanceId; 
        private String jobCode; 
        private Integer pageId; 
        private Integer pageSize; 
        private String projectCode; 
        private String pushMode; 
        private java.util.List < String > statusList; 

        private Builder() {
            super();
        } 

        private Builder(QuerySpeechPushJobRequest response) {
            super(response);
            this.iotInstanceId = response.iotInstanceId;
            this.jobCode = response.jobCode;
            this.pageId = response.pageId;
            this.pageSize = response.pageSize;
            this.projectCode = response.projectCode;
            this.pushMode = response.pushMode;
            this.statusList = response.statusList;
        } 

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putBodyParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * JobCode.
         */
        public Builder jobCode(String jobCode) {
            this.putQueryParameter("JobCode", jobCode);
            this.jobCode = jobCode;
            return this;
        }

        /**
         * PageId.
         */
        public Builder pageId(Integer pageId) {
            this.putBodyParameter("PageId", pageId);
            this.pageId = pageId;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ProjectCode.
         */
        public Builder projectCode(String projectCode) {
            this.putBodyParameter("ProjectCode", projectCode);
            this.projectCode = projectCode;
            return this;
        }

        /**
         * PushMode.
         */
        public Builder pushMode(String pushMode) {
            this.putBodyParameter("PushMode", pushMode);
            this.pushMode = pushMode;
            return this;
        }

        /**
         * StatusList.
         */
        public Builder statusList(java.util.List < String > statusList) {
            this.putBodyParameter("StatusList", statusList);
            this.statusList = statusList;
            return this;
        }

        @Override
        public QuerySpeechPushJobRequest build() {
            return new QuerySpeechPushJobRequest(this);
        } 

    } 

}
