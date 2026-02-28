// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link QuerySpeechPushJobRequest} extends {@link RequestModel}
 *
 * <p>QuerySpeechPushJobRequest</p>
 */
public class QuerySpeechPushJobRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobCode")
    private String jobCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageId")
    @com.aliyun.core.annotation.Validation(maximum = 10000, minimum = 1)
    private Integer pageId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 50, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PushMode")
    private String pushMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StatusList")
    private java.util.List<String> statusList;

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
    public java.util.List<String> getStatusList() {
        return this.statusList;
    }

    public static final class Builder extends Request.Builder<QuerySpeechPushJobRequest, Builder> {
        private String iotInstanceId; 
        private String jobCode; 
        private Integer pageId; 
        private Integer pageSize; 
        private String projectCode; 
        private String pushMode; 
        private java.util.List<String> statusList; 

        private Builder() {
            super();
        } 

        private Builder(QuerySpeechPushJobRequest request) {
            super(request);
            this.iotInstanceId = request.iotInstanceId;
            this.jobCode = request.jobCode;
            this.pageId = request.pageId;
            this.pageSize = request.pageSize;
            this.projectCode = request.projectCode;
            this.pushMode = request.pushMode;
            this.statusList = request.statusList;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0Ykj************************Av0I</p>
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
        public Builder statusList(java.util.List<String> statusList) {
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
