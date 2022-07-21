// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySpeechPushJobSpeechRequest} extends {@link RequestModel}
 *
 * <p>QuerySpeechPushJobSpeechRequest</p>
 */
public class QuerySpeechPushJobSpeechRequest extends Request {
    @Body
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Body
    @NameInMap("JobCode")
    @Validation(required = true)
    private String jobCode;

    @Body
    @NameInMap("PageId")
    @Validation(maximum = 10000, minimum = 1)
    private Integer pageId;

    @Body
    @NameInMap("PageSize")
    @Validation(maximum = 50, minimum = 1)
    private Integer pageSize;

    private QuerySpeechPushJobSpeechRequest(Builder builder) {
        super(builder);
        this.iotInstanceId = builder.iotInstanceId;
        this.jobCode = builder.jobCode;
        this.pageId = builder.pageId;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySpeechPushJobSpeechRequest create() {
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

    public static final class Builder extends Request.Builder<QuerySpeechPushJobSpeechRequest, Builder> {
        private String iotInstanceId; 
        private String jobCode; 
        private Integer pageId; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(QuerySpeechPushJobSpeechRequest request) {
            super(request);
            this.iotInstanceId = request.iotInstanceId;
            this.jobCode = request.jobCode;
            this.pageId = request.pageId;
            this.pageSize = request.pageSize;
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
            this.putBodyParameter("JobCode", jobCode);
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

        @Override
        public QuerySpeechPushJobSpeechRequest build() {
            return new QuerySpeechPushJobSpeechRequest(this);
        } 

    } 

}
