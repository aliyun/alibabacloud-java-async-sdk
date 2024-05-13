// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUserUploadFileJobRequest} extends {@link RequestModel}
 *
 * <p>GetUserUploadFileJobRequest</p>
 */
public class GetUserUploadFileJobRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long tid;

    private GetUserUploadFileJobRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.jobKey = builder.jobKey;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserUploadFileJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return jobKey
     */
    public String getJobKey() {
        return this.jobKey;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<GetUserUploadFileJobRequest, Builder> {
        private String regionId; 
        private String jobKey; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(GetUserUploadFileJobRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.jobKey = request.jobKey;
            this.tid = request.tid;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The key of the file upload task. The key is returned when you call the [CreateUploadFileJob](~~206059~~) or [CreateUploadOSSFileJob](~~206060~~) operation.
         */
        public Builder jobKey(String jobKey) {
            this.putQueryParameter("JobKey", jobKey);
            this.jobKey = jobKey;
            return this;
        }

        /**
         * The tenant ID.
         * <p>
         * 
         * > To view the tenant ID, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see [Manage DMS tenants](~~181330~~).
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public GetUserUploadFileJobRequest build() {
            return new GetUserUploadFileJobRequest(this);
        } 

    } 

}
